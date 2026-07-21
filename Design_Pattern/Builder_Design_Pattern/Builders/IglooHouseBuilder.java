package Design_Pattern.Builder_Design_Pattern.Builders;

import Design_Pattern.Builder_Design_Pattern.Product.House;

public class IglooHouseBuilder implements HouseBuilder {
    
    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    public void buildInterior() {
        house.setInterior("Ice Carvings");
    }

    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    public House getHouse() {
        return this.house;
    }
}