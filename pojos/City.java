package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name ="city")
public class City {
	
	private Integer cityId;
	private String cityName;
	
	public City() {
		// TODO Auto-generated constructor stub
	}

	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	@Column(name="cityName",length = 20)
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
	}

	

	
	
	
}
