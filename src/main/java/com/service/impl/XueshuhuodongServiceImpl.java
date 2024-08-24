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


import com.dao.XueshuhuodongDao;
import com.entity.XueshuhuodongEntity;
import com.service.XueshuhuodongService;
import com.entity.vo.XueshuhuodongVO;
import com.entity.view.XueshuhuodongView;

@Service("xueshuhuodongService")
public class XueshuhuodongServiceImpl extends ServiceImpl<XueshuhuodongDao, XueshuhuodongEntity> implements XueshuhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshuhuodongEntity> page = this.selectPage(
                new Query<XueshuhuodongEntity>(params).getPage(),
                new EntityWrapper<XueshuhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshuhuodongEntity> wrapper) {
		  Page<XueshuhuodongView> page =new Query<XueshuhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XueshuhuodongVO> selectListVO(Wrapper<XueshuhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshuhuodongVO selectVO(Wrapper<XueshuhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshuhuodongView> selectListView(Wrapper<XueshuhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshuhuodongView selectView(Wrapper<XueshuhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
