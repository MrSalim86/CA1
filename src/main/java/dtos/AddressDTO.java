package dtos;

public class AddressDTO {
    private String id;
    private String additionalInfo;
    private String street;
    private String zipcode;
    private String city;

    public AddressDTO(String id, String additionalInfo, String street, String zipcode, String city) {
        this.id = id;
        this.additionalInfo = additionalInfo;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    // getters og setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
