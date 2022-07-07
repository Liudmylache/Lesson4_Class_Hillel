import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.year = 2022;
        car1.color = "Red";
        System.out.println(car1.hashCode());

        Car car2 = new Car();
        car1.year = 2022;
        car1.color = "Red";
        System.out.println(car2.hashCode());

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(new Car());
        cars.add(car2);
        System.out.println(cars);
        System.out.println(cars.size());
    }
}