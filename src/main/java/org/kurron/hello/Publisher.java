package org.kurron.hello;

import java.util.Random;

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

    public void go() throws InterruptedException
    {
        for( int i = 0; i < 50; i++ )
        {
            final RequestObject request = new RequestObject();
            request.setMessage( Integer.toHexString( theRandom.nextInt( Integer.MAX_VALUE ) ).toUpperCase() );
            System.out.println( "To AMQP: " + request );
            byte[] buffer = new byte[theRandom.nextInt( 1024 )];
            theRandom.nextBytes( buffer );
            final ResponseObject response = theService.publishWithHeader( request, Long.toHexString( System.currentTimeMillis() ).toUpperCase() );
            System.out.println( "From AMQP: " + response );
            Thread.sleep( theRandom.nextInt( 1000 ) );
        }
    }
}
