package com.react.myapp.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
public interface CarRepository{

}
/*
public interface CarRepository extends CrudRepository<Car, Long> {

    //브랜드로 자동차를 검색
    List<Car> findByBrand(String brand);

    //색상으로 검색
    List<Car> findByColor(String color);

    //년도로 자동차 검색
    List<Car> findByYear(int year);

}
*/