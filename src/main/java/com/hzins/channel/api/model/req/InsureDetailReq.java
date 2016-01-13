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
 *
 *
 * </p>
 * @author	hz15041177 
 * @date	2015-5-5 下午7:49:03
 * @version      
 */
public class InsureDetailReq {
    
    private String transNo;
    
    private int partnerId;
    
    private String sign;
    
    private String insureNum;

    
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

    
    public String getInsureNum() {
        return insureNum;
    }

    
    public void setInsureNum(String insureNum) {
        this.insureNum = insureNum;
    }
    
    

}
 