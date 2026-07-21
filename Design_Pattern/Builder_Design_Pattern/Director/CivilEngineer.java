package Design_Pattern.Builder_Design_Pattern.Director;

import Design_Pattern.Builder_Design_Pattern.Builders.HouseBuilder;
import Design_Pattern.Builder_Design_Pattern.Product.House;

public class CivilEngineer {
    
    private HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }

    public void constructHouse() {
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}
