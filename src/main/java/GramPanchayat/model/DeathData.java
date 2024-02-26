package GramPanchayat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//
//import lombok.NonNull;
//
//@Entity
//@Table
//public class DeathData {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//    // APPLICATION
//	@NonNull
//	private String date_of_birth;
//	private String date_of_death;
//	private String fullname;
//	private String Gender;
//	private String place_of_birth;
//	private String father_husband_name;
//	 
//	//PERMEANT; ADDRESS
//	
//	private String flatno;
//	private String street_name;
//	private String state;
//	private String city;
//	private String pincode;
//	
//	// POST ADDRESS
//	
//	private String d_flateno;
//	private String d_street_name;
//	private String d_state;
//	private String d_city;
//	private String d_pincode;
//	private long d_contact_number;
//	private String d_email;
//	public DeathData() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public DeathData(int id, String date_of_birth, String date_of_death, String fullname, String gender,
//			String place_of_birth, String father_husband_name, String flatno, String street_name, String state,
//			String city, String pincode, String d_flateno, String d_street_name, String d_state, String d_city,
//			String d_pincode, long d_contact_number, String d_email) {
//		super();
//		this.id = id;
//		this.date_of_birth = date_of_birth;
//		this.date_of_death = date_of_death;
//		this.fullname = fullname;
//		Gender = gender;
//		this.place_of_birth = place_of_birth;
//		this.father_husband_name = father_husband_name;
//		this.flatno = flatno;
//		this.street_name = street_name;
//		this.state = state;
//		this.city = city;
//		this.pincode = pincode;
//		this.d_flateno = d_flateno;
//		this.d_street_name = d_street_name;
//		this.d_state = d_state;
//		this.d_city = d_city;
//		this.d_pincode = d_pincode;
//		this.d_contact_number = d_contact_number;
//		this.d_email = d_email;
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
//	public String getDate_of_death() {
//		return date_of_death;
//	}
//	public void setDate_of_death(String date_of_death) {
//		this.date_of_death = date_of_death;
//	}
//	public String getFullname() {
//		return fullname;
//	}
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
//	public String getGender() {
//		return Gender;
//	}
//	public void setGender(String gender) {
//		Gender = gender;
//	}
//	public String getPlace_of_birth() {
//		return place_of_birth;
//	}
//	public void setPlace_of_birth(String place_of_birth) {
//		this.place_of_birth = place_of_birth;
//	}
//	public String getFather_husband_name() {
//		return father_husband_name;
//	}
//	public void setFather_husband_name(String father_husband_name) {
//		this.father_husband_name = father_husband_name;
//	}
//	public String getFlatno() {
//		return flatno;
//	}
//	public void setFlatno(String flatno) {
//		this.flatno = flatno;
//	}
//	public String getStreet_name() {
//		return street_name;
//	}
//	public void setStreet_name(String street_name) {
//		this.street_name = street_name;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getPincode() {
//		return pincode;
//	}
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//	public String getD_flateno() {
//		return d_flateno;
//	}
//	public void setD_flateno(String d_flateno) {
//		this.d_flateno = d_flateno;
//	}
//	public String getD_street_name() {
//		return d_street_name;
//	}
//	public void setD_street_name(String d_street_name) {
//		this.d_street_name = d_street_name;
//	}
//	public String getD_state() {
//		return d_state;
//	}
//	public void setD_state(String d_state) {
//		this.d_state = d_state;
//	}
//	public String getD_city() {
//		return d_city;
//	}
//	public void setD_city(String d_city) {
//		this.d_city = d_city;
//	}
//	public String getD_pincode() {
//		return d_pincode;
//	}
//	public void setD_pincode(String d_pincode) {
//		this.d_pincode = d_pincode;
//	}
//	public long getD_contact_number() {
//		return d_contact_number;
//	}
//	public void setD_contact_number(long d_contact_number) {
//		this.d_contact_number = d_contact_number;
//	}
//	public String getD_email() {
//		return d_email;
//	}
//	public void setD_email(String d_email) {
//		this.d_email = d_email;
//	}
//
//	
//
//}












@Entity
@Table
public class DeathData{
	
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
    private String eaddress;
    private Double phone;
    private String dob;
    private String Gender;
    private String DOB_date;
    private String DOD_date;
	public DeathData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeathData(int id, String fname, String lname, String fullname, String pob, String address1, String address2,
			String state, Double zip, String city, String eaddress, Double phone, String dob, String gender,
			String dOB_date, String dOD_date) {
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
		this.eaddress = eaddress;
		this.phone = phone;
		this.dob = dob;
		Gender = gender;
		DOB_date = dOB_date;
		DOD_date = dOD_date;
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
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
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
	public String getDOD_date() {
		return DOD_date;
	}
	public void setDOD_date(String dOD_date) {
		DOD_date = dOD_date;
	}
    
    
    
	
}

