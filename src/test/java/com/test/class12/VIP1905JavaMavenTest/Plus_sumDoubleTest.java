package com.test.class12.VIP1905JavaMavenTest;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//注解测试类，修饰整个测试类
@RunWith(Parameterized.class)
public class Plus_sumDoubleTest {

	// 为了让所有方法都能使用被测类的实例化对象，声明成员变量；
	private static Plus plus;
	private static double n;
	private static double m;
	private static String expectedData;

	public Plus_sumDoubleTest(String caseName, String expected, double param1, double param2) {
		n = param1;
		m = param2;
		expectedData = expected;
	}

	@BeforeClass
	public static void BeforeClass() throws Exception {
		try {
			plus = new Plus();
		} catch (Exception e) {
			throw new Exception("被测类实例化对象失败");
		}
		System.out.println("-----------------------------------被测类实例化成功-----------------------------------");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("-----------------------------------TestStarting-----------------------------------");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("-----------------------------------TestEnding-------------------------------------");

	}

	// 生成和返回测试数据供测试类使用。通常返回Object二位数组
	@Parameters(name = "测试Plus_DoubleSum_{0}测试")
	public static Object[][] testObjects() {
		Object[][] testObjects = new Object[][] { { "左边界-1", "-2147483648", -2147483647, -1 },
				{ "左边界+0", "-2147483648", -2147483648, 0 }, { "左边界+1", "-2147483647", -2147483648, 1 },
				{ "正常值-2", "-2", -2, 0 }, { "均为值0", "0", 0, 0 }, { "均为空值null", "", } };
		return testObjects;

	}

	@Test
	public void testSum() throws Exception {
		Double result = plus.Sum(n, m);
		System.out.println(+result);
		assertEquals("数据相加测试", expectedData, result);

	}

}
