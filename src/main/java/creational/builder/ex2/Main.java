package creational.builder.ex2;

public class Main {
    public static void main(String[] args) {
        HouseArchitecture.HouseArchitectureBuilder builder = new HouseArchitecture.HouseArchitectureBuilder();

        HouseArchitecture houseArchitecture = builder.walls("Painted with Savana")
                .doors("Bought from Dedeman")
                .roof("Roof with expensive tin")
                .floors("Laminated floors")
                .garage("Big garage for my 2 cars")
                .balcony("Inbuilt balcony in the block")
                .build();

        System.out.println(houseArchitecture.getWalls());
        System.out.println(houseArchitecture.getDoors());
        System.out.println(houseArchitecture.getRoof());
        System.out.println(houseArchitecture.getFloors());
        System.out.println(houseArchitecture.getGarage());
        System.out.println(houseArchitecture.getBalcony());
    }
}
