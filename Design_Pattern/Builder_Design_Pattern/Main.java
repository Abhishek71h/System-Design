package Design_Pattern.Builder_Design_Pattern;

import Design_Pattern.Builder_Design_Pattern.Builders.HouseBuilder;
import Design_Pattern.Builder_Design_Pattern.Builders.IglooHouseBuilder;
import Design_Pattern.Builder_Design_Pattern.Director.CivilEngineer;
import Design_Pattern.Builder_Design_Pattern.Product.House;

public class Main {
    
    public static void main(String[] args) {
        // We want to build HouseType: Igloo
        HouseBuilder iglooBuilder = new IglooHouseBuilder();

        // Tell that to our Director i.e. Civil Engineer
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        // emgineer starts constructing house
        engineer.constructHouse();

        // house creation done, just fetch the house
        House house = engineer.getHouse();

        // Prints the House
        System.out.println("Builder constructed: " + house);
    }
}