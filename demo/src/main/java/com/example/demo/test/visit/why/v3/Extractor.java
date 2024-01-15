package com.example.demo.test.visit.why.v3;

import com.example.demo.test.visit.why.PPTFile;
import com.example.demo.test.visit.why.WordFile;

public class Extractor implements Visitor {

    @Override
    public void visit(PPTFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    @Override
    public void visit(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}
