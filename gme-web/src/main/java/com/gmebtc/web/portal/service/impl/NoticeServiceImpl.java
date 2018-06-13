package com.gmebtc.web.portal.service.impl;

import com.gmebtc.web.portal.service.NoticeService;
import com.gmebtc.web.portal.utils.SendRequestUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/*
 * @Author zhou
 * @Date 2018/5/31 15:28
 * @Desc 系统公告
 */
@Service(value = "noticeService")
public class NoticeServiceImpl implements NoticeService {
    
    
    @Value("${SERVICE_BASE_PARAM}")
    private String SERVICE_BASE_PARAM;


    /**
     * @Author zhou
     * @Date 2018/5/31 15:29
     * @Param [request, hashMap]
     * @Desc 币种介绍
     */
    @Override
    public String getCoinIntroduce(HttpServletRequest request) {
        String method = SERVICE_BASE_PARAM + "getCoinIntroduce&";
        return SendRequestUtil.sendRequest(request, method);
    }


    /**
     * @Author zhou
     * @Date 2018/5/31 15:32
     * @Param [request, hashMap]
     * @Desc 获取公告
     */
    @Override
    public String getNotice(HttpServletRequest request, HashMap<String, String> hashMap) {
        String method = SERVICE_BASE_PARAM + "getNotice&";
        return SendRequestUtil.sendMapRequest(request, hashMap, method);
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
    @Override
	public String getCoinDetail(HttpServletRequest request, HashMap<String, String> hashMap) {
    	String method = SERVICE_BASE_PARAM + "getCoinId&";
		return SendRequestUtil.sendMapRequest(request, hashMap, method);
	}


    
    
}
