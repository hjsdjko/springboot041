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

import com.entity.XueshuzhutileixingEntity;
import com.entity.view.XueshuzhutileixingView;

import com.service.XueshuzhutileixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学术主题类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@RestController
@RequestMapping("/xueshuzhutileixing")
public class XueshuzhutileixingController {
    @Autowired
    private XueshuzhutileixingService xueshuzhutileixingService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshuzhutileixingEntity xueshuzhutileixing,
		HttpServletRequest request){
        EntityWrapper<XueshuzhutileixingEntity> ew = new EntityWrapper<XueshuzhutileixingEntity>();

		PageUtils page = xueshuzhutileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshuzhutileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshuzhutileixingEntity xueshuzhutileixing, 
		HttpServletRequest request){
        EntityWrapper<XueshuzhutileixingEntity> ew = new EntityWrapper<XueshuzhutileixingEntity>();

		PageUtils page = xueshuzhutileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshuzhutileixing), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshuzhutileixingEntity xueshuzhutileixing){
       	EntityWrapper<XueshuzhutileixingEntity> ew = new EntityWrapper<XueshuzhutileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshuzhutileixing, "xueshuzhutileixing")); 
        return R.ok().put("data", xueshuzhutileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshuzhutileixingEntity xueshuzhutileixing){
        EntityWrapper< XueshuzhutileixingEntity> ew = new EntityWrapper< XueshuzhutileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshuzhutileixing, "xueshuzhutileixing")); 
		XueshuzhutileixingView xueshuzhutileixingView =  xueshuzhutileixingService.selectView(ew);
		return R.ok("查询学术主题类型成功").put("data", xueshuzhutileixingView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshuzhutileixingEntity xueshuzhutileixing = xueshuzhutileixingService.selectById(id);
        return R.ok().put("data", xueshuzhutileixing);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshuzhutileixingEntity xueshuzhutileixing = xueshuzhutileixingService.selectById(id);
        return R.ok().put("data", xueshuzhutileixing);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshuzhutileixingEntity xueshuzhutileixing, HttpServletRequest request){
        if(xueshuzhutileixingService.selectCount(new EntityWrapper<XueshuzhutileixingEntity>().eq("xueshuzhutileixing", xueshuzhutileixing.getXueshuzhutileixing()))>0) {
            return R.error("学术主题类型已存在");
        }
    	//ValidatorUtils.validateEntity(xueshuzhutileixing);
        xueshuzhutileixingService.insert(xueshuzhutileixing);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshuzhutileixingEntity xueshuzhutileixing, HttpServletRequest request){
        if(xueshuzhutileixingService.selectCount(new EntityWrapper<XueshuzhutileixingEntity>().eq("xueshuzhutileixing", xueshuzhutileixing.getXueshuzhutileixing()))>0) {
            return R.error("学术主题类型已存在");
        }
    	//ValidatorUtils.validateEntity(xueshuzhutileixing);
        xueshuzhutileixingService.insert(xueshuzhutileixing);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshuzhutileixingEntity xueshuzhutileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshuzhutileixing);
        if(xueshuzhutileixingService.selectCount(new EntityWrapper<XueshuzhutileixingEntity>().ne("id", xueshuzhutileixing.getId()).eq("xueshuzhutileixing", xueshuzhutileixing.getXueshuzhutileixing()))>0) {
            return R.error("学术主题类型已存在");
        }
        xueshuzhutileixingService.updateById(xueshuzhutileixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshuzhutileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
