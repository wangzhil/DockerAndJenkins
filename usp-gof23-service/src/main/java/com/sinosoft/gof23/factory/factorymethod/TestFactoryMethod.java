package com.sinosoft.gof23.factory.factorymethod;

/**
 * @description 工厂方法模式
 *     1. 需要两个接口，如Car定义一个公共类型的公共方法如：run，或者添加其它。
 *        CarCreateFactory接口定义Factory类的统一处理方法。
 *     2. 需要扩展就增加对应如：Car接口的类型接口People，再建立不同的Factory
 *        统一接口，更符合设计原则。
 *     3. 和抽象工厂相比，该工厂模式针对单产品大类使用，而抽象工厂针对产品族。
 * @author wangzhilei
 *
 */
public class TestFactoryMethod {

	public static void main(String[] args) {
		
		new AudiFactory().createCar().run();
		new BaoMaFactory().createCar().run();
	}
}
