package com.java.api.examples.demo.process;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.api.examples.demo.service.StudentInformationService;
import com.java.api.examples.demo.ws.reponse.RestWSBaseResponseData;
import com.java.api.examples.demo.ws.reponse.StudentInformationDataResponse;

@Component
public class StudentInformationProcessor {

	@Autowired
	private StudentInformationService mStudentInformationService;

	public StudentInformationDataResponse getStudentInformationData(Long studentdId) throws Exception {

		StudentInformationDataResponse studentInformationDataResponse = null;

		StudentInformationProcess studentInformationProcess = new StudentInformationProcess(mStudentInformationService);

		studentInformationDataResponse = studentInformationProcess.getStudentInformationData(studentdId);

		return studentInformationDataResponse;
	}

	public RestWSBaseResponseData insetUpdateStudentInformationData(String pName, BigInteger pMobileNumber,
			Double pPercentMarks, String pRegisterNumber, Long pStdId) throws Exception {

		RestWSBaseResponseData RestWSBaseResponseData = null;
		
		StudentInformationProcess studentInformationProcess = new StudentInformationProcess(mStudentInformationService);

		RestWSBaseResponseData = studentInformationProcess.insetUpdateStudentInformationData( pName,  pMobileNumber,
				 pPercentMarks,  pRegisterNumber,  pStdId);
		
		return RestWSBaseResponseData;
	}

	public RestWSBaseResponseData deleteStudentInformationData(Long pStudentdId) {

		RestWSBaseResponseData RestWSBaseResponseData = null;
		
		StudentInformationProcess studentInformationProcess = new StudentInformationProcess(mStudentInformationService);

		RestWSBaseResponseData = studentInformationProcess.deleteStudentInformationData( pStudentdId);
		
		return RestWSBaseResponseData;
	}


}
