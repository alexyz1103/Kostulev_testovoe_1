package ru.kostulev.testovoe1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Page {
    private String text;
    private String url;

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public void getPage() throws IOException {
        RandomNumber randomNumber = new RandomNumber();
        this.url = "http://numbersapi.com/"+randomNumber.getNumber()+"/trivia";
        Document page = Jsoup.parse(new URL(url), 3000);
        this.text = page.select("body").text();
    }


}
