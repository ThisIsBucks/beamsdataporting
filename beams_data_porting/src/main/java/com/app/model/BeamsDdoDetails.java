 package com.app.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itr3_22aug")
public class BeamsDdoDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="DDO_PORTING_Id")
	private Integer portingId;
	@Column(name = "WORK_UNIQUE_ID")
	private Integer workUniqueId;
	@Column(name="WORK_IND")
	private String workInd;
	@Column(name="WORK_ID")
	private BigInteger workId;
	@Column(name="DDO_CODE")
	private BigInteger ddoCode;
	
	public BeamsDdoDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BeamsDdoDetails(Integer workUniqueId, String workInd, BigInteger workId, BigInteger ddoCode) {
		super();
		this.workUniqueId = workUniqueId;
		this.workInd = workInd;
		this.workId = workId;
		this.ddoCode = ddoCode;
	}
	public Integer getWorkUniqueId() {
		return workUniqueId;
	}
	public void setWorkUniqueId(Integer workUniqueId) {
		this.workUniqueId = workUniqueId;
	}
	public String getWorkInd() {
		return workInd;
	}
	public void setWorkInd(String workInd) {
		this.workInd = workInd;
	}
	public BigInteger getWorkId() {
		return workId;
	}
	public void setWorkId(BigInteger workId) {
		this.workId = workId;
	}
	public BigInteger getDdoCode() {
		return ddoCode;
	}
	public void setDdoCode(BigInteger ddoCode) {
		this.ddoCode = ddoCode;
	}
	
}
