package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.OrderDTO;


public class OrderForm extends BaseForm{
	
	
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Only letters are Allowed")

	@NotEmpty(message = "Please enter  productName")
	private String productName ;
	
	@NotNull(message = "please enter orderDate")
	private Date orderDate;
	
	@NotNull(message = "please enter quantity")
	@Min(1)
	private int quantity;
	
	
	@NotEmpty(message = "please Enter customer")
	private String customer ;

	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public Date getOrderDate() {
		return orderDate;
	}




	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}
	

	public BaseDTO getDto() {

		OrderDTO dto = initDTO(new OrderDTO());
		dto.setProductName(productName);
		dto.setOrderDate(orderDate);
		dto.setQuantity(quantity);
		dto.setCustomer(customer);
		return dto;

	}

}
