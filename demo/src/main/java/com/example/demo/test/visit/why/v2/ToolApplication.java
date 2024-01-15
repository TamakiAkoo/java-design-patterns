package com.example.demo.test.visit.why.v2;

import com.example.demo.test.visit.why.Extractor;
import com.example.demo.test.visit.why.PPTFile;
import com.example.demo.test.visit.why.PdfFile;
import com.example.demo.test.visit.why.ResourceFile;
import com.example.demo.test.visit.why.WordFile;
import java.util.ArrayList;
import java.util.List;

/**
 * 意图：主要将数据结构与数据操作分离。
 * <p>
 * 对象结构比较稳定，但经常需要在此对象结构上定义新的操作。
 * 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而需要避免这些操作“污染”这些对象的类，也不希望在增加新操作时修改这些类。
 *
 *
 */
public class ToolApplication {

    public static void main(String[] args) {
        ExtractorV2 extractor = new ExtractorV2();
        List<ResourceFileV2> resourceFiles = listAllResourceFiles();
        for (ResourceFileV2 resourceFile : resourceFiles) {
            //多态是一种动态绑定，可以在运行时获取对象的实际类型，来运行实际类型对应的方法。
            // 而函数重载是一种静态绑定，在编译时并不能获取对象的实际类型，而是根据声明类型执行声明类型对应的方法。
            resourceFile.accept(extractor);

        }
    }

    private static List<ResourceFileV2> listAllResourceFiles() {
        List<ResourceFileV2> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFileV2("a.pdf"));
        resourceFiles.add(new WordFileV2("b.word"));
        resourceFiles.add(new PPTFileV2("c.ppt"));
        return resourceFiles;
    }
}