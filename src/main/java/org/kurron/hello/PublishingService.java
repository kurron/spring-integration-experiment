package org.kurron.hello;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.Header;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/26/13
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
public interface PublishingService
{
    ResponseObject publish( final RequestObject request );

    byte[] publishBytes( final byte[] buffer, @Header( "logan" ) final String header );
}
