package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "commission")
public class Commission {

	private Integer commId;
	private float commissionBuyer;
	private float commissionSeller;
	private Property property;
	
	public Commission() {
		// TODO Auto-generated constructor stub
	}
	
	public Commission(float commissionBuyer, float commissionSeller) {
		super();
		this.commissionBuyer = commissionBuyer;
		this.commissionSeller = commissionSeller;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCommId() {
		return commId;
	}
	
	
	public void setCommId(Integer commId) {
		this.commId = commId;
	}

	@Column(name = "comm_buyer",length = 20)
	public float getCommissionBuyer() {
		return commissionBuyer;
	}
	
	public void setCommissionBuyer(float commissionBuyer) {
		this.commissionBuyer = commissionBuyer;
	}
	
	
	@Column(name = "comm_seller",length = 20)
	public float getCommissionSeller() {
		return commissionSeller;
	}
	
	public void setCommissionSeller(float commissionSeller) {
		this.commissionSeller = commissionSeller;
	}
	
	public Property getProperty() {
		return property;
	}
	
	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Commission [commId=" + commId + ", commissionBuyer=" + commissionBuyer + ", commissionSeller="
				+ commissionSeller + "]";
	}
	
	
}
