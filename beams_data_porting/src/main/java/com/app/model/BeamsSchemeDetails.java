package com.app.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itr2_22Aug")
public class BeamsSchemeDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SCHME_PORTING_Id")
	private Integer portingId;
	@Column(name = "WORK_UNIQUE_ID")
	private Integer workUniqueId;
	
	@Column(name="WORK_ID")
	private BigInteger workId;
	@Column(name="DEMAND_NO")
	private String demandNo;
	@Column(name="SCHEME_CD")
	private Integer schemeCd;
	@Column(name="DH_CD")
	private Integer dhCd;
	
	
	public BeamsSchemeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BeamsSchemeDetails(Integer workUniqueId, BigInteger workId, String demandNo, Integer schemeCd,
			Integer dhCd) {
		super();
		this.workUniqueId = workUniqueId;
		this.workId = workId;
		this.demandNo = demandNo;
		this.schemeCd = schemeCd;
		this.dhCd = dhCd;
	}


	public Integer getWorkUniqueId() {
		return workUniqueId;
	}


	public void setWorkUniqueId(Integer workUniqueId) {
		this.workUniqueId = workUniqueId;
	}


	public BigInteger getWorkId() {
		return workId;
	}


	public void setWorkId(BigInteger workId) {
		this.workId = workId;
	}


	public String getDemandNo() {
		return demandNo;
	}


	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}


	public Integer getSchemeCd() {
		return schemeCd;
	}


	public void setSchemeCd(Integer schemeCd) {
		this.schemeCd = schemeCd;
	}


	public Integer getDhCd() {
		return dhCd;
	}


	public void setDhCd(Integer dhCd) {
		this.dhCd = dhCd;
	}
	

}
