package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CustomerDTO;
import com.rays.dto.PhysicianDTO;

public class CustomerForm extends BaseForm{

    @NotEmpty(message = "Please enter  clientName")
    @Pattern(regexp = "^[A-Za-z\\s]*$", message = "ClientName can only contain alphabets and spaces")
    private String clientName;

    @NotEmpty(message = "Please enter  location")
    @Pattern(regexp = "^[A-Za-z\\s]*$", message = "Location can only contain alphabets and spaces")
    private String location;


    @NotNull(message = "Please enter contactNumber")
    @Pattern(regexp="(^$|[0-9]{10})", message = "ContactNumber contain 10 digits only")
	private String contactNumber;
    
    @NotEmpty(message = "Please select a importance")
    private String importance;


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getImportance() {
		return importance;
	}


	public void setImportance(String importance) {
		this.importance = importance;
	}
	
	
    
	@Override
    public BaseDTO getDto() {
		CustomerDTO dto = initDTO(new CustomerDTO());
        dto.setClientName(clientName);
        dto.setLocation(location);
        dto.setContactNumber(contactNumber);
        dto.setImportance(importance);
        return dto;
    }


}
