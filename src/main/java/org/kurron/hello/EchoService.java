package org.kurron.hello;

import org.springframework.integration.annotation.ServiceActivator;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/26/13
 * Time: 8:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class EchoService
{
    @ServiceActivator
    public String echo( final String message )
    {
        System.out.println( "Processing " + message );
        return "Just heard: " + message;
    }
}
