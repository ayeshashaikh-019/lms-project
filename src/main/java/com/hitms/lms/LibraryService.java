package com.hitms.lms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LibraryService {

    static Map<String, Integer> cat = new LinkedHashMap<>();

    public static int addb(String t, int c) {
        cat.put(t, c);
        return cat.size();
    }
}