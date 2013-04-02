package org.kurron.hello;

import java.io.UnsupportedEncodingException;
import org.springframework.integration.annotation.Transformer;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 4/1/13
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class ErrorTransformer
{
    @Transformer
    public byte[] transform( final Throwable t ) throws UnsupportedEncodingException
    {
        System.err.println( "Error detected.  Transforming into acceptable response." );
        return new byte[]{0,1,3};
    }
}
