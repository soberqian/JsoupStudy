package com.crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class JsoupConnectTest {

	public static void main(String[] args) throws IOException {
//		Document doc = Jsoup.connect("http://www.w3school.com.cn/b.asp").get();
//		System.out.println(doc.body());
//		Document doc = Jsoup.connect("http://www.w3school.com.cn/b.asp").get();
//		System.out.println(doc);
		//设置延迟时间，5000指5秒
		Document doc = Jsoup.connect("http://www.w3school.com.cn/b.asp").timeout(5000).get();
		System.out.println(doc);
	}

}
