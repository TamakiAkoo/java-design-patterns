package com.example.demo.test.visit.why.v2;

public class PdfFileV2 extends ResourceFileV2 {

    public PdfFileV2(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(ExtractorV2 extractor) {
        extractor.extract2txt(this);
    }
    //...
}
