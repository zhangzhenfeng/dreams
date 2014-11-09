package com.margin.dream.dao;

import java.util.Map;

/**
 * Copyright(C) JiNanShangJie 2014.
 * 
 * 登录Dao
 * 
 * @author 张振峰 2014/10/29.
 * 
 * @version V1.00.
 * 
 *          更新履历： V1.00 2014/10/29 张振峰 创建.
 */
public interface LoginDao{
	
	/**
	 * 根据用户的email获取用户的密码
	 * @param paramMap
	 * @return
	 */
	public String getUserPassword(Map<String, Object> paramMap);
	
}
