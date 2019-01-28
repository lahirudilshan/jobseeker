
package dblayer;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DBService", targetNamespace = "http://DBLayer/", wsdlLocation = "http://localhost:8080/JobSeekerDataLayer/DBService?wsdl")
public class DBService_Service
    extends Service
{

    private final static URL DBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DBSERVICE_EXCEPTION;
    private final static QName DBSERVICE_QNAME = new QName("http://DBLayer/", "DBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/JobSeekerDataLayer/DBService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DBSERVICE_WSDL_LOCATION = url;
        DBSERVICE_EXCEPTION = e;
    }

    public DBService_Service() {
        super(__getWsdlLocation(), DBSERVICE_QNAME);
    }

    public DBService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DBSERVICE_QNAME, features);
    }

    public DBService_Service(URL wsdlLocation) {
        super(wsdlLocation, DBSERVICE_QNAME);
    }

    public DBService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DBSERVICE_QNAME, features);
    }

    public DBService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DBService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DBService
     */
    @WebEndpoint(name = "DBServicePort")
    public DBService getDBServicePort() {
        return super.getPort(new QName("http://DBLayer/", "DBServicePort"), DBService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DBService
     */
    @WebEndpoint(name = "DBServicePort")
    public DBService getDBServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://DBLayer/", "DBServicePort"), DBService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DBSERVICE_EXCEPTION!= null) {
            throw DBSERVICE_EXCEPTION;
        }
        return DBSERVICE_WSDL_LOCATION;
    }

}
