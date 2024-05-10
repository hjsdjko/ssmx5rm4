package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxuexiziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxuexiziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxuexiziyuanView;


/**
 * 学习资源评论表
 *
 * @author 
 * @email 
 * @date 2021-04-21 20:26:04
 */
public interface DiscussxuexiziyuanService extends IService<DiscussxuexiziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxuexiziyuanVO> selectListVO(Wrapper<DiscussxuexiziyuanEntity> wrapper);
   	
   	DiscussxuexiziyuanVO selectVO(@Param("ew") Wrapper<DiscussxuexiziyuanEntity> wrapper);
   	
   	List<DiscussxuexiziyuanView> selectListView(Wrapper<DiscussxuexiziyuanEntity> wrapper);
   	
   	DiscussxuexiziyuanView selectView(@Param("ew") Wrapper<DiscussxuexiziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxuexiziyuanEntity> wrapper);
   	
}

