package test.com;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

import org.junit.Test;

public class TestCache {

	@Test
	public void test01() {
		CacheManager cm = CacheManager.newInstance("/ehcache.xml");
		Cache cache = cm.getCache("simple");
		Element ele = new Element("name", "徐申玉");
		cache.put(ele);
		System.out.println(cache.get("name"));
	}

}
