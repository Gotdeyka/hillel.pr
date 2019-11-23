package com.company.newpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wow {

public static void main(String[] args){
    String text = "Егор Алла Аллек4сандр";
    Pattern patter = Pattern.compile("А. + а");

    Matcher matcher = patter.matcher(text);

    while (matcher.find()){
        System.out.println(text.substring(matcher.start(), matcher.end()));
    }
   // for(String str: args)
    //System.out.println(str);
}
}