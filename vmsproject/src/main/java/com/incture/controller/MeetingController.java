package com.incture.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.incture.service.MeetingServiceLocal;
import com.incture.vms.MeetingTable;





@Controller
@RequestMapping(value="/meeting", produces = "application/json")
public class MeetingController {
	
	@Autowired
	private MeetingServiceLocal meetingservicelocal;
	
	
	@PostMapping("/create")
	public void create(@RequestBody MeetingTable nt){
		meetingservicelocal.create(nt);
	}
}



