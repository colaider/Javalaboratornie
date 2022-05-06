package ua.lviv.iot.tablewearPackage;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
@AllArgsConstructor()
public  class DisposibleTabelware {

    @Getter @Setter private Date dateOfCreation;
    @Getter @Setter private double price;
    @Getter @Setter private String material;
    @Getter @Setter private int size;

    public String getHeaders(){
        String result = "dateOfCreation price material size";
        return result.replaceAll("([^ ]) ", "$1, ");
    }
    public String toCSV(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(dateOfCreation);
        String result = strDate + ", " + String.valueOf(price) + ", " + material + ", " + String.valueOf(size);
        return result;
    }
}
