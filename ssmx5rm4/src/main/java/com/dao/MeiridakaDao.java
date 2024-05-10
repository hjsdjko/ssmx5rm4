package com.dao;

import com.entity.MeiridakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeiridakaVO;
import com.entity.view.MeiridakaView;


/**
 * 每日打卡
 * 
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
public interface MeiridakaDao extends BaseMapper<MeiridakaEntity> {
	
	List<MeiridakaVO> selectListVO(@Param("ew") Wrapper<MeiridakaEntity> wrapper);
	
	MeiridakaVO selectVO(@Param("ew") Wrapper<MeiridakaEntity> wrapper);
	
	List<MeiridakaView> selectListView(@Param("ew") Wrapper<MeiridakaEntity> wrapper);

	List<MeiridakaView> selectListView(Pagination page,@Param("ew") Wrapper<MeiridakaEntity> wrapper);
	
	MeiridakaView selectView(@Param("ew") Wrapper<MeiridakaEntity> wrapper);
	
}
