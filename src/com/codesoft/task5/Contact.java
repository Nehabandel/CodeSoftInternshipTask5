package com.codesoft.task5;

public class Contact {
	private String name;
	private String surname;
	private String address;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name,String surname,String address, 
    		String phoneNumber, String emailAddress) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Address: "+ address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
    }
}