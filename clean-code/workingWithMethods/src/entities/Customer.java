package entities;

public class Customer extends Person{
    private int cityId;

    public Customer(){}

    public Customer(String firstName, String lastName, String identityNumber, int yearOfBirth, int cityId) {
        super(firstName, lastName, identityNumber, yearOfBirth);
        this.cityId = cityId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
