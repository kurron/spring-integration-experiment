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
public class AmqpRequestReplyDriver
{

    public static void main( final String[] args )
    {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext( "/META-INF/spring/integration/amqp-request-reply-context.xml", AmqpRequestReplyDriver.class );
        context.registerShutdownHook();
    }
}
