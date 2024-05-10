package com.entity.model;

import com.entity.MeiridakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 每日打卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
public class MeiridakaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户
	 */
	
	private String yonghu;
		
	/**
	 * 打卡
	 */
	
	private String daka;
		
	/**
	 * 动态
	 */
	
	private String dongtai;
		
	/**
	 * 配图
	 */
	
	private String peitu;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：用户
	 */
	 
	public void setYonghu(String yonghu) {
		this.yonghu = yonghu;
	}
	
	/**
	 * 获取：用户
	 */
	public String getYonghu() {
		return yonghu;
	}
				
	
	/**
	 * 设置：打卡
	 */
	 
	public void setDaka(String daka) {
		this.daka = daka;
	}
	
	/**
	 * 获取：打卡
	 */
	public String getDaka() {
		return daka;
	}
				
	
	/**
	 * 设置：动态
	 */
	 
	public void setDongtai(String dongtai) {
		this.dongtai = dongtai;
	}
	
	/**
	 * 获取：动态
	 */
	public String getDongtai() {
		return dongtai;
	}
				
	
	/**
	 * 设置：配图
	 */
	 
	public void setPeitu(String peitu) {
		this.peitu = peitu;
	}
	
	/**
	 * 获取：配图
	 */
	public String getPeitu() {
		return peitu;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
