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
            final String message = Integer.toHexString( theRandom.nextInt( Integer.MAX_VALUE ) ).toUpperCase();
            //System.out.println( "Publishing " + message );
            final String response = theService.publish( message );
            System.out.println( "Just heard: " + response );
            Thread.sleep( theRandom.nextInt( 1000 ) );
        }
    }
}
