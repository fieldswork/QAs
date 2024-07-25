package skillstorm.beanfactory.beanfactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanfactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanfactoryApplication.class, args);

        // Using try-with-resources to ensure the context is closed after use
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            // Retrieve the HelloWorld bean from the context
            HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

            // Call the getMessage method
            helloWorld.getMessage();
        }
    }
}
