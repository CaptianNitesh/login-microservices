package com.example.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_details")
public class StudentPOJO {
	
	@Id
	private String suid;
	@Column
	private String sfname;
	@Column
	private String sulname;
	@Column
	private String dob;

	public String getSuid() {
		return suid;
	}
	public void setSuid(String suid) {
		this.suid = suid;
	}
	public String getSfname() {
		return sfname;
	}
	public void setSfname(String sfname) {
		this.sfname = sfname;
	}
	public String getSulname() {
		return sulname;
	}
	public void setSulname(String sulname) {
		this.sulname = sulname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "StudentPOJO [suid=" + suid + ", sfname=" + sfname + ", sulname=" + sulname + ", dob=" + dob + "]";
	}
	

}
