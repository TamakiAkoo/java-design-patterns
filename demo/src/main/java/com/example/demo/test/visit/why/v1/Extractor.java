package com.example.demo.test.visit.why.v1;

/**
 * 这里是文档的操作,结构和操作分离
 */
//...PPTFile、WordFile代码省略...
public class Extractor {

    public void extract2txt(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}
