package com.auto.test.auto_simple;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

public class NewTest extends DriverBase {
  @Test
  public void f() throws IOException {
	//get方法的参数写到url里面
			String url = "http://www.baidu.com?su=1";
			//把结果值赋给a
			String a = get1(url);
			//控制台打印下a看结果
			System.out.println(a);
			//校验返回值包含STATUS OK
			assertTrue(a.contains("STATUS OK"));

  }
}
