/**
 * 
 */
package com.cogent.dao;

/**
 * @author: Natanim
 *
 * @date: Jan 18, 2023
 */
public interface CustomerDAO {
	void create();
	void read();
	void update(String cid);
	void delete(String id);
	void findById(String cid);
	void findYoung();
}
