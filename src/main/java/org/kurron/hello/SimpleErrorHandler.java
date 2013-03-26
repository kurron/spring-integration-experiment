package org.kurron.hello;

import org.springframework.util.ErrorHandler;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/26/13
 * Time: 9:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class SimpleErrorHandler implements ErrorHandler
{
    @Override
    public void handleError( final Throwable t )
    {
        //t.printStackTrace();
        System.err.println( "Problem with processing: " + t.getMessage() );
    }
}
