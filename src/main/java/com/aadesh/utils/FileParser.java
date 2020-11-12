package com.aadesh.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Description - An interface defining contracts for class implementing it,
 *                  1. Parse given file.
 * 
 * @author Aadesh Singhai
 * @version 0.0.1
 */

public interface FileParser {

    /**
     * Description - Parse the given file.
     * 
     * @throws IOException - If any Format mismatch is there in give file.
     */
    ArrayList<HashMap<String, String>> parseFile() throws IOException; 
}
