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
 * 支付接口请求对象
 * </p>
 * @author	hz15031081 
 * @date	2015-4-27 上午11:26:02
 * @version      
 */
public class PrePayReq {
    
    // 交易流水号，每一单请求交易不能相同
    private String transNo;
    
    // 代理商编号
    private int partnerId; 
    
    //商户Id
    private String userId;
    
    // 方案代码
    private String caseCode;
    
    // 数字签名
    private String sign;
    
    // 投保单号
    private String orderNum;
    
    // 在线支付网关标识，1：支付宝；3：银联；12：易宝在线；13：易宝无卡支付；14：财付通；15：手机支付；16：银联(B2B)；21：微信支付
    private int onliePaymnetId;
    
    // 银行标识，当值大于0时，会直接跳转到相应的银行页面
    private int bankId;
    
    // 页面返回地址
    private String pageNoticeUrl;
    
    // 支付金额（单位：元）
    private String price;
    
    

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
    
    
    public String getCaseCode() {
        return caseCode;
    }


    
    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode;
    }


    public String getSign() {
        return sign;
    }

    
    public void setSign(String sign) {
        this.sign = sign;
    }

    
    public String getOrderNum() {
        return orderNum;
    }

    
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }


    
    public int getOnliePaymnetId() {
        return onliePaymnetId;
    }


    
    public void setOnliePaymnetId(int onliePaymnetId) {
        this.onliePaymnetId = onliePaymnetId;
    }


    
    public int getBankId() {
        return bankId;
    }


    
    public void setBankId(int bankId) {
        this.bankId = bankId;
    }


    
    public String getPageNoticeUrl() {
        return pageNoticeUrl;
    }


    
    public void setPageNoticeUrl(String pageNoticeUrl) {
        this.pageNoticeUrl = pageNoticeUrl;
    }


    
    public String getPrice() {
        return price;
    }


    
    public void setPrice(String price) {
        this.price = price;
    }


    
    public String getUserId() {
        return userId;
    }


    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    
    
}
 