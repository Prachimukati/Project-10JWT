package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_customer")
public class CustomerDTO extends BaseDTO{

	@Column(name = "CLIENTNAME", length = 100)
    private String clientName;
	
	@Column(name = "LOCATION", length = 100)
    private String location;
	
	@Column(name = "CONTACTNUMBER", length = 100)
    private String contactNumber;
	
	@Column(name = "IMPORTANCE", length = 100)
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
	

	public String getKey() {
		return id + "";
	}


	@Override
	public String getValue() {
		return "importance";
	}

	@Override
	public String getUniqueKey() {
		return "importance";
	}

	@Override
	public String getUniqueValue() {
		return "importance";
	}

	@Override
	public String getLabel() {
		return "importance";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("importance", "asc");
        return map;
    }

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("importance", importance);
        return map;
    }
	
}
