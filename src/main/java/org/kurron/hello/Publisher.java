package org.kurron.hello;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.springframework.integration.Message;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/26/13
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Publisher
{
    private final PublishingService theService;
    private final Random theRandom = new Random();

    public Publisher( final PublishingService aService )
    {
        theService = aService;
    }

    public void go() throws InterruptedException, TimeoutException, ExecutionException
    {
        for( int i = 0; i < 50; i++ )
        {
            byte[] buffer = new byte[theRandom.nextInt( 1024 )];
            theRandom.nextBytes( buffer );
            System.out.println( "To AMQP: " + buffer.length );
            final Future<byte[]> future = theService.publishWithHeader( buffer, Long.toHexString( System.currentTimeMillis() ).toUpperCase() );
            final byte[] response = future.get( 1, TimeUnit.SECONDS );
            System.out.println( "From AMQP: " + response.length );
            System.out.println();
            Thread.sleep( theRandom.nextInt( 1000 ) );
        }
    }
}
