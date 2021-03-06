package com.gmebtc.web.portal.controller;

import com.gmebtc.web.portal.service.NoticeService;
import com.gmebtc.web.portal.utils.Toolkits;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/*
 * @Author zhou
 * @Date 2018/5/31 15:22
 * @Desc 系统公告
 */
@Controller
@RequestMapping("${ROOT_PATH}/user")
public class NoticeController {


    @Resource(name = "noticeService")
    private NoticeService noticeService;



    /**
     * @Author zhou
     * @Date 2018/5/31 15:24
     * @Param [request,]
     * @Desc 查询所有币种
     */
    @RequestMapping(value = "/coinIntroduce",method = RequestMethod.POST)
    @ResponseBody
    public Object getCoinIntroduce2018 (HttpServletRequest request){
    	/* HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("coinType", coinType);
        hashMap.put("page", page);
        hashMap.put("pageSize", pageSize);*/
        String json = noticeService.getCoinIntroduce(request);
        return Toolkits.messageTransformation(request, json);
    }

    
    
    /**
     * 
     * @Title: getCoinDetail
     * @Description: 币种详情查询
     * @param @param request
     * @param @param coinId
     * @param @return
     * @return Object
     * @throws
     */
    @RequestMapping(value = "/coinDetail",method = RequestMethod.POST)
    @ResponseBody
    public Object getCoinDetail (HttpServletRequest request,@RequestParam String coinId){
    	HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("coinId", coinId);
        String json = noticeService.getCoinDetail(request,hashMap);
        return Toolkits.messageTransformation(request, json);
    }
    
    

    /**
     * @Author zhou
     * @Date 2018/5/31 15:31
     * @Param [request, noticeType:类型，1，行业资讯，2，系统公告，3，帮助, page, pageSize]
     * @Desc 获取公告
     */
    @RequestMapping(value = "/getNotice",method = RequestMethod.POST)
    @ResponseBody
    public Object getNotice (HttpServletRequest request,@RequestParam String noticeType
                            ,@RequestParam(defaultValue = "1") String page,@RequestParam String pageSize){
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("noticeType", noticeType);
        hashMap.put("page", page);
        hashMap.put("pageSize", pageSize);
        String json = noticeService.getNotice(request,hashMap);
        return Toolkits.messageTransformation(request, json);

    }


}
