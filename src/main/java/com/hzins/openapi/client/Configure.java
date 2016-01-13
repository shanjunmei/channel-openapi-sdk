/**
 * Copyright (c) 2006-2015 Hzins Ltd. All Rights Reserved. 
 *  
 * This code is the confidential and proprietary information of   
 * Hzins. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Hzins,http://www.hzins.com.
 *  
 */
package com.hzins.openapi.client;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016年1月6日 下午3:11:57
 * @version
 */
public class Configure {

    public static class Channel {

	// public final static String baseUrl =
	// "http://localhost:8081/channel-openapi-reroute/api/";

	public final static String baseUrl = "http://testchannel.hzins.com/api/";

	public final static Integer partnerId = 2820;

	public final static String channelKey = "2820^*##%%";
    }

    public static class Request {

	public final static int http_connection_timeout = 0;// ms为单位
							    // 默认为0，系统默认超时时间，根据操作系统而定

	public final static int http_read_timeout = 0;// ms为单位
						      // 默认为0，系统默认超时时间，根据操作系统而定

	public final static String userAgent = "Channel OpenApi Sdk";

	public final static String contentType = "application/json;charset=UTF-8";
    }

}
