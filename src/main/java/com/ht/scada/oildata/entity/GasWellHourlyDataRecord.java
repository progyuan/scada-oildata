package com.ht.scada.oildata.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 天然气井时数据（也可能按分钟来）
 * @author 赵磊
 *
 */
@Entity
@Table(name="T_Gaswell_Hourly_Record")
public class GasWellHourlyDataRecord extends AbstractPersistable<Integer> {

	/**
	 * 油井编号
	 */
	private String code;
	
	/**
	 * 产气量
	 */
	private float gasProduct;
	
	/**
	 * 开井时间（分钟，即存储间隔）
	 */
	private int runTime;
	/**
	 * 用电量
	 */
	private float eleConsume;
	
	

	/**
	 * 时间
	 */
	private Date datetime;


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public float getGasProduct() {
		return gasProduct;
	}


	public void setGasProduct(float gasProduct) {
		this.gasProduct = gasProduct;
	}


	public int getRunTime() {
		return runTime;
	}


	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}


	public float getEleConsume() {
		return eleConsume;
	}


	public void setEleConsume(float eleConsume) {
		this.eleConsume = eleConsume;
	}


	public Date getDatetime() {
		return datetime;
	}


	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}


	

}
