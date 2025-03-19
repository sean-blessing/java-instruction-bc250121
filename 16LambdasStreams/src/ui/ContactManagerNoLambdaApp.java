package ui;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import util.MyConsole;

public class ContactManagerNoLambdaApp {

	public static void main(String[] args) {
		MyConsole.printHeader("Welcome to the Contact Manager - Lambda Free!");

		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528")); 
		contacts.add(new Contact("Anne Boehm", null, null)); 
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		// show all contacts
		displayContacts(contacts, "All Contacts");
		
		// show contacts - missing phone #s
		List<Contact> contactsNoPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone()==null) {
				contactsNoPhone.add(c);
			}
		}
		displayContacts(contactsNoPhone, "Contacts - no phone");
		
		// show contacts - missing emails
		List<Contact> contactsNoEmail = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getEmail()==null) {
				contactsNoEmail.add(c);
			}
		}
		displayContacts(contactsNoEmail, "Contacts - no email");
		
		
		MyConsole.printLine("\nBye");
	}
	
	private static void displayContacts(List<Contact> contacts, String header) {
		MyConsole.printHeader(header, "-");
		for (Contact c: contacts) {
			MyConsole.printLine(c.toString());
		}
	}

}
