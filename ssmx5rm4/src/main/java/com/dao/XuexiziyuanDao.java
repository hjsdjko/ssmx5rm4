package com.dao;

import com.entity.XuexiziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiziyuanVO;
import com.entity.view.XuexiziyuanView;


/**
 * 学习资源
 * 
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
public interface XuexiziyuanDao extends BaseMapper<XuexiziyuanEntity> {
	
	List<XuexiziyuanVO> selectListVO(@Param("ew") Wrapper<XuexiziyuanEntity> wrapper);
	
	XuexiziyuanVO selectVO(@Param("ew") Wrapper<XuexiziyuanEntity> wrapper);
	
	List<XuexiziyuanView> selectListView(@Param("ew") Wrapper<XuexiziyuanEntity> wrapper);

	List<XuexiziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiziyuanEntity> wrapper);
	
	XuexiziyuanView selectView(@Param("ew") Wrapper<XuexiziyuanEntity> wrapper);
	
}
