package GramPanchayat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import GramPanchayat.model.UserDtls;


public interface UserRepository extends JpaRepository<UserDtls, Integer>{

	public boolean existsByEmail(String email);

	public UserDtls findByEmail(String email);
	
	
//	public UserDtls loadResetPassword(String em,String mobno);
	public UserDtls findByEmailAndMobileNumber(String em,String mobno);
	
	public UserDtls findByVerificationCode(String code);
}
