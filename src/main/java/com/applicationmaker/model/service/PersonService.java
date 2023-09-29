package com.applicationmaker.model.service;

import com.applicationmaker.controller.exception.NoContentException;
import com.applicationmaker.model.entity.Group;
import com.applicationmaker.model.entity.Person;
import com.applicationmaker.model.entity.User;
import com.applicationmaker.model.repository.CrudRepository;
import com.applicationmaker.model.service.impl.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService implements ServiceImpl<Person,Long> {
    private static PersonService service = new PersonService();

    private PersonService() {
    }

    public static PersonService getService() {
        return service;
    }

    @Override
    public Person save(Person person) throws Exception {
        try(CrudRepository<Person,Long> repository = new CrudRepository<>()){
            repository.insert(person);
            return person;
        }
    }

    @Override
    public Person edit(Person person) throws Exception {
        try(CrudRepository<Person,Long> repository = new CrudRepository<>()){
            repository.update(person);
            return person;
        }
    }

    @Override
    public Person remove(Long id) throws Exception {
        try(CrudRepository<Person,Long> repository = new CrudRepository<>()){
            Person person = repository.selectById(Person.class, id);

            if (person == null){
                throw  new NoContentException("No Person Found");
            }
            person.setDeleted(true);
            repository.update(person);
            return person;
        }
    }

    @Override
    public List<Person> findAll() throws Exception {
        try(CrudRepository<Person,Long> repository = new CrudRepository<>()){
            List<Person> personList = repository.selectAll(Person.class);

            if (personList.size()==0){
                throw  new NoContentException("No Person Found");
            }
            return personList;
        }
    }

    @Override
    public List<Person> findAllPaging(int pageNumber, int pageSize) throws Exception {
        try (CrudRepository<Person, Long> repository = new CrudRepository<>()) {
            List<Person> personList = repository.selectAll(Person.class, pageNumber, pageSize);

            if (personList.size() == 0) {
                throw new NoContentException("No Person Found");
            }
            return personList;
        }
    }

    @Override
    public Person findById(Long id) throws Exception {
        try(CrudRepository<Person,Long> repository = new CrudRepository<>()){
            Person person = repository.selectById(Person.class, id);

            if (person == null){
                throw  new NoContentException("No Person Found");
            }
            return person;
        }
    }

    @Override
    public Long getRecordCount() throws Exception {
        try (CrudRepository<Person, Integer> repository = new CrudRepository<Person, Integer>()) {
            return repository.getRecordCount(Group.class);
        }
    }

    public List<Person> findByFamily(String family) throws Exception {
        try(CrudRepository<Person,Long> repository = new CrudRepository<>()){
            Map<String,Object> params = new HashMap<>();
            params.put("family",family );

            List<Person> personList = repository.getResultList("Person.FindByFamily", params);

            if (personList.size() == 0){
                throw  new NoContentException("No Person Found");
            }
            return personList;
        }
    }


}