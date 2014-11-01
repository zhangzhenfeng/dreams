package com.margin.dream.view;

import java.util.Date;

import com.margin.dream.frame.view.BaseView;

/**
 * Copyright(C) JiNanShangJie 2014.
 * 
 * 用户view
 * 
 * @author 张振峰 2014/10/29.
 * 
 * @version V1.00.
 * 
 *          更新履历： V1.00 2014/10/29 张振峰 创建.
 */
public class UserView extends BaseView{
	
	/** 主键 */
	private String object_id;

	/** 用户真实姓名 */
	private String real_name;

	/** 昵称 */
	private String username;

	/** 密码 */
	private String password;

	/** 注册时间 */
	private Date create_time;

	/** 邮箱 */
	private String email;

	/** 手机号 */
	private String phone;

	/** 地址 */
	private String address;

	/** 头像 */
	private String head_img;

	/** 签名 */
	private String signature;

	/** 喜欢我的人数 */
	private int love_me;

	/** 粉丝数 */
	private int fans_me;


	/**
	 * 取得主键.
	 *
	 * @return String
	 */
	public String getObject_id() {
		return this.object_id;
	}

	/**
	 *  设定主键.
	 *
	 * @param object_id
	 */
	public void setObject_id(String object_id) {
		this.object_id = object_id;
	}

	/**
	 * 取得用户真实姓名.
	 *
	 * @return String
	 */
	public String getReal_name() {
		return this.real_name;
	}

	/**
	 *  设定用户真实姓名.
	 *
	 * @param real_name
	 */
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	/**
	 * 取得昵称.
	 *
	 * @return String
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 *  设定昵称.
	 *
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 取得密码.
	 *
	 * @return String
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 *  设定密码.
	 *
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 取得注册时间.
	 *
	 * @return Date
	 */
	public Date getCreate_time() {
		return this.create_time;
	}

	/**
	 *  设定注册时间.
	 *
	 * @param create_time
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	/**
	 * 取得邮箱.
	 *
	 * @return String
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 *  设定邮箱.
	 *
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 取得手机号.
	 *
	 * @return String
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 *  设定手机号.
	 *
	 * @param phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 取得地址.
	 *
	 * @return String
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 *  设定地址.
	 *
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 取得头像.
	 *
	 * @return String
	 */
	public String getHead_img() {
		return this.head_img;
	}

	/**
	 *  设定头像.
	 *
	 * @param head_img
	 */
	public void setHead_img(String head_img) {
		this.head_img = head_img;
	}

	/**
	 * 取得签名.
	 *
	 * @return String
	 */
	public String getSignature() {
		return this.signature;
	}

	/**
	 *  设定签名.
	 *
	 * @param signature
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * 取得喜欢我的人数.
	 *
	 * @return int
	 */
	public int getLove_me() {
		return this.love_me;
	}

	/**
	 *  设定喜欢我的人数.
	 *
	 * @param love_me
	 */
	public void setLove_me(int love_me) {
		this.love_me = love_me;
	}

	/**
	 * 取得粉丝数.
	 *
	 * @return int
	 */
	public int getFans_me() {
		return this.fans_me;
	}

	/**
	 *  设定粉丝数.
	 *
	 * @param fans_me
	 */
	public void setFans_me(int fans_me) {
		this.fans_me = fans_me;
	}
}
