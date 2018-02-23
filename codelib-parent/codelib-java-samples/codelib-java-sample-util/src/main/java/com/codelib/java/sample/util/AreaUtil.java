package com.codelib.java.sample.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AreaUtil {

    public static List<String> getArea(String s, String patternStr) {
        List<String> values = new ArrayList<>();
        try {
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(s);
            matcher.matches();
            for (int i = 1; i <= matcher.groupCount(); i++) {
                String groupi = matcher.group(i);
                values.add(groupi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return values;
    }

}
