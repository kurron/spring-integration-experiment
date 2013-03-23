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
public class CompetingConsumersDriver
{

    public static void main( final String[] args )
    {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext( "/META-INF/spring/integration/competing-consumers-context.xml", CompetingConsumersDriver.class );
        final Greeter greeter = context.getBean( Greeter.class );

        for( int i = 0; i < 50; i++ )
        {
            greeter.sendGreeting( String.format( "Hello World %d", i ) );
        }
    }
}
