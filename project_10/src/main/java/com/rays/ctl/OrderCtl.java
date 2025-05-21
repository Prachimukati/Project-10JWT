package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.OrderDTO;
import com.rays.form.OrderForm;
import com.rays.service.OrderServiceInt;
import com.rays.common.DropdownList;


@RestController
@RequestMapping(value = "Order")
public class OrderCtl extends BaseCtl<OrderForm, OrderDTO, OrderServiceInt>{

	@Autowired
	private OrderServiceInt orderService;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse();
		OrderDTO dto = new OrderDTO();
		List<DropdownList>list = orderService.search(dto, userContext);
		res.addResult("orderlist", list);
		
		return res;
		
	}
	
	@GetMapping("name/{name}")
	public ORSResponse get(@PathVariable String name) {
		ORSResponse res = new ORSResponse(true);
		OrderDTO dto = orderService.findByName(name, userContext);
		
		if (dto != null) {
			res.addData(dto);
		} else {
			res.setSuccess(false);
			res.addMessage("Record not found");
		}
		return res;
	}
}
