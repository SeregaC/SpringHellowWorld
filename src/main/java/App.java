import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        boolean comparison = bean == bean;
        System.out.println(comparison);

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getMessage());
        boolean comparisonCat = catBean == catBean1;
        System.out.println(comparisonCat);

    }
}