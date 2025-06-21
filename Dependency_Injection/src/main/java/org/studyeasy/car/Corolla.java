package org.studyeasy.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("corolla")
public class Corolla implements Car {
	//if required is false, then if engin.type is not used anywhere or engine in general is not used anywhere
	//then its instance wont be created and autowiring wont be done 

	Engine engine;
	
	@Autowired
	public void SetEngine(Engine engine) {
		engine.type = "V6";
		this.engine=engine;
	}

	@Override
	public void specs() {
		System.out.println("Sedan from toyota with engine " + engine.type);

	}
}
