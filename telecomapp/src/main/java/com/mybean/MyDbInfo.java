package com.mybean;

public class MyDbInfo {
	private String dbInfo;
	
	MyDbInfo(){
		
	}
	public String getDbInfo() {
		return dbInfo;
	}
	public void setDbInfo(String dbInfo) {
		this.dbInfo = dbInfo;
	}
	@Override
	public String toString() {
		return "MyDbInfo [dbInfo=" + dbInfo + "]";
	}
	public MyDbInfo(String dbInfo) {
		super();
		this.dbInfo = dbInfo;
	}
	
}