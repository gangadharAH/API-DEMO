package com.java.api.examples.demo.ws.reponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RestWSBaseResponseData {

	private Exception errorDescription;

	private String status = "SUCCESS";

	public Exception getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(Exception errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
