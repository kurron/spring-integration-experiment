package org.kurron.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.message.GenericMessage;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/22/13
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloDriver
{

    public static void main( final String[] args )
    {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext( "/META-INF/spring/integration/hello-context.xml", HelloDriver.class );
        final MessageChannel inputChannel = context.getBean( "messageChannel", MessageChannel.class );
        inputChannel.send( new GenericMessage<>( "Hello, World" ) );
    }
}
