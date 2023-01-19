/**
 * 
 */
package com.cogent.service;

/**
 * @author: Natanim
 *
 * @date: Jan 18, 2023
 */
import com.cogent.dao.*;
public class CustomerService {
	CustomerDAOImpl cdao;
	
	public CustomerService() {
		cdao = new CustomerDAOImpl();
	}
	
	public void save() {
		cdao.create();
	}
	
	public void fetch() {
		cdao.read();
	}

	public void modify(String cid) {
		cdao.update(cid);
	}

	public void remove(String id) {
		cdao.delete(id);
	}
	
	public void search(String cfid) {
		cdao.findById(cfid);
	}
	
	public void young() {
		cdao.findYoung();
	}
}
