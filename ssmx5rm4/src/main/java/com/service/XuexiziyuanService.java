package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiziyuanView;


/**
 * 学习资源
 *
 * @author 
 * @email 
 * @date 2021-04-21 20:26:03
 */
public interface XuexiziyuanService extends IService<XuexiziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiziyuanVO> selectListVO(Wrapper<XuexiziyuanEntity> wrapper);
   	
   	XuexiziyuanVO selectVO(@Param("ew") Wrapper<XuexiziyuanEntity> wrapper);
   	
   	List<XuexiziyuanView> selectListView(Wrapper<XuexiziyuanEntity> wrapper);
   	
   	XuexiziyuanView selectView(@Param("ew") Wrapper<XuexiziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiziyuanEntity> wrapper);
   	
}

