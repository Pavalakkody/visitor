package com.incture.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.dao.MeetingDaoLocal;
import com.incture.vms.MeetingTable;





@Service
@Transactional

public class MeetingService implements MeetingServiceLocal {
	@Autowired
	private MeetingDaoLocal meetingdaolocal;


	public void create(MeetingTable nt) {
		// TODO Auto-generated method stub
		meetingdaolocal.save(nt);
		
	}
	

}
