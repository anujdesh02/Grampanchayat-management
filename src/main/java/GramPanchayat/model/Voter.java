package GramPanchayat.model;
//
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//
//@Entity
//@Table
//public class Voter {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column
//	private  int id;
//	private  String date_of_birth;
//	private String  Firstname;
//	private String Middlename;
//	private String Lastname;
//	private String Gender;
//	private String adharcard;
//	private String Address;
//	private int mobilenumber;
//	
//	public Voter(int id, String date_of_birth, String firstname, String middlename, String lastname, String gender,
//			String adharcard, String address, int mobilenumber) {
//		super();
//		this.id = id;
//		this.date_of_birth = date_of_birth;
//		Firstname = firstname;
//		Middlename = middlename;
//		Lastname = lastname;
//		Gender = gender;
//		this.adharcard = adharcard;
//		Address = address;
//		this.mobilenumber = mobilenumber;
//	}
//	public Voter() {
//		super();
//		// TODO Auto-generated constructor stub
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
//	public String getAdharcard() {
//		return adharcard;
//	}
//	public void setAdharcard(String adharcard) {
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
//}





@Entity
@Table
public class Voter{
	
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
    
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voter(int id, String fname, String lname, String fullname, String pob, String address1, String address2,
			String state, Double zip, String city, Double phone, String dob, String gender, String dOB_date,
			Double adhar) {
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

	

}

