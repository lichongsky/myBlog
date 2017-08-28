package com.lichong.ui.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class BaseController{
    private static final Logger logger = LoggerFactory.getLogger(BaseController.class);


    /**
     * 结果输出
     *
     * @param str      字符串
     * @param response HttpServletResponse
     */
    protected void outputResponse(String str, HttpServletResponse response) {
        response.setHeader("Cache-Control", "no-cache");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        BufferedOutputStream bf = null;
        try {
            bf = new BufferedOutputStream(response.getOutputStream());
            bf.write(str.getBytes(Charset.forName("UTF-8")));
        } catch (IOException e) {
            logger.error("system error", e);
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
