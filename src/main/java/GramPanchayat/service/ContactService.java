package GramPanchayat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import GramPanchayat.model.ContactData;
import GramPanchayat.repository.ContactRepo;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepo ConRepo;
	
	public void SaveContact(ContactData c)
	{
		ConRepo.save(c);
	}
	

}

