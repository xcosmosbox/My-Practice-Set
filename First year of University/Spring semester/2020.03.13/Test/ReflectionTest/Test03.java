package ReflectionTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test03 
{
	public static void main(String[] args)
	{
		iTestDemo test = new TestDemo();
		
		/**
		 *	注意：一个对象想要被代理，
		 *	要通过 Proxy.newProxyInstance(loader, interfaces, h)方法代理
		 *	那么这个对象的类一定要有相应的接口
		 */
		test.test1();
		test.test2();
		System.out.println("===========================");
		
		/**
		 *	需求：
		 *	在执行test1和test2方法时需要加入一些东西
		 *	在执行方法前打印test1后test2开始执行
		 *	在执行方法后打印test1或test2执行完毕
		 *	打印的方法名要和当时调用方法保持一致 
		 */
		
		InvocationHandler handler = new ProxyDemo(test);
		/**
		 * Proxy.newProxyInstance(loader, interfaces, h)
		 * 参数1是代理对象的类加载器，
		 * 参数2是被代理对象的接口
		 * 参数3是代理对象
		 * 返回的值就是成功被代理后的对象
		 * 
		 * 返回的值就是成功被代理后的对象，返回值是Object类型，需要根据当时情况进行类型转换
		 * 
		 */
		iTestDemo t = (iTestDemo)Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
	
		t.test1();
		System.out.println("---------------------");
		t.test2();
	}
}
