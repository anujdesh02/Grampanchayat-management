package GramPanchayat.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class ApplyCertificate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String email;
	private String certificate_type;
	private String images;
	private String comments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCertificate_type() {
		return certificate_type;
	}
	public void setCertificate_type(String certificate_type) {
		this.certificate_type = certificate_type;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "ApplyCertificate [id=" + id + ", name=" + name + ", email=" + email + ", certificate_type="
				+ certificate_type + ", images=" + images + ", comments=" + comments + "]";
	}
	public ApplyCertificate(int id, String name, String email, String certificate_type, String images,
			String comments) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.certificate_type = certificate_type;
		this.images = images;
		this.comments = comments;
	}
	public ApplyCertificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}