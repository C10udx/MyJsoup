package com.cloudx.douban;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @ClassName DoubanTest1
 * @Author yun.xia
 * @Date 2018/11/22 13:48
 * @Description TODO
 **/
public class DoubanTest1 {

//    private static final String url = "https://movie.douban.com/review/9767063/";
    private static final String url = "https://movie.douban.com/review/9772056/";
    public static void main(String[] args) {
        try {
            //获取整个网站的根节点，也就是HTML开头部分一直到结束
            Document document = Jsoup.connect(url).get();
            Element article = document.getElementById("link-report");
            String articleStr = article.text();
            String string = articleStr.replace("", "\n");
            System.out.println(articleStr);
//            Element comments = document.getElementById("comments");
//            String commentsStr = comments.text();
//            String str = commentsStr.replace("> 删除 ", "\n");
//            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

