package org.service.crud;

public class ServiceCrudS_RegionProxy implements org.service.crud.ServiceCrudS_Region {
  private String _endpoint = null;
  private org.service.crud.ServiceCrudS_Region serviceCrudS_Region = null;
  
  public ServiceCrudS_RegionProxy() {
    _initServiceCrudS_RegionProxy();
  }
  
  public ServiceCrudS_RegionProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceCrudS_RegionProxy();
  }
  
  private void _initServiceCrudS_RegionProxy() {
    try {
      serviceCrudS_Region = (new org.service.crud.ServiceCrudS_RegionServiceLocator()).getServiceCrudS_Region();
      if (serviceCrudS_Region != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceCrudS_Region)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceCrudS_Region)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceCrudS_Region != null)
      ((javax.xml.rpc.Stub)serviceCrudS_Region)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.service.crud.ServiceCrudS_Region getServiceCrudS_Region() {
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    return serviceCrudS_Region;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    serviceCrudS_Region.main(args);
  }
  
  public void connectionOracleDataBase() throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    serviceCrudS_Region.connectionOracleDataBase();
  }
  
  public java.lang.String consultaIndividualS_product(int id) throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    return serviceCrudS_Region.consultaIndividualS_product(id);
  }
  
  public void consultaGeneralS_product() throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    serviceCrudS_Region.consultaGeneralS_product();
  }
  
  public void invocaProcedimientoAlmacenado(int id, java.lang.String name, java.lang.String short_desc, int longtext_id, int suggesed_price, int whlsl_unit, int image_id) throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    serviceCrudS_Region.invocaProcedimientoAlmacenado(id, name, short_desc, longtext_id, suggesed_price, whlsl_unit, image_id);
  }
  
  public java.lang.String eliminarS_Product(int id) throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    return serviceCrudS_Region.eliminarS_Product(id);
  }
  
  public java.lang.String actalizarS_Product(java.lang.String name, java.lang.String short_desc, int longtext_id, int suggesed_price, int whlsl_units, int image_id, int id) throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    return serviceCrudS_Region.actalizarS_Product(name, short_desc, longtext_id, suggesed_price, whlsl_units, image_id, id);
  }
  
  public java.lang.String agregarS_Product(int id, java.lang.String name, java.lang.String short_desc, int longtext_id, int suggesed_price, int whlsl_unit, int image_id) throws java.rmi.RemoteException{
    if (serviceCrudS_Region == null)
      _initServiceCrudS_RegionProxy();
    return serviceCrudS_Region.agregarS_Product(id, name, short_desc, longtext_id, suggesed_price, whlsl_unit, image_id);
  }
  
  
}