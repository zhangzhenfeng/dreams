package com.margin.dream.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.margin.dream.frame.util.WebConstantValue;

public class CommonInterceptor implements HandlerInterceptor {

	private Logger logger = Logger.getLogger(CommonInterceptor.class);

	/** 不进行拦截的URI. */
	private static final String[] IGNORE_URI = { "/dreams/login" };
	
	/** 登陆页面 **/
	private static final String LOGIN_URL = "login.jsp";
	
	/** Session中的username KEY. */
	protected static final String SESSION_KEY_USERNAME = WebConstantValue.SESSION_KEY_USERNAME;
	
	public CommonInterceptor() {

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object object, Exception exception)
			throws Exception {
		logger.info("====================afterCompletion start========================");

		logger.info("====================afterCompletion end========================");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		logger.info("====================postHandle start========================");

		logger.info("====================postHandle end========================");
	}

	/**
	 * 在业务处理器处理请求之前被调用 如果返回false 从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链
	 * 
	 * 如果返回true 执行下一个拦截器,直到所有的拦截器都执行完毕 再执行被拦截的Controller 然后进入拦截器链,
	 * 从最后一个拦截器往回执行所有的postHandle() 接着再从最后一个拦截器往回执行所有的afterCompletion()
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception {
		logger.info("====================preHandle start========================");

		// Flag
		boolean bolFlag = false;

		// 取得请求的URL
		String strUrl = request.getRequestURI();

		// 当前URL是否是忽略的URI
		for (String strTemp : IGNORE_URI) {
			if (strUrl.equals(strTemp)) {
				// Flag改为true
				bolFlag = true;
			}
		}

		// 从Session中取得登录者的用户名
		String strUserName = (String) request.getSession().getAttribute(
				SESSION_KEY_USERNAME);

		// 如果存在session
		if (strUserName != null) {
			bolFlag = true;
		} else {

			// 如果用戶沒有登陆或者登陆超时，就跳转到登陆页面
			bolFlag = false;

			response.sendRedirect(LOGIN_URL);
		}

		logger.info("====================preHandle end========================");
		return bolFlag;
	}

}
