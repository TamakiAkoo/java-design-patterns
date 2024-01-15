package com.example.demo.test.visit.why.v2;

public class WordFileV2 extends ResourceFileV2 {

    public WordFileV2(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(ExtractorV2 extractor) {
        extractor.extract2txt(this);
    }
    //...
}
