package com.dkte.pizzaShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dkte.pizzaShop.entities.pizza;
import com.dkte.pizzaShop.util.DButil;

public class pizzaDao implements AutoCloseable{
	
private Connection connection;
	
	public pizzaDao() throws SQLException
	{
		connection = DButil.getConnection();
	}
	
	public List<pizza> getAllPizza() throws SQLException
	{
		String sql = "Select * from menu";
		List <pizza> pizzaList = new ArrayList<pizza>();
		try(PreparedStatement selectStatement = connection.prepareCall(sql))
		{
			ResultSet rs = selectStatement.executeQuery();
			while(rs.next()) {
				pizza pizza = new pizza();
				pizza.setMid(rs.getInt(1));
				pizza.setName(rs.getString(2));
				pizza.setDesc(rs.getString(3));
				pizza.setPrice(rs.getDouble(4));
				
				pizzaList.add(pizza);
			}
			return pizzaList;
		}
	}
	
	public void close() throws SQLException
	{
		if(connection != null)
		{
			connection.close();
		}
	}

}
