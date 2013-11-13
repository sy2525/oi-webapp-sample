package com.oisix.sample.model;

// Generated 2013/10/03 12:45:40 by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

/**
 * MstCustomer generated by hbm2java
 */
@Entity
public class MstCustomer implements java.io.Serializable {

	private String customerId;
	private String mailAddress;
	private String fullname;
	private String fullnameKana;
	private String zipCode;
	@Transient
	private String zipCode1;
	@Transient
	private String zipCode2;
	private String todofuken;
	private String address1;
	private String address2;
	private String tel;
	@Transient
	private String tel1;
	@Transient
	private String tel2;
	@Transient
	private String tel3;
	private Date createTime;
	private String createId;
	private Date updateTime;
	private String updateId;

	public MstCustomer() {
	}

	public MstCustomer(String mailAddress, String fullname, String fullnameKana, String zipCode, String todofuken,
			String address1, String address2, String tel, Date createTime, String createId, Date updateTime,
			String updateId) {
		this.mailAddress = mailAddress;
		this.fullname = fullname;
		this.fullnameKana = fullnameKana;
		this.zipCode = zipCode;
		this.todofuken = todofuken;
		this.address1 = address1;
		this.address2 = address2;
		this.tel = tel;
		this.createTime = createTime;
		this.createId = createId;
		this.updateTime = updateTime;
		this.updateId = updateId;
	}

	@Id
	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getFullnameKana() {
		return this.fullnameKana;
	}

	public void setFullnameKana(String fullnameKana) {
		this.fullnameKana = fullnameKana;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setZipCode1(String zipCode1) {
		this.zipCode1 = zipCode1;
	}

	public void setZipCode2(String zipCode2) {
		this.zipCode2 = zipCode2;
	}

	@Transient
	public String getZipCode1() {
		return this.zipCode1;
	}

	@Transient
	public String getZipCode2() {
		return this.zipCode2;
	}

	public String getTodofuken() {
		return this.todofuken;
	}

	public void setTodofuken(String todofuken) {
		this.todofuken = todofuken;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getTel() {
		return this.tel;
	}

	@Transient
	public String getTel1() {
		return this.tel1;
	}

	@Transient
	public String getTel2() {
		return this.tel2;
	}

	@Transient
	public String getTel3() {
		return this.tel3;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Transient
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	@Transient
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	@Transient
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateId() {
		return this.createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	@Transient
	public void divideZipCode() {
		String[] zipCode = {"", ""};
		if (!StringUtils.isEmpty(this.zipCode)) {
			String[] sa = this.zipCode.split("-");
			System.arraycopy(sa, 0, zipCode, 0, sa.length);
		}
		this.zipCode1 = zipCode[0];
		this.zipCode2 = zipCode[1];
	}

	@Transient
	public void divideTel() {
		String[] tel = {"", "", ""};
		if (!StringUtils.isEmpty(this.tel)) {
			String[] sa = this.tel.split("-");
			System.arraycopy(sa, 0, tel, 0, sa.length);
		}
		tel1 = tel[0];
		tel2 = tel[1];
		tel3 = tel[2];
	}

	public void joinZipCode() {
		this.zipCode = this.zipCode1 + "-" + this.zipCode2;
	}

	public void joinTel() {
		this.tel = this.tel1 + "-" + this.tel2 + "-" + this.tel3;
	}
}