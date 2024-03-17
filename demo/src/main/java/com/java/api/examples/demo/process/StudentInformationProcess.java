package com.java.api.examples.demo.process;

import java.math.BigInteger;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.java.api.examples.demo.entity.StudentInformationEntity;
import com.java.api.examples.demo.mapper.ModelMapperUtil;
import com.java.api.examples.demo.service.StudentInformationService;
import com.java.api.examples.demo.ws.data.StudentInformationWSData;
import com.java.api.examples.demo.ws.data.StudentInformationWSDatas;
import com.java.api.examples.demo.ws.reponse.RestWSBaseResponseData;
import com.java.api.examples.demo.ws.reponse.StudentInformationDataResponse;

public class StudentInformationProcess {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentInformationProcess.class);

	private StudentInformationService mStudentInformationService;

	public StudentInformationProcess(StudentInformationService pStudentInformationService) {

		mStudentInformationService = pStudentInformationService;
	}

	public StudentInformationDataResponse getStudentInformationData(Long studentdId) throws Exception {

		LOGGER.info("Entered into StudentInformationProcess.getStudentInformationData()");
		StudentInformationDataResponse studentInformationDataResponse = new StudentInformationDataResponse();

		StudentInformationWSDatas studentInformationWSDatas = new StudentInformationWSDatas();

		List<StudentInformationEntity> studentInformationEntityList = mStudentInformationService
				.getStudentInformationData(studentdId);

		List<StudentInformationWSData> studentInformationWSDataList = ModelMapperUtil
				.mapList(studentInformationEntityList, StudentInformationWSData.class);

		studentInformationWSDatas.setStudentInformationWSDataList(studentInformationWSDataList);

		studentInformationDataResponse.setStudentInformationWSDatas(studentInformationWSDatas);

		LOGGER.info("Exited from StudentInformationProcess.getStudentInformationData()");

		return studentInformationDataResponse;

	}

	public RestWSBaseResponseData insetUpdateStudentInformationData(String pName, BigInteger pMobileNumber,
			Double pPercentMarks, String pRegisterNumber, Long pStdId) {

		RestWSBaseResponseData responseData = new RestWSBaseResponseData();

		try {

			if (pStdId != null) {

				mStudentInformationService.updateStudentInformationData(pName, pMobileNumber, pPercentMarks,
						pRegisterNumber, pStdId);

			} else {
				mStudentInformationService.insertStudentInformationData(pName, pMobileNumber, pPercentMarks,
						pRegisterNumber);
			}

		} catch (Exception e) {
			responseData = new RestWSBaseResponseData();
			responseData.setErrorDescription(e);
		}

		return responseData;
	}

	public RestWSBaseResponseData deleteStudentInformationData(Long pStudentdId) {

		RestWSBaseResponseData responseData = null;
		try {
			mStudentInformationService.deleteStudentInformationData(pStudentdId);

		} catch (Exception e) {
			responseData = new RestWSBaseResponseData();
			responseData.setErrorDescription(e);
		}

		return responseData;
	}

}
