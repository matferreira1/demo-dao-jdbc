package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("teste 1: seller findbyid");

		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		
		System.out.println("\nteste 2: seller findbydepartment");
		
		Department department = new Department(4, null);
		List<Seller> listFBD = sellerDao.findByDepartment(department);
		for (Seller obj : listFBD) {
			System.out.println(obj);
		}
		
		System.out.println("\nteste 3: seller findall");
		
		
		List<Seller> listFA = sellerDao.findAll();
		for (Seller obj : listFA) {
			System.out.println(obj);
		}
		
		System.out.println("\nteste 4: insert");
		Seller newSeller = new Seller(null, "Tatum" , "tatum@gmail.com", new Date(), 10000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("novo id = " + newSeller.getId());
		
		/*System.out.println("\nteste 5: update");
		seller = sellerDao.findById(10);
		seller.setName("Dornas");
		sellerDao.update(seller);
		System.out.println(sellerDao.findById(10).getName());*/
		
		/*System.out.println("\nteste 6: delete");
		sellerDao.deleteById(5);*/
	}
	

}
