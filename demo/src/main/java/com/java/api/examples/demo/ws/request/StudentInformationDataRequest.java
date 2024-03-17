package com.java.api.examples.demo.ws.request;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;

@XmlAccessorType(XmlAccessType.FIELD)
public class StudentInformationDataRequest {

	@XmlSchemaType(name = "stdId")
	private Long stdId;

	@XmlSchemaType(name = "name")
	private String name;

	@XmlSchemaType(name = "registerNumber")
	private String registerNumber;

	@XmlSchemaType(name = "percentMarks")
	private Double percentMarks;

	@XmlSchemaType(name = "mobileNumber")
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
