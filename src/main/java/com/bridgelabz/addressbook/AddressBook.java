package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook {
	Scanner scan = new Scanner(System.in);
	
    Contact contact = new Contact();
	public void createContact() {
		System.out.println("Enter First Name:");
		String firstName = scan.next();
		contact.setFirstName(firstName);
		System.out.println("Enter Last Name:");
		String LastName = scan.next();
		contact.setLastName(LastName);
		System.out.println("Enter Address:");
		String address = scan.next();
		contact.setAddress(address);
		System.out.println("Enter City:");
		String city = scan.next();
		contact.setCity(city);
		System.out.println("Enter State:");
		String state = scan.next();
		contact.setState(state);
		System.out.println("Enter Zip Code:");
		int zipcode = scan.nextInt();
		contact.setZipCode(zipcode);
		System.out.println("Enter Phone Number:");
		String phonenumber= scan.next();
		contact.setPhoneNumber(phonenumber);
		System.out.println("Enter Email:");
		String email = scan.next();
		contact.setEmail(email);
		
	}
}