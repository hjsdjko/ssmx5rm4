package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexiziyuanDao;
import com.entity.XuexiziyuanEntity;
import com.service.XuexiziyuanService;
import com.entity.vo.XuexiziyuanVO;
import com.entity.view.XuexiziyuanView;

@Service("xuexiziyuanService")
public class XuexiziyuanServiceImpl extends ServiceImpl<XuexiziyuanDao, XuexiziyuanEntity> implements XuexiziyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiziyuanEntity> page = this.selectPage(
                new Query<XuexiziyuanEntity>(params).getPage(),
                new EntityWrapper<XuexiziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiziyuanEntity> wrapper) {
		  Page<XuexiziyuanView> page =new Query<XuexiziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiziyuanVO> selectListVO(Wrapper<XuexiziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiziyuanVO selectVO(Wrapper<XuexiziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiziyuanView> selectListView(Wrapper<XuexiziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiziyuanView selectView(Wrapper<XuexiziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
