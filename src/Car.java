import java.util.Objects;

public class Car {

    public String color;
    public int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
