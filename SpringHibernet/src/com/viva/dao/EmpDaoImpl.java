package com.viva.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.viva.entity.Emp;

@Repository("empdao")
public class EmpDaoImpl implements IEmpDao {
	
	@Autowired
	private SessionFactory sfac;

	@Override
	@Transactional
	public int addEmployee(Emp emp) {
		
	Session sess=sfac.getCurrentSession();
	 sess.save(emp);
	 return 1;
		
	}

	@Override
	@Transactional(readOnly=true)
	public Emp getEmployee(int eid) {
		Session sess=sfac.getCurrentSession();
		Emp emp =sess.get(Emp.class, eid);
		return emp;
			
	}

	@Override
	@Transactional
	public int editEmployee(Emp emp) {
		
		Session sess=sfac.getCurrentSession();
		sess.saveOrUpdate(emp);
		//sess.update(emp);
		return 1;
	}

	@Override
	@Transactional
	public int removeEmployee(int eid) {
		
		Session sess=sfac.getCurrentSession();
		Emp emp = sess.get(Emp.class,eid);
		sess.delete(emp);
		return 1;
	}

	@Override
	@Transactional
	public List<Emp> getEmployee(String dept) {
		Session sess=sfac.getCurrentSession();
		String hql = "from Emp where dept=:edept";
		Query qry = sess.createQuery(hql);
		qry.setParameter("edept", dept);
		List<Emp> lst = qry.list();
		return lst;
		
	}

	@Override
	@Transactional
	public List<Emp> getEmployee() {
		Session sess=sfac.getCurrentSession();
		String hql = "from Emp";
		Query qry = sess.createQuery(hql);
		List<Emp> lst = qry.list();
		return lst;
		
	}



	@Override
	@Transactional
	public List<Emp> getEmployessLike(String name) {
		Session sess=sfac.getCurrentSession();
		String hql = "from Emp where empName like :ename";
		Query qry = sess.createQuery(hql);
		qry.setParameter("ename", "%" + name + "%");
		List<Emp> lst = qry.list();
		return lst;
	}


}
