package ThreadTest;

public class TestThread 
{
	/**
	  	void start():启动线程，并执行对象的run()方法
	  	run():线程在被调度时执行的操作
	  	String getName():返回线程的名称
	  	void setName(String name):设置线程的名称
	  	static currentThread():返回当前线程
	  	
	  	static void yield():线程让步
	  		暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程
	  		若队列中没有同优先级的线程，忽略此方法
	  	join():当某个程序执行流中调用其它线程的join()方法时，调用线程将被阻塞，
	  	直到join()方法加入的join线程执行完毕
	  		低优先级的线程也可以获得执行
	  	static void sleep(long millis):（指定时间：毫秒）
	  		令当前活动线程在指定时间段内放弃对CPU控制，使其他线程有机会被执行，时间到后重新排队
	  		抛出InterruptedException异常
	  	stop():强制线程生命周期结束
	  	boolean isAlive():返回boolean，判断线程是否还活着
	 */
}
