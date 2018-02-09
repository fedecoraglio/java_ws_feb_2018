
package jwclase1_1.pkg3.ws;

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
@WebServiceClient(name = "MiPrimerWebServiceService", targetNamespace = "http://ws.pkg3.jwclase1_1/", wsdlLocation = "http://localhost:8084/MiPrimerWebService?wsdl")
public class MiPrimerWebServiceService
    extends Service
{

    private final static URL MIPRIMERWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MIPRIMERWEBSERVICESERVICE_EXCEPTION;
    private final static QName MIPRIMERWEBSERVICESERVICE_QNAME = new QName("http://ws.pkg3.jwclase1_1/", "MiPrimerWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/MiPrimerWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MIPRIMERWEBSERVICESERVICE_WSDL_LOCATION = url;
        MIPRIMERWEBSERVICESERVICE_EXCEPTION = e;
    }

    public MiPrimerWebServiceService() {
        super(__getWsdlLocation(), MIPRIMERWEBSERVICESERVICE_QNAME);
    }

    public MiPrimerWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MIPRIMERWEBSERVICESERVICE_QNAME, features);
    }

    public MiPrimerWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MIPRIMERWEBSERVICESERVICE_QNAME);
    }

    public MiPrimerWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MIPRIMERWEBSERVICESERVICE_QNAME, features);
    }

    public MiPrimerWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MiPrimerWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MiPrimerWebService
     */
    @WebEndpoint(name = "MiPrimerWebServicePort")
    public MiPrimerWebService getMiPrimerWebServicePort() {
        return super.getPort(new QName("http://ws.pkg3.jwclase1_1/", "MiPrimerWebServicePort"), MiPrimerWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MiPrimerWebService
     */
    @WebEndpoint(name = "MiPrimerWebServicePort")
    public MiPrimerWebService getMiPrimerWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.pkg3.jwclase1_1/", "MiPrimerWebServicePort"), MiPrimerWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MIPRIMERWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MIPRIMERWEBSERVICESERVICE_EXCEPTION;
        }
        return MIPRIMERWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
