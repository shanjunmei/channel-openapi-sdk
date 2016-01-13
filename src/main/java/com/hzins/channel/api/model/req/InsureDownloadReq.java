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
 * 
 * <p>
 * 保单下载
 * </p>
 *  
 * @author	hz15051252 
 * @date	2015年5月11日 下午3:38:53
 * @version
 */
public class InsureDownloadReq {
    
    private String transNo;
    
    private String insureNum;

    private int partnerId;
    
    private String sign;
    
    public String getTransNo() {
        return transNo;
    }
    
    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }
    
    public String getInsureNum() {
        return insureNum;
    }
    
    public void setInsureNum(String insureNum) {
        this.insureNum = insureNum;
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

}
 