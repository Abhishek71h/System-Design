package Design_Pattern.Builder_Design_Pattern.Builders;

import Design_Pattern.Builder_Design_Pattern.Product.House;

public interface HouseBuilder {
    
    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}