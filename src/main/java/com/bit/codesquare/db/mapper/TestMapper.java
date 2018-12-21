package com.bit.codesquare.db.mapper;

import java.util.List;

import com.bit.codesquare.db.dto.Test;

public interface TestMapper {
	 public List<Test> getAll() throws Exception;
	 public void insert(Test test) throws Exception;
	 public void delete(int id)throws Exception;
	 public void update(Test test)throws Exception;
}
