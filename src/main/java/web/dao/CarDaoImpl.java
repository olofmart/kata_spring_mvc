package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Volga", 2001, "1K"));
        carList.add(new Car("VAZ", 2022, "20K"));
        carList.add(new Car("Moskvich", 1990, "500"));
        carList.add(new Car("UAZ", 2010, "3K"));
        carList.add(new Car("Kamaz", 2020, "40K"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}