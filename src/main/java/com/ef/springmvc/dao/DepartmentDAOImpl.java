package com.ef.springmvc.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ef.springmvc.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List< Department > getDepartment() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery < Department > cq = cb.createQuery(Department.class);
        Root < Department > root = cq.from(Department.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }
	
	@Override
	public void deleteDepartment(int id) {
		 Session session = sessionFactory.getCurrentSession();
	        Department book = session.byId(Department.class).load(id);
	        session.delete(book);
	    }

	    @Override
	    public void saveDepartment(Department theDepartment) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        currentSession.saveOrUpdate(theDepartment);
	    }

	    @Override
	    public Department getDepartment(int theId) {
	        Session currentSession = sessionFactory.getCurrentSession();
	        Department theDepartment = currentSession.get(Department.class, theId);
	        return theDepartment;
	    }
	
	}
	


