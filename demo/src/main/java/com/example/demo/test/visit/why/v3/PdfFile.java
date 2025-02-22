package com.example.demo.test.visit.why.v3;

public class PdfFile extends ResourceFileV3 {

    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //...
}
