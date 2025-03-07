package com.dkte.pizzaShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dkte.pizzaShop.entities.Customer;
import com.dkte.pizzaShop.util.DButil;

public class customerDao implements AutoCloseable {
	
	private Connection connection;
	
	public customerDao() throws SQLException
	{
		connection = DButil.getConnection();
	}
	
	public void insertCustomer(Customer customer) throws SQLException
	{
		String sql = "Insert Into Customer(name,email,password,mobile) Values (?,?,?,?)";
		try(PreparedStatement insertStatement = connection.prepareCall(sql))
		{
			insertStatement.setString(1, customer.getName());
			insertStatement.setString(2, customer.getEmail());
			insertStatement.setString(3, customer.getPassword());
			insertStatement.setString(4, customer.getMobile());
			
			insertStatement.executeUpdate();	
		}
		
	}
	
	public Customer getCustomer(String email,String password) throws SQLException
	{
		String sql = "Select * from customer where email = ? AND password = ?";
		try(PreparedStatement selectStatement = connection.prepareStatement(sql))
		{
			selectStatement.setString(1,email);
			selectStatement.setString(2,password);
			
			ResultSet rs = selectStatement.executeQuery();
			if(rs.next())
			{
				Customer customer = new Customer();
				customer.setCid(rs.getInt(1));
				customer.setEmail(email);
				customer.setPassword(password);
				customer.setName(rs.getString(2));
				customer.setMobile(rs.getString(5));
				
				return customer;
			}
		}
		return null;
	}

	public void close() throws SQLException
	{
		if(connection != null)
		{
			connection.close();
		}
	}
}
