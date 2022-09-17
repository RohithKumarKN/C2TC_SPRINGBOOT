/**
 * 
 */
package com.cg.shop_management;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Rohith Kumar K N
 *
 */
@Entity
public class Shop {

	private Integer shopEmployeeId;
	private Integer shopId;
	private String shopCategory;
	private String shopName;
	private String customers;
	private String shopStatus;
	private String shopOwner;
	private String leaseStatus;

	public Shop() {
		super();
	}

	public Shop(Integer shopEmployeeId, Integer shopId, String shopCategory, String shopName, String customers,
			String shopStatus, String shopOwner, String leaseStatus) {

		this.shopEmployeeId = shopEmployeeId;
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopName = shopName;
		this.customers = customers;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getShopEmployeeId() {
		return shopEmployeeId;
	}

	public void setShopEmployeeId(Integer shopEmployeeId) {
		this.shopEmployeeId = shopEmployeeId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomers() {
		return customers;
	}

	public void setCustomers(String customers) {
		this.customers = customers;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	@Override
	public String toString() {
		return "Shop [shopEmployeeId=" + shopEmployeeId + ", shopId=" + shopId + ", shopCategory=" + shopCategory
				+ ", shopName=" + shopName + ", customers=" + customers + ", shopStatus=" + shopStatus + ", shopOwner="
				+ shopOwner + ", leaseStatus=" + leaseStatus + ", getShopEmployeeId()=" + getShopEmployeeId()
				+ ", getShopId()=" + getShopId() + ", getShopCategory()=" + getShopCategory() + ", getShopName()="
				+ getShopName() + ", getCustomers()=" + getCustomers() + ", getShopStatus()=" + getShopStatus()
				+ ", getShopOwner()=" + getShopOwner() + ", getLeaseStatus()=" + getLeaseStatus() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
