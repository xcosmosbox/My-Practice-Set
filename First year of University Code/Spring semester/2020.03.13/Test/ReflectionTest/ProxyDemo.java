package ReflectionTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *	��̬������ 
 */
public class ProxyDemo implements InvocationHandler
{
	//������Ķ���
	Object obj;
	
	public ProxyDemo(Object obj)
	{
		this.obj = obj;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
	{
		System.out.println(method.getName()+"��ʼִ��");
	
		//ִ�еĴ�������ָ������
		Object result = method.invoke(this.obj, args);
		
		System.out.println(method.getName()+"����ִ�����");
		
		return null;
	}
	
}
