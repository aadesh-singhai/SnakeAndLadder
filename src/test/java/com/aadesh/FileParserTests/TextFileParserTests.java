package com.aadesh.FileParserTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.aadesh.utils.FileParser;
import com.aadesh.utils.FileParserFactory;
import com.aadesh.utils.TextFileParser;

import org.junit.jupiter.api.Test;

/**
 * Description - This a class to run tests for the validity of File content
 * correctly read.
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */
public class TextFileParserTests {

    /**
     * Description - This method checks, if we are reading correct input and getting
     * it returned in desired format.
     * 
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    void checkTextParseFile() throws IOException, ClassNotFoundException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("input1.txt").getFile());
        String path = file.getPath();
        FileParser fileParser = FileParserFactory.INSTANCE.getFileParser("txt", path);
        ArrayList<HashMap<String, String>> input = fileParser.parseFile();
        assertTrue(input.get(0).containsKey("1"));
        assertTrue(input.get(1).containsKey("98"));
        assertTrue(input.get(2).containsKey("1"));
    }

    /**
     * Description - This method check if file is present ,asserting file not found exception by passing non existing file.
     *  
     * @throws ClassNotFoundException
     * @throws IOException
     */
    @Test
    void checkFileNotFoundException() throws ClassNotFoundException, IOException {
        assertThrows(FileNotFoundException.class,() -> FileParserFactory.INSTANCE.getFileParser("txt", "abc.txt"));
    }
}
