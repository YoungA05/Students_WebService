package service;

public class ConcoursWSProxy implements service.ConcoursWS {
  private String _endpoint = null;
  private service.ConcoursWS concoursWS = null;
  
  public ConcoursWSProxy() {
    _initConcoursWSProxy();
  }
  
  public ConcoursWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initConcoursWSProxy();
  }
  
  private void _initConcoursWSProxy() {
    try {
      concoursWS = (new service.ConcoursWSServiceLocator()).getConcoursWSPort();
      if (concoursWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)concoursWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)concoursWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (concoursWS != null)
      ((javax.xml.rpc.Stub)concoursWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.ConcoursWS getConcoursWS() {
    if (concoursWS == null)
      _initConcoursWSProxy();
    return concoursWS;
  }
  
  public int isAccepted(java.lang.String CNI) throws java.rmi.RemoteException{
    if (concoursWS == null)
      _initConcoursWSProxy();
    return concoursWS.isAccepted(CNI);
  }
  
  
}