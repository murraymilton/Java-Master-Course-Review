package interfacesExplained;

public interface Product {

    String getName();
    void setName(String name);

    default double getPrice(){return 100;}
    default void setPrice(double price){}
}
