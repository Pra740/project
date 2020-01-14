package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "images")
public class Images {

	private Integer imgId;
	private byte[] image;
	private Property property;
	
	public Images() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Images(byte[] image) {
		super();
		this.image = image;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getImgId() {
		return imgId;
	}
	public void setImgId(Integer imgId) {
		this.imgId = imgId;
	}
	
	@Column(name = "image",length = 20)
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	
	
	@Override
	public String toString() {
		return "Images [imgId=" + imgId + "]";
	}
	
	
	
	
}
