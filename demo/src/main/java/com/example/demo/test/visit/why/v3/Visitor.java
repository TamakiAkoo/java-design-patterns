package com.example.demo.test.visit.why.v3;

public interface Visitor {

    void visit(PdfFile pdfFile);

    void visit(PPTFile pdfFile);

    void visit(WordFile pdfFile);
}
