package com.src.util;

import java.util.ArrayList;
import java.util.List;

public class AjaxResponse<T> {
	
	private boolean success;
	
	private String msg;
	private Integer err;
	private String errMsg;
	private T data;
	
	private boolean status;
	@SuppressWarnings("rawtypes")
	private List dataList;	
	private Object object;
	private ArrayList<String> list;
	
	//private T objData;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean status) {
		this.success = status;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		setSuccess(true);
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		setSuccess(true);
		this.msg = msg;
	}

	public Integer getErr() {
		return err;
	}
	public void setErr(Integer err) {
		setSuccess(true);
		this.err = err;
	}

	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		setSuccess(false);
		this.errMsg = errMsg;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public List getDataList() {
		return dataList;
	}
	public void setDataList(List dataList) {
		this.dataList = dataList;
	}
	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
}
