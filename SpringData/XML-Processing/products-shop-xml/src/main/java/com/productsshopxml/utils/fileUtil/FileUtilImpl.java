package com.productsshopxml.utils.fileUtil;

import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Collectors;

@Component
public class FileUtilImpl implements FileUtil {

    @Override
    public String readFileContent(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath))
                .stream().filter(s -> !s.isEmpty())
                .collect(Collectors.joining(System.lineSeparator()));
    }

    @Override
    public void write(String content, String filePath) throws IOException {
        Files.write(Paths.get(filePath), Collections.singleton(content));
    }

    @Override
    public FileInputStream streamFile(String filePath) throws FileNotFoundException {
        return new FileInputStream(filePath);
    }
}
