/**
 * ServiceCrudS_Region.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.service.crud;

public interface ServiceCrudS_Region extends java.rmi.Remote {
    public void main(java.lang.String[] args) throws java.rmi.RemoteException;
    public void connectionOracleDataBase() throws java.rmi.RemoteException;
    public java.lang.String consultaIndividualS_product(int id) throws java.rmi.RemoteException;
    public void consultaGeneralS_product() throws java.rmi.RemoteException;
    public void invocaProcedimientoAlmacenado(int id, java.lang.String name, java.lang.String short_desc, int longtext_id, int suggesed_price, int whlsl_unit, int image_id) throws java.rmi.RemoteException;
    public java.lang.String eliminarS_Product(int id) throws java.rmi.RemoteException;
    public java.lang.String actalizarS_Product(java.lang.String name, java.lang.String short_desc, int longtext_id, int suggesed_price, int whlsl_units, int image_id, int id) throws java.rmi.RemoteException;
    public java.lang.String agregarS_Product(int id, java.lang.String name, java.lang.String short_desc, int longtext_id, int suggesed_price, int whlsl_unit, int image_id) throws java.rmi.RemoteException;
}
