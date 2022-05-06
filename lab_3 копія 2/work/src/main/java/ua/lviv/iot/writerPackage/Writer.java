package ua.lviv.iot.writerPackage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import ua.lviv.iot.tablewearPackage.DisposibleTabelware;

public class Writer{

    private List<DisposibleTabelware> arrOfTablewear;

    public void writeToFile() throws IOException {
        try(FileWriter writer = new FileWriter("result.csv")){
            writer.write(arrOfTablewear.get(0).getHeaders() + "\r\n");
            for (DisposibleTabelware el: arrOfTablewear){
                writer.write(el.toCSV() + "\r\n");
            }
        }
    }
    public Writer(List<DisposibleTabelware> arrOfTablewearSet){
        arrOfTablewear = arrOfTablewearSet;
    }

}
