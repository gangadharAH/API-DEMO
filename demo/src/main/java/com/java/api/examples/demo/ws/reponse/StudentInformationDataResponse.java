package com.java.api.examples.demo.ws.reponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.java.api.examples.demo.ws.data.StudentInformationWSDatas;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentInformationDataResponse extends RestWSBaseResponseData {

	@XmlElement(name = "studentInformationWSDatas")
	private StudentInformationWSDatas studentInformationWSDatas;

	public StudentInformationWSDatas getStudentInformationWSDatas() {
		return studentInformationWSDatas;
	}

	public void setStudentInformationWSDatas(StudentInformationWSDatas studentInformationWSDatas) {
		this.studentInformationWSDatas = studentInformationWSDatas;
	}

}
