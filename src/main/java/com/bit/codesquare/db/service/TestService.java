package com.bit.codesquare.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.codesquare.db.dto.Test;
import com.bit.codesquare.db.mapper.TestMapper;

@Service
public class TestService {
 
    @Autowired
    TestMapper testMapper;
    
    public List<Test> getAll() throws Exception{
        return testMapper.getAll();
    }
	 public void insert(Test test) throws Exception{
		testMapper.insert(test);
	 }
	 public void delete(int id)throws Exception {
		 testMapper.delete(id);
	 }
	 public void update(Test test)throws Exception {
		 testMapper.update(test);
	 }
}
