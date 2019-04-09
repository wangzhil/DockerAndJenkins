package com.sinosoft.gof23.factory.factorymethod;

public class AudiFactory implements CarCreateFactory {

	@Override
	public Car createCar() {
		
		return new Audi();
	}
	

}
