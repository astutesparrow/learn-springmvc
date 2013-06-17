package com.github.astutesparrow.web.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author: 刘兆敏
 * @since: 2013-06-16
 */
public class Dom4jUtil {

    /**
     * 那天少华那个初始化的问题，我知道咋回事了，不是类加载和static的问题；因为document是延迟加载执行的
     * http://xerces.apache.org/xerces-j/faq-write.html#faq-4
     * @param args
     * @throws DocumentException
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        SAXReader saxReader = new SAXReader();
        Document doc = saxReader.read(new FileReader(new File(Dom4jUtil.class
                .getResource("/catalog.xml").getFile())));
    }

}
