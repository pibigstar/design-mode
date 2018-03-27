package com.pibigstar.模板模式;
/**
 * 某日，程序员A拿到一个任务：
 * 给定一个整数数组，把数组中的数由小到大排序，
 * 然后把排序之后的结果打印出来。经过分析之后，
 * 这个任务大体上可分为两部分，排序和打印，
 * 打印功能好实现，排序就有点麻烦了。
 * 但是A有办法，先把打印功能完成，排序功能另找人做。
 * @author pibigstar
 *
 */
public abstract class AbstractSort {
	//让子类去完成
	public abstract void sortArray(int[] array);
	
	public void showResult(int[] array) {
		this.sortArray(array);//调用排序
		
		int len = array.length;
		for (int i = 0; i < len; i++) {
			System.out.println(array[i]);
		}
	}
	
	
}
