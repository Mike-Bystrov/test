
package wsdl;

import jakarta.xml.ws.*;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BEPTGlobalService", targetNamespace = "http://globalservice.ws.bept.ids.by/", wsdlLocation = "file:/D:/Java/Spring/fptrade/src/main/resources/wsdl/epassFile.wsdl")
public class BEPTGlobalService
    extends Service
{

    private static final URL BEPTGLOBALSERVICE_WSDL_LOCATION;
    private static final WebServiceException BEPTGLOBALSERVICE_EXCEPTION;
    private static final QName BEPTGLOBALSERVICE_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "BEPTGlobalService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Java/Spring/fptrade/src/main/resources/wsdl/epassFile.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BEPTGLOBALSERVICE_WSDL_LOCATION = url;
        BEPTGLOBALSERVICE_EXCEPTION = e;
    }

    public BEPTGlobalService() {
        super(__getWsdlLocation(), BEPTGLOBALSERVICE_QNAME);
    }

    public BEPTGlobalService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BEPTGLOBALSERVICE_QNAME, features);
    }

    public BEPTGlobalService(URL wsdlLocation) {
        super(wsdlLocation, BEPTGLOBALSERVICE_QNAME);
    }

    public BEPTGlobalService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BEPTGLOBALSERVICE_QNAME, features);
    }

    public BEPTGlobalService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BEPTGlobalService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BEPTGlobal
     */
    @WebEndpoint(name = "BEPTGlobalPort")
    public BEPTGlobal getBEPTGlobalPort() {
        return super.getPort(new QName("http://globalservice.ws.bept.ids.by/", "BEPTGlobalPort"), BEPTGlobal.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BEPTGlobal
     */
    @WebEndpoint(name = "BEPTGlobalPort")
    public BEPTGlobal getBEPTGlobalPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://globalservice.ws.bept.ids.by/", "BEPTGlobalPort"), BEPTGlobal.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BEPTGLOBALSERVICE_EXCEPTION!= null) {
            throw BEPTGLOBALSERVICE_EXCEPTION;
        }
        return BEPTGLOBALSERVICE_WSDL_LOCATION;
    }

}