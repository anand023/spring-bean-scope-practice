import bean.EarlyInstantiationSingleToneHelloWorld;
import bean.HelloWorld;
import bean.LazyInstantiationSingleToneHelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();

        // Lazy singleton
        LazyInstantiationSingleToneHelloWorld obj1=
                (LazyInstantiationSingleToneHelloWorld) context.getBean("lazySingleTone");

        obj1.setMessage("I'm Lazy singleton");
        obj1.getMessage();

        LazyInstantiationSingleToneHelloWorld obj2=
                (LazyInstantiationSingleToneHelloWorld) context.getBean("lazySingleTone");

        obj2.getMessage();

        // Early singleton

        EarlyInstantiationSingleToneHelloWorld obj3=
                (EarlyInstantiationSingleToneHelloWorld) context.getBean("earlySingleTone");
        obj3.setMessage("I'm Early singleton");
        obj3.getMessage();
        EarlyInstantiationSingleToneHelloWorld obj4=
                (EarlyInstantiationSingleToneHelloWorld) context.getBean("earlySingleTone");
        obj4.getMessage();
    }
}