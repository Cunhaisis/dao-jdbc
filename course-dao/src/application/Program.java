package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println("=== TEST1: Seller findById =====");
		
		Seller seller = sellerDao.findById(7);
		
		System.out.println(seller);
	}

}
