package org.example.homeworks.hw_13;

import infrastructure.utils.TestUrl;
import org.w3c.dom.ls.LSOutput;

public class Url {

    public static void main(String[] args) {




    String url = new TestUrl.Builder()
            .withProtocol("https")
            .withDomain("www.google.com")
            .withPath("/ukraine")
            .build();

        System.out.println(url);

}}
