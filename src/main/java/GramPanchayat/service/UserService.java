package GramPanchayat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;



import GramPanchayat.model.UserDtls;

public interface UserService {
	
	public UserDtls createUser(UserDtls user,String url);

	public boolean checkEmail(String email);
	
	public boolean verifyAccount(String code);
	
	


}
