package tacos;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order /*implements Serializable */{

    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}
