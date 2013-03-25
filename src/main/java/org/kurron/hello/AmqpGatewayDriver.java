package org.kurron.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/22/13
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmqpGatewayDriver
{

    public static void main( final String[] args )
    {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext( "/META-INF/spring/integration/amqp-gateway-context.xml", AmqpGatewayDriver.class );
        context.registerShutdownHook();
    }
}
