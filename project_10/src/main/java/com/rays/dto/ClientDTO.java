package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;


@Entity
@Table(name="ST_CLIENT")
public class ClientDTO extends BaseDTO {

	@Column(name = "FULLNAME", length = 25)
	private String fullName;

	@Column(name = "APPOINTMENTDATE")
	private Date appointmentDate;

	@Column(name = "PHONE", length = 10)
	private String phone;

	@Column(name = "ILLNESS", length = 50)
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

	
	public String getKey() {
		return id + "";
	}
	
	@Override
	public String getValue() {
		return "illness";
	}

	@Override
	public String getUniqueKey() {
		return "illness";
	}

	@Override
	public String getUniqueValue() {
		return "illness";
	}

	@Override
	public String getLabel() {
		return "illness";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("illness", "asc");
        return map;
    }

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("illness", illness);
        return map;
    }

}
