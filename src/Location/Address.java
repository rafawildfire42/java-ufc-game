package Location;

public class Address {
    private String country;
    private String state;
    private String city;

    public Address(String country, String state, String city) {
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() { return country; }

    public String getCity() { return city; }

    public String getState() {

        return state;
    }


}
