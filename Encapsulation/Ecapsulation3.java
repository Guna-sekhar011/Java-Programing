/* Design a Customer class in Java with private attributes for customer
information, including`id`, `name`, `email`, `phone`, `password`, and
`address`.Create an appropriate constructor and implement encapsulation by
providing appropriate getters and setters for each attribute.
Create an object of Customer & take the inputs from the user, set the values
using constructor display the values using getters. */


package com.Encapsulation;

import java.util.Scanner;

class Customer{
	private int id;
	private String name;
	private String email;
	private String address;
	private int phone;
	private int password;
	
	Customer(){
		
	}
	Customer(int id,String name,String email,int phone, int password ,String address){
		this.id=id;
		this.name = name;
		this.email= email;
		this.phone=phone;
		this.password=password;
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public int getPhone() {
		return phone;
	}
	public int getPassword() {
		return password;
	}
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
	
	
}

public class Ecapsulation3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String details = scan.nextLine();
		String[] arr = details.split(",");
		int id = Integer.parseInt(arr[0]);
		String name = arr[1];
		String email = arr[2];
		int phone = Integer.parseInt(arr[3]);
		int password = Integer.parseInt(arr[4]);
		String address = arr[5];
		
		Customer c = new Customer(id,name,email,phone,password,address);
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getEmail());
		System.out.println(c.getPhone());
		System.out.println(c.getPassword());
		System.out.println(c.getAddress());

		
		
		scan.close();
		

	}

}
