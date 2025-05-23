package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InventoryDTO;
import com.rays.dto.PhysicianDTO;

public class InventoryForm extends BaseForm{

    @NotEmpty(message = "Please enter  supplierName")
    @Pattern(regexp = "^[A-Za-z\\s]*$", message = "supplierName can only contain alphabets and spaces")
    private String supplierName;

    @PastOrPresent(message = "lastUpdateDate  must be today or in the past")
    @NotNull(message = "Please enter  lastUpdateDate")
    private Date lastUpdateDate;

    @NotNull(message = "please enter quantity")
	@Min(1)
    private int quantity;
    
    @NotEmpty(message = "Please select a product")
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
	

	@Override
    public BaseDTO getDto() {
		InventoryDTO dto = initDTO(new InventoryDTO());
        dto.setSupplierName(supplierName);
        dto.setLastUpdateDate(lastUpdateDate);
        dto.setQuantity(quantity);
        dto.setProduct(product);
        return dto;
    }
}
