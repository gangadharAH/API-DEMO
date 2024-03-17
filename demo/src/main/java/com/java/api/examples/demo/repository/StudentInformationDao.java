package com.java.api.examples.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.api.examples.demo.entity.StudentInformationEntity;

@Repository
public interface StudentInformationDao extends JpaRepository<StudentInformationEntity, Long> {

	List<StudentInformationEntity> findByStdId(Long studentdId) throws Exception;

}
