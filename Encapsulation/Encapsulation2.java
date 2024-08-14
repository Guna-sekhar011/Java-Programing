package com.Encapsulation;

import java.util.Scanner;

class Customer{
	private int id;
	private String name;
	private String email;
	private String address;
	private int phone;
	private int password;
	
	public void setId(int id) {
		this.id = id;
		}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public void getId() {
		System.out.println(id);
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void getEmail() {
		System.out.println(email);
	}
	
	public void getAddress() {
		System.out.println(address);
	}
	
	public void getPhone() {
		System.out.println(phone);
	}
	
	public void getPassword() {
		System.out.println(password);
	}
}


public class Encapsulation2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Customer[] arr = new Customer[num];
		
		for(int i=0;i<arr.length;i++) {
			int id = scan.nextInt();
			scan.nextLine();
			String name = scan.nextLine();
			String email = scan.nextLine();
			int phone = scan.nextInt();
			int password = scan.nextInt();
			scan.nextLine();
			String address = scan.nextLine();
			
			Customer c = new Customer();
			
			c.setId(id);
			c.setName(name);
			c.setEmail(email);
			c.setPhone(phone);
			c.setPassword(password);
			c.setAddress(address);
			
			arr[i] = c;
			
		}		
		
		for(int i=0;i<arr.length;i++) {
			arr[i].getId();
			arr[i].getName();
			arr[i].getEmail();
			arr[i].getPhone();
			arr[i].getPassword();
			arr[i].getAddress();
		}
		scan.close();
	}

}
