import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    private static List<City> prepareTemperature()
    {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 43));
        return cities;
    }
    public static void main(String[] args) {


        System.out.println(prepareTemperature().stream()
        .filter(f -> f.getTemperature() > 10)
        .map(f -> f.getName())
        .collect(Collectors.toList()));

        // Here, the name and the temperature
        // are defined as the type City
        System.out.println(prepareTemperature()
        .stream()
        .filter(city -> city.getTemperature() > 10)
        .collect(Collectors.toMap(
                City::getName,
                City::getTemperature,
                (key, identicalKey) -> key))
        );

        // Collects the elements and
        // counts the occurrences
        System.out.println(prepareTemperature()
        .stream()
        .collect(Collectors.groupingBy(
                City::getName,
                Collectors.collectingAndThen(
                Collectors.counting(),
                f -> f.intValue())))
        );

        // Concatenate the collection with
        // comma
        System.out.println(prepareTemperature()
        .stream()
        .filter(city -> city.getTemperature() > 10)
        .map(f -> f.getName())
        .collect(Collectors.joining(", ")));

        // Mapping the collection with
        // comma
        System.out.println(prepareTemperature()
        .stream()
        .collect(Collectors.groupingBy(
                City::getName,
                Collectors.mapping(
                City::getTemperature,
                Collectors.toList())))
        );
    }
}
