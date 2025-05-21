package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.OrderDTO;

@Repository
public class OrderDAOImpl extends BaseDAOImpl<OrderDTO> implements OrderDAOInt {

	@Override
	protected List<Predicate> getWhereClause(OrderDTO dto, CriteriaBuilder builder, Root<OrderDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getProductName())) {

			whereCondition.add(builder.like(qRoot.get("productName"), dto.getProductName() + "%"));
		}

		if (isNotNull(dto.getOrderDate())) {

			whereCondition.add(builder.equal(qRoot.get("orderDate"), dto.getOrderDate()));
		}

		if (!isZeroNumber(dto.getQuantity())) {

			whereCondition.add(builder.equal(qRoot.get("quantity"), dto.getQuantity()));
		}
		if (!isEmptyString(dto.getCustomer())) {

			whereCondition.add(builder.like(qRoot.get("customer"), dto.getCustomer() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<OrderDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return OrderDTO.class;
	}

}
