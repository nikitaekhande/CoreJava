package jn02springcore.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIdemo {

	  public static void main(String args[]) {
		  
		  ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		  
		  
		  
		  
		  person obj = ac.getBean(person.class);
		  
		  System.out.println(obj);
	  }
}
