package com.lti.appl.homeloan.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Transient;




@SuppressWarnings("serial")
@Entity
@Table(name = "customer2")
public class Customer implements Serializable {

	@Id
	@Column(name = "APP_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APP_ID_GEN")
	@SequenceGenerator(name = "APP_ID_GEN", sequenceName = "APP_ID_SEQ")
	// Applicant ID - generated by the given sequence
	private Integer appId;

	@Column(name = "first_name")
	@Size(min = 2, max = 20, message = "FIRST NAME can vary between 2 to 20 characters")
	@NotNull(message = "FIRST NAME cannot be empty")
	@Pattern(regexp = "[A-Za-z]+", message = "FIRST NAME can only be alphabets")
	// First Name - Mandatory
	private String firstName;

	@Column(name = "middle_name")
	@Pattern(regexp = "[A-Za-z]*", message = "MIDDLE NAME can only be alphabets")
	// Middle Name - Not Mandatory
	private String middleName;

	@Column(name = "last_name")
	@Size(min = 2, max = 20, message = "LAST NAME can vary between 2 to 20 characters")
	@NotNull(message = "LAST NAME cannot be empty")
	@Pattern(regexp = "[A-Za-z]+", message = "LAST NAME can only be alphabets")
	// Last Name - Mandatory
	private String lastName;

	@NotNull(message = "EMAIL is mandatory")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Please enter a valid email Id")
	// Email - Mandatory
	private String email;

	@NotNull(message = "PASSWORD is mandatory")
	@Size(min = 5, max = 12, message = "Mandatory Password Length between 8-12 characters")
	// Password - Mandatory
	private String password;

	@NotNull(message = "Confirm PASSWORD is mandatory")
	@Size(min = 5, max = 12, message = "Mandatory Password Length between 8-12 characters")
	@Transient
	private String confirmPwd;

	@Column(name = "phone_no")
	@Size(min = 10, max = 10, message = "Enter valid Phone Number")
	@Pattern(regexp = "^\\+?[0-9-]+$", message = "Phone Number can only be Numbers")
	@NotNull(message = "Phone No is mandatory")
	// Phone Number - Mandatory
	private String phoneNo;

	//@DateTimeFormat(pattern = "MM/dd/yyyy")
	@Pattern(regexp="^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$" , message="Valid date format is 01/01/11 Or 01/01/2011")
	@NotNull(message = "DOB is mandatory")
	// DOB - Mandatory
	private String dob;

	@NotNull(message = "Please select your Gender")
	// Gender - Mandatory
	private String gender;

	@NotNull(message = "Please select your Nationality")
	@Pattern(regexp = "[A-Za-z]+", message = "Nationality can only be alphabets")
	// Nationality - Mandatory
	private String nationality;

	@Column(name = "aadhar_no")
	@Size(min = 12, max = 12, message = "Length should be 12 characters")
	@NotNull(message = "Aadhar Number is Mandatory")
	@Pattern(regexp = "^\\+?[0-9-]+$", message = "Enter valid Aadhar Number")
	private String aadharNo;

	@Column(name = "pan_no")
	@Size(min = 10, max = 10, message = "Length should be 10 characters")
	@NotNull(message = "PAN Number is Mandatory")
	@Pattern(regexp = "^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$", message = "Enter valid PAN Number")
	private String panNo;

	/* @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL) */
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private PropertyAndIncome propertyAndIncome;

	/* @OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL) */
	@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private Loan loan;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Document> docs;

	/*@OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
	private Login login;*/

	public Customer() {

	}

	public Customer(Integer appId, String firstName, String middleName, String lastName, String email, String password,
			String confirmPwd, String phoneNo, String dob, String gender, String nationality, String aadharNo,
			String panNo) {
		super();
		this.appId = appId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPwd = confirmPwd;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
	}

	public Integer getAppId() {
		return appId;
	}

	public void setAppId(Integer appId) {
		this.appId = appId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getconfirmPwd() {
		return confirmPwd;
	}

	public void setconfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public PropertyAndIncome getPropertyAndIncome() {
		return propertyAndIncome;
	}

	public void setPropertyAndIncome(PropertyAndIncome propertyAndIncome) {
		this.propertyAndIncome = propertyAndIncome;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public List<Document> getDocs() {
		return docs;
	}

	public void setDocs(List<Document> document) {
		this.docs = document;
	}

	@Override
	public String toString() {
		return "Customer [appId=" + appId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", email=" + email + ", password=" + password + ", confirmPwd=" + confirmPwd + ", phoneNo="
				+ phoneNo + ", dob=" + dob + ", gender=" + gender + ", nationality=" + nationality + ", aadharNo="
				+ aadharNo + ", panNo=" + panNo + ", propertyAndIncome=" + propertyAndIncome + ", loan=" + loan
				+ ", docs=" + docs + "]";
	}

}
