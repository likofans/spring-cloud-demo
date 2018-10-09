package com.mj.demo.springcloud.dao;

import java.util.List;

import com.mj.demo.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import com.mj.demo.springcloud.entities.Dept;

@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
