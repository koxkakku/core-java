package com.sharad.learn.corejava.basic.designpattern.creational.singleton;

import com.sharad.learn.corejava.basic.designpattern.creational.singleton.SingletonFactory.Singleton;

public class SingletonTest {
	public static void main(String[] args) {
		
		StaticInitializerSingleton sis = StaticInitializerSingleton.getInstance();
		StaticInitializerSingleton sis1 = StaticInitializerSingleton.getInstance();
		System.out.println(sis);
		System.out.println(sis1);//same hashcode
		

		StaticBlockInitializerSingleton sbis = StaticBlockInitializerSingleton.getInstance();
		StaticBlockInitializerSingleton sbis1 = StaticBlockInitializerSingleton.getInstance();
		System.out.println(sbis);
		System.out.println(sbis1);//same hashcode
		
		LazySingleton ls = LazySingleton.getInstance();
		LazySingleton ls1 = LazySingleton.getInstance();
		System.out.println(ls);
		System.out.println(ls1);//same hashcode
		
		DoubleCheckSingleton dcs = DoubleCheckSingleton.getInstance();
		DoubleCheckSingleton dcs1 = DoubleCheckSingleton.getInstance();
		System.out.println(dcs);
		System.out.println(dcs1);//same hashcode
		
		
		ThreadSafeLazySingleton tsls = ThreadSafeLazySingleton.getInstance();
		ThreadSafeLazySingleton tsls1 = ThreadSafeLazySingleton.getInstance();
		System.out.println(tsls);
		System.out.println(tsls1);//same hashcode
		
		Singleton instance = SingletonFactory.getInstance();
		Singleton instance2 = SingletonFactory.getInstance();
		instance.setName("Hi");
		System.out.println(instance);
		System.out.println(instance2);//same hashcode
		System.out.println(instance2.getName());
		instance2.setName("Hello");
		System.out.println(instance.getName());//changes in any instance reflected in all others
			
		
	}
}
