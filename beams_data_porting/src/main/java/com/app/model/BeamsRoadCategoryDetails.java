package com.app.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itr4_22Aug")
public class BeamsRoadCategoryDetails {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ROAD_CATEGORY_PORTING_Id")
	private Integer portingId;
	@Column(name = "UNIQUE_ID")
	private Integer uniqeId;
	@Column(name = "WORK_UNIQUE_ID")
	private Integer workUniqueId;
	@Column(name="WORK_ID")
	private BigInteger workId;
	@Column(name = "ROAD_CATEGORY")
	private String roadCategory;
	@Column(name = "ROAD_NO")
	private Integer roadNo;
//	@Column(name = "dynamicSegementNumber")
//	private String dynamicSegementNumber;
	@Column(name = "CHAINAGE_FROM")
	private Double chainageFrom;
	@Column(name = "CHAINAGE_TO")
	private Double chainageTo;
	public BeamsRoadCategoryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BeamsRoadCategoryDetails(Integer uniqeId, Integer workUniqueId, BigInteger workId, String roadCategory,
			Integer roadNo, Double chainageFrom, Double chainageTo) {
		super();
		this.uniqeId = uniqeId;
		this.workUniqueId = workUniqueId;
		this.workId = workId;
		this.roadCategory = roadCategory;
		this.roadNo = roadNo;
		//this.dynamicSegementNumber = dynamicSegementNumber;
		this.chainageFrom = chainageFrom;
		this.chainageTo = chainageTo;
	}
	public Integer getUniqeId() {
		return uniqeId;
	}
	public void setUniqeId(Integer uniqeId) {
		this.uniqeId = uniqeId;
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
	public String getRoadCategory() {
		return roadCategory;
	}
	public void setRoadCategory(String roadCategory) {
		this.roadCategory = roadCategory;
	}
	public Integer getRoadNo() {
		return roadNo;
	}
	public void setRoadNo(Integer roadNo) {
		this.roadNo = roadNo;
	}
//	public String getDynamicSegementNumber() {
//		return dynamicSegementNumber;
//	}
//	public void setDynamicSegementNumber(String dynamicSegementNumber) {
//		this.dynamicSegementNumber = dynamicSegementNumber;
//	}
	public Double getChainageFrom() {
		return chainageFrom;
	}
	public void setChainageFrom(Double chainageFrom) {
		this.chainageFrom = chainageFrom;
	}
	public Double getChainageTo() {
		return chainageTo;
	}
	public void setChainageTo(Double chainageTo) {
		this.chainageTo = chainageTo;
	}
	
	
}
