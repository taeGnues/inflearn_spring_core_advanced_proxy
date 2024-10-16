package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.*;
import org.junit.jupiter.api.Test;

public class DecoratorPatternTest {

    @Test
    void noDecorator() {
        Component component = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(component);

        client.execute();
    }

    @Test
    void decorator(){
        Component component = new RealComponent();
        Component decorator = new MessageDecorator(component);
        DecoratorPatternClient client = new DecoratorPatternClient(decorator);

        client.execute();
    }

    @Test
    void decorator2(){
        Component component = new RealComponent();
        Component decorator = new MessageDecorator(component);
        Component decorator2 = new TimeDecorator(decorator);
        DecoratorPatternClient client = new DecoratorPatternClient(decorator2);

        client.execute();
    }
}
