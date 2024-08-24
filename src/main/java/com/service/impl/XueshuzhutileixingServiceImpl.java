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


import com.dao.XueshuzhutileixingDao;
import com.entity.XueshuzhutileixingEntity;
import com.service.XueshuzhutileixingService;
import com.entity.vo.XueshuzhutileixingVO;
import com.entity.view.XueshuzhutileixingView;

@Service("xueshuzhutileixingService")
public class XueshuzhutileixingServiceImpl extends ServiceImpl<XueshuzhutileixingDao, XueshuzhutileixingEntity> implements XueshuzhutileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshuzhutileixingEntity> page = this.selectPage(
                new Query<XueshuzhutileixingEntity>(params).getPage(),
                new EntityWrapper<XueshuzhutileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshuzhutileixingEntity> wrapper) {
		  Page<XueshuzhutileixingView> page =new Query<XueshuzhutileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XueshuzhutileixingVO> selectListVO(Wrapper<XueshuzhutileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshuzhutileixingVO selectVO(Wrapper<XueshuzhutileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshuzhutileixingView> selectListView(Wrapper<XueshuzhutileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshuzhutileixingView selectView(Wrapper<XueshuzhutileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
