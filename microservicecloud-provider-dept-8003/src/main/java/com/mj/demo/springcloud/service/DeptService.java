package com.mj.demo.springcloud.service;

import java.util.List;

import com.mj.demo.springcloud.entities.Dept;
import com.mj.demo.springcloud.entities.Dept;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
