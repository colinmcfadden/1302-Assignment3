import java.util.ArrayList;
import java.util.Collections;

public class CitySortMain {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<City>();

        cities.add(new City("Dallas", "Texas"));
        cities.add(new City("Atlanta", "Georgia"));
        cities.add(new City("Minneapolis", "Minnesota"));
        cities.add(new City("Nashville", "Tennessee"));
        cities.add(new City("San Francisco", "California"));
        cities.add(new City("Orlando", "Florida"));
        cities.add(new City("New York", "New York"));
        cities.add(new City("Bangor", "Maine"));
        cities.add(new City("Detroit", "Michigan"));
        cities.add(new City("Dillon", "Montana"));
        cities.add(new City("Charlotte", "South Carolina"));
        cities.add(new City("Diamondhead", "Mississippi"));
        cities.add(new City("Birmingham", "Alabama"));
        cities.add(new City("San Diego", "California"));
        cities.add(new City("Las Vegas", "Nevada"));

        Collections.sort(cities);

        for(City c : cities) {
            System.out.println(c.toString());
        }

    }
}
