package com.test.class12.VIP1905JavaMavenTest;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ipjson = "{\"status\":\"0\",\"t\":\"1577448636035\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"美国\",\"titlecont\":\"IP地址查询\",\"origip\":\"3.4.5.6\",\"origipquery\":\"3.4.5.6\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.4.5.6\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.4.5.6\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]}";

		System.out.println("json格式字符串：" + ipjson);

		// 先将json格式字符串转换为json对象
		JSONObject ipjsonOb = JSONObject.parseObject(ipjson);
		// 直接将json格式的字符串存储到map中
		Map<String, Object> Map01 = (Map<String, Object>) JSON.parseObject(ipjson);
		System.out.println("直接写入转换为map的结果：" + Map01);

		/*
		 * 
		 * // 获取json对象一个key的值 System.out.println("json对象中的t值为：" + ipjsonOb.get("t"));
		 * 
		 * // 将json对象存储到map中,先new一个map Map<String, Object> ipMap = new HashMap<String,
		 * Object>(); // 遍历json对象中的每个键值对，存储到map中去 for (String key1 : ipjsonOb.keySet())
		 * { // 基于遍历json中的键集合，将键值对存储到map中去 ipMap.put(key1, ipjsonOb.get(key1)); }
		 * System.out.println("打印存储在map中的json对象" + ipMap);
		 * 
		 * 
		 * 
		 * // 将map拼接为json字符串 String reIpJson = "{"; for (Entry<String, Object> en :
		 * ipMap.entrySet()) { if (en.getValue() instanceof String) { reIpJson += "\"" +
		 * en.getKey() + "\":\"" + en.getValue() + "\","; } else { reIpJson += "\"" +
		 * en.getKey() + "\":" + en.getValue() + ","; } } reIpJson =
		 * reIpJson.substring(0, reIpJson.length() - 1); reIpJson += "}";
		 * System.out.println("map拼接的字符串为：" + reIpJson);
		 * 
		 * // 使用fastjson直接将map转换为json格式字符串 String ipMapJson =
		 * JSONObject.toJSONString(ipMap);
		 * System.out.println("使用fastjson直接将map转换为json格式字符串：" + ipMapJson);
		 */
	}
}
