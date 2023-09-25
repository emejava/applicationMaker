package com.applicationmaker.model.service;

import com.applicationmaker.model.entity.StuffUnit;
import com.applicationmaker.model.service.impl.ServiceImpl;

import java.util.List;

public class StuffUnitService implements ServiceImpl<StuffUnit,Integer> {
    private static StuffUnitService service = new StuffUnitService();

    public StuffUnitService() {
    }

    public static StuffUnitService getService() {
        return service;
    }

    @Override
    public StuffUnit save(StuffUnit stuffUnit) throws Exception {
        return null;
    }

    @Override
    public StuffUnit edit(StuffUnit stuffUnit) throws Exception {
        return null;
    }

    @Override
    public StuffUnit remove(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<StuffUnit> findAll() throws Exception {
        return null;
    }

    @Override
    public List<StuffUnit> findAllPaging(int pageNumber, int pageSize) throws Exception {
        return null;
    }

    @Override
    public StuffUnit findById(Integer id) throws Exception {
        return null;
    }

    @Override
    public Long getRecordCount() throws Exception {
        return null;
    }
}
