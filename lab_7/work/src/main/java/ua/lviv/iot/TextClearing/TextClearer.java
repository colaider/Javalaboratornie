package ua.lviv.iot.TextClearing;
import java.io.FileWriter;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextClearer{
    public String txtFileRider(String path) {
        try{
            return(new String(Files.readAllBytes(Paths.get(path))));
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean areStringContainsQuestion(String str){
        char[] arr = str.toCharArray();
        for (char el: arr) {
            if(el == '?'){
                return true;
            }
        }
        return false;
    }

    public boolean howOften(String word, String str){
        Pattern pattern = Pattern.compile(word + " " + word + " " + word + ".*+$?");
        Matcher matcher = pattern.matcher(str);

        return  matcher.find();
    }

    public void clear(String path, String word){
        String output = "";
        List<String> arr = new ArrayList<>();

        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        String source = txtFileRider(path);
        iterator.setText(source);
        int start = iterator.first();
        for (int end = iterator.next();
             end != BreakIterator.DONE;
             start = end, end = iterator.next()) {
             arr.add(source.substring(start,end));
        }

        for (int j = 0; j < arr.size(); j++) {
           if(areStringContainsQuestion(arr.get(j))){
               if(howOften(word,arr.get(j))){
                   arr.remove(j);
               }
           }
        }

        for(String el1: arr) output += el1;
        try{
            FileWriter writer = new FileWriter("clearText.txt");
            writer.write(output);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
