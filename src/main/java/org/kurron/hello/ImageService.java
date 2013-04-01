package org.kurron.hello;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/26/13
 * Time: 8:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class ImageService
{
    @ServiceActivator
    public Message<byte[]> echo( final Message<byte[]> request )
    {
        System.out.println( "logan = " + request.getHeaders().get( "logan" ) );
        return MessageBuilder.withPayload( request.getPayload() ).build();
    }
}
