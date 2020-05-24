import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld tree =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);
        HelloWorld leaf =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);

        Cat one = (Cat) applicationContext.getBean(Cat.class);
        Cat two = (Cat) applicationContext.getBean(Cat.class);

        System.out.println(one == two);

        System.out.println(tree == leaf);


    }
}