package com.app.pojos;

import javax.persistence.*;


@Entity
@Table(name = "area")
public class Area {
	
	private Integer areaID;
	private City city;
	private String areaName;
	private int pinCode;

	public Area() {
		// TODO Auto-generated constructor stub
	}

	

	public Area(String areaName, int pinCode) {
		super();
		this.areaName = areaName;
		this.pinCode = pinCode;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAreaID() {
		return areaID;
	}

	public void setAreaID(Integer areaID) {
		this.areaID = areaID;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "areaName",length = 20)
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Area [areaID=" + areaID + ", areaName=" + areaName + ", pinCode=" + pinCode + "]";
	}

	
	
	
	
    
}
