package com.sharad.learn.corejava.basic.findcity;

import com.opencsv.bean.CsvBindByPosition;

public class Area {
	@CsvBindByPosition(position = 0)
	private String circleName;
	@CsvBindByPosition(position = 1)
	private String regionName;	
	@CsvBindByPosition(position = 2)
	private String divisionName;	
	@CsvBindByPosition(position = 3)
	private String officeName;	
	@CsvBindByPosition(position = 4)
	private String pincode;	
	@CsvBindByPosition(position = 5)
	private String officeType;	
	@CsvBindByPosition(position = 6)
	private String delivery;	
	@CsvBindByPosition(position = 7)
	private String district;	
	@CsvBindByPosition(position = 8)
	private String stateName;
	
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getDivisionName() {
		return divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getOfficeType() {
		return officeType;
	}
	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "Area [pincode=" + pincode + ", district=" + district +  ", officeName=" + officeName +", stateName=" + stateName+", regionName=" + regionName + ", divisionName=" + divisionName + ",circleName=" + circleName + "]";
	}
}