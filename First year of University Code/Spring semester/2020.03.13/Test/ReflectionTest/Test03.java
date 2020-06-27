package ReflectionTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test03 
{
	public static void main(String[] args)
	{
		iTestDemo test = new TestDemo();
		
		/**
		 *	ע�⣺һ��������Ҫ������
		 *	Ҫͨ�� Proxy.newProxyInstance(loader, interfaces, h)��������
		 *	��ô����������һ��Ҫ����Ӧ�Ľӿ�
		 */
		test.test1();
		test.test2();
		System.out.println("===========================");
		
		/**
		 *	����
		 *	��ִ��test1��test2����ʱ��Ҫ����һЩ����
		 *	��ִ�з���ǰ��ӡtest1��test2��ʼִ��
		 *	��ִ�з������ӡtest1��test2ִ�����
		 *	��ӡ�ķ�����Ҫ�͵�ʱ���÷�������һ�� 
		 */
		
		InvocationHandler handler = new ProxyDemo(test);
		/**
		 * Proxy.newProxyInstance(loader, interfaces, h)
		 * ����1�Ǵ����������������
		 * ����2�Ǳ��������Ľӿ�
		 * ����3�Ǵ������
		 * ���ص�ֵ���ǳɹ��������Ķ���
		 * 
		 * ���ص�ֵ���ǳɹ��������Ķ��󣬷���ֵ��Object���ͣ���Ҫ���ݵ�ʱ�����������ת��
		 * 
		 */
		iTestDemo t = (iTestDemo)Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
	
		t.test1();
		System.out.println("---------------------");
		t.test2();
	}
}
