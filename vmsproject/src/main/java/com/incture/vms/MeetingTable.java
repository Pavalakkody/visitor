package com.incture.vms;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEETING")
public class MeetingTable {
	@Id
	@Column(name = "MEETINGID", columnDefinition="VARCHAR(255)")
	private String MeetingId;
	
   @Column(name = "EMPID", columnDefinition="VARCHAR(255)")
	private String EmpId;
   
   @Column(name = "VISITORID", columnDefinition="INT")
	private int VisitorId;
	
     @Column(name = "FROM DATETIME", columnDefinition="FROM DATE&Time")
	private Date from_Date_Time;
    
     @Column(name = "END DATETIME", columnDefinition="END DATE&Time")
 	private Date end_Date_Time;
    
     @Column(name = " CREATION DATETIME", columnDefinition="CREATION DATE&Time")
 	private Date Creation_Date_Time;
     
       @Column(name = "TYPE", columnDefinition="INT")
	private int Type;
       @Column(name = "STATUSID", columnDefinition="INT")
   	private int StatusId;
	public String getMeetingId() {
		return MeetingId;
	}
	public void setMeetingId(String meetingId) {
		MeetingId = meetingId;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public int getVisitorId() {
		return VisitorId;
	}
	public void setVisitorId(int visitorId) {
		VisitorId = visitorId;
	}
	public Date getFrom_Date_Time() {
		return from_Date_Time;
	}
	public void setFrom_Date_Time(Date from_Date_Time) {
		this.from_Date_Time = from_Date_Time;
	}
	public Date getEnd_Date_Time() {
		return end_Date_Time;
	}
	public void setEnd_Date_Time(Date end_Date_Time) {
		this.end_Date_Time = end_Date_Time;
	}
	public Date getCreation_Date_Time() {
		return Creation_Date_Time;
	}
	public void setCreation_Date_Time(Date creation_Date_Time) {
		Creation_Date_Time = creation_Date_Time;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public int getStatusId() {
		return StatusId;
	}
	public void setStatusId(int statusId) {
		StatusId = statusId;
	}
	
       

}
