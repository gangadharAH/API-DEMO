package com.java.api.examples.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.java.api.examples.demo.process.StudentInformationProcessor;
import com.java.api.examples.demo.ws.reponse.RestWSBaseResponseData;
import com.java.api.examples.demo.ws.reponse.StudentInformationDataResponse;
import com.java.api.examples.demo.ws.request.StudentInformationDataRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class StudentInformationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentInformationController.class);

	@Autowired
	private StudentInformationProcessor mStudentInformationProcessor;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@Operation(summary = "getStudentInformationData ", description = "API to get Student Information Data ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "202", description = "Successful Operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = StudentInformationDataResponse.class)))),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	@GetMapping("/get-student-information-data")

	public @ResponseBody StudentInformationDataResponse getStudentInformationData(
			@RequestParam(value = "studenId") Long pStudentdId) {
		StudentInformationDataResponse response = null;

		try {

			response = mStudentInformationProcessor.getStudentInformationData(pStudentdId);

		} catch (Exception e) {
			String str = "" + e.getMessage();
			LOGGER.info(str);
			response = new StudentInformationDataResponse();
			response.setErrorDescription(e);
		}

		return response;

	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@Operation(summary = "inset or update student information Data", description = "API to insert or Update Student Infformation Data")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "202", description = "Successful Operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = StudentInformationDataResponse.class)))),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	@PostMapping("/insert-update-student-information-data")

	public @ResponseBody RestWSBaseResponseData insetUpdateStudentInformationData(
			@RequestBody StudentInformationDataRequest pStudentInformationDataRequest) {
		RestWSBaseResponseData response = null;

		try {

			response = mStudentInformationProcessor.insetUpdateStudentInformationData(
					pStudentInformationDataRequest.getName(), pStudentInformationDataRequest.getMobileNumber(),
					pStudentInformationDataRequest.getPercentMarks(),
					pStudentInformationDataRequest.getRegisterNumber(), pStudentInformationDataRequest.getStdId());

		} catch (Exception e) {
			String str = "" + e.getMessage();
			LOGGER.info(str);
			response = new RestWSBaseResponseData();
			response.setErrorDescription(e);

		}

		return response;

	}

	@ResponseStatus(HttpStatus.ACCEPTED)
	@Operation(summary = "delete student information Data", description = "API to delete Student Infformation Data")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "202", description = "Successful Operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = StudentInformationDataResponse.class)))),
			@ApiResponse(responseCode = "400", description = "Bad Request"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	@DeleteMapping("/delete-student-information-data")

	public @ResponseBody RestWSBaseResponseData deleteStudentInformationData(
			@RequestParam(value = "studenId") Long pStudentdId) {
		RestWSBaseResponseData response = null;

		try {

			response = mStudentInformationProcessor.deleteStudentInformationData(pStudentdId);

		} catch (Exception e) {
			String str = "" + e.getMessage();
			LOGGER.info(str);
			response = new RestWSBaseResponseData();
			response.setErrorDescription(e);

		}

		return response;

	}
}
