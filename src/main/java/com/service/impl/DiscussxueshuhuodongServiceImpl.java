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


import com.dao.DiscussxueshuhuodongDao;
import com.entity.DiscussxueshuhuodongEntity;
import com.service.DiscussxueshuhuodongService;
import com.entity.vo.DiscussxueshuhuodongVO;
import com.entity.view.DiscussxueshuhuodongView;

@Service("discussxueshuhuodongService")
public class DiscussxueshuhuodongServiceImpl extends ServiceImpl<DiscussxueshuhuodongDao, DiscussxueshuhuodongEntity> implements DiscussxueshuhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxueshuhuodongEntity> page = this.selectPage(
                new Query<DiscussxueshuhuodongEntity>(params).getPage(),
                new EntityWrapper<DiscussxueshuhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxueshuhuodongEntity> wrapper) {
		  Page<DiscussxueshuhuodongView> page =new Query<DiscussxueshuhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussxueshuhuodongVO> selectListVO(Wrapper<DiscussxueshuhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxueshuhuodongVO selectVO(Wrapper<DiscussxueshuhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxueshuhuodongView> selectListView(Wrapper<DiscussxueshuhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxueshuhuodongView selectView(Wrapper<DiscussxueshuhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
