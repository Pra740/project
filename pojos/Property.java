package com.app.pojos;

import java.util.*;

import javax.persistence.*;


@Entity
@Table(name = "property")
public class Property {
   private Integer propId;
   private String propName;
   private PType ptype;
   private double price;
   private boolean isBook;
   private User user;
   private Area area;
   private String address;
   private List<Images> images=new ArrayList<>();
   
   public Property() {
	// TODO Auto-generated constructor stub
    }
   
   

	public Property(String propName, PType ptype, double price, boolean isBook, String address) {
		super();
		this.propName = propName;
		this.ptype = ptype;
		this.price = price;
		this.isBook = isBook;
		this.address = address;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPropId() {
		return propId;
	}
	
	public void setPropId(Integer propId) {
		this.propId = propId;
	}
	
	@Column(name = "propName",length = 20)
	public String getPropName() {
		return propName;
	}
	
	public void setPropName(String propName) {
		this.propName = propName;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "p_type",length = 20)
	public PType getPtype() {
		return ptype;
	}
	
	public void setPtype(PType ptype) {
		this.ptype = ptype;
	}
	
	@Column(name = "price",length = 20)
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Column(name = "is_book",length = 20)
	public boolean isBook() {
		return isBook;
	}
	
	public void setBook(boolean isBook) {
		this.isBook = isBook;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	   public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	@Column(name = "address",length = 20)
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Images> getImages() {
		return images;
	}

	public void setImages(List<Images> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "Property [propId=" + propId + ", propName=" + propName + ", ptype=" + ptype + ", price=" + price
				+ ", isBook=" + isBook + ", address=" + address + "]";
	}
   
   
   
   
}
