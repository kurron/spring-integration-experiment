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
public class BinaryPlusHeaderDriver
{

    public static void main( final String[] args ) throws Exception
    {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext( "/META-INF/spring/integration/binary-plus-header-context.xml", BinaryPlusHeaderDriver.class );
        final Publisher bean = context.getBean( "automatedPublisher", Publisher.class );
        bean.go();
        context.registerShutdownHook();
    }
}
