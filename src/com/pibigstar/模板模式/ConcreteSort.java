package com.pibigstar.模板模式;
/**
 * A找到刚毕业入职不久的同事B说：
 * 有个任务，主要逻辑我已经写好了，你把剩下的逻辑实现一下吧。
 * 于是把AbstractSort类给B，让B写实现。B拿过来一看，太简单了，10分钟搞定
 * @author pibigstar
 *
 */
public class ConcreteSort extends AbstractSort{

	@Override
	public void sortArray(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i]>array[j]) {
					int t = array[i];
					array[i] = array[j];
					array[j] = t;
				}
			}
		}
	}

}
