package com.java.api.examples.demo.entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentInformation", schema = "Students")
public class StudentInformationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_ID")
	private Long stdId;

	@Column(name = "Name")
	private String name;

	@Column(name = "Register_Number")
	private String registerNumber;

	@Column(name = "Percent_Marks")
	private Double percentMarks;

	@Column(name = "Mobile_Number")
	private BigInteger mobileNumber;

	public Long getStdId() {
		return stdId;
	}

	public void setStdId(Long stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterNumber() {
		return registerNumber;
	}

	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}

	public Double getPercentMarks() {
		return percentMarks;
	}

	public void setPercentMarks(Double percentMarks) {
		this.percentMarks = percentMarks;
	}

	public BigInteger getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
