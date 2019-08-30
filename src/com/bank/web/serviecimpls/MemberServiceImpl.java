package com.bank.web.serviecimpls;

import java.util.ArrayList;
import java.util.List;

import com.bank.web.domains.CustomerBean;
import com.bank.web.domains.EmployeeBean;
import com.bank.web.domains.MemberBean;
import com.bank.web.services.MemberService;

public class MemberServiceImpl implements MemberService {

	private List<CustomerBean> customers;
	private List<EmployeeBean> employees;
	
	public MemberServiceImpl() {
		customers = new ArrayList<>();
		employees = new ArrayList<>();
	}
	
	@Override
	public void customerJoin(CustomerBean param) {
		customers.add(param);
		
	}

	@Override
	public void employeeJoin(EmployeeBean param) {
		employees.add(param);
		
	}

	@Override
	public List<CustomerBean> findAllCustomers() {
		return customers;
		}

	@Override
	public List<EmployeeBean> findAllEmployees() {
		return employees;
	}

	@Override
	public MemberBean[] findByName(String name) {
		
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(CustomerBean c : customers) {
			if(id.equals(c.getId())) {
				member =c ;
				return member;				
			}
		}
		for(EmployeeBean e : employees) {
			
		}
		return null;
	}

	@Override
	public boolean login(MemberBean param) {
		boolean flag = false;
		return flag;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub
		
	}

}
