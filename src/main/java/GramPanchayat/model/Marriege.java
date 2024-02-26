//
package GramPanchayat.model;
//
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//
//@Entity
//@Table
//public class Marriege {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO) 
//	@Column
//	private  int id; 
//	private  String date_of_birth ;
//	private String Firstname  ;
//	private String Middlename ;
//	private String Lastname ;
//	private String Gender;
//	private String Nationality ;
//	private String Religion;
//	private  int adharcard ;
//	private String Address  ;
//	private int mobilenumber ;
//	
//	private String W_date_of_birth ;
//	private String w_Firstname ;
//	private String  W_Middlename;
//	private String  W_Lastname;
//	
//	private  String  W_Gender;
//	private String  W_Nationality ;
//	private String W_Religion ;
//	private int  W_adharcard;
//	private String  W_Address;
//	private int W_mobilenumber ;
//	private String W_merrage_date_of_Merrage;
//
//	
//
//	public Marriege() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Marriege(int id, String date_of_birth, String firstname, String middlename, String lastname, String gender,
//			String nationality, String religion, int adharcard, String address, int mobilenumber,
//			String w_date_of_birth, String w_Firstname, String w_Middlename, String w_Lastname, String w_Gender,
//			String w_Nationality, String w_Religion, int w_adharcard, String w_Address, int w_mobilenumber,
//			String w_merrage_date_of_Merrage) {
//		super();
//		this.id = id;
//		this.date_of_birth = date_of_birth;
//		Firstname = firstname;
//		Middlename = middlename;
//		Lastname = lastname;
//		Gender = gender;
//		Nationality = nationality;
//		Religion = religion;
//		this.adharcard = adharcard;
//		Address = address;
//		this.mobilenumber = mobilenumber;
//		W_date_of_birth = w_date_of_birth;
//		this.w_Firstname = w_Firstname;
//		W_Middlename = w_Middlename;
//		W_Lastname = w_Lastname;
//		W_Gender = w_Gender;
//		W_Nationality = w_Nationality;
//		W_Religion = w_Religion;
//		W_adharcard = w_adharcard;
//		W_Address = w_Address;
//		W_mobilenumber = w_mobilenumber;
//		W_merrage_date_of_Merrage = w_merrage_date_of_Merrage;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getDate_of_birth() {
//		return date_of_birth;
//	}
//	public void setDate_of_birth(String date_of_birth) {
//		this.date_of_birth = date_of_birth;
//	}
//	public String getFirstname() {
//		return Firstname;
//	}
//	public void setFirstname(String firstname) {
//		Firstname = firstname;
//	}
//	public String getMiddlename() {
//		return Middlename;
//	}
//	public void setMiddlename(String middlename) {
//		Middlename = middlename;
//	}
//	public String getLastname() {
//		return Lastname;
//	}
//	public void setLastname(String lastname) {
//		Lastname = lastname;
//	}
//	public String getGender() {
//		return Gender;
//	}
//	public void setGender(String gender) {
//		Gender = gender;
//	}
//	public String getNationality() {
//		return Nationality;
//	}
//	public void setNationality(String nationality) {
//		Nationality = nationality;
//	}
//	public String getReligion() {
//		return Religion;
//	}
//	public void setReligion(String religion) {
//		Religion = religion;
//	}
//	public int getAdharcard() {
//		return adharcard;
//	}
//	public void setAdharcard(int adharcard) {
//		this.adharcard = adharcard;
//	}
//	public String getAddress() {
//		return Address;
//	}
//	public void setAddress(String address) {
//		Address = address;
//	}
//	public int getMobilenumber() {
//		return mobilenumber;
//	}
//	public void setMobilenumber(int mobilenumber) {
//		this.mobilenumber = mobilenumber;
//	}
//	public String getW_date_of_birth() {
//		return W_date_of_birth;
//	}
//	public void setW_date_of_birth(String w_date_of_birth) {
//		W_date_of_birth = w_date_of_birth;
//	}
//	public String getW_Firstname() {
//		return w_Firstname;
//	}
//	public void setW_Firstname(String w_Firstname) {
//		this.w_Firstname = w_Firstname;
//	}
//	public String getW_Middlename() {
//		return W_Middlename;
//	}
//	public void setW_Middlename(String w_Middlename) {
//		W_Middlename = w_Middlename;
//	}
//	public String getW_Lastname() {
//		return W_Lastname;
//	}
//	public void setW_Lastname(String w_Lastname) {
//		W_Lastname = w_Lastname;
//	}
//	public String getW_Gender() {
//		return W_Gender;
//	}
//	public void setW_Gender(String w_Gender) {
//		W_Gender = w_Gender;
//	}
//	public String getW_Nationality() {
//		return W_Nationality;
//	}
//	public void setW_Nationality(String w_Nationality) {
//		W_Nationality = w_Nationality;
//	}
//	public String getW_Religion() {
//		return W_Religion;
//	}
//	public void setW_Religion(String w_Religion) {
//		W_Religion = w_Religion;
//	}
//	public int getW_adharcard() {
//		return W_adharcard;
//	}
//	public void setW_adharcard(int w_adharcard) {
//		W_adharcard = w_adharcard;
//	}
//	public String getW_Address() {
//		return W_Address;
//	}
//	public void setW_Address(String w_Address) {
//		W_Address = w_Address;
//	}
//	public int getW_mobilenumber() {
//		return W_mobilenumber;
//	}
//	public void setW_mobilenumber(int w_mobilenumber) {
//		W_mobilenumber = w_mobilenumber;
//	}
//	public String getW_merrage_date_of_Merrage() {
//		return W_merrage_date_of_Merrage;
//	}
//	public void setW_merrage_date_of_Merrage(String w_merrage_date_of_Merrage) {
//		W_merrage_date_of_Merrage = w_merrage_date_of_Merrage;
//	}
//	 
//	
//	
//}





@Entity
@Table
public class Marriege{
	
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  
	private int id;
    private String fname;
    private String lname;
    private String fullname;
    private String pob;
    private String address1;
    private String address2;
    private String state;
    private Double zip;
    private String city;
    private Double phone;
    private String dob;
    private String Gender;
    private String DOB_date;
    private Double adhar;
    private String nationality;
    private String religion;
    private String DOB_marriage;
    
    
    
    
    
	public Marriege() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Marriege(int id, String fname, String lname, String fullname, String pob, String address1, String address2,
			String state, Double zip, String city, Double phone, String dob, String gender, String dOB_date,
			Double adhar, String nationality, String religion, String dOB_marriage) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.fullname = fullname;
		this.pob = pob;
		this.address1 = address1;
		this.address2 = address2;
		this.state = state;
		this.zip = zip;
		this.city = city;
		this.phone = phone;
		this.dob = dob;
		Gender = gender;
		DOB_date = dOB_date;
		this.adhar = adhar;
		this.nationality = nationality;
		this.religion = religion;
		DOB_marriage = dOB_marriage;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getFname() {
		return fname;
	}





	public void setFname(String fname) {
		this.fname = fname;
	}





	public String getLname() {
		return lname;
	}





	public void setLname(String lname) {
		this.lname = lname;
	}





	public String getFullname() {
		return fullname;
	}





	public void setFullname(String fullname) {
		this.fullname = fullname;
	}





	public String getPob() {
		return pob;
	}





	public void setPob(String pob) {
		this.pob = pob;
	}





	public String getAddress1() {
		return address1;
	}





	public void setAddress1(String address1) {
		this.address1 = address1;
	}





	public String getAddress2() {
		return address2;
	}





	public void setAddress2(String address2) {
		this.address2 = address2;
	}





	public String getState() {
		return state;
	}





	public void setState(String state) {
		this.state = state;
	}





	public Double getZip() {
		return zip;
	}





	public void setZip(Double zip) {
		this.zip = zip;
	}





	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	public Double getPhone() {
		return phone;
	}





	public void setPhone(Double phone) {
		this.phone = phone;
	}





	public String getDob() {
		return dob;
	}





	public void setDob(String dob) {
		this.dob = dob;
	}





	public String getGender() {
		return Gender;
	}





	public void setGender(String gender) {
		Gender = gender;
	}





	public String getDOB_date() {
		return DOB_date;
	}





	public void setDOB_date(String dOB_date) {
		DOB_date = dOB_date;
	}





	public Double getAdhar() {
		return adhar;
	}





	public void setAdhar(Double adhar) {
		this.adhar = adhar;
	}





	public String getNationality() {
		return nationality;
	}





	public void setNationality(String nationality) {
		this.nationality = nationality;
	}





	public String getReligion() {
		return religion;
	}





	public void setReligion(String religion) {
		this.religion = religion;
	}





	public String getDOB_marriage() {
		return DOB_marriage;
	}





	public void setDOB_marriage(String dOB_marriage) {
		DOB_marriage = dOB_marriage;
	}








    
    


}


