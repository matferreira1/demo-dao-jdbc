package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	//interface para os metodos seller
	
	void insert(Seller seller);
	void update(Seller seller);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();

}
