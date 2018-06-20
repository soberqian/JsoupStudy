package com.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupConnectContentParse {

	public static void main(String[] args) throws IOException {
		//获取URL对应的HTML内容
		Document doc = Jsoup.connect("http://www.w3school.com.cn/b.asp").timeout(5000).get();
		//层层定位到要解析的内容，可以发现包含多个li标签
		Elements elements = doc.select("div[id=course]").select("li"); 
		//遍历每一个li节点
		for (Element ele : elements) {
			String title = ele.select("a").text();  //.text()为解析标签中的文本内容
			String course_url = ele.select("a").attr("href");  //.attr(String)表示获取标签内某一属性的内容
			System.out.println("课程的标题为:" + title + "\t对应的URL为" + course_url);
		}
		
	}

}
