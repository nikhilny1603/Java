package com.dkte.pizzaShop.menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dkte.pizzaShop.dao.orderDao;
import com.dkte.pizzaShop.dao.pizzaDao;
import com.dkte.pizzaShop.entities.Customer;
import com.dkte.pizzaShop.entities.pizza;

public class subMenu {
	
	public static int menu(Scanner sc)
	{
		System.out.println("0.Logout");
		System.out.println("1.Pizza Menu");
		System.out.println("2.Order a Pizza");
		System.out.println("3.Order History");
		int choice = sc.nextInt();
		System.out.println("*****************");
		return choice;
	}
	
	public static void displayMenu()
	{
		try(pizzaDao pizzaDao = new pizzaDao())
		{
			List<pizza> pizzaList = pizzaDao.getAllPizza();
			pizzaList.forEach(p->System.out.println(p));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void orderPizza(Scanner sc,int cid)
	{
		try(orderDao orderdao = new orderDao())
		{
			System.out.println("Enter menu id : ");
			int mid = sc.nextInt();
			
			orderdao.PlaceOrder(cid, mid);
			System.out.println("Order placed ....");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	public static void getOrders(int cid)
	{
		try(orderDao orderdao = new orderDao())
		{
			List<pizza> orderList = orderdao.getAllOrder(cid);
			orderList.forEach((c->System.out.println(c)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void submenu(Scanner sc , Customer customer) {
		int choice;
		System.out.println("Login successful....");
		while((choice = menu(sc))!= 0)
		{
			switch (choice) {
			case 1:
				System.out.println("Pizza menu");
				displayMenu();
				break;
				
			case 2:
				System.out.println("Order a pizza");
				orderPizza(sc, customer.getCid());
				break;
				
			case 3:
				System.out.println("Order history");
				
				break;

			default:
				System.out.println("Invalid credentials....:(");
				break;
			}
	}

	}
}
