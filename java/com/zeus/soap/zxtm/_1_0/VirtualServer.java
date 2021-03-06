/**
 * VirtualServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;

public interface VirtualServer extends javax.xml.rpc.Service {

/**
 * The VirtualServer interface allows management of Virtual Server
 * objects. Using this interface, you can create, delete and rename virtual
 * server objects, and manage their configuration.
 */
    public java.lang.String getVirtualServerPortAddress();

    public com.zeus.soap.zxtm._1_0.VirtualServerPort getVirtualServerPort() throws javax.xml.rpc.ServiceException;

    public com.zeus.soap.zxtm._1_0.VirtualServerPort getVirtualServerPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
