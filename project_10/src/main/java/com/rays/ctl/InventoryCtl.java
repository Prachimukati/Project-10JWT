package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.InventoryDTO;
import com.rays.form.InventoryForm;
import com.rays.service.InventoryServiceInt;

@RestController
@RequestMapping(value = "Inventory")
public class InventoryCtl extends BaseCtl<InventoryForm, InventoryDTO, InventoryServiceInt>{

    @GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Neurologist");
		map.put(2, "Dentist");
		map.put(3, "genralist");
		
		
		res.addResult("Invt", map);
		return res;
	}
}
