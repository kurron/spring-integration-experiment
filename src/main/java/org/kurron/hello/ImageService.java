package org.kurron.hello;

import org.springframework.integration.Message;
import org.springframework.integration.annotation.Header;
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
    public ResponseObject echo( final RequestObject request, @Header( "logan" ) final String header )
    {
        final ResponseObject response = new ResponseObject();
        response.setId( header );
        response.setMessage( request.getMessage() );
        return response;
    }
}
