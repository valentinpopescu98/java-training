package creational.builder.ex2;

public class HouseArchitecture {
    private String walls;
    private String doors;
    private String roof;
    private String floors;
    private String garage;
    private String balcony;

    public HouseArchitecture(HouseArchitectureBuilder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.roof = builder.roof;
        this.floors = builder.floors;
        this.garage = builder.garage;
        this.balcony = builder.balcony;
    }

    public String getWalls() {
        return walls;
    }

    public String getDoors() {
        return doors;
    }

    public String getRoof() {
        return roof;
    }

    public String getFloors() {
        return floors;
    }

    public String getGarage() {
        return garage;
    }

    public String getBalcony() {
        return balcony;
    }

    public static class HouseArchitectureBuilder {
        private String walls;
        private String doors;
        private String roof;
        private String floors;
        private String garage;
        private String balcony;

        public HouseArchitectureBuilder walls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseArchitectureBuilder doors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseArchitectureBuilder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseArchitectureBuilder floors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseArchitectureBuilder garage(String garage) {
            this.garage = garage;
            return this;
        }

        public HouseArchitectureBuilder balcony(String balcony) {
            this.balcony = balcony;
            return this;
        }

        public HouseArchitecture build() {
            return new HouseArchitecture(this);
        }
    }
}
