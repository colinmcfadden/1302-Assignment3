public class City implements Comparable<City> {
    private String city;
    private String state;

    public City(String city, String state) {
        this.city = city;
        this.state = state;
    }

    @Override
    public int compareTo(City other) {
        if (city.compareTo(other.city) == 0)
        {
            return state.compareTo(other.state);
        }
        else
        {
            return  city.compareTo(other.city);
        }

    }

    public String toString() {
        return "City: " + this.city + ", " + this.state;
    }
}
