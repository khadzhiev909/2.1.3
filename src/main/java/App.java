import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        //вызовите еще раз бин HelloWorld
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        //затем 2 раза вызовите бин cat
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);

        //Сравните 2 пары бинов по ссылке и выведите результат в консоль.
        System.out.println("Сравнение HelloWorld" + (bean == bean1));
        System.out.println("Сравнение Cat" + (cat1 == cat2));
        System.out.println(bean.getMessage());
    }
}