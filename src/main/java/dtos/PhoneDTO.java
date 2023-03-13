package dtos;

public class PhoneDTO {

    private String PhoneNumber;
    private String description;

    public PhoneDTO(String PhoneNumber, String description) {
        this.PhoneNumber = PhoneNumber;
        this.description = description;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PhoneDTO{" +
                "PhoneNumber='" + PhoneNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}



