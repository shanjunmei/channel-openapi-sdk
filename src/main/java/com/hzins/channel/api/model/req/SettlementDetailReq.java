/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */   
package com.hzins.channel.api.model.req; 

/**
 * <p>
 * 服务费明细请求信息
 * </p>
 * @author	hz15051252 
 * @date	2015年6月12日 下午3:41:09
 * @version      
 */
public class SettlementDetailReq {

    //流水号，每次请求不相同
    private String transNo;
    
    //代理商编号
    private int partnerId;
    
    //渠道唯一的标识
    private String userId;
    
    //投保单号(多个以英文逗号隔开)
    private String insureNums;
    
    //查询开始时间
    private String startTime;
    
    //查询结束时间
    private String endTime;
    
    //查询页数
    private int pageNum;
    
    //每页数量
    private int pageSize;
    
    //签名
    private String sign;

    
    public String getTransNo() {
        return transNo;
    }

    
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    
    public int getPartnerId() {
        return partnerId;
    }

    
    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    
    public String getStartTime() {
        return startTime;
    }

    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    
    public String getEndTime() {
        return endTime;
    }

    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    
    public int getPageNum() {
        return pageNum;
    }

    
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    
    public int getPageSize() {
        return pageSize;
    }

    
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    
    public String getSign() {
        return sign;
    }

    
    public void setSign(String sign) {
        this.sign = sign;
    }


    
    
    public String getInsureNums() {
        return insureNums;
    }


    
    public void setInsureNums(String insureNums) {
        this.insureNums = insureNums;
    }


    public String getUserId() {
        return userId;
    }


    
    public void setUserId(String userId) {
        this.userId = userId;
    }

}
 