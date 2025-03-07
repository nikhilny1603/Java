package com.dkte.pizzaShop.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.dkte.pizzaShop.dao.customerDao;
import com.dkte.pizzaShop.entities.Customer;

public class mainMenu {
	
	public static int menu(Scanner sc)
	{
		System.out.println("*******Welcome to Pizza Store*******");
		System.out.println("0.Exit");
		System.out.println("1.Login");
		System.out.println("2.Register");
		int choice = sc.nextInt();
		System.out.println("************************************");
		return choice;
	}
	
	public static void registerCustomer(Scanner sc)
	{
		Customer customer = new Customer();
		customer.accept(sc);
		System.out.println("Successful");
		
		try(customerDao CustomerDao = new customerDao())
		{
			CustomerDao.insertCustomer(customer);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	private static Customer loginCustomer(Scanner sc)
	{
		try(customerDao customerDao = new customerDao())
		{
			System.out.println("Enter an email : ");
			String email = sc.next();
			System.out.println("Enter password : ");
			String password = sc.next(); 
			
			return customerDao.getCustomer(email, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while((choice = menu(sc))!= 0)
		{
			switch (choice) {
			case 1:
				Customer customer = loginCustomer(sc);
				if(customer != null)
				{
					subMenu.submenu(sc,customer);
				}
				else
				{
					System.out.println("Invalid customer ....");
				}
				break;
				
			case 2:
				registerCustomer(sc);
				break;

			default:
				System.out.println("Invalid credentials....:(");
				break;
			}
			
		}

	}

}
