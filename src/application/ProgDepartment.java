package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgDepartment {

	public static void main(String[] args) {
		
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
			
		
		System.out.println("\nteste 1: insert");
		Department dep = new Department(null, "Software");
		depDao.insert(dep);
		System.out.println("novo id = " + dep.getId());

	}

}
