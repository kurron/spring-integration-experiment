package org.kurron.hello;

/**
 * Created with IntelliJ IDEA.
 * User: ron
 * Date: 3/27/13
 * Time: 10:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class ResponseObject
{
    private String id;
    private String message;

    public String getId()
    {
        return id;
    }

    public void setId( final String aId )
    {
        id = aId;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage( final String aMessage )
    {
        message = aMessage;
    }

    @Override
    public String toString()
    {
        return id + ":" + message;
    }
}
