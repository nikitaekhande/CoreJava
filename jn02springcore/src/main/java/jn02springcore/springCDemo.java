
package jn02springcore ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springCDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		helloword obj=ac.getBean("hw1",helloword.class);
		obj.sayHello();
		
		helloword obj1=ac.getBean("hw2",helloword.class);
		obj1.sayHello();
		
		
		System.out.println(obj==obj1);

	}

}