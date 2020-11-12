package com.aadesh.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Description - A class implementing FileParser interface. 1. Parse file of
 * .txt format.
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public class TextFileParser implements FileParser {

    public Scanner sc;

    /**
     * Description- Method to create scanner object having content of given file.
     * 
     * @param uri - File path
     * 
     * @throws FileNotFoundException - File is not present at the provide path.
     * @throws IOException           - Input format in the file is not correct.
     */
    public TextFileParser(String uri) throws FileNotFoundException, IOException {
        File file = new File(uri);
        sc = new Scanner(file);
    }

    @Override
    public ArrayList<HashMap<String, String>> parseFile() throws IOException {
        ArrayList<HashMap<String, String>> input = new ArrayList<>();
        int playerCount = sc.nextInt();
        input.add(parseInput(playerCount));
        int snakeCount = sc.nextInt();
        input.add(parseInput(snakeCount));
        int ladderCount = sc.nextInt();
        input.add(parseInput(ladderCount));
        cleanup();
        return input;
    }

    public HashMap<String, String> parseInput(int n) {
        HashMap<String, String> hs = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            hs.put(a, b);
        }
        return hs;
    }

    /**
     * Description - Method responsible for cleanup process after the whole process.
     * 1. Closing scanner object.
     */
    public void cleanup() {
        sc.close();
    }

}
