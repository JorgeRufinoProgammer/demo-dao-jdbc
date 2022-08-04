package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Programm2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("==========   TEST 1: Department FindAll()   ==========");

		List<Department> departments = departmentDao.findAll();
		departments.forEach(System.out::println);
		System.out.println();

		System.out.println("==========   TEST 2: Department FindById()   ==========");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);		
		System.out.println();

//		System.out.println("==========   TEST 3: Department insert()   ==========");
//		dep = new Department(null, "Acessorios");
//		departmentDao.insert(dep);
//		System.out.println(dep);
//		System.out.println();

		System.out.println("==========   TEST 4: Department update()   ==========");
		dep = departmentDao.findById(6);
		dep.setName("Brinquedos");
		departmentDao.update(dep);
		
		System.out.println();

		System.out.println("==========   TEST 5: Department delete()   ==========");
		departmentDao.deleteById(9);
		
	}

}
