package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CustomerDTO;
import com.rays.form.CustomerForm;
import com.rays.service.CustomerServiceInt;

@RestController
@RequestMapping(value = "Customer")
public class CustomerCtl extends BaseCtl<CustomerForm, CustomerDTO, CustomerServiceInt>{
	
	 @GetMapping("/preload")
		public ORSResponse preload() {
			ORSResponse res = new ORSResponse(true);
			HashMap<Integer, String> map=new HashMap<Integer, String>();
			map.put(1, "High");
			map.put(2, "Low");			
			
			res.addResult("customerlist", map);
			return res;
		}

}
