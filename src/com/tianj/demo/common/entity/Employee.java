package com.tianj.demo.common.entity;
//通用实体类，对应于数据表
import java.sql.Date;

public class Employee {

	private Integer ID;

	private String xm; // 姓名
	
	private String num;//编号

	public Integer getBh() {
		return ID;
	}

	public void setBh(Integer bh) {
		this.ID = bh;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
    
	@Override
    public String toString() {
        return "Employee [xm=" + xm + ", num=" + num +"]";
	}

}
