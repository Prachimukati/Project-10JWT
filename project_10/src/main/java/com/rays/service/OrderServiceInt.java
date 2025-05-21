package com.rays.service;

import com.rays.common.BaseServiceInt;
import com.rays.common.UserContext;
import com.rays.dto.OrderDTO;

public interface OrderServiceInt extends BaseServiceInt<OrderDTO>{
	
	public OrderDTO findByName(String name , UserContext userContext);
		
	

}
