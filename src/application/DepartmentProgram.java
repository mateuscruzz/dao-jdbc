package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentProgram {
	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("=== TEST 3: department insert ===");
		Department newDep = new Department(null,"Supplies");
		departmentDao.insert(newDep);
		System.out.println("Inserted, New id: " + newDep.getId());
		

		
		System.out.println("=== TEST 4: department update ===");
		Department dep2 = departmentDao.findById(1);
		dep.setName("Hardware");
		departmentDao.update(dep2);
		System.out.println("Updated");
		
		System.out.println("=== TEST 5: department delete ===");
		System.out.println("Enter a department id to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted");
		
		sc.close();
	}
}
