/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javaee7.jca.connector.simple.connector.outbound;

import javax.resource.Referenceable;
import javax.resource.ResourceException;
import java.io.Serializable;

/**
 *
 * @author arungup
 */
public interface MyConnectionFactory extends Serializable, Referenceable{

    public MyConnectionImpl getConnection() throws ResourceException;
    
}
