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

import com.entity.XueshuhuodongEntity;
import com.entity.view.XueshuhuodongView;

import com.service.XueshuhuodongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 学术活动
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-21 16:10:50
 */
@RestController
@RequestMapping("/xueshuhuodong")
public class XueshuhuodongController {
    @Autowired
    private XueshuhuodongService xueshuhuodongService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshuhuodongEntity xueshuhuodong,
		HttpServletRequest request){
        EntityWrapper<XueshuhuodongEntity> ew = new EntityWrapper<XueshuhuodongEntity>();

		PageUtils page = xueshuhuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshuhuodong), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshuhuodongEntity xueshuhuodong, 
		HttpServletRequest request){
        EntityWrapper<XueshuhuodongEntity> ew = new EntityWrapper<XueshuhuodongEntity>();

		PageUtils page = xueshuhuodongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshuhuodong), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshuhuodongEntity xueshuhuodong){
       	EntityWrapper<XueshuhuodongEntity> ew = new EntityWrapper<XueshuhuodongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshuhuodong, "xueshuhuodong")); 
        return R.ok().put("data", xueshuhuodongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshuhuodongEntity xueshuhuodong){
        EntityWrapper< XueshuhuodongEntity> ew = new EntityWrapper< XueshuhuodongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshuhuodong, "xueshuhuodong")); 
		XueshuhuodongView xueshuhuodongView =  xueshuhuodongService.selectView(ew);
		return R.ok("查询学术活动成功").put("data", xueshuhuodongView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshuhuodongEntity xueshuhuodong = xueshuhuodongService.selectById(id);
        return R.ok().put("data", xueshuhuodong);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshuhuodongEntity xueshuhuodong = xueshuhuodongService.selectById(id);
        return R.ok().put("data", xueshuhuodong);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshuhuodongEntity xueshuhuodong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshuhuodong);
        xueshuhuodongService.insert(xueshuhuodong);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshuhuodongEntity xueshuhuodong, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xueshuhuodong);
        xueshuhuodongService.insert(xueshuhuodong);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XueshuhuodongEntity xueshuhuodong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshuhuodong);
        xueshuhuodongService.updateById(xueshuhuodong);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshuhuodongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
