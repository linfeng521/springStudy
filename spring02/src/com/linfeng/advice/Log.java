package com.linfeng.advice;

import java.lang.reflect.Method;

public class Log {
	public static void test(Method method) {
		System.out.println("--------------添加日志------------"+method.getName());
	}
}
