package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Mobile {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Id
	private Long mobileId;
	private String mobileName;
	private String ram;
	private String ImET;
	private String displaySize;
	public Long getMobileId() {
		return mobileId;
	}
	public void setMobileId(Long mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getImET() {
		return ImET;
	}
	public void setImET(String imET) {
		ImET = imET;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public Mobile(long i, String mobileName, String ram, String imET, String displaySize) {
		super();
		this.mobileId = i;
		this.mobileName = mobileName;
		this.ram = ram;
		ImET = imET;
		this.displaySize = displaySize;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", ram=" + ram + ", ImET=" + ImET
				+ ", displaySize=" + displaySize + "]";
	}
	
	
}
