package com.Encapsulation;

import java.util.Scanner;

class Customer11{
	private int id;
	private String name;
	private String email;
	private long phone;
	private String password;
	private String address;
	
	Customer11(){
		
	}
	
	public Customer11(int id, String name, String email, String address, long phone, String password) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.password = password;
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

	public long getPhone() {
		return phone;
	}

	public String getPassword() {
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

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}


public class Encapsulation4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		scan.nextLine();
		String name = scan.nextLine();
		String email = scan.nextLine();
		long phone = scan.nextLong();
		scan.nextLine();
		String password = scan.nextLine();
		String address = scan.nextLine();
		if(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com")) {
			Customer11 c = new Customer11(id,name,email,address,phone,password);
			
			System.out.println(c.getId());
			System.out.println(c.getName());
			System.out.println(c.getEmail());
			System.out.println(c.getPhone());
			System.out.println(c.getPassword());
			System.out.println(c.getAddress());
		}
		else {
			System.out.println("Invalid email id!!");
		}
		
		scan.close();

	}

}
