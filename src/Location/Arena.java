package Location;

public class Arena {
    private String name;
    private int numberOfSeats;
    private int numberOfVIPSeats;
    private int numberOfCommonSeats;
    private Address address;

    public Arena(String name, int numberOfSeats, int numberOfVIPSeats, int numberOfCommonSeats, Address address) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        this.numberOfVIPSeats = numberOfVIPSeats;
        this.numberOfCommonSeats = numberOfCommonSeats;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfVIPSeats() {
        return numberOfVIPSeats;
    }

    public void setNumberOfVIPSeats(int numberOfVIPSeats) {
        this.numberOfVIPSeats = numberOfVIPSeats;
    }

    public int getNumberOfCommonSeats() {
        return numberOfCommonSeats;
    }

    public void setNumberOfCommonSeats(int numberOfCommonSeats) {
        this.numberOfCommonSeats = numberOfCommonSeats;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
