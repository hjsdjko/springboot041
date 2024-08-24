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


import com.dao.DiscusslunwenDao;
import com.entity.DiscusslunwenEntity;
import com.service.DiscusslunwenService;
import com.entity.vo.DiscusslunwenVO;
import com.entity.view.DiscusslunwenView;

@Service("discusslunwenService")
public class DiscusslunwenServiceImpl extends ServiceImpl<DiscusslunwenDao, DiscusslunwenEntity> implements DiscusslunwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslunwenEntity> page = this.selectPage(
                new Query<DiscusslunwenEntity>(params).getPage(),
                new EntityWrapper<DiscusslunwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslunwenEntity> wrapper) {
		  Page<DiscusslunwenView> page =new Query<DiscusslunwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusslunwenVO> selectListVO(Wrapper<DiscusslunwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslunwenVO selectVO(Wrapper<DiscusslunwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslunwenView> selectListView(Wrapper<DiscusslunwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslunwenView selectView(Wrapper<DiscusslunwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
