package ua.mykola.disastergrpcreporter.rest.dto;

public class DisasterDto {
    private String city;
    private int code;
    private String description;

    public DisasterDto(String city, int code, String description) {
        this.city = city;
        this.code = code;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
