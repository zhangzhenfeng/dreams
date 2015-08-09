package com.margin.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.margin.dream.frame.controller.BaseController;
import com.margin.dream.frame.util.WebConstantUrlValue;
import com.margin.dream.frame.util.WebConstantValue;
import com.margin.dream.frame.util.WebJsonUtil;
import com.margin.dream.model.UserModel;
import com.margin.dream.service.LoginService;
import com.margin.dream.view.UserView;

/**
 * Copyright(C) JiNanShangJie 2014.
 * 
 * 登录controller
 * 
 * @author 张振峰 2014/10/29.
 * 
 * @version V1.00.
 * 
 *          更新履历： V1.00 2014/10/29 张振峰 创建.
 */
@Controller
public class LoginController extends BaseController{
	
	/** 登陆的service **/
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = WebConstantUrlValue.LOGIN, produces = WebConstantValue.PRODUCE_TEXT, method = RequestMethod.GET)
	@ResponseBody
	public String login(UserView userView){
		logger.info("========================Controller login Start==========================");
		UserModel resultModel = new UserModel();
		try {
			
			//验证用户名密码
			resultModel = loginService.getUserPassword(userView);
		} catch (Exception e) {
			logger.info("========================Exception login Start==========================");
			logger.info(e.getStackTrace());
			
			return WebJsonUtil.bean2Json(getSysErrorModel());
		}
		logger.info("========================Controller login End==========================");
		return WebJsonUtil.bean2Json(resultModel);
	}
	
	@RequestMapping(value = "/test", produces = WebConstantValue.PRODUCE_TEXT, method = RequestMethod.GET)
	@ResponseBody
	public void test(String content){
		logger.info("短信内容为---->"+content);
	}
}
