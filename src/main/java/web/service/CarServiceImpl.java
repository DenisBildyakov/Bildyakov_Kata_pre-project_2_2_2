package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("LADA", 2110, 2005));
        list.add(new Car("ZAZ", 3504, 2010));
        list.add(new Car("Mercedes", 8886, 2021));
        list.add(new Car("Renault", 1414, 1990));
        list.add(new Car("Kia", 3, 2015));
    }

    @Override
    public List<Car> getCarList() {
        return list;
    }

    @Override
    public List<Car> countedCarList(int count) {
        List<Car> countedCarList = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            countedCarList.add(list.get(i));
        }
        return countedCarList;
    }

    @Override
    public void addCar(Car car) {
        list.add(new Car(car.getModel(), car.getSeries(), car.getYear()));
    }
}
