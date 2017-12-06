import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Object myEquation = applicationContext.getBean("myEquation");
        String result = ((Equation) myEquation).solution();
        System.out.println(result);
    }
}
