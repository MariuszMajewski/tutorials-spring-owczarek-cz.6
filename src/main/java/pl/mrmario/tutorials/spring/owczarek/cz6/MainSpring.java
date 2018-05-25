package pl.mrmario.tutorials.spring.owczarek.cz6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author MrMario108
 *		Instancyjne metody fabrykuj¹ce
 */
public class MainSpring {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		User user = context.getBean("someUser", User.class);
		
		System.out.println(user);
		
		
	}
}