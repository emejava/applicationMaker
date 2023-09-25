package com.applicationmaker.model.service;

import com.applicationmaker.controller.exception.AccessDeniedException;
import com.applicationmaker.controller.exception.DuplicateDataException;
import com.applicationmaker.controller.exception.NoContentException;
import com.applicationmaker.model.entity.Group;
import com.applicationmaker.model.entity.User;
import com.applicationmaker.model.repository.CrudRepository;
import com.applicationmaker.model.service.impl.ServiceImpl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserService implements ServiceImpl<User, Long> {
    private static UserService service = new UserService();

    private UserService() {
    }

    public static UserService getService() {
        return service;
    }

    @Override
    public User save(User user) throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
            if (findByUserName(user.getUserName()) == null) {
                repository.insert(user);
            } else {
                throw new DuplicateDataException("Username cant be duplicated !!!");
            }
            return user;
        }
    }

    @Override
    public User edit(User user) throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
//            if (findByUserName(user.getUserName()) == null) {
                repository.update(user);
//            } else {
//                throw new DuplicateDataException("Username cant be duplicated !!!");
//            }
            return user;
        }
    }

    @Override
    public User remove(Long id) throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
            User user = repository.selectById(User.class, id);

            if (user == null) {
                throw new NoContentException("No User Found");
            }
            user.setDeleted(true);
            repository.update(user);
            return user;
        }
    }

    @Override
    public List<User> findAll() throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
            List<User> userList = repository.selectAll(User.class);

            if (userList.size() == 0) {
                throw new NoContentException("No User Found");
            }
            return userList;
        }
    }

    @Override
    public List<User> findAllPaging(int pageNumber, int pageSize) throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
            List<User> userList = repository.selectAll(User.class, pageNumber, pageSize);

            if (userList.size() == 0) {
                throw new NoContentException("No User Found");
            }
            return userList;
        }
    }

    @Override
    public User findById(Long id) throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
            User user = repository.selectById(User.class, id);

            if (user == null) {
                throw new NoContentException("No User Found");
            }
            return user;
        }
    }

    @Override
    public Long getRecordCount() throws Exception {
        try (CrudRepository<User, Integer> repository = new CrudRepository<User, Integer>()) {
            return repository.getRecordCount(Group.class);
        }
    }

    public User findByUserName(String userName) throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
            Map<String, Object> params = new HashMap<>();
            params.put("userName", userName);

            User user = repository.getSingleResult("User.FindByUserName", params);

            if (user == null) {
                throw new NoContentException("No User Found");
            }
            return user;
        }
    }

    public User login(String userName, String password) throws Exception {
        try (CrudRepository<User, Long> repository = new CrudRepository<>()) {
            Map<String, Object> params = new HashMap<>();
            params.put("userName", userName);
            params.put("password", password);

            User user = repository.getSingleResult("User.FindByUserNameAndPassword", params);

            if (user == null) {
                throw new AccessDeniedException();
            }
            return user;
        }
    }


}
