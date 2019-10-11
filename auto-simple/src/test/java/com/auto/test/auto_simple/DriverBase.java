package com.auto.test.auto_simple;

import java.io.IOException;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class DriverBase {
	

	OkHttpClient client = new OkHttpClient();
	public static final MediaType JSON = MediaType
				.parse("application/json; charset=utf-8");
		
		//入参为测试地址路径，和json的参数形式，同步传输
	public String post(String url, String json) throws IOException {
			RequestBody body = RequestBody.create(JSON, json);
			Request request = new Request.Builder().url(url).post(body).build();
			Response response = client.newCall(request).execute();
			String result1 = response.body().string();
			//结果返回为字符串
	        return result1;
		}
	// GET方法
	public static String get1(String url) throws IOException {
		OkHttpClient client = new OkHttpClient();
		String result = null;
		Request request = new Request.Builder().url(url).build();
		Response response = client.newCall(request).execute();
		return response.body().string();
	}


public static Map returnmap(String str) {
		Map<String, Object> map = com.alibaba.fastjson.JSON.parseObject(str,
				Map.class);
		return map;

}
}
