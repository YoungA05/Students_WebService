/**
 * ConcoursWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class ConcoursWSServiceLocator extends org.apache.axis.client.Service implements service.ConcoursWSService {

    public ConcoursWSServiceLocator() {
    }


    public ConcoursWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ConcoursWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ConcoursWSPort
    private java.lang.String ConcoursWSPort_address = "http://localhost:6600/";

    public java.lang.String getConcoursWSPortAddress() {
        return ConcoursWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ConcoursWSPortWSDDServiceName = "ConcoursWSPort";

    public java.lang.String getConcoursWSPortWSDDServiceName() {
        return ConcoursWSPortWSDDServiceName;
    }

    public void setConcoursWSPortWSDDServiceName(java.lang.String name) {
        ConcoursWSPortWSDDServiceName = name;
    }

    public service.ConcoursWS getConcoursWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ConcoursWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getConcoursWSPort(endpoint);
    }

    public service.ConcoursWS getConcoursWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.ConcoursWSPortBindingStub _stub = new service.ConcoursWSPortBindingStub(portAddress, this);
            _stub.setPortName(getConcoursWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setConcoursWSPortEndpointAddress(java.lang.String address) {
        ConcoursWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.ConcoursWS.class.isAssignableFrom(serviceEndpointInterface)) {
                service.ConcoursWSPortBindingStub _stub = new service.ConcoursWSPortBindingStub(new java.net.URL(ConcoursWSPort_address), this);
                _stub.setPortName(getConcoursWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ConcoursWSPort".equals(inputPortName)) {
            return getConcoursWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "ConcoursWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "ConcoursWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ConcoursWSPort".equals(portName)) {
            setConcoursWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
