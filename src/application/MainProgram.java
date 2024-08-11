package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;
import model.entities.Department;

public class MainProgram {

	public static void main(String[] args) {
		
		Department obj = new Department(5,"teste");
		
		System.out.println(obj);
	}
}
