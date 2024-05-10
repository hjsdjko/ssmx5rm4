package com.entity.vo;

import com.entity.XuexijihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学习计划
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
public class XuexijihuaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户
	 */
	
	private String yonghu;
		
	/**
	 * 学习目标
	 */
	
	private String xueximubiao;
		
	/**
	 * 学习内容
	 */
	
	private String xuexineirong;
		
	/**
	 * 学习表
	 */
	
	private String xuexibiao;
		
	/**
	 * 起始日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qishiriqi;
		
	/**
	 * 结束日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshuriqi;
		
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
	 * 设置：学习目标
	 */
	 
	public void setXueximubiao(String xueximubiao) {
		this.xueximubiao = xueximubiao;
	}
	
	/**
	 * 获取：学习目标
	 */
	public String getXueximubiao() {
		return xueximubiao;
	}
				
	
	/**
	 * 设置：学习内容
	 */
	 
	public void setXuexineirong(String xuexineirong) {
		this.xuexineirong = xuexineirong;
	}
	
	/**
	 * 获取：学习内容
	 */
	public String getXuexineirong() {
		return xuexineirong;
	}
				
	
	/**
	 * 设置：学习表
	 */
	 
	public void setXuexibiao(String xuexibiao) {
		this.xuexibiao = xuexibiao;
	}
	
	/**
	 * 获取：学习表
	 */
	public String getXuexibiao() {
		return xuexibiao;
	}
				
	
	/**
	 * 设置：起始日期
	 */
	 
	public void setQishiriqi(Date qishiriqi) {
		this.qishiriqi = qishiriqi;
	}
	
	/**
	 * 获取：起始日期
	 */
	public Date getQishiriqi() {
		return qishiriqi;
	}
				
	
	/**
	 * 设置：结束日期
	 */
	 
	public void setJieshuriqi(Date jieshuriqi) {
		this.jieshuriqi = jieshuriqi;
	}
	
	/**
	 * 获取：结束日期
	 */
	public Date getJieshuriqi() {
		return jieshuriqi;
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
