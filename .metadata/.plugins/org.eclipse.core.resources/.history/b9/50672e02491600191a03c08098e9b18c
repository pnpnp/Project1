package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="IncomeDetails")
public class IncomeDetails {

	public IncomeDetails() {
		super();
	}
	public IncomeDetails(String propertyLocation, String propertyName, int estimatedAmount, String typeOfEmployment,
			int retirementAge, String organizationType, String employeerName) {
		super();
		this.propertyLocation = propertyLocation;
		this.propertyName = propertyName;
		EstimatedAmount = estimatedAmount;
		TypeOfEmployment = typeOfEmployment;
		this.retirementAge = retirementAge;
		OrganizationType = organizationType;
		EmployeerName = employeerName;
	}
	@Column(name="propertylocation")
	private String propertyLocation;
	@Column(name="propertyname")
	private String propertyName;
	@Column(name="estimatedamount")
	private int EstimatedAmount;
	@Column(name="typeofemployement")
	private String TypeOfEmployment;
	@Column(name="retirementage")
	private int retirementAge;
	@Column(name="propertlocation")
	private String OrganizationType;
	@Column(name="propertlocation")
	private String EmployeerName;
	
	public String getPropertyLocation() {
		return propertyLocation;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public int getEstimatedAmount() {
		return EstimatedAmount;
	}
	public String getTypeOfEmployment() {
		return TypeOfEmployment;
	}
	public int getRetirementAge() {
		return retirementAge;
	}
	public String getOrganizationType() {
		return OrganizationType;
	}
	public String getEmployeerName() {
		return EmployeerName;
	}
	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public void setEstimatedAmount(int estimatedAmount) {
		EstimatedAmount = estimatedAmount;
	}
	public void setTypeOfEmployment(String typeOfEmployment) {
		TypeOfEmployment = typeOfEmployment;
	}
	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}
	public void setOrganizationType(String organizationType) {
		OrganizationType = organizationType;
	}
	public void setEmployeerName(String employeerName) {
		EmployeerName = employeerName;
	}
		@Override
		public String toString() {
			return "IncomeDetails [propertyLocation=" + propertyLocation + ", propertyName=" + propertyName
					+ ", EstimatedAmount=" + EstimatedAmount + ", TypeOfEmployment=" + TypeOfEmployment + ", retirementAge="
					+ retirementAge + ", OrganizationType=" + OrganizationType + ", EmployeerName=" + EmployeerName + "]";
	}
	
}
