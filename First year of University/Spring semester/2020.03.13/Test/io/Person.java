package io;

import java.io.Serializable;

/**
 *可以序列化和反序列化的对象 
 */
public class Person implements Serializable
{
	/**
	 *一个表示序列化版本标识符的静态变量
	 *用来表明类的不同版本的兼容性
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	int age;
}
