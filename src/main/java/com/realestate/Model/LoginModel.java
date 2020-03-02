package com.realestate.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="re_users")
public class LoginModel {
	
		

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="pkid")
		
		private int userPkid;
		
		@Column(name="user_email")
		private String userEmail;
		
		@Column(name="user_psw")
		private String userPsw;
		
		@Column(name="user_c_psw")
		private String userC_psw;
		
		@Column(name="user_first_name")
		private String userFirstName;
		
		@Column(name="user_last_name")
		private String userLastName;
		
		@Column(name="user_middle_name")
		private String userMiddleName;
		
		@Column(name="user_address")
		private String userAddress;
		
		@Column(name="user_city")
		private String userCity;
		
		@Column(name="user_mobile_no")
		private String userMobileNo;
		
		@Column(name="user_state")
		private String userState;
		
		@Column(name="user_country")
		private String userCountry;
		
		@Column(name="user_postalcode")
		private String userPostalcode;

		public String getUserPostalcode() {
			return userPostalcode;
		}

		public void setUserPostalcode(String userPostalcode) {
			this.userPostalcode = userPostalcode;
		}

		public int getUserPkid() {
			return userPkid;
		}

		public void setUserPkid(int userPkid) {
			this.userPkid = userPkid;
		}

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public String getUserPsw() {
			return userPsw;
		}

		public void setUserPsw(String userPsw) {
			this.userPsw = userPsw;
		}

		public String getUserC_psw() {
			return userC_psw;
		}

		public void setUserC_psw(String userC_psw) {
			this.userC_psw = userC_psw;
		}

		public String getUserFirstName() {
			return userFirstName;
		}

		public void setUserFirstName(String userFirstName) {
			this.userFirstName = userFirstName;
		}

		public String getUserLastName() {
			return userLastName;
		}

		public void setUserLastName(String userLastName) {
			this.userLastName = userLastName;
		}

		public String getUserMiddleName() {
			return userMiddleName;
		}

		public void setUserMiddleName(String userMiddleName) {
			this.userMiddleName = userMiddleName;
		}

		public String getUserAddress() {
			return userAddress;
		}

		public void setUserAddress(String userAddress) {
			this.userAddress = userAddress;
		}

		public String getUserCity() {
			return userCity;
		}

		public void setUserCity(String userCity) {
			this.userCity = userCity;
		}

		public String getUserMobileNo() {
			return userMobileNo;
		}

		public void setUserMobileNo(String userMobileNo) {
			this.userMobileNo = userMobileNo;
		}

		public String getUserState() {
			return userState;
		}

		public void setUserState(String userState) {
			this.userState = userState;
		}

		public String getUserCountry() {
			return userCountry;
		}

		public void setUserCountry(String userCountry) {
			this.userCountry = userCountry;
		}


}
