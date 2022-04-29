package ua.lviv.iot.tablewearPackage;
import java.util.Date;
import lombok.Data;
import lombok.AllArgsConstructor;
@AllArgsConstructor()
public @Data class DisposibleTabelware {

    private Date dateOfCreation;
    private double price;
    private String material;
    private int size;
}
