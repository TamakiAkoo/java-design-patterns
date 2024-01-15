package com.example.demo.test.visit.why.v2;

public abstract class ResourceFileV2 {
  protected String filePath;
  public ResourceFileV2(String filePath) {
    this.filePath = filePath;
  }
  public abstract void accept(ExtractorV2 extractor);

}

