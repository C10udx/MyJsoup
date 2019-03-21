package com.cloudx.novel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Copyright (C) 1997-2018 Shenzhen GX IOT Co., Ltd.
 *
 * @Author: yun.xia
 * @Date: 2018/10/23
 * @Description:
 */

public class Msj {

    private static final String url = "http://www.huanyue123.com/book/37/37849/24453788.html";
    private static final String url1 = "http://www.huanyue123.com/book/37/37849/24456299.html";

    public static void main(String[] args) {
        try {
            //获取整个网站的根节点，也就是HTML开头部分一直到结束
            Document document = Jsoup.connect(url).get();
            Element content = document.getElementById("content");
            String text = content.text();
//            System.out.println(text.replace("。", "\n"));
            Document document1 = Jsoup.connect(url1).get();
            Element content1 = document1.getElementById("content");
            String text1 = content1.text();
            System.out.println(text1.replace("。", "\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
