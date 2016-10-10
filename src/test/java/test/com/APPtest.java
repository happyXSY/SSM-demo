package test.com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.com.abstractcalss.impl.Copter;
import test.com.abstractcalss.impl.Iphone6;
import test.com.domain.BMW;

import com.ssm.domain.Dict;
import com.ssm.service.DictService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-config.xml" })
public class APPtest {
	@Autowired
	private DictService dictService;

	// 在接口中 无修饰符非同包可以访问？
	@Test
	public void test05() {
		Iphone6 iphone6 = new Iphone6();
		iphone6.call();
	}

	/**
	 * 
	 * 子类继承父类，拥有子类所有属性和方法，不能使用父类的（除public外）方法和属性
	 * 
	 * 
	 */

	public void test04() {
		BMW bmw = new BMW();
		bmw.setId(1);
		bmw.setLength(5.3f);
		bmw.setModel("X2");
		bmw.setPrice(600000f);
		bmw.setWide(3.3f);
		System.out.println(bmw);
	}

	public void test03() {
		Copter cop = new Copter();
		cop.setLength(200f);
		cop.fly();
		System.out.println(cop);
	}

	public void test02() {
		System.out.println(dictService.selectBydict("SEASON", "spring"));
	}

	public void test01() {
		long s = System.currentTimeMillis();
		Dict record = new Dict();
		record.setCode("other");
		record.setName("中性");
		record.setParentCode("SEX");
		record.setSort((byte) 4);
		dictService.insertdict(record);
		long e = System.currentTimeMillis();
		System.out.println(record + "+++++++++++++++++++time:" + (e - s));
	}

}
