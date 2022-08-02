package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programm {

	public static void main(String[] args) {
				
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==========   TEST 1: Seller FindById()   ==========");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller+"\n");
		
		System.out.println("==========   TEST 2: Seller FindByDepartment()   ==========");
		Department department = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		sellers.forEach(System.out::println);
		System.out.println();
		
		System.out.println("==========   TEST 3: Seller FindAll()   ==========");		
		sellers = sellerDao.findAll();
		sellers.forEach(System.out::println);
	}

}
