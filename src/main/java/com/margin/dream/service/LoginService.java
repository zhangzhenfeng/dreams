package com.margin.dream.service;

import com.margin.dream.model.UserModel;
import com.margin.dream.view.UserView;

/**
 * Copyright(C) JiNanShangJie 2014.
 * 
 * 登录service
 * 
 * @author 张振峰 2014/10/29.
 * 
 * @version V1.00.
 * 
 *          更新履历： V1.00 2014/10/29 张振峰 创建.
 */
public interface LoginService {
	
	/**
	 * 根据用户的email获取用户的密码
	 * @param userView
	 * @return
	 */
	public UserModel getUserPassword(UserView userView) throws Exception;
}
