package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学习计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
@TableName("xuexijihua")
public class XuexijihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexijihuaEntity() {
		
	}
	
	public XuexijihuaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date qishiriqi;
	
	/**
	 * 结束日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jieshuriqi;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
