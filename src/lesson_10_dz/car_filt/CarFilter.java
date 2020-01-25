package lesson_10_dz.car_filt;

import lesson_10_dz.car_filt.Car;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarFilter {
    public static void processCars(List<Car> cars, Predicate<Car> predicate,
                                   Consumer<Car> consumer) {
        for(Car car : cars) {
            if (predicate.test(car)) {
                consumer.accept(car);
            }
        }
    }
}
