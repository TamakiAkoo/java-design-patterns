package com.example.demo.test.visit.why.v1;

import java.util.ArrayList;
import java.util.List;

public class ToolApplication {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            //多态是一种动态绑定，可以在运行时获取对象的实际类型，来运行实际类型对应的方法。
            // 而函数重载是一种静态绑定，在编译时并不能获取对象的实际类型，而是根据声明类型执行声明类型对应的方法。
            //extractor.extract2txt(resourceFile);

            //解决办法之一
            //if (resourceFile instanceof PdfFile) {
            //    extractor.extract2txt((PdfFile) resourceFile);
            //}

            //解决办法之二  查看V2
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}