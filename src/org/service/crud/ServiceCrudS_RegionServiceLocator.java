/**
 * ServiceCrudS_RegionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.service.crud;

public class ServiceCrudS_RegionServiceLocator extends org.apache.axis.client.Service implements org.service.crud.ServiceCrudS_RegionService {

    public ServiceCrudS_RegionServiceLocator() {
    }


    public ServiceCrudS_RegionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceCrudS_RegionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceCrudS_Region
    private java.lang.String ServiceCrudS_Region_address = "http://localhost:7575/WebServiceServidorSOAP/services/ServiceCrudS_Region";

    public java.lang.String getServiceCrudS_RegionAddress() {
        return ServiceCrudS_Region_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceCrudS_RegionWSDDServiceName = "ServiceCrudS_Region";

    public java.lang.String getServiceCrudS_RegionWSDDServiceName() {
        return ServiceCrudS_RegionWSDDServiceName;
    }

    public void setServiceCrudS_RegionWSDDServiceName(java.lang.String name) {
        ServiceCrudS_RegionWSDDServiceName = name;
    }

    public org.service.crud.ServiceCrudS_Region getServiceCrudS_Region() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceCrudS_Region_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceCrudS_Region(endpoint);
    }

    public org.service.crud.ServiceCrudS_Region getServiceCrudS_Region(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.service.crud.ServiceCrudS_RegionSoapBindingStub _stub = new org.service.crud.ServiceCrudS_RegionSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiceCrudS_RegionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceCrudS_RegionEndpointAddress(java.lang.String address) {
        ServiceCrudS_Region_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.service.crud.ServiceCrudS_Region.class.isAssignableFrom(serviceEndpointInterface)) {
                org.service.crud.ServiceCrudS_RegionSoapBindingStub _stub = new org.service.crud.ServiceCrudS_RegionSoapBindingStub(new java.net.URL(ServiceCrudS_Region_address), this);
                _stub.setPortName(getServiceCrudS_RegionWSDDServiceName());
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
        if ("ServiceCrudS_Region".equals(inputPortName)) {
            return getServiceCrudS_Region();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://crud.service.org", "ServiceCrudS_RegionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://crud.service.org", "ServiceCrudS_Region"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceCrudS_Region".equals(portName)) {
            setServiceCrudS_RegionEndpointAddress(address);
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
