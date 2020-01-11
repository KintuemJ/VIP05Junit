package com.test.class12.VIP1905JavaMavenTest;

public class TestArrayUtils10 {
	// 求数组的和
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

	// 求数组的最大值
	public int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;

	}

	// 求数组的最小值
	public int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	// 遍历数组元素
	public void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.print("]");
	}

	// 数组反转
	public int[] reverse(int[] arr) {
		for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		return arr;

	}

	// 对数组进行排序,冒泡排序法
	public void sortArray(int[] arr, String sort) {
		if (sort == "asc") {
			for (int i = 0; i < arr.length; i++) {// 从小到大排序
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}

		} else if (sort == "desc") {
			for (int i = 0; i < arr.length; i++) {// 从大到小排序
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] < arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		} else {
			System.out.println("格式不支持，请输入'asc'or'desc'!");
		}

	}

	// 数组的复制
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	// 数组的平均数
	public int avg(int[] arr) {
		int avg = getSum(arr) / arr.length;
		return avg;
	}

}
