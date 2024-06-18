package alessiovulpinari.u2_w1_d2_Java;

import alessiovulpinari.u2_w1_d2_Java.entities.Menu;
import alessiovulpinari.u2_w1_d2_Java.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D2JavaApplication.class);

        Order order = (Order) ctx.getBean("order");
        System.out.println(order);

        System.out.println(menu);
    }
}
