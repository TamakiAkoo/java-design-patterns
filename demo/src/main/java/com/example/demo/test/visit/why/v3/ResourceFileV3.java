package com.example.demo.test.visit.why.v3;

public abstract class ResourceFileV3 {
  protected String filePath;
  public ResourceFileV3(String filePath) {
    this.filePath = filePath;
  }
  abstract public void accept(Visitor vistor);
}

//...PPTFile、WordFile跟PdfFile类似，这里就省略了...

