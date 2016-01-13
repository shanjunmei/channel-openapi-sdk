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

import java.util.List;

/**
 * <p>
 * 结算前每月汇总查询请求参数
 * </p>
 * @author	hz15051252 
 * @date	2015年6月12日 下午6:58:30
 * @version      
 */
public class IncomeDetailReq {

    //流水号，每次请求不相同
    private String transNo;
    
    //代理商ID
    private int partnerId;
    
    //渠道唯一的标识
    private List<String> userIds;
    
    //年份
    private int  year;
    
    //月份
    private int month;
    
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

    
    
    public String getSign() {
        return sign;
    }

    
    public void setSign(String sign) {
        this.sign = sign;
    }


    
    public List<String> getUserIds() {
        return userIds;
    }


    
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }


    
    public int getYear() {
        return year;
    }


    
    public void setYear(int year) {
        this.year = year;
    }


    
    public int getMonth() {
        return month;
    }


    
    public void setMonth(int month) {
        this.month = month;
    }

    
   
}
 