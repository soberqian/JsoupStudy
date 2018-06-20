package com.crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
public class JsoupConnectTest2 {

	public static void main(String[] args) throws IOException {
		String html = "<html><body><div id=\"w3school\"> <h1>浏览器脚本教程</h1> <p><strong>从左侧的菜单选择你需要的教程！</strong></p> </div>"
				+ "<div>  <div id=\"course\"> <ul> <li><a href=\"/js/index.asp\" title=\"JavaScript 教程\">JavaScript</a></li> </ul> </div> </body></html>";
		Document doc = Jsoup.parse(html); //转化成Document
		Element element = doc.select("div[id=w3school]").get(0); //获取Element
		String text1 = element.select("h1").text(); //从Element提取内容(抽取一个Node对应的信息)
		String text2 = element.select("p").text(); //从Element提取内容(抽取一个Node对应的信息)
		System.out.println("输出解析的元素内容为:");
		System.out.println(element);
		System.out.println("抽取的文本信息为:");
		System.out.println(text1 + "\t" + text2);
	}

}
