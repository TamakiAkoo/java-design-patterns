package com.example.demo.test.visit.why.v3;

import com.example.demo.test.visit.why.PPTFile;
import com.example.demo.test.visit.why.WordFile;
import java.util.ArrayList;
import java.util.List;

public abstract class ResourceFile {
  protected String filePath;
  public ResourceFile(String filePath) {
    this.filePath = filePath;
  }
  abstract public void accept(Visitor vistor);
}

//...PPTFile、WordFile跟PdfFile类似，这里就省略了...

