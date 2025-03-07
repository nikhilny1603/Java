package com.dkte.pizzaShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dkte.pizzaShop.entities.pizza;
import com.dkte.pizzaShop.util.DButil;

public class orderDao implements AutoCloseable{
	Connection connection;
	
	public orderDao() throws SQLException
	{
		connection = DButil.getConnection();
	}
	
	public void PlaceOrder(int cid,int mid) throws SQLException
	{
		String sql = "Insert Into order(oid,cid,mid) values ( ?,?,?)";
		try(PreparedStatement insertStatement = connection.prepareCall(sql))
		{
			insertStatement.setInt(1, cid);
			insertStatement.setInt(2, mid);
			insertStatement.executeUpdate();
		}
	}
	
	public List<pizza> getAllOrder(int cid) throws SQLException
	{
		List<pizza> orderList = new ArrayList<pizza>();
		String sql = "select m.* from menu m inner join order o on o.mid = m.mid where o.cid = ?";
		try(PreparedStatement selectStatement = connection.prepareCall(sql))
		{
			selectStatement.setInt(1, cid);
			ResultSet rs = selectStatement.executeQuery();
			while(rs.next())
			{
				pizza Pizza = new pizza();
				Pizza.setMid(cid);
				Pizza.setName(rs.getString(2));
				Pizza.setDesc(sql);
				Pizza.setPrice(rs.getDouble(4));
				
				orderList.add(Pizza);
			}
			return orderList;
		}
	}

	@Override
	public void close() throws Exception {
		if(connection != null)
		{
			connection.close();
		}
	}
}
