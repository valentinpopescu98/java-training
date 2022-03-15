package creational.builder.ex3;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class HouseArchitecture {
    private String walls;
    private String doors;
    private String roof;
    private String floors;
    private String garage;
    private String balcony;
}
