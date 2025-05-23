package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name="ST_INVENTORY")
public class InventoryDTO extends BaseDTO{
	
	@Column(name="SUPPLIERNAME" , length=25)
	private String supplierName;
	
	 @Column(name = "LASTUPDATEDATE")
	  private Date lastUpdateDate;
	 
	 @Column(name="QUANTITY",length=50)
	 private int quantity;
	 
	 @Column(name="PRODUCT",length=25)
	 private String product; 
	

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getKey() {
		return id + "";
	}

	@Override
	public String getValue() {
		return "product";
	}

	@Override
	public String getUniqueKey() {
		return "product";
	}

	@Override
	public String getUniqueValue() {
		return "product";
	}

	@Override
	public String getLabel() {
		return "product";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("product", "asc");
        return map;
    }

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("product", product);
        return map;
    }
	
}
