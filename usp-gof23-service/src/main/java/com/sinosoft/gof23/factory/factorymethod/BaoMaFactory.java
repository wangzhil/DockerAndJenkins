package com.sinosoft.gof23.factory.factorymethod;

public class BaoMaFactory implements CarCreateFactory {

	@Override
	public Car createCar() {
		
		return new BaoMa();
	}

}
