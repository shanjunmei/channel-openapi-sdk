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

import com.hzins.channel.api.model.info.FinancialInfo;

/**
 * 
 * <p>
 * 服务费结算请求实体
 * </p>
 *  
 * @author	hz15051252 
 * @date	2015年5月11日 下午3:38:53
 * @version
 */
public class SettlementReq {
    
    private String transNo;
    
    private int partnerId;
    
    private String sign;
    
    private String userId;
    
    private FinancialInfo financialInfo;

    
    public String getTransNo() {
        return transNo;
    }

    
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    
    
    public String getUserId() {
        return userId;
    }


    
    public void setUserId(String userId) {
        this.userId = userId;
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


    
    public FinancialInfo getFinancialInfo() {
        return financialInfo;
    }


    
    public void setFinancialInfo(FinancialInfo financialInfo) {
        this.financialInfo = financialInfo;
    }
    
    
}
 