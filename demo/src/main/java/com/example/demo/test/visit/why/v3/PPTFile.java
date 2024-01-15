package com.example.demo.test.visit.why.v3;

public class PPTFile extends ResourceFileV3 {

    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //...
}
