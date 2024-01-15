package com.example.demo.test.visit.why.v3;

public class WordFile extends ResourceFileV3 {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //...
}
