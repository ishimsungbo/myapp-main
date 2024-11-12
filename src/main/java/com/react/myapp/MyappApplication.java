package com.react.myapp;

import com.react.myapp.cardatabase.domain.Car;
import com.react.myapp.cardatabase.domain.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MyappApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(MyappApplication.class);

	//@Autowired
	//private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{


		log.debug("===============================================");
		log.debug("MyappApplication 시작 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		/*
		carRepository.save(new Car("Ford", "Mustang","Red","ADF-11101",2021,59000,"남성미 물씬"));
		carRepository.save(new Car("닛산", "스카이라인","White","ADF-11102",2022,7000,"날렵함과 기계공학"));
		carRepository.save(new Car("도요타", "캠리","Blue","ADF-11103",2020,8000,"실용성 하나"));

		for(Car car: carRepository.findAll()){
			logger.info(car.getBrand() + " "+car.getModel());
		}
		*/
	}
}
