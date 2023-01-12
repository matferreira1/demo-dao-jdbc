package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		//serve para nao expor a implementacao
		return new SellerDaoJDBC(DB.getConnection());
	}

}
