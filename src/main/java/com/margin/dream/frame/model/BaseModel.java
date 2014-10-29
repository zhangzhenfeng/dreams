package com.margin.dream.frame.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Copyright(C) JiNanShangJie 2014.
 * 
 * BaseModel。所有的model将继承他
 * 
 * @author 张振峰 2014/10/29.
 * 
 * @version V1.00.
 * 
 *          更新履历： V1.00 2014/10/29 张振峰 创建.
 */
public class BaseModel {
	
	/** 状态. */
	private boolean state = false;

	/** 提示信息. */
	private String msg;

	/** 总条数. */
	private int total;

	/** 前台渲染的List. */
	private List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Map<String, Object>> getRows() {
		return rows;
	}

	public void setRows(List<Map<String, Object>> rows) {
		this.rows = rows;
	}
	
	
	
}
