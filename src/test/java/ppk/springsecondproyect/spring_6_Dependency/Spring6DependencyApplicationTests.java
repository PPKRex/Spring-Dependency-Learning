package ppk.springsecondproyect.spring_6_Dependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import ppk.springsecondproyect.spring_6_Dependency.controllers.MyController;

@SpringBootTest
class Spring6DependencyApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController(){
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx(){
		MyController controller = (MyController) applicationContext.getBean(MyController.class);

		System.out.println(controller.sayHello());
	}
	@Test
	void contextLoads() {
	}

}
