package com.test.class12.VIP1905JavaMavenTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//注解测试类，修饰整个测试类
@RunWith(Parameterized.class)
public class TestArrayUtils10Test {

	// 为了让所有方法都能使用被测类的实例化对象，声明成员变量；
	private static TestArrayUtils10 testArrayUtils10;

	@BeforeClass
	public static void BeforeClass() throws Exception {
		try {
			testArrayUtils10 = new TestArrayUtils10();
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

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void test_001() throws Exception {
		int[] arr = new int[] { 1, 2, 3 };
		int actuals = testArrayUtils10.getSum(arr);
		try {
			Assert.assertEquals(5, actuals);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			System.out.println(actuals);
		}

	}

	@Test
	public void test_002() throws Exception {
		int[] arr = new int[] {};
		int actuals = testArrayUtils10.getSum(arr);
		Assert.assertEquals("测试getsum", 0, actuals);
		System.out.println(actuals);
	}

	@Test
	public void test_003() throws Exception {
		int[] arr = new int[] { 1, 0, 3, 5, 8 };
		int actuals = testArrayUtils10.getSum(arr);
		Assert.assertEquals("测试getsum", 17, actuals);
		System.out.println(actuals);

	}

	@Test
	public void test_004() throws Exception {
		int[] arr = new int[] { 1, 0, 3, 5, 8 };
		int actuals = testArrayUtils10.getMax(arr);
		Assert.assertEquals("测试getsum", 8, actuals);
		System.out.println(actuals);

	}

}
