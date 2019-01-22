package com.gpch.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
        
        
        try {
			Connection conn = DriverManager.getConnection( 
			        "jdbc:mysql://localhost:3306/login?user=root&password=123@abc");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
            // Statement st = conn.createStatement();
            // ResultSet rs = st.executeQuery( "select * from table" );

            System.out.println("Connected?");
        
       
    }
}
