package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HuodongleixingEntity;
import com.entity.view.HuodongleixingView;

import com.service.HuodongleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 活动类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@RestController
@RequestMapping("/huodongleixing")
public class HuodongleixingController {
    @Autowired
    private HuodongleixingService huodongleixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongleixingEntity huodongleixing,
		HttpServletRequest request){
        EntityWrapper<HuodongleixingEntity> ew = new EntityWrapper<HuodongleixingEntity>();

		PageUtils page = huodongleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongleixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongleixingEntity huodongleixing, 
		HttpServletRequest request){
        EntityWrapper<HuodongleixingEntity> ew = new EntityWrapper<HuodongleixingEntity>();

		PageUtils page = huodongleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongleixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongleixingEntity huodongleixing){
       	EntityWrapper<HuodongleixingEntity> ew = new EntityWrapper<HuodongleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongleixing, "huodongleixing")); 
        return R.ok().put("data", huodongleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongleixingEntity huodongleixing){
        EntityWrapper< HuodongleixingEntity> ew = new EntityWrapper< HuodongleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongleixing, "huodongleixing")); 
		HuodongleixingView huodongleixingView =  huodongleixingService.selectView(ew);
		return R.ok("查询活动类型成功").put("data", huodongleixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongleixingEntity huodongleixing = huodongleixingService.selectById(id);
        return R.ok().put("data", huodongleixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongleixingEntity huodongleixing = huodongleixingService.selectById(id);
        return R.ok().put("data", huodongleixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongleixingEntity huodongleixing, HttpServletRequest request){
        if(huodongleixingService.selectCount(new EntityWrapper<HuodongleixingEntity>().eq("huodongleixing", huodongleixing.getHuodongleixing()))>0) {
            return R.error("活动类型已存在");
        }
    	//ValidatorUtils.validateEntity(huodongleixing);
        huodongleixingService.insert(huodongleixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongleixingEntity huodongleixing, HttpServletRequest request){
        if(huodongleixingService.selectCount(new EntityWrapper<HuodongleixingEntity>().eq("huodongleixing", huodongleixing.getHuodongleixing()))>0) {
            return R.error("活动类型已存在");
        }
    	//ValidatorUtils.validateEntity(huodongleixing);
        huodongleixingService.insert(huodongleixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuodongleixingEntity huodongleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongleixing);
        if(huodongleixingService.selectCount(new EntityWrapper<HuodongleixingEntity>().ne("id", huodongleixing.getId()).eq("huodongleixing", huodongleixing.getHuodongleixing()))>0) {
            return R.error("活动类型已存在");
        }
        huodongleixingService.updateById(huodongleixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
