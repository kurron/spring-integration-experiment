package org.kurron.hello;

import java.util.concurrent.Future;
import org.springframework.integration.Message;
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
    Message<byte[]> publishWithHeader( final byte[] request, @Header( "logan" ) final String header );
}
