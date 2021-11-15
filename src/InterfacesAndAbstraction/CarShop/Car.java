package InterfacesAndAbstraction.CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    public static final int TIRES = 4;


    public String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();


}
