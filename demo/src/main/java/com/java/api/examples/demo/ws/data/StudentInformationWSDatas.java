package com.java.api.examples.demo.ws.data;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class StudentInformationWSDatas {

	@XmlElement(name = "studentInformationWSDataList")
	private List<StudentInformationWSData> studentInformationWSDataList;

	public List<StudentInformationWSData> getStudentInformationWSDataList() {
		return studentInformationWSDataList;
	}

	public void setStudentInformationWSDataList(List<StudentInformationWSData> studentInformationWSDataList) {
		this.studentInformationWSDataList = studentInformationWSDataList;
	}
	
	
}
