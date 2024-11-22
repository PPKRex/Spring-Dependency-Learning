package ppk.springsecondproyect.spring_6_Dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ppk.springsecondproyect.spring_6_Dependency.controllers.MyController;

@SpringBootApplication
public class Spring6DependencyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring6DependencyApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In Main Method");

		System.out.println(controller.sayHello());
	}

}
