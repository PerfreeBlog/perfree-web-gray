package com.webGray;

import com.perfree.plugin.proxy.HtmlRenderProxy;
import org.jsoup.nodes.Document;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebGray extends HtmlRenderProxy {

    @Override
    public Document editFrontDocument(Document document, HttpServletResponse response, HttpServletRequest request) {
        document.head().append("<style>html{\n" +
                "filter: grayscale(100%);\n" +
                "-webkit-filter: grayscale(100%);\n" +
                "-moz-filter: grayscale(100%);\n" +
                "-ms-filter: grayscale(100%);\n" +
                "-o-filter: grayscale(100%);\n" +
                "filter:progid:DXImageTransform.Microsoft.BasicImage(grayscale=1);\n" +
                "}</style>");
        return document;
    }
}
