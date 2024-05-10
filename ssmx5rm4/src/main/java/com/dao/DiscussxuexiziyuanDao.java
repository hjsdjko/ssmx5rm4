package com.dao;

import com.entity.DiscussxuexiziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxuexiziyuanVO;
import com.entity.view.DiscussxuexiziyuanView;


/**
 * 学习资源评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-21 20:26:04
 */
public interface DiscussxuexiziyuanDao extends BaseMapper<DiscussxuexiziyuanEntity> {
	
	List<DiscussxuexiziyuanVO> selectListVO(@Param("ew") Wrapper<DiscussxuexiziyuanEntity> wrapper);
	
	DiscussxuexiziyuanVO selectVO(@Param("ew") Wrapper<DiscussxuexiziyuanEntity> wrapper);
	
	List<DiscussxuexiziyuanView> selectListView(@Param("ew") Wrapper<DiscussxuexiziyuanEntity> wrapper);

	List<DiscussxuexiziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxuexiziyuanEntity> wrapper);
	
	DiscussxuexiziyuanView selectView(@Param("ew") Wrapper<DiscussxuexiziyuanEntity> wrapper);
	
}
