package com.rays.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rays.common.BaseServiceImpl;
import com.rays.common.UserContext;
import com.rays.dao.OrderDAOInt;
import com.rays.dto.OrderDTO;

@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<OrderDTO, OrderDAOInt> implements OrderServiceInt{


	@Transactional(readOnly = true)
	public OrderDTO findByName(String name, UserContext userContext) {
		return baseDao.findByUniqueKey("productName", name, userContext);
	}

}
