package test.com.abstractcalss.impl;

import test.com.abstractcalss.AppleIphone;
import test.com.abstractcalss.Phone;

public class Iphone6 implements Phone, AppleIphone {

	@Override
	public void takepic() {
		System.out.println("iphone6 拍照。。。");
	}

	@Override
	public void call() {
		System.out.println(name + "iphone6 Call。。。");
	}

}
