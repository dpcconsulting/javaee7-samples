/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaee7.jca.connector.simple.connector.outbound;

import javax.resource.ResourceException;
import javax.resource.cci.Connection;
import javax.resource.cci.ConnectionMetaData;
import javax.resource.cci.Interaction;
import javax.resource.cci.LocalTransaction;
import javax.resource.cci.ResultSetInfo;

/**
 * @author arungup
 */
public class MyConnectionImpl implements MyConnection {

    private final MyManagedConnection myManagedConnection;

    public MyConnectionImpl(MyManagedConnection myManagedConnection) {
        this.myManagedConnection = myManagedConnection;
    }

    @Override
    public String check() {
        {
            return "OK";
        }
    }
}
