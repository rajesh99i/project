package esp.spring.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

	public static void main(String[] args) {
		ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml"); 
	Person	person=container.getBean("person",Person.class);
	System.out.println(person);
		
	}

}
