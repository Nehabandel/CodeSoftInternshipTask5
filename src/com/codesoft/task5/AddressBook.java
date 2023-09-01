package com.codesoft.task5;

import java.util.ArrayList;

public class AddressBook {
	 private ArrayList<Contact> contacts = new ArrayList<>();

	    public void addContact(Contact contact) {
	        contacts.add(contact);
	    }

	    public void removeContact(String name) {
	        contacts.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
	    }

	    public Contact searchContact(String name) {
	        for (Contact contact : contacts) {
	            if (contact.getName().equalsIgnoreCase(name)) {
	                return contact;
	            }
	        }
	        return null;
	    }

	    public void displayAllContacts() {
	        for (Contact contact : contacts) {
	            contact.display();
	            System.out.println("-------------------------------------------------");
	        }
	    }
}
