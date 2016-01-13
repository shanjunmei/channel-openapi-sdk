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
 * 
 * </p>
 * @author	hz15031081 
 * @date	2015-4-30 下午2:20:46
 * @version      
 */
public class CpsPayReq {
    
    //请求流水号
    private String transNo;
    //投保单号，不是订单号
    private String orderNum;
    //渠道id
    private int partnerId;
    //渠道唯一标示
    private String userId;
    //加密串
    private String sign;
    
    //普通类型，0为Pc.1为H5
    private int platformType;
    
    //支付成功之后返回链接(如果是cps支付，需填写，用户能有更好的体验)
    private String backUrl;
    
    
    
    

    
    public String getBackUrl() {
        return backUrl;
    }


    
    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }


    public String getTransNo() {
        return transNo;
    }

    
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    
    public String getOrderNum() {
        return orderNum;
    }

    
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    
    public int getPartnerId() {
        return partnerId;
    }

    
    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
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


    
    public int getPlatformType() {
        return platformType;
    }


    
    public void setPlatformType(int platformType) {
        this.platformType = platformType;
    }
    
    

}
 