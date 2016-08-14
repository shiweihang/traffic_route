/**
 * copyright@www.laulyl.com
 */
package com.easy.tr.model;

import java.util.Date;
import java.io.Serializable;
/**
 * @author laulyl
 * @time 2016-08-14 16:06:09
 * @description create by laulyl project
 */
public class User implements Serializable {

	private Long id;
	private String nickName;
	private String phoneNumber;
	private String email;
	private Byte gender;
	private Byte age;
	private String headIcon;
	private String identifierNumber;
	private String identifierIcon;
	private Date createTime;// 创建时间
	private Date updateTime;// 更新时间
	private Double score;
	private Byte state;// 0 =禁用 1 正常
	private Byte userType;// 用户类型
	private static final long serialVersionUID = 1471161969697L;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return this.id;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Byte getGender() {
		return this.gender;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public Byte getAge() {
		return this.age;
	}

	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}

	public String getHeadIcon() {
		return this.headIcon;
	}

	public void setIdentifierNumber(String identifierNumber) {
		this.identifierNumber = identifierNumber;
	}

	public String getIdentifierNumber() {
		return this.identifierNumber;
	}

	public void setIdentifierIcon(String identifierIcon) {
		this.identifierIcon = identifierIcon;
	}

	public String getIdentifierIcon() {
		return this.identifierIcon;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getScore() {
		return this.score;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Byte getState() {
		return this.state;
	}

	public void setUserType(Byte userType) {
		this.userType = userType;
	}

	public Byte getUserType() {
		return this.userType;
	}
}
