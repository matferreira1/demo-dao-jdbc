package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	//interface para os metodos department
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	

}
