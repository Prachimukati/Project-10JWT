package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.InventoryDTO;

@Repository
public class InventoryDAOImpl extends BaseDAOImpl<InventoryDTO> implements InventoryDAOInt{

	@Override
	protected List<Predicate> getWhereClause(InventoryDTO dto, CriteriaBuilder builder, Root<InventoryDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (dto.getId() != null && dto.getId() > 0) {
            whereCondition.add(builder.equal(qRoot.get("id"), dto.getId()));
        }

    	if (!isEmptyString(dto.getSupplierName())) {

			whereCondition.add(builder.like(qRoot.get("supplierName"), dto.getSupplierName() + "%"));
		}


        if (dto.getLastUpdateDate() != null) {
            whereCondition.add(builder.equal(qRoot.get("lastUpdateDate"), dto.getLastUpdateDate()));
        }

        if (!isZeroNumber(dto.getQuantity())) {
			whereCondition.add(builder.equal(qRoot.get("quantity"), dto.getQuantity()));
		}

        if (dto.getProduct() != null && !dto.getProduct().isEmpty()) {
            whereCondition.add(builder.like(qRoot.get("product"), dto.getProduct()));
        }

        return whereCondition;
    
	}

	@Override
	public Class<InventoryDTO> getDTOClass() {
		return InventoryDTO.class;
	}

}
