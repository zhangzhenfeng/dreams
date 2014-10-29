package com.margin.dream.frame.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.margin.dream.frame.util.WebConstantValue;
import com.margin.dream.frame.util.WebJsonUtil;

/**
 * Copyright(C) JiNanShangJie 2014.
 * 
 * BaseController
 * 
 * @author 张振峰 2014/10/29.
 * 
 * @version V1.00.
 * 
 *          更新履历： V1.00 2014/10/29 张振峰 创建.
 */
public class BaseController {

	/** logger. */
	protected Logger logger;

	/** HttpServletRequest. */
	protected HttpServletRequest request;

	/** HttpServletResponse. */
	protected HttpServletResponse response;

	/** HttpSession. */
	protected HttpSession session;

	/** Session中的username KEY. */
	protected static final String SESSION_KEY_USERNAME = WebConstantValue.SESSION_KEY_USERNAME;

	/**
	 * 设置基本对象.
	 * 
	 * @param request
	 *            HttpServletRequest.
	 * 
	 * @param response
	 *            HttpServletResponse.
	 */
	@ModelAttribute
	private void setContextValue(HttpServletRequest request,
			HttpServletResponse response) {

		// request
		this.request = request;
		// response
		this.response = response;
		// session
		this.session = request.getSession(true);
		// logger
		this.logger = Logger.getLogger(this.getClass());
	}

	/**
	 * 从Request中取得IP.
	 * 
	 * @return 取得访问者IP.
	 */
	protected String getRemoteAddress() {

		return this.request.getRemoteAddr().toString();
	}

	/**
	 * 取得webApp的绝对路径.
	 * 
	 * @return webApp的绝对路径.
	 */
	protected String getWebRootPath() {

		return this.request.getServletPath();
	}
	
	/**
	 * 从Session中取得登录的用户名.
	 * 
	 * @return 用户名.
	 */
	protected String getUserName() {

		// 返回用户名.
		return this.session.getAttribute(SESSION_KEY_USERNAME) == null ? ""
				: (String) this.session.getAttribute(SESSION_KEY_USERNAME);
	}

	/**
	 * 将登录者的用户名放到Session中.
	 * 
	 * @param username
	 *            用户名.
	 */
	protected void setUserName(String username) {

		// 设定用户名
		this.session.setAttribute(SESSION_KEY_USERNAME, username);
	}

	/**
	 * 将Request中传过来的数据转换为View实体.
	 * 
	 * @param request
	 *            HttpServletRequest.
	 * 
	 * @param classOfT
	 *            View类.
	 * 
	 * @return View实体.
	 */
	protected <T> T getPostData(HttpServletRequest request, Class<T> classOfT) {

		// POST数据
		String strPostBody = WebConstantValue.EMPTY;
		InputStream in = null;

		try {
			// 避免中文乱码 POST方式提交
			request.setCharacterEncoding("UTF-8");
			// 获取流
			in = request.getInputStream();

			if (in != null) {
				// 读取流
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(in, "UTF-8"));

				StringBuffer buffer = new StringBuffer();
				String strTempLine = WebConstantValue.EMPTY;

				while ((strTempLine = reader.readLine()) != null) {
					buffer.append(strTempLine);
				}

				// 转换为字符串
				strPostBody = buffer.toString();
			}

			// 关闭流
			in.close();
			in = null;

			// 没有流时
			if (strPostBody.equals(WebConstantValue.EMPTY)) {
				// 返回NULL
				return null;
			} else {
				logger.info(strPostBody);
				// 返回
				return WebJsonUtil.json2Bean(strPostBody, classOfT);
			}
		} catch (Exception e) {
			// 异常时返回NULL
			in = null;
			return null;
		}
	}
}
