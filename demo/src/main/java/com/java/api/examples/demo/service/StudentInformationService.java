package com.java.api.examples.demo.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.api.examples.demo.entity.StudentInformationEntity;

@Service
public interface StudentInformationService {

	List<StudentInformationEntity> getStudentInformationData(Long studentdId) throws Exception;

	void updateStudentInformationData(String pName, BigInteger pMobileNumber, Double pPercentMarks,
			String pRegisterNumber, Long pStdId) throws Exception;

	void insertStudentInformationData(String pName, BigInteger pMobileNumber, Double pPercentMarks,
			String pRegisterNumber) throws Exception;

	void deleteStudentInformationData(Long pStudentdId) throws Exception;

}
