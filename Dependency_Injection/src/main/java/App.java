import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.car.*;
import org.studyeasy.interfaces.*;

public class App {

	public static void main(String[] args) {
//		Car swift = new Swift();
//		swift.specs();
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("corolla",Car.class);
		myCar.specs();
		context.close();

	
	}

}
