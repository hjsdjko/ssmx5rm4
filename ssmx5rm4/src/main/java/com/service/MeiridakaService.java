package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeiridakaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeiridakaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeiridakaView;


/**
 * 每日打卡
 *
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
public interface MeiridakaService extends IService<MeiridakaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeiridakaVO> selectListVO(Wrapper<MeiridakaEntity> wrapper);
   	
   	MeiridakaVO selectVO(@Param("ew") Wrapper<MeiridakaEntity> wrapper);
   	
   	List<MeiridakaView> selectListView(Wrapper<MeiridakaEntity> wrapper);
   	
   	MeiridakaView selectView(@Param("ew") Wrapper<MeiridakaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeiridakaEntity> wrapper);
   	
}

