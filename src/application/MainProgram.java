package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import db.DB;
import db.DbIntegrityException;
import model.entities.Department;
import model.entities.Seller;

public class MainProgram {

	public static void main(String[] args) {
		
		Department d = new Department(5,"teste");
		
		System.out.println(d);
		
		Seller s = new Seller(1,"name","name@gmail",new Date(),2000.0,d);
		System.out.println(s);
	}
}
