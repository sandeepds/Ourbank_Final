package com.Ourbank.dao;

import java.util.List;

import com.Ourbank.actionForm.Emp_AddTrans;


public interface ContactDao {

	public Emp_AddTrans add(Emp_AddTrans contact);
	public Emp_AddTrans delete(Long id);
	public List<Emp_AddTrans> list();

}
