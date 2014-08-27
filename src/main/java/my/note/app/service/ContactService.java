package my.note.app.service;

import java.util.List;

import my.note.app.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
	
}
