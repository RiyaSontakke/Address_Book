package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBook  {
	static Contact readDataFromConsole() {
	Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = scan.next();
		System.out.println("Enter Last Name:");
		String LastName = scan.next();
		System.out.println("Enter Address:");
		String address = scan.next();
		System.out.println("Enter City:");
		String city = scan.next();
		System.out.println("Enter State:");
		String state = scan.next();
		System.out.println("Enter Zip Code:");
		int zipcode = scan.nextInt();
		System.out.println("Enter Phone Number:");
		String phonenumber= scan.next();
		System.out.println("Enter Email:");
		String email = scan.next();
		return new Contact(firstName, LastName, address, city, state, zipcode, phonenumber,email);
		
	}
	static Contact editContact(Contact Contact) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Address");
		Contact.address = sc.next();
		System.out.println("Enter the City");
		Contact.city = sc.next();
		System.out.println("Enter the State");
		Contact.state = sc.next();
		System.out.println("Enter the ZipCode");
		Contact.zipCode = sc.nextInt();
		System.out.println("Enter the contact number...");
		Contact.phoneNumber = sc.next();
		return Contact;
	}	
	static Contact deleteContactDetailsDetails(Contact Contact) {
		return null;
}
	static void menu() {
		Contact ContactDetails = null;
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur choice \n 1 : Add \n 2 : Edit \n 3 : Delete \n 4 : Display ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ContactDetails = readDataFromConsole();
				break;
			case 2:
				System.out.println("Enter the ContactDetails Name to edit details..");
				String firstName = sc.next();
				if (firstName.equals(ContactDetails.firstName)) {
					ContactDetails = editContact(ContactDetails);
				} else {
					System.out.println(firstName + " is not exists ");
				}
				break;
			case 3:
				System.out.println("Enter the ContactDetails name to Delete the Details");
				String firstName1 = sc.next();
				if (firstName1.equals(ContactDetails.firstName)) {
					ContactDetails = deleteContactDetailsDetails(ContactDetails);
				} else {
					System.out.println(firstName1 + " is not exists ");
				}
				break;
			case 4:
				System.out.println(ContactDetails);
				break;
			default:
				System.out.println("Enter numer from 1 to 4");
			}
		}
		 while (choice < 5);

		}
}
	
	
	
	