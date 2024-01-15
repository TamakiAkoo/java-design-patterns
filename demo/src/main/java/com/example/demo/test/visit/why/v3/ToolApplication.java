package com.example.demo.test.visit.why.v3;

import com.example.demo.test.visit.why.PPTFile;
import com.example.demo.test.visit.why.WordFile;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dqk
 * @version 1.0
 * @date 2024/1/15 11:02
 */
public class ToolApplication {

    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFile("a.pdf"));
        //resourceFiles.add(new WordFile("b.word"));
        //resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
