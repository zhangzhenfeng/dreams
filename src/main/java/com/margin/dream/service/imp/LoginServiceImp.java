package com.margin.dream.service.imp;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.margin.dream.dao.LoginDao;
import com.margin.dream.frame.service.BaseService;
import com.margin.dream.frame.util.WebConstantValue;
import com.margin.dream.model.UserModel;
import com.margin.dream.service.LoginService;
import com.margin.dream.view.UserView;

/**
 * Copyright(C) JiNanShangJie 2014.
 * 
 * 登录serviceImp
 * 
 * @author 张振峰 2014/10/29.
 * 
 * @version V1.00.
 * 
 *          更新履历： V1.00 2014/10/29 张振峰 创建.
 */
@Service
public class LoginServiceImp extends BaseService implements LoginService {
	
	/** logger **/
	private static final Logger logger = Logger.getLogger(LoginServiceImp.class);
	
	/** 登陆相关的dao **/
	@Autowired
	private LoginDao loginDao;
	
	/**
	 * 根据用户的email获取用户的密码
	 */
	@Override
	public UserModel getUserPassword(UserView userView) throws Exception{
		logger.info("========================Service getUserPassword Start==========================");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(BEAN, userView);
		
		//根据用户的邮箱获取用户的密码
		String password = loginDao.getUserPassword(paramMap);
		
		UserModel resultModel = new UserModel();
		
		//判断用户密码是否正确
		if ((userView.getPassword()+"").equals(password)) {
			resultModel.setState(WebConstantValue.HTTP_OK);
			resultModel.setMsg(WebConstantValue.LOGIN_SUCCESS);
		}else {
			resultModel.setState(WebConstantValue.HTTP_ERROR);
			resultModel.setMsg(WebConstantValue.LOGIN_ERROR);
		}
		
		logger.info("========================Service getUserPassword End==========================");
		return resultModel;
	}
	
}
