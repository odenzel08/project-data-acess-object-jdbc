package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST: Seller findById ====");
		Seller seller = sellerDao.findById(2);
		System.out.println(seller);
		
		System.out.println("\n==== TEST: Seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findById(department);
		System.out.println(list);

	}
}
