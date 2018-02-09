
package jwclase1_1.pkg6.wsdl.response;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MiPrimerWebService", targetNamespace = "http://ws.pkg3.jwclase1_1/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MiPrimerWebService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "saludos", targetNamespace = "http://ws.pkg3.jwclase1_1/", className = "jwclase1_1.pkg6.wsdl.response.Saludos")
    @ResponseWrapper(localName = "saludosResponse", targetNamespace = "http://ws.pkg3.jwclase1_1/", className = "jwclase1_1.pkg6.wsdl.response.SaludosResponse")
    @Action(input = "http://ws.pkg3.jwclase1_1/MiPrimerWebService/saludosRequest", output = "http://ws.pkg3.jwclase1_1/MiPrimerWebService/saludosResponse")
    public String saludos();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operationSaludos", targetNamespace = "http://ws.pkg3.jwclase1_1/", className = "jwclase1_1.pkg6.wsdl.response.OperationSaludos")
    @ResponseWrapper(localName = "operationSaludosResponse", targetNamespace = "http://ws.pkg3.jwclase1_1/", className = "jwclase1_1.pkg6.wsdl.response.OperationSaludosResponse")
    @Action(input = "http://ws.pkg3.jwclase1_1/MiPrimerWebService/operationSaludosRequest", output = "http://ws.pkg3.jwclase1_1/MiPrimerWebService/operationSaludosResponse")
    public String operationSaludos(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
