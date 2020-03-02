package com.realestate.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="re_property_details")
public class PropertyDetailsModel {
    
	@Id
	@Column(name="pkid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int propertyId;
	
	@Column(name="user_id")
	public int userId;
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Column(name="property_type")
	public String propertyType="";
	
	@Column(name="type_of_ad")
	public String typeOfAd="";
	
	@Column(name="apartment_type")
	public String apartmentType="";
	
	@Column(name="apartment_name")
	public String apartmentName="";
	
	@Column(name="bhk_type")
	public String bhkType="";
	
	@Column(name="floor")
	public int floor;
	
	@Column(name="total_floor")
	public int totalFloor;
	
	@Column(name="property_age")
	public String propertyAge="";
	
	@Column(name="property_facing")
	public String propertyFacing="";
	
	@Column(name="property_size")
	public String propertySize="";
	
	@Column(name="property_city")
	public String propertyCity="";
	
	@Column(name="property_locality")
	public String propertyLocality="";
	
	@Column(name="street_address")
	public String streetAddress="";
	
	@Column(name="available_for_lease")
	public String availableForLease="";
	
	@Column(name="expected_rent")
	public String expectedRent="";
	
	@Column(name="expected_deposite")
	public String expectedDeposite="";
	
	@Column(name="maintenance")
	public String maintenance="";
	
	@Column(name="prefered_tenants")
	public String preferedTenants="";
	
	@Column(name="furnishing")
	public String furnishing="";
	
	@Column(name="parking")
	public String parking="";
	
	@Column(name="bathrooms")
	public int bathrooms;
	
	@Column(name="balcony")
	public int balcony;
	
	@Column(name="water_supply")
	public String waterSupply="";
	
	@Column(name="gym")
	public String gym="";
	
	@Column(name="nonveg_allowed")
	public String nonVegAllowed="";
	
	@Column(name="gateway_community")
	public String gatewayCommunity="";
	
	@Column(name="whowill_show_house")
	public String whoWillShowHouse="";
	
	@Column(name="secondary_no")
	public String secondaryNo="";
	
	@Column(name="availability")
	public String availability="";
	
	@Column(name="start_time")
	public String startTime="";
	
	@Column(name="end_time")
	public String endTime="";
	
	
    	
	
	

	
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getTypeOfAd() {
		return typeOfAd;
	}
	public void setTypeOfAd(String typeOfAd) {
		this.typeOfAd = typeOfAd;
	}
	public String getApartmentType() {
		return apartmentType;
	}
	public void setApartmentType(String apartmentType) {
		this.apartmentType = apartmentType;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getBhkType() {
		return bhkType;
	}
	public void setBhkType(String bhkType) {
		this.bhkType = bhkType;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getTotalFloor() {
		return totalFloor;
	}
	public void setTotalFloor(int totalFloor) {
		this.totalFloor = totalFloor;
	}
	public String getPropertyAge() {
		return propertyAge;
	}
	public void setPropertyAge(String propertyAge) {
		this.propertyAge = propertyAge;
	}
	public String getPropertyFacing() {
		return propertyFacing;
	}
	public void setPropertyFacing(String propertyFacing) {
		this.propertyFacing = propertyFacing;
	}
	public String getPropertySize() {
		return propertySize;
	}
	public void setPropertySize(String propertySize) {
		this.propertySize = propertySize;
	}
	public String getPropertyCity() {
		return propertyCity;
	}
	public void setPropertyCity(String propertyCity) {
		this.propertyCity = propertyCity;
	}
	public String getPropertyLocality() {
		return propertyLocality;
	}
	public void setPropertyLocality(String propertyLocality) {
		this.propertyLocality = propertyLocality;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getAvailableForLease() {
		return availableForLease;
	}
	public void setAvailableForLease(String availableForLease) {
		this.availableForLease = availableForLease;
	}
	public String getExpectedRent() {
		return expectedRent;
	}
	public void setExpectedRent(String expectedRent) {
		this.expectedRent = expectedRent;
	}
	public String getExpectedDeposite() {
		return expectedDeposite;
	}
	public void setExpectedDeposite(String expectedDeposite) {
		this.expectedDeposite = expectedDeposite;
	}
	public String getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(String maintenance) {
		this.maintenance = maintenance;
	}
	public String getPreferedTenants() {
		return preferedTenants;
	}
	public void setPreferedTenants(String preferedTenants) {
		this.preferedTenants = preferedTenants;
	}
	public String getFurnishing() {
		return furnishing;
	}
	public void setFurnishing(String furnishing) {
		this.furnishing = furnishing;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public int getBalcony() {
		return balcony;
	}
	public void setBalcony(int balcony) {
		this.balcony = balcony;
	}
	public String getWaterSupply() {
		return waterSupply;
	}
	public void setWaterSupply(String waterSupply) {
		this.waterSupply = waterSupply;
	}
	public String getGym() {
		return gym;
	}
	public void setGym(String gym) {
		this.gym = gym;
	}
	public String getNonVegAllowed() {
		return nonVegAllowed;
	}
	public void setNonVegAllowed(String nonVegAllowed) {
		this.nonVegAllowed = nonVegAllowed;
	}
	public String getGatewayCommunity() {
		return gatewayCommunity;
	}
	public void setGatewayCommunity(String gatewayCommunity) {
		this.gatewayCommunity = gatewayCommunity;
	}
	public String getWhoWillShowHouse() {
		return whoWillShowHouse;
	}
	public void setWhoWillShowHouse(String whoWillShowHouse) {
		this.whoWillShowHouse = whoWillShowHouse;
	}
	public String getSecondaryNo() {
		return secondaryNo;
	}
	public void setSecondaryNo(String secondaryNo) {
		this.secondaryNo = secondaryNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
