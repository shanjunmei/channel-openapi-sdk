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
 * 结算申请请求信息
 * </p>
 * @author	hz15051252 
 * @date	2015年6月12日 下午6:58:30
 * @version      
 */
public class SettlementBillTotalReq {

    //流水号，每次请求不相同
    private String transNo;
    
    //代理商ID
    private int partnerId;
    
    //渠道唯一的标识
    private String userId;
    
    //查询的申请结算开始时间
    private String startTime;
    
    //查询的申请结算结束时间
    private String endTime;
    
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

    
    public String getSign() {
        return sign;
    }

    
    public void setSign(String sign) {
        this.sign = sign;
    }


    
    public String getUserId() {
        return userId;
    }


    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
}
 