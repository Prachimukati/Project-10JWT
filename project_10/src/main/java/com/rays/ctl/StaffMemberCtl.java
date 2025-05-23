package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.StaffMemberDTO;
import com.rays.form.StaffMemberForm;
import com.rays.service.StaffMemberServiceInt;

@RestController
@RequestMapping(value = "Staff") 
public class StaffMemberCtl extends BaseCtl<StaffMemberForm, StaffMemberDTO, StaffMemberServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "It");
		map.put(2, "sales");
		map.put(3, "Education");
		
		
		res.addResult("stafflist", map);
		return res;
	}

	
}