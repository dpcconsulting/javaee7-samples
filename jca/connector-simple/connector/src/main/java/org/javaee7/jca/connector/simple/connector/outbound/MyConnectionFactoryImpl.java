package org.javaee7.jca.connector.simple.connector.outbound;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.resource.ResourceException;
import javax.resource.spi.ConnectionManager;

public class MyConnectionFactoryImpl implements MyConnectionFactory {

    private final MyManagedConnectionFactory connectionFactory;
    private final ConnectionManager connectionManager;
    private Reference reference;

    public MyConnectionFactoryImpl(MyManagedConnectionFactory myManagedConnectionFactory, ConnectionManager connectionManager) {
        connectionFactory = myManagedConnectionFactory;
        this.connectionManager = connectionManager;
    }

    @Override
    public MyConnectionImpl getConnection() throws ResourceException {
        return (MyConnectionImpl) connectionManager.allocateConnection(connectionFactory, null);
    }

    @Override
    public void setReference(Reference reference) {
        this.reference = reference;
    }

    @Override
    public Reference getReference() throws NamingException {
        return reference;
    }
}
