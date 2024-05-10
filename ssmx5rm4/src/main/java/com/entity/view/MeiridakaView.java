package com.entity.view;

import com.entity.MeiridakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 每日打卡
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
@TableName("meiridaka")
public class MeiridakaView  extends MeiridakaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeiridakaView(){
	}
 
 	public MeiridakaView(MeiridakaEntity meiridakaEntity){
 	try {
			BeanUtils.copyProperties(this, meiridakaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
