
package com.rays.ctl;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PhysicianDTO;
import com.rays.form.PhysicianForm;
import com.rays.service.PhysicianServiceInt;

@RestController
@RequestMapping(value = "Physician")
public class PhysicianCtl extends BaseCtl<PhysicianForm, PhysicianDTO, PhysicianServiceInt> {

    @GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "Neurologist");
		map.put(2, "Dentist");
		map.put(3, "genralist");
		
		
		res.addResult("phyList", map);
		return res;
	}
}
