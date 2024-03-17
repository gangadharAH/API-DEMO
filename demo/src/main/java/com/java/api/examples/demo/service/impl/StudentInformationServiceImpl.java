package com.java.api.examples.demo.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.api.examples.demo.entity.StudentInformationEntity;
import com.java.api.examples.demo.repository.StudentInformationDao;
import com.java.api.examples.demo.service.StudentInformationService;
import com.java.api.examples.exception.NoDataFoundException;

@Service
public class StudentInformationServiceImpl implements StudentInformationService {

	@Autowired
	private StudentInformationDao mStudentInformationDao;

	@Override
	public List<StudentInformationEntity> getStudentInformationData(Long studentdId) throws Exception {

		List<StudentInformationEntity> studentInformationEntity = null;

		studentInformationEntity = mStudentInformationDao.findByStdId(studentdId);

		if (studentInformationEntity == null || studentInformationEntity.isEmpty()) {
			throw new NoDataFoundException("No student information found for student ID: " + studentdId);
		}

		return studentInformationEntity;
	}

	@Override
	public void updateStudentInformationData(String pName, BigInteger pMobileNumber, Double pPercentMarks,
			String pRegisterNumber, Long pStdId) throws Exception {

		StudentInformationEntity studentInformationEntity = new StudentInformationEntity();

		studentInformationEntity.setStdId(pStdId);
		studentInformationEntity.setName(pName);
		studentInformationEntity.setMobileNumber(pMobileNumber);
		studentInformationEntity.setPercentMarks(pPercentMarks);
		studentInformationEntity.setRegisterNumber(pRegisterNumber);

		mStudentInformationDao.save(studentInformationEntity);

	}

	@Override
	public void insertStudentInformationData(String pName, BigInteger pMobileNumber, Double pPercentMarks,
			String pRegisterNumber) throws Exception {

		StudentInformationEntity studentInformationEntity = new StudentInformationEntity();

		studentInformationEntity.setName(pName);
		studentInformationEntity.setMobileNumber(pMobileNumber);
		studentInformationEntity.setPercentMarks(pPercentMarks);
		studentInformationEntity.setRegisterNumber(pRegisterNumber);

		mStudentInformationDao.save(studentInformationEntity);
	}

	@Override
	public void deleteStudentInformationData(Long pStudentdId) throws Exception {

		mStudentInformationDao.deleteById(pStudentdId);

	}

}
