package com.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ElementTest {

	public static void main(String[] args) throws IOException {
		//获取URL对应的HTML内容
		Document doc = Jsoup.connect("http://www.w3school.com.cn/b.asp").timeout(5000).get();
		//层层定位到要解析的内容，可以发现包含多个li标签
		System.out.println("通过id提取的结果为:" + doc.getElementById("course").text()); //通过id定位，并获取文本
		System.out.println("通过tag提取的结果为:" + doc.getElementById("course").getElementsByTag("a").text());
		System.out.println("通过attr提取的结果为:" + doc.getElementById("course").getElementsByAttribute("href").text());
		Elements elements = doc.getElementsByClass("browserscripting"); //获取HTML文档中指定class名的所有元素
		System.out.println("通过class提取的元素为:" + elements);
	}

}
