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


import com.dao.MeiridakaDao;
import com.entity.MeiridakaEntity;
import com.service.MeiridakaService;
import com.entity.vo.MeiridakaVO;
import com.entity.view.MeiridakaView;

@Service("meiridakaService")
public class MeiridakaServiceImpl extends ServiceImpl<MeiridakaDao, MeiridakaEntity> implements MeiridakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeiridakaEntity> page = this.selectPage(
                new Query<MeiridakaEntity>(params).getPage(),
                new EntityWrapper<MeiridakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeiridakaEntity> wrapper) {
		  Page<MeiridakaView> page =new Query<MeiridakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeiridakaVO> selectListVO(Wrapper<MeiridakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeiridakaVO selectVO(Wrapper<MeiridakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeiridakaView> selectListView(Wrapper<MeiridakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeiridakaView selectView(Wrapper<MeiridakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
