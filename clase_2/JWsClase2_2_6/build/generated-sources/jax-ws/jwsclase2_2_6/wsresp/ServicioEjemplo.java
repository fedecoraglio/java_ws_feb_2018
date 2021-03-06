
package jwsclase2_2_6.wsresp;

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
@WebServiceClient(name = "servicioEjemplo", targetNamespace = "http://ws.jwsclase_2_2_5/", wsdlLocation = "http://localhost:8081/MiServicio?wsdl")
public class ServicioEjemplo
    extends Service
{

    private final static URL SERVICIOEJEMPLO_WSDL_LOCATION;
    private final static WebServiceException SERVICIOEJEMPLO_EXCEPTION;
    private final static QName SERVICIOEJEMPLO_QNAME = new QName("http://ws.jwsclase_2_2_5/", "servicioEjemplo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/MiServicio?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOEJEMPLO_WSDL_LOCATION = url;
        SERVICIOEJEMPLO_EXCEPTION = e;
    }

    public ServicioEjemplo() {
        super(__getWsdlLocation(), SERVICIOEJEMPLO_QNAME);
    }

    public ServicioEjemplo(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOEJEMPLO_QNAME, features);
    }

    public ServicioEjemplo(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOEJEMPLO_QNAME);
    }

    public ServicioEjemplo(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOEJEMPLO_QNAME, features);
    }

    public ServicioEjemplo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioEjemplo(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MiServicioExamploService
     */
    @WebEndpoint(name = "getServicioEjemplo")
    public MiServicioExamploService getGetServicioEjemplo() {
        return super.getPort(new QName("http://ws.jwsclase_2_2_5/", "getServicioEjemplo"), MiServicioExamploService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MiServicioExamploService
     */
    @WebEndpoint(name = "getServicioEjemplo")
    public MiServicioExamploService getGetServicioEjemplo(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.jwsclase_2_2_5/", "getServicioEjemplo"), MiServicioExamploService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOEJEMPLO_EXCEPTION!= null) {
            throw SERVICIOEJEMPLO_EXCEPTION;
        }
        return SERVICIOEJEMPLO_WSDL_LOCATION;
    }

}
