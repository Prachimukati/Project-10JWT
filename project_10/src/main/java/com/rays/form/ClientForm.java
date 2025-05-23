package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ClientDTO;

public class ClientForm extends BaseForm {

	@NotEmpty(message = "Please enter  FullName")
	@Pattern(regexp = "^[A-Za-z\\s]*$", message = "FullName can only contain alphabets and spaces")
	private String fullName;

	@PastOrPresent(message = "appointmentDate  must be today or in the past")
	@NotNull(message = "Please enter  appointmentDate")
	private Date appointmentDate;

	@NotNull(message = "Please enter Phone")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "phone contain 10 digits only")
	private String phone;

	@NotEmpty(message = "Please select a illness")
	private String illness;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	@Override
	public BaseDTO getDto() {
		ClientDTO dto = initDTO(new ClientDTO());
		dto.setFullName(fullName);
		dto.setAppointmentDate(appointmentDate);
		dto.setPhone(phone);
		dto.setIllness(illness);
		return dto;
	}
}
