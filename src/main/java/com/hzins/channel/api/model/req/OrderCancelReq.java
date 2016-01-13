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

import com.hzins.channel.api.model.info.ExtendInfo;

/**
 * <p>
 * 退保请求消息
 * </p>
 * @author	hz15031081 
 * @date	2015-4-9 下午3:22:12
 * @version      
 */
public class OrderCancelReq {
    
    private String transNo;
    
    private int partnerId;
    
    private String sign;
    
    private String insureNo;
    
    // 扩展信息
    private ExtendInfo extendInfo;

    
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


    
    public String getSign() {
        return sign;
    }


    
    public void setSign(String sign) {
        this.sign = sign;
    }


    
    public String getInsureNo() {
        return insureNo;
    }


    
    public void setInsureNo(String insureNo) {
        this.insureNo = insureNo;
    }


    
    public ExtendInfo getExtendInfo() {
        return extendInfo;
    }


    
    public void setExtendInfo(ExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
    }
    
    

}
 