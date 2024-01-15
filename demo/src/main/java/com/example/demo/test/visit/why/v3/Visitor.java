package com.example.demo.test.visit.why.v3;

import com.example.demo.test.visit.why.PPTFile;
import com.example.demo.test.visit.why.WordFile;

public interface Visitor {

    void visit(PdfFile pdfFile);

    void visit(PPTFile pdfFile);

    void visit(WordFile pdfFile);
}
