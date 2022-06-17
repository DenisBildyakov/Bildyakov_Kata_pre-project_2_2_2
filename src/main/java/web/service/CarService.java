package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getCarList();
    public List<Car> countedCarList(int count);
    public void addCar(Car car);

}
