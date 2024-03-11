
package wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.consumingwebservice.wsdl package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Login_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "Login");
    private static final QName _LoginResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "LoginResponse");
    private static final QName _Logout_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "Logout");
    private static final QName _LogoutResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "LogoutResponse");
    private static final QName _SearchGTINfromDatamarkSystemByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByGTIN");
    private static final QName _SearchGTINfromDatamarkSystemByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByGTINResponse");
    private static final QName _SearchGTINfromDatamarkSystemByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByModifiedTime");
    private static final QName _SearchGTINfromDatamarkSystemByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchGTINfromDatamarkSystemByModifiedTimeResponse");
    private static final QName _SearchPartiesByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchPartiesByModifiedTime");
    private static final QName _SearchPartiesByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchPartiesByModifiedTimeResponse");
    private static final QName _SearchSimpleTradeitemsByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime");
    private static final QName _SearchSimpleTradeitemsByModifiedTime2_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime2");
    private static final QName _SearchSimpleTradeitemsByModifiedTime2Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime2Response");
    private static final QName _SearchSimpleTradeitemsByModifiedTime3_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime3");
    private static final QName _SearchSimpleTradeitemsByModifiedTime3Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTime3Response");
    private static final QName _SearchSimpleTradeitemsByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchSimpleTradeitemsByModifiedTimeResponse");
    private static final QName _SearchTradeitemsByGLN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLN");
    private static final QName _SearchTradeitemsByGLNAndModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLNAndModifiedTime");
    private static final QName _SearchTradeitemsByGLNAndModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLNAndModifiedTimeResponse");
    private static final QName _SearchTradeitemsByGLNResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByGLNResponse");
    private static final QName _SearchTradeitemsByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByModifiedTime");
    private static final QName _SearchTradeitemsByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByModifiedTimeResponse");
    private static final QName _SearchTradeitemsByName_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByName");
    private static final QName _SearchTradeitemsByNameResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByNameResponse");
    private static final QName _SearchTradeitemsByOKRB007_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByOKRB007");
    private static final QName _SearchTradeitemsByOKRB007Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByOKRB007Response");
    private static final QName _SearchTradeitemsByTNVED_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByTNVED");
    private static final QName _SearchTradeitemsByTNVEDResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "SearchTradeitemsByTNVEDResponse");
    private static final QName _CleanTradeitemsOfPoolByDeleteTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "cleanTradeitemsOfPoolByDeleteTime");
    private static final QName _CleanTradeitemsOfPoolByDeleteTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "cleanTradeitemsOfPoolByDeleteTimeResponse");
    private static final QName _GetCheckGTIN29_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCheckGTIN29");
    private static final QName _GetCheckGTIN29Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCheckGTIN29Response");
    private static final QName _GetClassificator_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getClassificator");
    private static final QName _GetClassificatorResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getClassificatorResponse");
    private static final QName _GetCurrentTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCurrentTime");
    private static final QName _GetCurrentTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getCurrentTimeResponse");
    private static final QName _GetFullPartyByGLN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFullPartyByGLN");
    private static final QName _GetFullPartyByGLNResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFullPartyByGLNResponse");
    private static final QName _GetFunctionalnameByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTIN");
    private static final QName _GetFunctionalnameByGTIN2_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTIN2");
    private static final QName _GetFunctionalnameByGTIN2Response_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTIN2Response");
    private static final QName _GetFunctionalnameByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getFunctionalnameByGTINResponse");
    private static final QName _GetOldHeaderReq_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderReq");
    private static final QName _GetOldHeaderReqResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderReqResponse");
    private static final QName _GetOldHeaderResp_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderResp");
    private static final QName _GetOldHeaderRespResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldHeaderRespResponse");
    private static final QName _GetOldParty_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldParty");
    private static final QName _GetOldPartyResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldPartyResponse");
    private static final QName _GetOldTradeitem_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldTradeitem");
    private static final QName _GetOldTradeitemResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getOldTradeitemResponse");
    private static final QName _GetPartyByGLN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByGLN");
    private static final QName _GetPartyByGLNResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByGLNResponse");
    private static final QName _GetPartyByUNP_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByUNP");
    private static final QName _GetPartyByUNPResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getPartyByUNPResponse");
    private static final QName _GetQuotaImportInfo_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getQuotaImportInfo");
    private static final QName _GetQuotaImportInfoResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getQuotaImportInfoResponse");
    private static final QName _GetSimpleTradeitemsByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getSimpleTradeitemsByGTIN");
    private static final QName _GetSimpleTradeitemsByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getSimpleTradeitemsByGTINResponse");
    private static final QName _GetTIImageKindsByGTINs_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTIImageKindsByGTINs");
    private static final QName _GetTIImageKindsByGTINsResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTIImageKindsByGTINsResponse");
    private static final QName _GetTradeitemByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTIN");
    private static final QName _GetTradeitemByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTINResponse");
    private static final QName _GetTradeitemByGTINshort_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTINshort");
    private static final QName _GetTradeitemByGTINshortResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemByGTINshortResponse");
    private static final QName _GetTradeitemsByGTINs_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINs");
    private static final QName _GetTradeitemsByGTINsResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINsResponse");
    private static final QName _GetTradeitemsByGTINsShort_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINsShort");
    private static final QName _GetTradeitemsByGTINsShortResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsByGTINsShortResponse");
    private static final QName _GetTradeitemsOfPoolByModifiedTime_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsOfPoolByModifiedTime");
    private static final QName _GetTradeitemsOfPoolByModifiedTimeResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getTradeitemsOfPoolByModifiedTimeResponse");
    private static final QName _GetVariantByGTIN_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getVariantByGTIN");
    private static final QName _GetVariantByGTINResponse_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "getVariantByGTINResponse");
    private static final QName _Tradeitem_QNAME = new QName("http://globalservice.ws.bept.ids.by/", "tradeitem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.consumingwebservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Login }
     * 
     * @return
     *     the new instance of {@link Login }
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     * @return
     *     the new instance of {@link LoginResponse }
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     * @return
     *     the new instance of {@link Logout }
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     * @return
     *     the new instance of {@link LogoutResponse }
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTIN }
     * 
     * @return
     *     the new instance of {@link SearchGTINfromDatamarkSystemByGTIN }
     */
    public SearchGTINfromDatamarkSystemByGTIN createSearchGTINfromDatamarkSystemByGTIN() {
        return new SearchGTINfromDatamarkSystemByGTIN();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTINResponse }
     * 
     * @return
     *     the new instance of {@link SearchGTINfromDatamarkSystemByGTINResponse }
     */
    public SearchGTINfromDatamarkSystemByGTINResponse createSearchGTINfromDatamarkSystemByGTINResponse() {
        return new SearchGTINfromDatamarkSystemByGTINResponse();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByModifiedTime }
     * 
     * @return
     *     the new instance of {@link SearchGTINfromDatamarkSystemByModifiedTime }
     */
    public SearchGTINfromDatamarkSystemByModifiedTime createSearchGTINfromDatamarkSystemByModifiedTime() {
        return new SearchGTINfromDatamarkSystemByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByModifiedTimeResponse }
     * 
     * @return
     *     the new instance of {@link SearchGTINfromDatamarkSystemByModifiedTimeResponse }
     */
    public SearchGTINfromDatamarkSystemByModifiedTimeResponse createSearchGTINfromDatamarkSystemByModifiedTimeResponse() {
        return new SearchGTINfromDatamarkSystemByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTime }
     * 
     * @return
     *     the new instance of {@link SearchPartiesByModifiedTime }
     */
    public SearchPartiesByModifiedTime createSearchPartiesByModifiedTime() {
        return new SearchPartiesByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTimeResponse }
     * 
     * @return
     *     the new instance of {@link SearchPartiesByModifiedTimeResponse }
     */
    public SearchPartiesByModifiedTimeResponse createSearchPartiesByModifiedTimeResponse() {
        return new SearchPartiesByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTime }
     */
    public SearchSimpleTradeitemsByModifiedTime createSearchSimpleTradeitemsByModifiedTime() {
        return new SearchSimpleTradeitemsByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime2 }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTime2 }
     */
    public SearchSimpleTradeitemsByModifiedTime2 createSearchSimpleTradeitemsByModifiedTime2() {
        return new SearchSimpleTradeitemsByModifiedTime2();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime2Response }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTime2Response }
     */
    public SearchSimpleTradeitemsByModifiedTime2Response createSearchSimpleTradeitemsByModifiedTime2Response() {
        return new SearchSimpleTradeitemsByModifiedTime2Response();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime3 }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTime3 }
     */
    public SearchSimpleTradeitemsByModifiedTime3 createSearchSimpleTradeitemsByModifiedTime3() {
        return new SearchSimpleTradeitemsByModifiedTime3();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTime3Response }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTime3Response }
     */
    public SearchSimpleTradeitemsByModifiedTime3Response createSearchSimpleTradeitemsByModifiedTime3Response() {
        return new SearchSimpleTradeitemsByModifiedTime3Response();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTimeResponse }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTimeResponse }
     */
    public SearchSimpleTradeitemsByModifiedTimeResponse createSearchSimpleTradeitemsByModifiedTimeResponse() {
        return new SearchSimpleTradeitemsByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLN }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLN }
     */
    public SearchTradeitemsByGLN createSearchTradeitemsByGLN() {
        return new SearchTradeitemsByGLN();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTime }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLNAndModifiedTime }
     */
    public SearchTradeitemsByGLNAndModifiedTime createSearchTradeitemsByGLNAndModifiedTime() {
        return new SearchTradeitemsByGLNAndModifiedTime();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTimeResponse }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLNAndModifiedTimeResponse }
     */
    public SearchTradeitemsByGLNAndModifiedTimeResponse createSearchTradeitemsByGLNAndModifiedTimeResponse() {
        return new SearchTradeitemsByGLNAndModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNResponse }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLNResponse }
     */
    public SearchTradeitemsByGLNResponse createSearchTradeitemsByGLNResponse() {
        return new SearchTradeitemsByGLNResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTime }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByModifiedTime }
     */
    public SearchTradeitemsByModifiedTime createSearchTradeitemsByModifiedTime() {
        return new SearchTradeitemsByModifiedTime();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTimeResponse }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByModifiedTimeResponse }
     */
    public SearchTradeitemsByModifiedTimeResponse createSearchTradeitemsByModifiedTimeResponse() {
        return new SearchTradeitemsByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByName }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByName }
     */
    public SearchTradeitemsByName createSearchTradeitemsByName() {
        return new SearchTradeitemsByName();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByNameResponse }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByNameResponse }
     */
    public SearchTradeitemsByNameResponse createSearchTradeitemsByNameResponse() {
        return new SearchTradeitemsByNameResponse();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007 }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByOKRB007 }
     */
    public SearchTradeitemsByOKRB007 createSearchTradeitemsByOKRB007() {
        return new SearchTradeitemsByOKRB007();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007Response }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByOKRB007Response }
     */
    public SearchTradeitemsByOKRB007Response createSearchTradeitemsByOKRB007Response() {
        return new SearchTradeitemsByOKRB007Response();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVED }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByTNVED }
     */
    public SearchTradeitemsByTNVED createSearchTradeitemsByTNVED() {
        return new SearchTradeitemsByTNVED();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVEDResponse }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByTNVEDResponse }
     */
    public SearchTradeitemsByTNVEDResponse createSearchTradeitemsByTNVEDResponse() {
        return new SearchTradeitemsByTNVEDResponse();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTime }
     * 
     * @return
     *     the new instance of {@link CleanTradeitemsOfPoolByDeleteTime }
     */
    public CleanTradeitemsOfPoolByDeleteTime createCleanTradeitemsOfPoolByDeleteTime() {
        return new CleanTradeitemsOfPoolByDeleteTime();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTimeResponse }
     * 
     * @return
     *     the new instance of {@link CleanTradeitemsOfPoolByDeleteTimeResponse }
     */
    public CleanTradeitemsOfPoolByDeleteTimeResponse createCleanTradeitemsOfPoolByDeleteTimeResponse() {
        return new CleanTradeitemsOfPoolByDeleteTimeResponse();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29 }
     * 
     * @return
     *     the new instance of {@link GetCheckGTIN29 }
     */
    public GetCheckGTIN29 createGetCheckGTIN29() {
        return new GetCheckGTIN29();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29Response }
     * 
     * @return
     *     the new instance of {@link GetCheckGTIN29Response }
     */
    public GetCheckGTIN29Response createGetCheckGTIN29Response() {
        return new GetCheckGTIN29Response();
    }

    /**
     * Create an instance of {@link GetClassificator }
     * 
     * @return
     *     the new instance of {@link GetClassificator }
     */
    public GetClassificator createGetClassificator() {
        return new GetClassificator();
    }

    /**
     * Create an instance of {@link GetClassificatorResponse }
     * 
     * @return
     *     the new instance of {@link GetClassificatorResponse }
     */
    public GetClassificatorResponse createGetClassificatorResponse() {
        return new GetClassificatorResponse();
    }

    /**
     * Create an instance of {@link GetCurrentTime }
     * 
     * @return
     *     the new instance of {@link GetCurrentTime }
     */
    public GetCurrentTime createGetCurrentTime() {
        return new GetCurrentTime();
    }

    /**
     * Create an instance of {@link GetCurrentTimeResponse }
     * 
     * @return
     *     the new instance of {@link GetCurrentTimeResponse }
     */
    public GetCurrentTimeResponse createGetCurrentTimeResponse() {
        return new GetCurrentTimeResponse();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLN }
     * 
     * @return
     *     the new instance of {@link GetFullPartyByGLN }
     */
    public GetFullPartyByGLN createGetFullPartyByGLN() {
        return new GetFullPartyByGLN();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLNResponse }
     * 
     * @return
     *     the new instance of {@link GetFullPartyByGLNResponse }
     */
    public GetFullPartyByGLNResponse createGetFullPartyByGLNResponse() {
        return new GetFullPartyByGLNResponse();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTIN }
     * 
     * @return
     *     the new instance of {@link GetFunctionalnameByGTIN }
     */
    public GetFunctionalnameByGTIN createGetFunctionalnameByGTIN() {
        return new GetFunctionalnameByGTIN();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTIN2 }
     * 
     * @return
     *     the new instance of {@link GetFunctionalnameByGTIN2 }
     */
    public GetFunctionalnameByGTIN2 createGetFunctionalnameByGTIN2() {
        return new GetFunctionalnameByGTIN2();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTIN2Response }
     * 
     * @return
     *     the new instance of {@link GetFunctionalnameByGTIN2Response }
     */
    public GetFunctionalnameByGTIN2Response createGetFunctionalnameByGTIN2Response() {
        return new GetFunctionalnameByGTIN2Response();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTINResponse }
     * 
     * @return
     *     the new instance of {@link GetFunctionalnameByGTINResponse }
     */
    public GetFunctionalnameByGTINResponse createGetFunctionalnameByGTINResponse() {
        return new GetFunctionalnameByGTINResponse();
    }

    /**
     * Create an instance of {@link GetOldHeaderReq }
     * 
     * @return
     *     the new instance of {@link GetOldHeaderReq }
     */
    public GetOldHeaderReq createGetOldHeaderReq() {
        return new GetOldHeaderReq();
    }

    /**
     * Create an instance of {@link GetOldHeaderReqResponse }
     * 
     * @return
     *     the new instance of {@link GetOldHeaderReqResponse }
     */
    public GetOldHeaderReqResponse createGetOldHeaderReqResponse() {
        return new GetOldHeaderReqResponse();
    }

    /**
     * Create an instance of {@link GetOldHeaderResp }
     * 
     * @return
     *     the new instance of {@link GetOldHeaderResp }
     */
    public GetOldHeaderResp createGetOldHeaderResp() {
        return new GetOldHeaderResp();
    }

    /**
     * Create an instance of {@link GetOldHeaderRespResponse }
     * 
     * @return
     *     the new instance of {@link GetOldHeaderRespResponse }
     */
    public GetOldHeaderRespResponse createGetOldHeaderRespResponse() {
        return new GetOldHeaderRespResponse();
    }

    /**
     * Create an instance of {@link GetOldParty }
     * 
     * @return
     *     the new instance of {@link GetOldParty }
     */
    public GetOldParty createGetOldParty() {
        return new GetOldParty();
    }

    /**
     * Create an instance of {@link GetOldPartyResponse }
     * 
     * @return
     *     the new instance of {@link GetOldPartyResponse }
     */
    public GetOldPartyResponse createGetOldPartyResponse() {
        return new GetOldPartyResponse();
    }

    /**
     * Create an instance of {@link GetOldTradeitem }
     * 
     * @return
     *     the new instance of {@link GetOldTradeitem }
     */
    public GetOldTradeitem createGetOldTradeitem() {
        return new GetOldTradeitem();
    }

    /**
     * Create an instance of {@link GetOldTradeitemResponse }
     * 
     * @return
     *     the new instance of {@link GetOldTradeitemResponse }
     */
    public GetOldTradeitemResponse createGetOldTradeitemResponse() {
        return new GetOldTradeitemResponse();
    }

    /**
     * Create an instance of {@link GetPartyByGLN }
     * 
     * @return
     *     the new instance of {@link GetPartyByGLN }
     */
    public GetPartyByGLN createGetPartyByGLN() {
        return new GetPartyByGLN();
    }

    /**
     * Create an instance of {@link GetPartyByGLNResponse }
     * 
     * @return
     *     the new instance of {@link GetPartyByGLNResponse }
     */
    public GetPartyByGLNResponse createGetPartyByGLNResponse() {
        return new GetPartyByGLNResponse();
    }

    /**
     * Create an instance of {@link GetPartyByUNP }
     * 
     * @return
     *     the new instance of {@link GetPartyByUNP }
     */
    public GetPartyByUNP createGetPartyByUNP() {
        return new GetPartyByUNP();
    }

    /**
     * Create an instance of {@link GetPartyByUNPResponse }
     * 
     * @return
     *     the new instance of {@link GetPartyByUNPResponse }
     */
    public GetPartyByUNPResponse createGetPartyByUNPResponse() {
        return new GetPartyByUNPResponse();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfo }
     * 
     * @return
     *     the new instance of {@link GetQuotaImportInfo }
     */
    public GetQuotaImportInfo createGetQuotaImportInfo() {
        return new GetQuotaImportInfo();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfoResponse }
     * 
     * @return
     *     the new instance of {@link GetQuotaImportInfoResponse }
     */
    public GetQuotaImportInfoResponse createGetQuotaImportInfoResponse() {
        return new GetQuotaImportInfoResponse();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTIN }
     * 
     * @return
     *     the new instance of {@link GetSimpleTradeitemsByGTIN }
     */
    public GetSimpleTradeitemsByGTIN createGetSimpleTradeitemsByGTIN() {
        return new GetSimpleTradeitemsByGTIN();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTINResponse }
     * 
     * @return
     *     the new instance of {@link GetSimpleTradeitemsByGTINResponse }
     */
    public GetSimpleTradeitemsByGTINResponse createGetSimpleTradeitemsByGTINResponse() {
        return new GetSimpleTradeitemsByGTINResponse();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINs }
     * 
     * @return
     *     the new instance of {@link GetTIImageKindsByGTINs }
     */
    public GetTIImageKindsByGTINs createGetTIImageKindsByGTINs() {
        return new GetTIImageKindsByGTINs();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINsResponse }
     * 
     * @return
     *     the new instance of {@link GetTIImageKindsByGTINsResponse }
     */
    public GetTIImageKindsByGTINsResponse createGetTIImageKindsByGTINsResponse() {
        return new GetTIImageKindsByGTINsResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTIN }
     * 
     * @return
     *     the new instance of {@link GetTradeitemByGTIN }
     */
    public GetTradeitemByGTIN createGetTradeitemByGTIN() {
        return new GetTradeitemByGTIN();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINResponse }
     * 
     * @return
     *     the new instance of {@link GetTradeitemByGTINResponse }
     */
    public GetTradeitemByGTINResponse createGetTradeitemByGTINResponse() {
        return new GetTradeitemByGTINResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINshort }
     * 
     * @return
     *     the new instance of {@link GetTradeitemByGTINshort }
     */
    public GetTradeitemByGTINshort createGetTradeitemByGTINshort() {
        return new GetTradeitemByGTINshort();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINshortResponse }
     * 
     * @return
     *     the new instance of {@link GetTradeitemByGTINshortResponse }
     */
    public GetTradeitemByGTINshortResponse createGetTradeitemByGTINshortResponse() {
        return new GetTradeitemByGTINshortResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINs }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINs }
     */
    public GetTradeitemsByGTINs createGetTradeitemsByGTINs() {
        return new GetTradeitemsByGTINs();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsResponse }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINsResponse }
     */
    public GetTradeitemsByGTINsResponse createGetTradeitemsByGTINsResponse() {
        return new GetTradeitemsByGTINsResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShort }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINsShort }
     */
    public GetTradeitemsByGTINsShort createGetTradeitemsByGTINsShort() {
        return new GetTradeitemsByGTINsShort();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShortResponse }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINsShortResponse }
     */
    public GetTradeitemsByGTINsShortResponse createGetTradeitemsByGTINsShortResponse() {
        return new GetTradeitemsByGTINsShortResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTime }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsOfPoolByModifiedTime }
     */
    public GetTradeitemsOfPoolByModifiedTime createGetTradeitemsOfPoolByModifiedTime() {
        return new GetTradeitemsOfPoolByModifiedTime();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTimeResponse }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsOfPoolByModifiedTimeResponse }
     */
    public GetTradeitemsOfPoolByModifiedTimeResponse createGetTradeitemsOfPoolByModifiedTimeResponse() {
        return new GetTradeitemsOfPoolByModifiedTimeResponse();
    }

    /**
     * Create an instance of {@link GetVariantByGTIN }
     * 
     * @return
     *     the new instance of {@link GetVariantByGTIN }
     */
    public GetVariantByGTIN createGetVariantByGTIN() {
        return new GetVariantByGTIN();
    }

    /**
     * Create an instance of {@link GetVariantByGTINResponse }
     * 
     * @return
     *     the new instance of {@link GetVariantByGTINResponse }
     */
    public GetVariantByGTINResponse createGetVariantByGTINResponse() {
        return new GetVariantByGTINResponse();
    }

    /**
     * Create an instance of {@link Tradeitem }
     * 
     * @return
     *     the new instance of {@link Tradeitem }
     */
    public Tradeitem createTradeitem() {
        return new Tradeitem();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29Req }
     * 
     * @return
     *     the new instance of {@link GetCheckGTIN29Req }
     */
    public GetCheckGTIN29Req createGetCheckGTIN29Req() {
        return new GetCheckGTIN29Req();
    }

    /**
     * Create an instance of {@link ApiHeaderRequest }
     * 
     * @return
     *     the new instance of {@link ApiHeaderRequest }
     */
    public ApiHeaderRequest createApiHeaderRequest() {
        return new ApiHeaderRequest();
    }

    /**
     * Create an instance of {@link GetCheckGTIN29Resp }
     * 
     * @return
     *     the new instance of {@link GetCheckGTIN29Resp }
     */
    public GetCheckGTIN29Resp createGetCheckGTIN29Resp() {
        return new GetCheckGTIN29Resp();
    }

    /**
     * Create an instance of {@link ApiHeaderResponse }
     * 
     * @return
     *     the new instance of {@link ApiHeaderResponse }
     */
    public ApiHeaderResponse createApiHeaderResponse() {
        return new ApiHeaderResponse();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShortReq }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINsShortReq }
     */
    public GetTradeitemsByGTINsShortReq createGetTradeitemsByGTINsShortReq() {
        return new GetTradeitemsByGTINsShortReq();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsShortResp }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINsShortResp }
     */
    public GetTradeitemsByGTINsShortResp createGetTradeitemsByGTINsShortResp() {
        return new GetTradeitemsByGTINsShortResp();
    }

    /**
     * Create an instance of {@link ShortTradeItem }
     * 
     * @return
     *     the new instance of {@link ShortTradeItem }
     */
    public ShortTradeItem createShortTradeItem() {
        return new ShortTradeItem();
    }

    /**
     * Create an instance of {@link Gdsntradeitemclassification }
     * 
     * @return
     *     the new instance of {@link Gdsntradeitemclassification }
     */
    public Gdsntradeitemclassification createGdsntradeitemclassification() {
        return new Gdsntradeitemclassification();
    }

    /**
     * Create an instance of {@link TradeitemAddons }
     * 
     * @return
     *     the new instance of {@link TradeitemAddons }
     */
    public TradeitemAddons createTradeitemAddons() {
        return new TradeitemAddons();
    }

    /**
     * Create an instance of {@link FoodBeverageInformation }
     * 
     * @return
     *     the new instance of {@link FoodBeverageInformation }
     */
    public FoodBeverageInformation createFoodBeverageInformation() {
        return new FoodBeverageInformation();
    }

    /**
     * Create an instance of {@link HazardousGoods }
     * 
     * @return
     *     the new instance of {@link HazardousGoods }
     */
    public HazardousGoods createHazardousGoods() {
        return new HazardousGoods();
    }

    /**
     * Create an instance of {@link Brandname }
     * 
     * @return
     *     the new instance of {@link Brandname }
     */
    public Brandname createBrandname() {
        return new Brandname();
    }

    /**
     * Create an instance of {@link BrandnamePK }
     * 
     * @return
     *     the new instance of {@link BrandnamePK }
     */
    public BrandnamePK createBrandnamePK() {
        return new BrandnamePK();
    }

    /**
     * Create an instance of {@link FmpContent }
     * 
     * @return
     *     the new instance of {@link FmpContent }
     */
    public FmpContent createFmpContent() {
        return new FmpContent();
    }

    /**
     * Create an instance of {@link FmpContentPK }
     * 
     * @return
     *     the new instance of {@link FmpContentPK }
     */
    public FmpContentPK createFmpContentPK() {
        return new FmpContentPK();
    }

    /**
     * Create an instance of {@link SpecTechnicalCharacteristics }
     * 
     * @return
     *     the new instance of {@link SpecTechnicalCharacteristics }
     */
    public SpecTechnicalCharacteristics createSpecTechnicalCharacteristics() {
        return new SpecTechnicalCharacteristics();
    }

    /**
     * Create an instance of {@link SpecTechnicalCharacteristicsPK }
     * 
     * @return
     *     the new instance of {@link SpecTechnicalCharacteristicsPK }
     */
    public SpecTechnicalCharacteristicsPK createSpecTechnicalCharacteristicsPK() {
        return new SpecTechnicalCharacteristicsPK();
    }

    /**
     * Create an instance of {@link FoodBeverageMicrobiological }
     * 
     * @return
     *     the new instance of {@link FoodBeverageMicrobiological }
     */
    public FoodBeverageMicrobiological createFoodBeverageMicrobiological() {
        return new FoodBeverageMicrobiological();
    }

    /**
     * Create an instance of {@link FoodBeverageMicrobiologicalPK }
     * 
     * @return
     *     the new instance of {@link FoodBeverageMicrobiologicalPK }
     */
    public FoodBeverageMicrobiologicalPK createFoodBeverageMicrobiologicalPK() {
        return new FoodBeverageMicrobiologicalPK();
    }

    /**
     * Create an instance of {@link TradeitemTbAttVal }
     * 
     * @return
     *     the new instance of {@link TradeitemTbAttVal }
     */
    public TradeitemTbAttVal createTradeitemTbAttVal() {
        return new TradeitemTbAttVal();
    }

    /**
     * Create an instance of {@link TradeitemTbAttValPK }
     * 
     * @return
     *     the new instance of {@link TradeitemTbAttValPK }
     */
    public TradeitemTbAttValPK createTradeitemTbAttValPK() {
        return new TradeitemTbAttValPK();
    }

    /**
     * Create an instance of {@link FoodBeverageDietRelated }
     * 
     * @return
     *     the new instance of {@link FoodBeverageDietRelated }
     */
    public FoodBeverageDietRelated createFoodBeverageDietRelated() {
        return new FoodBeverageDietRelated();
    }

    /**
     * Create an instance of {@link FoodPhysiochemicalCharact }
     * 
     * @return
     *     the new instance of {@link FoodPhysiochemicalCharact }
     */
    public FoodPhysiochemicalCharact createFoodPhysiochemicalCharact() {
        return new FoodPhysiochemicalCharact();
    }

    /**
     * Create an instance of {@link FoodPhysiochemicalCharactPK }
     * 
     * @return
     *     the new instance of {@link FoodPhysiochemicalCharactPK }
     */
    public FoodPhysiochemicalCharactPK createFoodPhysiochemicalCharactPK() {
        return new FoodPhysiochemicalCharactPK();
    }

    /**
     * Create an instance of {@link TradeitemTbSpec }
     * 
     * @return
     *     the new instance of {@link TradeitemTbSpec }
     */
    public TradeitemTbSpec createTradeitemTbSpec() {
        return new TradeitemTbSpec();
    }

    /**
     * Create an instance of {@link Tradeitemsuppliers }
     * 
     * @return
     *     the new instance of {@link Tradeitemsuppliers }
     */
    public Tradeitemsuppliers createTradeitemsuppliers() {
        return new Tradeitemsuppliers();
    }

    /**
     * Create an instance of {@link TradeitemsuppliersPK }
     * 
     * @return
     *     the new instance of {@link TradeitemsuppliersPK }
     */
    public TradeitemsuppliersPK createTradeitemsuppliersPK() {
        return new TradeitemsuppliersPK();
    }

    /**
     * Create an instance of {@link FoodBeverageNutrient }
     * 
     * @return
     *     the new instance of {@link FoodBeverageNutrient }
     */
    public FoodBeverageNutrient createFoodBeverageNutrient() {
        return new FoodBeverageNutrient();
    }

    /**
     * Create an instance of {@link FoodBeverageNutrientPK }
     * 
     * @return
     *     the new instance of {@link FoodBeverageNutrientPK }
     */
    public FoodBeverageNutrientPK createFoodBeverageNutrientPK() {
        return new FoodBeverageNutrientPK();
    }

    /**
     * Create an instance of {@link Tradeitemformdescription }
     * 
     * @return
     *     the new instance of {@link Tradeitemformdescription }
     */
    public Tradeitemformdescription createTradeitemformdescription() {
        return new Tradeitemformdescription();
    }

    /**
     * Create an instance of {@link TradeitemformdescriptionPK }
     * 
     * @return
     *     the new instance of {@link TradeitemformdescriptionPK }
     */
    public TradeitemformdescriptionPK createTradeitemformdescriptionPK() {
        return new TradeitemformdescriptionPK();
    }

    /**
     * Create an instance of {@link AudioVideoConnector }
     * 
     * @return
     *     the new instance of {@link AudioVideoConnector }
     */
    public AudioVideoConnector createAudioVideoConnector() {
        return new AudioVideoConnector();
    }

    /**
     * Create an instance of {@link AudioVideoConnectorPK }
     * 
     * @return
     *     the new instance of {@link AudioVideoConnectorPK }
     */
    public AudioVideoConnectorPK createAudioVideoConnectorPK() {
        return new AudioVideoConnectorPK();
    }

    /**
     * Create an instance of {@link FoodBeverageServingInfo }
     * 
     * @return
     *     the new instance of {@link FoodBeverageServingInfo }
     */
    public FoodBeverageServingInfo createFoodBeverageServingInfo() {
        return new FoodBeverageServingInfo();
    }

    /**
     * Create an instance of {@link Nextlowerleveltiinformation }
     * 
     * @return
     *     the new instance of {@link Nextlowerleveltiinformation }
     */
    public Nextlowerleveltiinformation createNextlowerleveltiinformation() {
        return new Nextlowerleveltiinformation();
    }

    /**
     * Create an instance of {@link Childtradeitem }
     * 
     * @return
     *     the new instance of {@link Childtradeitem }
     */
    public Childtradeitem createChildtradeitem() {
        return new Childtradeitem();
    }

    /**
     * Create an instance of {@link ChildtradeitemPK }
     * 
     * @return
     *     the new instance of {@link ChildtradeitemPK }
     */
    public ChildtradeitemPK createChildtradeitemPK() {
        return new ChildtradeitemPK();
    }

    /**
     * Create an instance of {@link Variant }
     * 
     * @return
     *     the new instance of {@link Variant }
     */
    public Variant createVariant() {
        return new Variant();
    }

    /**
     * Create an instance of {@link VariantPK }
     * 
     * @return
     *     the new instance of {@link VariantPK }
     */
    public VariantPK createVariantPK() {
        return new VariantPK();
    }

    /**
     * Create an instance of {@link FmpContentInformation }
     * 
     * @return
     *     the new instance of {@link FmpContentInformation }
     */
    public FmpContentInformation createFmpContentInformation() {
        return new FmpContentInformation();
    }

    /**
     * Create an instance of {@link FoodBeverageAllergyRelated }
     * 
     * @return
     *     the new instance of {@link FoodBeverageAllergyRelated }
     */
    public FoodBeverageAllergyRelated createFoodBeverageAllergyRelated() {
        return new FoodBeverageAllergyRelated();
    }

    /**
     * Create an instance of {@link FoodBeverageAllergyRelatedPK }
     * 
     * @return
     *     the new instance of {@link FoodBeverageAllergyRelatedPK }
     */
    public FoodBeverageAllergyRelatedPK createFoodBeverageAllergyRelatedPK() {
        return new FoodBeverageAllergyRelatedPK();
    }

    /**
     * Create an instance of {@link FoodCertificationInformation }
     * 
     * @return
     *     the new instance of {@link FoodCertificationInformation }
     */
    public FoodCertificationInformation createFoodCertificationInformation() {
        return new FoodCertificationInformation();
    }

    /**
     * Create an instance of {@link Subbrand }
     * 
     * @return
     *     the new instance of {@link Subbrand }
     */
    public Subbrand createSubbrand() {
        return new Subbrand();
    }

    /**
     * Create an instance of {@link SubbrandPK }
     * 
     * @return
     *     the new instance of {@link SubbrandPK }
     */
    public SubbrandPK createSubbrandPK() {
        return new SubbrandPK();
    }

    /**
     * Create an instance of {@link FoodBevergeAdditiveInfo }
     * 
     * @return
     *     the new instance of {@link FoodBevergeAdditiveInfo }
     */
    public FoodBevergeAdditiveInfo createFoodBevergeAdditiveInfo() {
        return new FoodBevergeAdditiveInfo();
    }

    /**
     * Create an instance of {@link FoodBevergeAdditiveInfoPK }
     * 
     * @return
     *     the new instance of {@link FoodBevergeAdditiveInfoPK }
     */
    public FoodBevergeAdditiveInfoPK createFoodBevergeAdditiveInfoPK() {
        return new FoodBevergeAdditiveInfoPK();
    }

    /**
     * Create an instance of {@link Tradeitemdescription }
     * 
     * @return
     *     the new instance of {@link Tradeitemdescription }
     */
    public Tradeitemdescription createTradeitemdescription() {
        return new Tradeitemdescription();
    }

    /**
     * Create an instance of {@link TradeitemdescriptionPK }
     * 
     * @return
     *     the new instance of {@link TradeitemdescriptionPK }
     */
    public TradeitemdescriptionPK createTradeitemdescriptionPK() {
        return new TradeitemdescriptionPK();
    }

    /**
     * Create an instance of {@link Tradeitemrb }
     * 
     * @return
     *     the new instance of {@link Tradeitemrb }
     */
    public Tradeitemrb createTradeitemrb() {
        return new Tradeitemrb();
    }

    /**
     * Create an instance of {@link Tradeitemcertificate }
     * 
     * @return
     *     the new instance of {@link Tradeitemcertificate }
     */
    public Tradeitemcertificate createTradeitemcertificate() {
        return new Tradeitemcertificate();
    }

    /**
     * Create an instance of {@link TradeitemcertificatePK }
     * 
     * @return
     *     the new instance of {@link TradeitemcertificatePK }
     */
    public TradeitemcertificatePK createTradeitemcertificatePK() {
        return new TradeitemcertificatePK();
    }

    /**
     * Create an instance of {@link Tradeitemggr }
     * 
     * @return
     *     the new instance of {@link Tradeitemggr }
     */
    public Tradeitemggr createTradeitemggr() {
        return new Tradeitemggr();
    }

    /**
     * Create an instance of {@link Tradeitemtscertificate }
     * 
     * @return
     *     the new instance of {@link Tradeitemtscertificate }
     */
    public Tradeitemtscertificate createTradeitemtscertificate() {
        return new Tradeitemtscertificate();
    }

    /**
     * Create an instance of {@link Tradeitemtsdeclaration }
     * 
     * @return
     *     the new instance of {@link Tradeitemtsdeclaration }
     */
    public Tradeitemtsdeclaration createTradeitemtsdeclaration() {
        return new Tradeitemtsdeclaration();
    }

    /**
     * Create an instance of {@link Tradeitemtsggr }
     * 
     * @return
     *     the new instance of {@link Tradeitemtsggr }
     */
    public Tradeitemtsggr createTradeitemtsggr() {
        return new Tradeitemtsggr();
    }

    /**
     * Create an instance of {@link Tpneutraltiinformation }
     * 
     * @return
     *     the new instance of {@link Tpneutraltiinformation }
     */
    public Tpneutraltiinformation createTpneutraltiinformation() {
        return new Tpneutraltiinformation();
    }

    /**
     * Create an instance of {@link Tradeitemmarking }
     * 
     * @return
     *     the new instance of {@link Tradeitemmarking }
     */
    public Tradeitemmarking createTradeitemmarking() {
        return new Tradeitemmarking();
    }

    /**
     * Create an instance of {@link Tradeitemhierarchy }
     * 
     * @return
     *     the new instance of {@link Tradeitemhierarchy }
     */
    public Tradeitemhierarchy createTradeitemhierarchy() {
        return new Tradeitemhierarchy();
    }

    /**
     * Create an instance of {@link Suggestedretailprice }
     * 
     * @return
     *     the new instance of {@link Suggestedretailprice }
     */
    public Suggestedretailprice createSuggestedretailprice() {
        return new Suggestedretailprice();
    }

    /**
     * Create an instance of {@link Tradeitemcountryoforigin }
     * 
     * @return
     *     the new instance of {@link Tradeitemcountryoforigin }
     */
    public Tradeitemcountryoforigin createTradeitemcountryoforigin() {
        return new Tradeitemcountryoforigin();
    }

    /**
     * Create an instance of {@link TradeitemcountryoforiginPK }
     * 
     * @return
     *     the new instance of {@link TradeitemcountryoforiginPK }
     */
    public TradeitemcountryoforiginPK createTradeitemcountryoforiginPK() {
        return new TradeitemcountryoforiginPK();
    }

    /**
     * Create an instance of {@link Barcodetype }
     * 
     * @return
     *     the new instance of {@link Barcodetype }
     */
    public Barcodetype createBarcodetype() {
        return new Barcodetype();
    }

    /**
     * Create an instance of {@link BarcodetypePK }
     * 
     * @return
     *     the new instance of {@link BarcodetypePK }
     */
    public BarcodetypePK createBarcodetypePK() {
        return new BarcodetypePK();
    }

    /**
     * Create an instance of {@link Tradeitemmeasurements }
     * 
     * @return
     *     the new instance of {@link Tradeitemmeasurements }
     */
    public Tradeitemmeasurements createTradeitemmeasurements() {
        return new Tradeitemmeasurements();
    }

    /**
     * Create an instance of {@link Diameter }
     * 
     * @return
     *     the new instance of {@link Diameter }
     */
    public Diameter createDiameter() {
        return new Diameter();
    }

    /**
     * Create an instance of {@link DiameterPK }
     * 
     * @return
     *     the new instance of {@link DiameterPK }
     */
    public DiameterPK createDiameterPK() {
        return new DiameterPK();
    }

    /**
     * Create an instance of {@link Grossweight }
     * 
     * @return
     *     the new instance of {@link Grossweight }
     */
    public Grossweight createGrossweight() {
        return new Grossweight();
    }

    /**
     * Create an instance of {@link GrossweightPK }
     * 
     * @return
     *     the new instance of {@link GrossweightPK }
     */
    public GrossweightPK createGrossweightPK() {
        return new GrossweightPK();
    }

    /**
     * Create an instance of {@link Height }
     * 
     * @return
     *     the new instance of {@link Height }
     */
    public Height createHeight() {
        return new Height();
    }

    /**
     * Create an instance of {@link HeightPK }
     * 
     * @return
     *     the new instance of {@link HeightPK }
     */
    public HeightPK createHeightPK() {
        return new HeightPK();
    }

    /**
     * Create an instance of {@link Netweight }
     * 
     * @return
     *     the new instance of {@link Netweight }
     */
    public Netweight createNetweight() {
        return new Netweight();
    }

    /**
     * Create an instance of {@link NetweightPK }
     * 
     * @return
     *     the new instance of {@link NetweightPK }
     */
    public NetweightPK createNetweightPK() {
        return new NetweightPK();
    }

    /**
     * Create an instance of {@link Depth }
     * 
     * @return
     *     the new instance of {@link Depth }
     */
    public Depth createDepth() {
        return new Depth();
    }

    /**
     * Create an instance of {@link DepthPK }
     * 
     * @return
     *     the new instance of {@link DepthPK }
     */
    public DepthPK createDepthPK() {
        return new DepthPK();
    }

    /**
     * Create an instance of {@link Drainedweight }
     * 
     * @return
     *     the new instance of {@link Drainedweight }
     */
    public Drainedweight createDrainedweight() {
        return new Drainedweight();
    }

    /**
     * Create an instance of {@link DrainedweightPK }
     * 
     * @return
     *     the new instance of {@link DrainedweightPK }
     */
    public DrainedweightPK createDrainedweightPK() {
        return new DrainedweightPK();
    }

    /**
     * Create an instance of {@link Netcontent }
     * 
     * @return
     *     the new instance of {@link Netcontent }
     */
    public Netcontent createNetcontent() {
        return new Netcontent();
    }

    /**
     * Create an instance of {@link NetcontentPK }
     * 
     * @return
     *     the new instance of {@link NetcontentPK }
     */
    public NetcontentPK createNetcontentPK() {
        return new NetcontentPK();
    }

    /**
     * Create an instance of {@link Width }
     * 
     * @return
     *     the new instance of {@link Width }
     */
    public Width createWidth() {
        return new Width();
    }

    /**
     * Create an instance of {@link WidthPK }
     * 
     * @return
     *     the new instance of {@link WidthPK }
     */
    public WidthPK createWidthPK() {
        return new WidthPK();
    }

    /**
     * Create an instance of {@link Catalogueprice }
     * 
     * @return
     *     the new instance of {@link Catalogueprice }
     */
    public Catalogueprice createCatalogueprice() {
        return new Catalogueprice();
    }

    /**
     * Create an instance of {@link Tradeitemcountryofassembly }
     * 
     * @return
     *     the new instance of {@link Tradeitemcountryofassembly }
     */
    public Tradeitemcountryofassembly createTradeitemcountryofassembly() {
        return new Tradeitemcountryofassembly();
    }

    /**
     * Create an instance of {@link TradeitemcountryofassemblyPK }
     * 
     * @return
     *     the new instance of {@link TradeitemcountryofassemblyPK }
     */
    public TradeitemcountryofassemblyPK createTradeitemcountryofassemblyPK() {
        return new TradeitemcountryofassemblyPK();
    }

    /**
     * Create an instance of {@link Tradeitemunitindicator }
     * 
     * @return
     *     the new instance of {@link Tradeitemunitindicator }
     */
    public Tradeitemunitindicator createTradeitemunitindicator() {
        return new Tradeitemunitindicator();
    }

    /**
     * Create an instance of {@link Packagingmarking }
     * 
     * @return
     *     the new instance of {@link Packagingmarking }
     */
    public Packagingmarking createPackagingmarking() {
        return new Packagingmarking();
    }

    /**
     * Create an instance of {@link Packagemarksdietallergen }
     * 
     * @return
     *     the new instance of {@link Packagemarksdietallergen }
     */
    public Packagemarksdietallergen createPackagemarksdietallergen() {
        return new Packagemarksdietallergen();
    }

    /**
     * Create an instance of {@link PackagemarksdietallergenPK }
     * 
     * @return
     *     the new instance of {@link PackagemarksdietallergenPK }
     */
    public PackagemarksdietallergenPK createPackagemarksdietallergenPK() {
        return new PackagemarksdietallergenPK();
    }

    /**
     * Create an instance of {@link Pckgmarkedexpirationdatetype }
     * 
     * @return
     *     the new instance of {@link Pckgmarkedexpirationdatetype }
     */
    public Pckgmarkedexpirationdatetype createPckgmarkedexpirationdatetype() {
        return new Pckgmarkedexpirationdatetype();
    }

    /**
     * Create an instance of {@link PckgmarkedexpirationdatetypePK }
     * 
     * @return
     *     the new instance of {@link PckgmarkedexpirationdatetypePK }
     */
    public PckgmarkedexpirationdatetypePK createPckgmarkedexpirationdatetypePK() {
        return new PckgmarkedexpirationdatetypePK();
    }

    /**
     * Create an instance of {@link Packagemarkshygienic }
     * 
     * @return
     *     the new instance of {@link Packagemarkshygienic }
     */
    public Packagemarkshygienic createPackagemarkshygienic() {
        return new Packagemarkshygienic();
    }

    /**
     * Create an instance of {@link PackagemarkshygienicPK }
     * 
     * @return
     *     the new instance of {@link PackagemarkshygienicPK }
     */
    public PackagemarkshygienicPK createPackagemarkshygienicPK() {
        return new PackagemarkshygienicPK();
    }

    /**
     * Create an instance of {@link Packagemarksethical }
     * 
     * @return
     *     the new instance of {@link Packagemarksethical }
     */
    public Packagemarksethical createPackagemarksethical() {
        return new Packagemarksethical();
    }

    /**
     * Create an instance of {@link PackagemarksethicalPK }
     * 
     * @return
     *     the new instance of {@link PackagemarksethicalPK }
     */
    public PackagemarksethicalPK createPackagemarksethicalPK() {
        return new PackagemarksethicalPK();
    }

    /**
     * Create an instance of {@link Packagemarksfreefrom }
     * 
     * @return
     *     the new instance of {@link Packagemarksfreefrom }
     */
    public Packagemarksfreefrom createPackagemarksfreefrom() {
        return new Packagemarksfreefrom();
    }

    /**
     * Create an instance of {@link PackagemarksfreefromPK }
     * 
     * @return
     *     the new instance of {@link PackagemarksfreefromPK }
     */
    public PackagemarksfreefromPK createPackagemarksfreefromPK() {
        return new PackagemarksfreefromPK();
    }

    /**
     * Create an instance of {@link Packagemarksenvironment }
     * 
     * @return
     *     the new instance of {@link Packagemarksenvironment }
     */
    public Packagemarksenvironment createPackagemarksenvironment() {
        return new Packagemarksenvironment();
    }

    /**
     * Create an instance of {@link PackagemarksenvironmentPK }
     * 
     * @return
     *     the new instance of {@link PackagemarksenvironmentPK }
     */
    public PackagemarksenvironmentPK createPackagemarksenvironmentPK() {
        return new PackagemarksenvironmentPK();
    }

    /**
     * Create an instance of {@link Classcomplianceregulationcode }
     * 
     * @return
     *     the new instance of {@link Classcomplianceregulationcode }
     */
    public Classcomplianceregulationcode createClasscomplianceregulationcode() {
        return new Classcomplianceregulationcode();
    }

    /**
     * Create an instance of {@link ClasscomplianceregulationcodePK }
     * 
     * @return
     *     the new instance of {@link ClasscomplianceregulationcodePK }
     */
    public ClasscomplianceregulationcodePK createClasscomplianceregulationcodePK() {
        return new ClasscomplianceregulationcodePK();
    }

    /**
     * Create an instance of {@link Tradeitemdateinformation }
     * 
     * @return
     *     the new instance of {@link Tradeitemdateinformation }
     */
    public Tradeitemdateinformation createTradeitemdateinformation() {
        return new Tradeitemdateinformation();
    }

    /**
     * Create an instance of {@link Functionalname }
     * 
     * @return
     *     the new instance of {@link Functionalname }
     */
    public Functionalname createFunctionalname() {
        return new Functionalname();
    }

    /**
     * Create an instance of {@link FunctionalnamePK }
     * 
     * @return
     *     the new instance of {@link FunctionalnamePK }
     */
    public FunctionalnamePK createFunctionalnamePK() {
        return new FunctionalnamePK();
    }

    /**
     * Create an instance of {@link Tradeitemrbspec }
     * 
     * @return
     *     the new instance of {@link Tradeitemrbspec }
     */
    public Tradeitemrbspec createTradeitemrbspec() {
        return new Tradeitemrbspec();
    }

    /**
     * Create an instance of {@link Tradeitemtradechannel }
     * 
     * @return
     *     the new instance of {@link Tradeitemtradechannel }
     */
    public Tradeitemtradechannel createTradeitemtradechannel() {
        return new Tradeitemtradechannel();
    }

    /**
     * Create an instance of {@link TradeitemtradechannelPK }
     * 
     * @return
     *     the new instance of {@link TradeitemtradechannelPK }
     */
    public TradeitemtradechannelPK createTradeitemtradechannelPK() {
        return new TradeitemtradechannelPK();
    }

    /**
     * Create an instance of {@link FoodBeverageNutrientInfo }
     * 
     * @return
     *     the new instance of {@link FoodBeverageNutrientInfo }
     */
    public FoodBeverageNutrientInfo createFoodBeverageNutrientInfo() {
        return new FoodBeverageNutrientInfo();
    }

    /**
     * Create an instance of {@link TvFeature }
     * 
     * @return
     *     the new instance of {@link TvFeature }
     */
    public TvFeature createTvFeature() {
        return new TvFeature();
    }

    /**
     * Create an instance of {@link TvFeaturePK }
     * 
     * @return
     *     the new instance of {@link TvFeaturePK }
     */
    public TvFeaturePK createTvFeaturePK() {
        return new TvFeaturePK();
    }

    /**
     * Create an instance of {@link FoodBeverageCheeseInform }
     * 
     * @return
     *     the new instance of {@link FoodBeverageCheeseInform }
     */
    public FoodBeverageCheeseInform createFoodBeverageCheeseInform() {
        return new FoodBeverageCheeseInform();
    }

    /**
     * Create an instance of {@link FoodBevergeIngredientInform }
     * 
     * @return
     *     the new instance of {@link FoodBevergeIngredientInform }
     */
    public FoodBevergeIngredientInform createFoodBevergeIngredientInform() {
        return new FoodBevergeIngredientInform();
    }

    /**
     * Create an instance of {@link FoodBeverageIngredient }
     * 
     * @return
     *     the new instance of {@link FoodBeverageIngredient }
     */
    public FoodBeverageIngredient createFoodBeverageIngredient() {
        return new FoodBeverageIngredient();
    }

    /**
     * Create an instance of {@link FoodBeverageIngredientPK }
     * 
     * @return
     *     the new instance of {@link FoodBeverageIngredientPK }
     */
    public FoodBeverageIngredientPK createFoodBeverageIngredientPK() {
        return new FoodBeverageIngredientPK();
    }

    /**
     * Create an instance of {@link AudioVideoPhoto }
     * 
     * @return
     *     the new instance of {@link AudioVideoPhoto }
     */
    public AudioVideoPhoto createAudioVideoPhoto() {
        return new AudioVideoPhoto();
    }

    /**
     * Create an instance of {@link ProductYieldInformation }
     * 
     * @return
     *     the new instance of {@link ProductYieldInformation }
     */
    public ProductYieldInformation createProductYieldInformation() {
        return new ProductYieldInformation();
    }

    /**
     * Create an instance of {@link ProductYieldInformationPK }
     * 
     * @return
     *     the new instance of {@link ProductYieldInformationPK }
     */
    public ProductYieldInformationPK createProductYieldInformationPK() {
        return new ProductYieldInformationPK();
    }

    /**
     * Create an instance of {@link Productrange }
     * 
     * @return
     *     the new instance of {@link Productrange }
     */
    public Productrange createProductrange() {
        return new Productrange();
    }

    /**
     * Create an instance of {@link ProductrangePK }
     * 
     * @return
     *     the new instance of {@link ProductrangePK }
     */
    public ProductrangePK createProductrangePK() {
        return new ProductrangePK();
    }

    /**
     * Create an instance of {@link FoodBeverageMarketingInform }
     * 
     * @return
     *     the new instance of {@link FoodBeverageMarketingInform }
     */
    public FoodBeverageMarketingInform createFoodBeverageMarketingInform() {
        return new FoodBeverageMarketingInform();
    }

    /**
     * Create an instance of {@link FoodBeverageMarketingInformPK }
     * 
     * @return
     *     the new instance of {@link FoodBeverageMarketingInformPK }
     */
    public FoodBeverageMarketingInformPK createFoodBeverageMarketingInformPK() {
        return new FoodBeverageMarketingInformPK();
    }

    /**
     * Create an instance of {@link Targetmarketinformation }
     * 
     * @return
     *     the new instance of {@link Targetmarketinformation }
     */
    public Targetmarketinformation createTargetmarketinformation() {
        return new Targetmarketinformation();
    }

    /**
     * Create an instance of {@link TargetmarketinformationPK }
     * 
     * @return
     *     the new instance of {@link TargetmarketinformationPK }
     */
    public TargetmarketinformationPK createTargetmarketinformationPK() {
        return new TargetmarketinformationPK();
    }

    /**
     * Create an instance of {@link FoodBeveragePreparation }
     * 
     * @return
     *     the new instance of {@link FoodBeveragePreparation }
     */
    public FoodBeveragePreparation createFoodBeveragePreparation() {
        return new FoodBeveragePreparation();
    }

    /**
     * Create an instance of {@link FoodBeveragePreparationPK }
     * 
     * @return
     *     the new instance of {@link FoodBeveragePreparationPK }
     */
    public FoodBeveragePreparationPK createFoodBeveragePreparationPK() {
        return new FoodBeveragePreparationPK();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNReq }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLNReq }
     */
    public SearchTradeitemsByGLNReq createSearchTradeitemsByGLNReq() {
        return new SearchTradeitemsByGLNReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNResp }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLNResp }
     */
    public SearchTradeitemsByGLNResp createSearchTradeitemsByGLNResp() {
        return new SearchTradeitemsByGLNResp();
    }

    /**
     * Create an instance of {@link GetPartyByUNPReq }
     * 
     * @return
     *     the new instance of {@link GetPartyByUNPReq }
     */
    public GetPartyByUNPReq createGetPartyByUNPReq() {
        return new GetPartyByUNPReq();
    }

    /**
     * Create an instance of {@link GetPartyByUNPResp }
     * 
     * @return
     *     the new instance of {@link GetPartyByUNPResp }
     */
    public GetPartyByUNPResp createGetPartyByUNPResp() {
        return new GetPartyByUNPResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVEDReq }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByTNVEDReq }
     */
    public SearchTradeitemsByTNVEDReq createSearchTradeitemsByTNVEDReq() {
        return new SearchTradeitemsByTNVEDReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByTNVEDResp }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByTNVEDResp }
     */
    public SearchTradeitemsByTNVEDResp createSearchTradeitemsByTNVEDResp() {
        return new SearchTradeitemsByTNVEDResp();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTimeReq }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsOfPoolByModifiedTimeReq }
     */
    public GetTradeitemsOfPoolByModifiedTimeReq createGetTradeitemsOfPoolByModifiedTimeReq() {
        return new GetTradeitemsOfPoolByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link GetTradeitemsOfPoolByModifiedTimeResp }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsOfPoolByModifiedTimeResp }
     */
    public GetTradeitemsOfPoolByModifiedTimeResp createGetTradeitemsOfPoolByModifiedTimeResp() {
        return new GetTradeitemsOfPoolByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTINReq }
     * 
     * @return
     *     the new instance of {@link SearchGTINfromDatamarkSystemByGTINReq }
     */
    public SearchGTINfromDatamarkSystemByGTINReq createSearchGTINfromDatamarkSystemByGTINReq() {
        return new SearchGTINfromDatamarkSystemByGTINReq();
    }

    /**
     * Create an instance of {@link SearchGTINfromDatamarkSystemByGTINResp }
     * 
     * @return
     *     the new instance of {@link SearchGTINfromDatamarkSystemByGTINResp }
     */
    public SearchGTINfromDatamarkSystemByGTINResp createSearchGTINfromDatamarkSystemByGTINResp() {
        return new SearchGTINfromDatamarkSystemByGTINResp();
    }

    /**
     * Create an instance of {@link ApiHeaderResponseWithDataSource }
     * 
     * @return
     *     the new instance of {@link ApiHeaderResponseWithDataSource }
     */
    public ApiHeaderResponseWithDataSource createApiHeaderResponseWithDataSource() {
        return new ApiHeaderResponseWithDataSource();
    }

    /**
     * Create an instance of {@link SimpleTradeitem }
     * 
     * @return
     *     the new instance of {@link SimpleTradeitem }
     */
    public SimpleTradeitem createSimpleTradeitem() {
        return new SimpleTradeitem();
    }

    /**
     * Create an instance of {@link GetShortTradeitemByGTINReq }
     * 
     * @return
     *     the new instance of {@link GetShortTradeitemByGTINReq }
     */
    public GetShortTradeitemByGTINReq createGetShortTradeitemByGTINReq() {
        return new GetShortTradeitemByGTINReq();
    }

    /**
     * Create an instance of {@link GetShortTradeitemByGTINResp }
     * 
     * @return
     *     the new instance of {@link GetShortTradeitemByGTINResp }
     */
    public GetShortTradeitemByGTINResp createGetShortTradeitemByGTINResp() {
        return new GetShortTradeitemByGTINResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTimeReq }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByModifiedTimeReq }
     */
    public SearchTradeitemsByModifiedTimeReq createSearchTradeitemsByModifiedTimeReq() {
        return new SearchTradeitemsByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByModifiedTimeResp }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByModifiedTimeResp }
     */
    public SearchTradeitemsByModifiedTimeResp createSearchTradeitemsByModifiedTimeResp() {
        return new SearchTradeitemsByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTINReq }
     * 
     * @return
     *     the new instance of {@link GetFunctionalnameByGTINReq }
     */
    public GetFunctionalnameByGTINReq createGetFunctionalnameByGTINReq() {
        return new GetFunctionalnameByGTINReq();
    }

    /**
     * Create an instance of {@link GetFunctionalnameByGTINResp }
     * 
     * @return
     *     the new instance of {@link GetFunctionalnameByGTINResp }
     */
    public GetFunctionalnameByGTINResp createGetFunctionalnameByGTINResp() {
        return new GetFunctionalnameByGTINResp();
    }

    /**
     * Create an instance of {@link GetClassificatorReq }
     * 
     * @return
     *     the new instance of {@link GetClassificatorReq }
     */
    public GetClassificatorReq createGetClassificatorReq() {
        return new GetClassificatorReq();
    }

    /**
     * Create an instance of {@link GetClassificatorResp }
     * 
     * @return
     *     the new instance of {@link GetClassificatorResp }
     */
    public GetClassificatorResp createGetClassificatorResp() {
        return new GetClassificatorResp();
    }

    /**
     * Create an instance of {@link ClassificatorUnit }
     * 
     * @return
     *     the new instance of {@link ClassificatorUnit }
     */
    public ClassificatorUnit createClassificatorUnit() {
        return new ClassificatorUnit();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByNameReq }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByNameReq }
     */
    public SearchTradeitemsByNameReq createSearchTradeitemsByNameReq() {
        return new SearchTradeitemsByNameReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByNameResp }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByNameResp }
     */
    public SearchTradeitemsByNameResp createSearchTradeitemsByNameResp() {
        return new SearchTradeitemsByNameResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007Req }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByOKRB007Req }
     */
    public SearchTradeitemsByOKRB007Req createSearchTradeitemsByOKRB007Req() {
        return new SearchTradeitemsByOKRB007Req();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByOKRB007Resp }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByOKRB007Resp }
     */
    public SearchTradeitemsByOKRB007Resp createSearchTradeitemsByOKRB007Resp() {
        return new SearchTradeitemsByOKRB007Resp();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTINReq }
     * 
     * @return
     *     the new instance of {@link GetSimpleTradeitemsByGTINReq }
     */
    public GetSimpleTradeitemsByGTINReq createGetSimpleTradeitemsByGTINReq() {
        return new GetSimpleTradeitemsByGTINReq();
    }

    /**
     * Create an instance of {@link GetSimpleTradeitemsByGTINResp }
     * 
     * @return
     *     the new instance of {@link GetSimpleTradeitemsByGTINResp }
     */
    public GetSimpleTradeitemsByGTINResp createGetSimpleTradeitemsByGTINResp() {
        return new GetSimpleTradeitemsByGTINResp();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLNReq }
     * 
     * @return
     *     the new instance of {@link GetFullPartyByGLNReq }
     */
    public GetFullPartyByGLNReq createGetFullPartyByGLNReq() {
        return new GetFullPartyByGLNReq();
    }

    /**
     * Create an instance of {@link GetFullPartyByGLNResp }
     * 
     * @return
     *     the new instance of {@link GetFullPartyByGLNResp }
     */
    public GetFullPartyByGLNResp createGetFullPartyByGLNResp() {
        return new GetFullPartyByGLNResp();
    }

    /**
     * Create an instance of {@link Party }
     * 
     * @return
     *     the new instance of {@link Party }
     */
    public Party createParty() {
        return new Party();
    }

    /**
     * Create an instance of {@link PartyAddons }
     * 
     * @return
     *     the new instance of {@link PartyAddons }
     */
    public PartyAddons createPartyAddons() {
        return new PartyAddons();
    }

    /**
     * Create an instance of {@link Securityusers }
     * 
     * @return
     *     the new instance of {@link Securityusers }
     */
    public Securityusers createSecurityusers() {
        return new Securityusers();
    }

    /**
     * Create an instance of {@link SecurityusersAddons }
     * 
     * @return
     *     the new instance of {@link SecurityusersAddons }
     */
    public SecurityusersAddons createSecurityusersAddons() {
        return new SecurityusersAddons();
    }

    /**
     * Create an instance of {@link Userpools }
     * 
     * @return
     *     the new instance of {@link Userpools }
     */
    public Userpools createUserpools() {
        return new Userpools();
    }

    /**
     * Create an instance of {@link UserpoolsPK }
     * 
     * @return
     *     the new instance of {@link UserpoolsPK }
     */
    public UserpoolsPK createUserpoolsPK() {
        return new UserpoolsPK();
    }

    /**
     * Create an instance of {@link Userpoolscontent }
     * 
     * @return
     *     the new instance of {@link Userpoolscontent }
     */
    public Userpoolscontent createUserpoolscontent() {
        return new Userpoolscontent();
    }

    /**
     * Create an instance of {@link UserpoolscontentPK }
     * 
     * @return
     *     the new instance of {@link UserpoolscontentPK }
     */
    public UserpoolscontentPK createUserpoolscontentPK() {
        return new UserpoolscontentPK();
    }

    /**
     * Create an instance of {@link Securityauthorities }
     * 
     * @return
     *     the new instance of {@link Securityauthorities }
     */
    public Securityauthorities createSecurityauthorities() {
        return new Securityauthorities();
    }

    /**
     * Create an instance of {@link SecurityauthoritiesPK }
     * 
     * @return
     *     the new instance of {@link SecurityauthoritiesPK }
     */
    public SecurityauthoritiesPK createSecurityauthoritiesPK() {
        return new SecurityauthoritiesPK();
    }

    /**
     * Create an instance of {@link SecurityauthoritiesAddons }
     * 
     * @return
     *     the new instance of {@link SecurityauthoritiesAddons }
     */
    public SecurityauthoritiesAddons createSecurityauthoritiesAddons() {
        return new SecurityauthoritiesAddons();
    }

    /**
     * Create an instance of {@link Pools }
     * 
     * @return
     *     the new instance of {@link Pools }
     */
    public Pools createPools() {
        return new Pools();
    }

    /**
     * Create an instance of {@link PoolsPK }
     * 
     * @return
     *     the new instance of {@link PoolsPK }
     */
    public PoolsPK createPoolsPK() {
        return new PoolsPK();
    }

    /**
     * Create an instance of {@link Poolscontent }
     * 
     * @return
     *     the new instance of {@link Poolscontent }
     */
    public Poolscontent createPoolscontent() {
        return new Poolscontent();
    }

    /**
     * Create an instance of {@link PoolscontentPK }
     * 
     * @return
     *     the new instance of {@link PoolscontentPK }
     */
    public PoolscontentPK createPoolscontentPK() {
        return new PoolscontentPK();
    }

    /**
     * Create an instance of {@link PostAddress }
     * 
     * @return
     *     the new instance of {@link PostAddress }
     */
    public PostAddress createPostAddress() {
        return new PostAddress();
    }

    /**
     * Create an instance of {@link PostAddressPK }
     * 
     * @return
     *     the new instance of {@link PostAddressPK }
     */
    public PostAddressPK createPostAddressPK() {
        return new PostAddressPK();
    }

    /**
     * Create an instance of {@link Streetaddressone }
     * 
     * @return
     *     the new instance of {@link Streetaddressone }
     */
    public Streetaddressone createStreetaddressone() {
        return new Streetaddressone();
    }

    /**
     * Create an instance of {@link StreetaddressonePK }
     * 
     * @return
     *     the new instance of {@link StreetaddressonePK }
     */
    public StreetaddressonePK createStreetaddressonePK() {
        return new StreetaddressonePK();
    }

    /**
     * Create an instance of {@link Alternatepartyidentification }
     * 
     * @return
     *     the new instance of {@link Alternatepartyidentification }
     */
    public Alternatepartyidentification createAlternatepartyidentification() {
        return new Alternatepartyidentification();
    }

    /**
     * Create an instance of {@link AlternatepartyidentificationPK }
     * 
     * @return
     *     the new instance of {@link AlternatepartyidentificationPK }
     */
    public AlternatepartyidentificationPK createAlternatepartyidentificationPK() {
        return new AlternatepartyidentificationPK();
    }

    /**
     * Create an instance of {@link Quotaimport }
     * 
     * @return
     *     the new instance of {@link Quotaimport }
     */
    public Quotaimport createQuotaimport() {
        return new Quotaimport();
    }

    /**
     * Create an instance of {@link QuotaimportAddos }
     * 
     * @return
     *     the new instance of {@link QuotaimportAddos }
     */
    public QuotaimportAddos createQuotaimportAddos() {
        return new QuotaimportAddos();
    }

    /**
     * Create an instance of {@link Partyroles }
     * 
     * @return
     *     the new instance of {@link Partyroles }
     */
    public Partyroles createPartyroles() {
        return new Partyroles();
    }

    /**
     * Create an instance of {@link PartyrolesPK }
     * 
     * @return
     *     the new instance of {@link PartyrolesPK }
     */
    public PartyrolesPK createPartyrolesPK() {
        return new PartyrolesPK();
    }

    /**
     * Create an instance of {@link Bankaccounts }
     * 
     * @return
     *     the new instance of {@link Bankaccounts }
     */
    public Bankaccounts createBankaccounts() {
        return new Bankaccounts();
    }

    /**
     * Create an instance of {@link Banks }
     * 
     * @return
     *     the new instance of {@link Banks }
     */
    public Banks createBanks() {
        return new Banks();
    }

    /**
     * Create an instance of {@link BanksPK }
     * 
     * @return
     *     the new instance of {@link BanksPK }
     */
    public BanksPK createBanksPK() {
        return new BanksPK();
    }

    /**
     * Create an instance of {@link LegalName }
     * 
     * @return
     *     the new instance of {@link LegalName }
     */
    public LegalName createLegalName() {
        return new LegalName();
    }

    /**
     * Create an instance of {@link LegalNamePK }
     * 
     * @return
     *     the new instance of {@link LegalNamePK }
     */
    public LegalNamePK createLegalNamePK() {
        return new LegalNamePK();
    }

    /**
     * Create an instance of {@link Contactname }
     * 
     * @return
     *     the new instance of {@link Contactname }
     */
    public Contactname createContactname() {
        return new Contactname();
    }

    /**
     * Create an instance of {@link ContactnamePK }
     * 
     * @return
     *     the new instance of {@link ContactnamePK }
     */
    public ContactnamePK createContactnamePK() {
        return new ContactnamePK();
    }

    /**
     * Create an instance of {@link Chiefname }
     * 
     * @return
     *     the new instance of {@link Chiefname }
     */
    public Chiefname createChiefname() {
        return new Chiefname();
    }

    /**
     * Create an instance of {@link ChiefnamePK }
     * 
     * @return
     *     the new instance of {@link ChiefnamePK }
     */
    public ChiefnamePK createChiefnamePK() {
        return new ChiefnamePK();
    }

    /**
     * Create an instance of {@link Partyrb }
     * 
     * @return
     *     the new instance of {@link Partyrb }
     */
    public Partyrb createPartyrb() {
        return new Partyrb();
    }

    /**
     * Create an instance of {@link Partytaxinformation }
     * 
     * @return
     *     the new instance of {@link Partytaxinformation }
     */
    public Partytaxinformation createPartytaxinformation() {
        return new Partytaxinformation();
    }

    /**
     * Create an instance of {@link Partygcp }
     * 
     * @return
     *     the new instance of {@link Partygcp }
     */
    public Partygcp createPartygcp() {
        return new Partygcp();
    }

    /**
     * Create an instance of {@link PartygcpPK }
     * 
     * @return
     *     the new instance of {@link PartygcpPK }
     */
    public PartygcpPK createPartygcpPK() {
        return new PartygcpPK();
    }

    /**
     * Create an instance of {@link City }
     * 
     * @return
     *     the new instance of {@link City }
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link CityPK }
     * 
     * @return
     *     the new instance of {@link CityPK }
     */
    public CityPK createCityPK() {
        return new CityPK();
    }

    /**
     * Create an instance of {@link Streetaddresstwo }
     * 
     * @return
     *     the new instance of {@link Streetaddresstwo }
     */
    public Streetaddresstwo createStreetaddresstwo() {
        return new Streetaddresstwo();
    }

    /**
     * Create an instance of {@link StreetaddresstwoPK }
     * 
     * @return
     *     the new instance of {@link StreetaddresstwoPK }
     */
    public StreetaddresstwoPK createStreetaddresstwoPK() {
        return new StreetaddresstwoPK();
    }

    /**
     * Create an instance of {@link LegalShortName }
     * 
     * @return
     *     the new instance of {@link LegalShortName }
     */
    public LegalShortName createLegalShortName() {
        return new LegalShortName();
    }

    /**
     * Create an instance of {@link LegalShortNamePK }
     * 
     * @return
     *     the new instance of {@link LegalShortNamePK }
     */
    public LegalShortNamePK createLegalShortNamePK() {
        return new LegalShortNamePK();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     * @return
     *     the new instance of {@link Contact }
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link Communicaionchannel }
     * 
     * @return
     *     the new instance of {@link Communicaionchannel }
     */
    public Communicaionchannel createCommunicaionchannel() {
        return new Communicaionchannel();
    }

    /**
     * Create an instance of {@link CommunicaionchannelPK }
     * 
     * @return
     *     the new instance of {@link CommunicaionchannelPK }
     */
    public CommunicaionchannelPK createCommunicaionchannelPK() {
        return new CommunicaionchannelPK();
    }

    /**
     * Create an instance of {@link Secondarygovernmentarea }
     * 
     * @return
     *     the new instance of {@link Secondarygovernmentarea }
     */
    public Secondarygovernmentarea createSecondarygovernmentarea() {
        return new Secondarygovernmentarea();
    }

    /**
     * Create an instance of {@link SecondarygovernmentareaPK }
     * 
     * @return
     *     the new instance of {@link SecondarygovernmentareaPK }
     */
    public SecondarygovernmentareaPK createSecondarygovernmentareaPK() {
        return new SecondarygovernmentareaPK();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTimeReq }
     * 
     * @return
     *     the new instance of {@link CleanTradeitemsOfPoolByDeleteTimeReq }
     */
    public CleanTradeitemsOfPoolByDeleteTimeReq createCleanTradeitemsOfPoolByDeleteTimeReq() {
        return new CleanTradeitemsOfPoolByDeleteTimeReq();
    }

    /**
     * Create an instance of {@link CleanTradeitemsOfPoolByDeleteTimeResp }
     * 
     * @return
     *     the new instance of {@link CleanTradeitemsOfPoolByDeleteTimeResp }
     */
    public CleanTradeitemsOfPoolByDeleteTimeResp createCleanTradeitemsOfPoolByDeleteTimeResp() {
        return new CleanTradeitemsOfPoolByDeleteTimeResp();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINReq }
     * 
     * @return
     *     the new instance of {@link GetTradeitemByGTINReq }
     */
    public GetTradeitemByGTINReq createGetTradeitemByGTINReq() {
        return new GetTradeitemByGTINReq();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTimeReq }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTimeReq }
     */
    public SearchSimpleTradeitemsByModifiedTimeReq createSearchSimpleTradeitemsByModifiedTimeReq() {
        return new SearchSimpleTradeitemsByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchSimpleTradeitemsByModifiedTimeResp }
     * 
     * @return
     *     the new instance of {@link SearchSimpleTradeitemsByModifiedTimeResp }
     */
    public SearchSimpleTradeitemsByModifiedTimeResp createSearchSimpleTradeitemsByModifiedTimeResp() {
        return new SearchSimpleTradeitemsByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link GetTradeitemByGTINResp }
     * 
     * @return
     *     the new instance of {@link GetTradeitemByGTINResp }
     */
    public GetTradeitemByGTINResp createGetTradeitemByGTINResp() {
        return new GetTradeitemByGTINResp();
    }

    /**
     * Create an instance of {@link GetVariantByGTINReq }
     * 
     * @return
     *     the new instance of {@link GetVariantByGTINReq }
     */
    public GetVariantByGTINReq createGetVariantByGTINReq() {
        return new GetVariantByGTINReq();
    }

    /**
     * Create an instance of {@link GetVariantByGTINResp }
     * 
     * @return
     *     the new instance of {@link GetVariantByGTINResp }
     */
    public GetVariantByGTINResp createGetVariantByGTINResp() {
        return new GetVariantByGTINResp();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsReq }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINsReq }
     */
    public GetTradeitemsByGTINsReq createGetTradeitemsByGTINsReq() {
        return new GetTradeitemsByGTINsReq();
    }

    /**
     * Create an instance of {@link GetTradeitemsByGTINsResp }
     * 
     * @return
     *     the new instance of {@link GetTradeitemsByGTINsResp }
     */
    public GetTradeitemsByGTINsResp createGetTradeitemsByGTINsResp() {
        return new GetTradeitemsByGTINsResp();
    }

    /**
     * Create an instance of {@link SearchSimpleImportTradeitemsByModifiedTimeReq }
     * 
     * @return
     *     the new instance of {@link SearchSimpleImportTradeitemsByModifiedTimeReq }
     */
    public SearchSimpleImportTradeitemsByModifiedTimeReq createSearchSimpleImportTradeitemsByModifiedTimeReq() {
        return new SearchSimpleImportTradeitemsByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchSimpleImportTradeitemsByModifiedTimeResp }
     * 
     * @return
     *     the new instance of {@link SearchSimpleImportTradeitemsByModifiedTimeResp }
     */
    public SearchSimpleImportTradeitemsByModifiedTimeResp createSearchSimpleImportTradeitemsByModifiedTimeResp() {
        return new SearchSimpleImportTradeitemsByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTimeReq }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLNAndModifiedTimeReq }
     */
    public SearchTradeitemsByGLNAndModifiedTimeReq createSearchTradeitemsByGLNAndModifiedTimeReq() {
        return new SearchTradeitemsByGLNAndModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchTradeitemsByGLNAndModifiedTimeResp }
     * 
     * @return
     *     the new instance of {@link SearchTradeitemsByGLNAndModifiedTimeResp }
     */
    public SearchTradeitemsByGLNAndModifiedTimeResp createSearchTradeitemsByGLNAndModifiedTimeResp() {
        return new SearchTradeitemsByGLNAndModifiedTimeResp();
    }

    /**
     * Create an instance of {@link LogoutReq }
     * 
     * @return
     *     the new instance of {@link LogoutReq }
     */
    public LogoutReq createLogoutReq() {
        return new LogoutReq();
    }

    /**
     * Create an instance of {@link LogoutResp }
     * 
     * @return
     *     the new instance of {@link LogoutResp }
     */
    public LogoutResp createLogoutResp() {
        return new LogoutResp();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfoReq }
     * 
     * @return
     *     the new instance of {@link GetQuotaImportInfoReq }
     */
    public GetQuotaImportInfoReq createGetQuotaImportInfoReq() {
        return new GetQuotaImportInfoReq();
    }

    /**
     * Create an instance of {@link GetQuotaImportInfoResp }
     * 
     * @return
     *     the new instance of {@link GetQuotaImportInfoResp }
     */
    public GetQuotaImportInfoResp createGetQuotaImportInfoResp() {
        return new GetQuotaImportInfoResp();
    }

    /**
     * Create an instance of {@link GetPartyByGLNReq }
     * 
     * @return
     *     the new instance of {@link GetPartyByGLNReq }
     */
    public GetPartyByGLNReq createGetPartyByGLNReq() {
        return new GetPartyByGLNReq();
    }

    /**
     * Create an instance of {@link GetPartyByGLNResp }
     * 
     * @return
     *     the new instance of {@link GetPartyByGLNResp }
     */
    public GetPartyByGLNResp createGetPartyByGLNResp() {
        return new GetPartyByGLNResp();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINsReq }
     * 
     * @return
     *     the new instance of {@link GetTIImageKindsByGTINsReq }
     */
    public GetTIImageKindsByGTINsReq createGetTIImageKindsByGTINsReq() {
        return new GetTIImageKindsByGTINsReq();
    }

    /**
     * Create an instance of {@link GetTIImageKindsByGTINsResp }
     * 
     * @return
     *     the new instance of {@link GetTIImageKindsByGTINsResp }
     */
    public GetTIImageKindsByGTINsResp createGetTIImageKindsByGTINsResp() {
        return new GetTIImageKindsByGTINsResp();
    }

    /**
     * Create an instance of {@link TiImageKinds }
     * 
     * @return
     *     the new instance of {@link TiImageKinds }
     */
    public TiImageKinds createTiImageKinds() {
        return new TiImageKinds();
    }

    /**
     * Create an instance of {@link LoginReq }
     * 
     * @return
     *     the new instance of {@link LoginReq }
     */
    public LoginReq createLoginReq() {
        return new LoginReq();
    }

    /**
     * Create an instance of {@link LoginResp }
     * 
     * @return
     *     the new instance of {@link LoginResp }
     */
    public LoginResp createLoginResp() {
        return new LoginResp();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTimeReq }
     * 
     * @return
     *     the new instance of {@link SearchPartiesByModifiedTimeReq }
     */
    public SearchPartiesByModifiedTimeReq createSearchPartiesByModifiedTimeReq() {
        return new SearchPartiesByModifiedTimeReq();
    }

    /**
     * Create an instance of {@link SearchPartiesByModifiedTimeResp }
     * 
     * @return
     *     the new instance of {@link SearchPartiesByModifiedTimeResp }
     */
    public SearchPartiesByModifiedTimeResp createSearchPartiesByModifiedTimeResp() {
        return new SearchPartiesByModifiedTimeResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "Logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "LogoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByGTIN")
    public JAXBElement<SearchGTINfromDatamarkSystemByGTIN> createSearchGTINfromDatamarkSystemByGTIN(SearchGTINfromDatamarkSystemByGTIN value) {
        return new JAXBElement<>(_SearchGTINfromDatamarkSystemByGTIN_QNAME, SearchGTINfromDatamarkSystemByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByGTINResponse")
    public JAXBElement<SearchGTINfromDatamarkSystemByGTINResponse> createSearchGTINfromDatamarkSystemByGTINResponse(SearchGTINfromDatamarkSystemByGTINResponse value) {
        return new JAXBElement<>(_SearchGTINfromDatamarkSystemByGTINResponse_QNAME, SearchGTINfromDatamarkSystemByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByModifiedTime")
    public JAXBElement<SearchGTINfromDatamarkSystemByModifiedTime> createSearchGTINfromDatamarkSystemByModifiedTime(SearchGTINfromDatamarkSystemByModifiedTime value) {
        return new JAXBElement<>(_SearchGTINfromDatamarkSystemByModifiedTime_QNAME, SearchGTINfromDatamarkSystemByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchGTINfromDatamarkSystemByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchGTINfromDatamarkSystemByModifiedTimeResponse")
    public JAXBElement<SearchGTINfromDatamarkSystemByModifiedTimeResponse> createSearchGTINfromDatamarkSystemByModifiedTimeResponse(SearchGTINfromDatamarkSystemByModifiedTimeResponse value) {
        return new JAXBElement<>(_SearchGTINfromDatamarkSystemByModifiedTimeResponse_QNAME, SearchGTINfromDatamarkSystemByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchPartiesByModifiedTime")
    public JAXBElement<SearchPartiesByModifiedTime> createSearchPartiesByModifiedTime(SearchPartiesByModifiedTime value) {
        return new JAXBElement<>(_SearchPartiesByModifiedTime_QNAME, SearchPartiesByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchPartiesByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchPartiesByModifiedTimeResponse")
    public JAXBElement<SearchPartiesByModifiedTimeResponse> createSearchPartiesByModifiedTimeResponse(SearchPartiesByModifiedTimeResponse value) {
        return new JAXBElement<>(_SearchPartiesByModifiedTimeResponse_QNAME, SearchPartiesByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime> createSearchSimpleTradeitemsByModifiedTime(SearchSimpleTradeitemsByModifiedTime value) {
        return new JAXBElement<>(_SearchSimpleTradeitemsByModifiedTime_QNAME, SearchSimpleTradeitemsByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime2")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime2> createSearchSimpleTradeitemsByModifiedTime2(SearchSimpleTradeitemsByModifiedTime2 value) {
        return new JAXBElement<>(_SearchSimpleTradeitemsByModifiedTime2_QNAME, SearchSimpleTradeitemsByModifiedTime2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime2Response")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime2Response> createSearchSimpleTradeitemsByModifiedTime2Response(SearchSimpleTradeitemsByModifiedTime2Response value) {
        return new JAXBElement<>(_SearchSimpleTradeitemsByModifiedTime2Response_QNAME, SearchSimpleTradeitemsByModifiedTime2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime3")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime3> createSearchSimpleTradeitemsByModifiedTime3(SearchSimpleTradeitemsByModifiedTime3 value) {
        return new JAXBElement<>(_SearchSimpleTradeitemsByModifiedTime3_QNAME, SearchSimpleTradeitemsByModifiedTime3.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTime3Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTime3Response")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTime3Response> createSearchSimpleTradeitemsByModifiedTime3Response(SearchSimpleTradeitemsByModifiedTime3Response value) {
        return new JAXBElement<>(_SearchSimpleTradeitemsByModifiedTime3Response_QNAME, SearchSimpleTradeitemsByModifiedTime3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchSimpleTradeitemsByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchSimpleTradeitemsByModifiedTimeResponse")
    public JAXBElement<SearchSimpleTradeitemsByModifiedTimeResponse> createSearchSimpleTradeitemsByModifiedTimeResponse(SearchSimpleTradeitemsByModifiedTimeResponse value) {
        return new JAXBElement<>(_SearchSimpleTradeitemsByModifiedTimeResponse_QNAME, SearchSimpleTradeitemsByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLN")
    public JAXBElement<SearchTradeitemsByGLN> createSearchTradeitemsByGLN(SearchTradeitemsByGLN value) {
        return new JAXBElement<>(_SearchTradeitemsByGLN_QNAME, SearchTradeitemsByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLNAndModifiedTime")
    public JAXBElement<SearchTradeitemsByGLNAndModifiedTime> createSearchTradeitemsByGLNAndModifiedTime(SearchTradeitemsByGLNAndModifiedTime value) {
        return new JAXBElement<>(_SearchTradeitemsByGLNAndModifiedTime_QNAME, SearchTradeitemsByGLNAndModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNAndModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLNAndModifiedTimeResponse")
    public JAXBElement<SearchTradeitemsByGLNAndModifiedTimeResponse> createSearchTradeitemsByGLNAndModifiedTimeResponse(SearchTradeitemsByGLNAndModifiedTimeResponse value) {
        return new JAXBElement<>(_SearchTradeitemsByGLNAndModifiedTimeResponse_QNAME, SearchTradeitemsByGLNAndModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByGLNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByGLNResponse")
    public JAXBElement<SearchTradeitemsByGLNResponse> createSearchTradeitemsByGLNResponse(SearchTradeitemsByGLNResponse value) {
        return new JAXBElement<>(_SearchTradeitemsByGLNResponse_QNAME, SearchTradeitemsByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByModifiedTime")
    public JAXBElement<SearchTradeitemsByModifiedTime> createSearchTradeitemsByModifiedTime(SearchTradeitemsByModifiedTime value) {
        return new JAXBElement<>(_SearchTradeitemsByModifiedTime_QNAME, SearchTradeitemsByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByModifiedTimeResponse")
    public JAXBElement<SearchTradeitemsByModifiedTimeResponse> createSearchTradeitemsByModifiedTimeResponse(SearchTradeitemsByModifiedTimeResponse value) {
        return new JAXBElement<>(_SearchTradeitemsByModifiedTimeResponse_QNAME, SearchTradeitemsByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByName")
    public JAXBElement<SearchTradeitemsByName> createSearchTradeitemsByName(SearchTradeitemsByName value) {
        return new JAXBElement<>(_SearchTradeitemsByName_QNAME, SearchTradeitemsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByNameResponse")
    public JAXBElement<SearchTradeitemsByNameResponse> createSearchTradeitemsByNameResponse(SearchTradeitemsByNameResponse value) {
        return new JAXBElement<>(_SearchTradeitemsByNameResponse_QNAME, SearchTradeitemsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByOKRB007")
    public JAXBElement<SearchTradeitemsByOKRB007> createSearchTradeitemsByOKRB007(SearchTradeitemsByOKRB007 value) {
        return new JAXBElement<>(_SearchTradeitemsByOKRB007_QNAME, SearchTradeitemsByOKRB007 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByOKRB007Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByOKRB007Response")
    public JAXBElement<SearchTradeitemsByOKRB007Response> createSearchTradeitemsByOKRB007Response(SearchTradeitemsByOKRB007Response value) {
        return new JAXBElement<>(_SearchTradeitemsByOKRB007Response_QNAME, SearchTradeitemsByOKRB007Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVED }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVED }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByTNVED")
    public JAXBElement<SearchTradeitemsByTNVED> createSearchTradeitemsByTNVED(SearchTradeitemsByTNVED value) {
        return new JAXBElement<>(_SearchTradeitemsByTNVED_QNAME, SearchTradeitemsByTNVED.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVEDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchTradeitemsByTNVEDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "SearchTradeitemsByTNVEDResponse")
    public JAXBElement<SearchTradeitemsByTNVEDResponse> createSearchTradeitemsByTNVEDResponse(SearchTradeitemsByTNVEDResponse value) {
        return new JAXBElement<>(_SearchTradeitemsByTNVEDResponse_QNAME, SearchTradeitemsByTNVEDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "cleanTradeitemsOfPoolByDeleteTime")
    public JAXBElement<CleanTradeitemsOfPoolByDeleteTime> createCleanTradeitemsOfPoolByDeleteTime(CleanTradeitemsOfPoolByDeleteTime value) {
        return new JAXBElement<>(_CleanTradeitemsOfPoolByDeleteTime_QNAME, CleanTradeitemsOfPoolByDeleteTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CleanTradeitemsOfPoolByDeleteTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "cleanTradeitemsOfPoolByDeleteTimeResponse")
    public JAXBElement<CleanTradeitemsOfPoolByDeleteTimeResponse> createCleanTradeitemsOfPoolByDeleteTimeResponse(CleanTradeitemsOfPoolByDeleteTimeResponse value) {
        return new JAXBElement<>(_CleanTradeitemsOfPoolByDeleteTimeResponse_QNAME, CleanTradeitemsOfPoolByDeleteTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCheckGTIN29")
    public JAXBElement<GetCheckGTIN29> createGetCheckGTIN29(GetCheckGTIN29 value) {
        return new JAXBElement<>(_GetCheckGTIN29_QNAME, GetCheckGTIN29 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCheckGTIN29Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCheckGTIN29Response")
    public JAXBElement<GetCheckGTIN29Response> createGetCheckGTIN29Response(GetCheckGTIN29Response value) {
        return new JAXBElement<>(_GetCheckGTIN29Response_QNAME, GetCheckGTIN29Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassificator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClassificator }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getClassificator")
    public JAXBElement<GetClassificator> createGetClassificator(GetClassificator value) {
        return new JAXBElement<>(_GetClassificator_QNAME, GetClassificator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassificatorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetClassificatorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getClassificatorResponse")
    public JAXBElement<GetClassificatorResponse> createGetClassificatorResponse(GetClassificatorResponse value) {
        return new JAXBElement<>(_GetClassificatorResponse_QNAME, GetClassificatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCurrentTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCurrentTime")
    public JAXBElement<GetCurrentTime> createGetCurrentTime(GetCurrentTime value) {
        return new JAXBElement<>(_GetCurrentTime_QNAME, GetCurrentTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCurrentTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getCurrentTimeResponse")
    public JAXBElement<GetCurrentTimeResponse> createGetCurrentTimeResponse(GetCurrentTimeResponse value) {
        return new JAXBElement<>(_GetCurrentTimeResponse_QNAME, GetCurrentTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFullPartyByGLN")
    public JAXBElement<GetFullPartyByGLN> createGetFullPartyByGLN(GetFullPartyByGLN value) {
        return new JAXBElement<>(_GetFullPartyByGLN_QNAME, GetFullPartyByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLNResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFullPartyByGLNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFullPartyByGLNResponse")
    public JAXBElement<GetFullPartyByGLNResponse> createGetFullPartyByGLNResponse(GetFullPartyByGLNResponse value) {
        return new JAXBElement<>(_GetFullPartyByGLNResponse_QNAME, GetFullPartyByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTIN")
    public JAXBElement<GetFunctionalnameByGTIN> createGetFunctionalnameByGTIN(GetFunctionalnameByGTIN value) {
        return new JAXBElement<>(_GetFunctionalnameByGTIN_QNAME, GetFunctionalnameByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTIN2")
    public JAXBElement<GetFunctionalnameByGTIN2> createGetFunctionalnameByGTIN2(GetFunctionalnameByGTIN2 value) {
        return new JAXBElement<>(_GetFunctionalnameByGTIN2_QNAME, GetFunctionalnameByGTIN2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTIN2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTIN2Response")
    public JAXBElement<GetFunctionalnameByGTIN2Response> createGetFunctionalnameByGTIN2Response(GetFunctionalnameByGTIN2Response value) {
        return new JAXBElement<>(_GetFunctionalnameByGTIN2Response_QNAME, GetFunctionalnameByGTIN2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFunctionalnameByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getFunctionalnameByGTINResponse")
    public JAXBElement<GetFunctionalnameByGTINResponse> createGetFunctionalnameByGTINResponse(GetFunctionalnameByGTINResponse value) {
        return new JAXBElement<>(_GetFunctionalnameByGTINResponse_QNAME, GetFunctionalnameByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReq }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReq }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderReq")
    public JAXBElement<GetOldHeaderReq> createGetOldHeaderReq(GetOldHeaderReq value) {
        return new JAXBElement<>(_GetOldHeaderReq_QNAME, GetOldHeaderReq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReqResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderReqResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderReqResponse")
    public JAXBElement<GetOldHeaderReqResponse> createGetOldHeaderReqResponse(GetOldHeaderReqResponse value) {
        return new JAXBElement<>(_GetOldHeaderReqResponse_QNAME, GetOldHeaderReqResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderResp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderResp }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderResp")
    public JAXBElement<GetOldHeaderResp> createGetOldHeaderResp(GetOldHeaderResp value) {
        return new JAXBElement<>(_GetOldHeaderResp_QNAME, GetOldHeaderResp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldHeaderRespResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldHeaderRespResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldHeaderRespResponse")
    public JAXBElement<GetOldHeaderRespResponse> createGetOldHeaderRespResponse(GetOldHeaderRespResponse value) {
        return new JAXBElement<>(_GetOldHeaderRespResponse_QNAME, GetOldHeaderRespResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldParty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldParty }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldParty")
    public JAXBElement<GetOldParty> createGetOldParty(GetOldParty value) {
        return new JAXBElement<>(_GetOldParty_QNAME, GetOldParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldPartyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldPartyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldPartyResponse")
    public JAXBElement<GetOldPartyResponse> createGetOldPartyResponse(GetOldPartyResponse value) {
        return new JAXBElement<>(_GetOldPartyResponse_QNAME, GetOldPartyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldTradeitem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldTradeitem }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldTradeitem")
    public JAXBElement<GetOldTradeitem> createGetOldTradeitem(GetOldTradeitem value) {
        return new JAXBElement<>(_GetOldTradeitem_QNAME, GetOldTradeitem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOldTradeitemResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetOldTradeitemResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getOldTradeitemResponse")
    public JAXBElement<GetOldTradeitemResponse> createGetOldTradeitemResponse(GetOldTradeitemResponse value) {
        return new JAXBElement<>(_GetOldTradeitemResponse_QNAME, GetOldTradeitemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByGLN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByGLN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByGLN")
    public JAXBElement<GetPartyByGLN> createGetPartyByGLN(GetPartyByGLN value) {
        return new JAXBElement<>(_GetPartyByGLN_QNAME, GetPartyByGLN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByGLNResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByGLNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByGLNResponse")
    public JAXBElement<GetPartyByGLNResponse> createGetPartyByGLNResponse(GetPartyByGLNResponse value) {
        return new JAXBElement<>(_GetPartyByGLNResponse_QNAME, GetPartyByGLNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByUNP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByUNP }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByUNP")
    public JAXBElement<GetPartyByUNP> createGetPartyByUNP(GetPartyByUNP value) {
        return new JAXBElement<>(_GetPartyByUNP_QNAME, GetPartyByUNP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartyByUNPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPartyByUNPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getPartyByUNPResponse")
    public JAXBElement<GetPartyByUNPResponse> createGetPartyByUNPResponse(GetPartyByUNPResponse value) {
        return new JAXBElement<>(_GetPartyByUNPResponse_QNAME, GetPartyByUNPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getQuotaImportInfo")
    public JAXBElement<GetQuotaImportInfo> createGetQuotaImportInfo(GetQuotaImportInfo value) {
        return new JAXBElement<>(_GetQuotaImportInfo_QNAME, GetQuotaImportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetQuotaImportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getQuotaImportInfoResponse")
    public JAXBElement<GetQuotaImportInfoResponse> createGetQuotaImportInfoResponse(GetQuotaImportInfoResponse value) {
        return new JAXBElement<>(_GetQuotaImportInfoResponse_QNAME, GetQuotaImportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getSimpleTradeitemsByGTIN")
    public JAXBElement<GetSimpleTradeitemsByGTIN> createGetSimpleTradeitemsByGTIN(GetSimpleTradeitemsByGTIN value) {
        return new JAXBElement<>(_GetSimpleTradeitemsByGTIN_QNAME, GetSimpleTradeitemsByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSimpleTradeitemsByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getSimpleTradeitemsByGTINResponse")
    public JAXBElement<GetSimpleTradeitemsByGTINResponse> createGetSimpleTradeitemsByGTINResponse(GetSimpleTradeitemsByGTINResponse value) {
        return new JAXBElement<>(_GetSimpleTradeitemsByGTINResponse_QNAME, GetSimpleTradeitemsByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINs }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTIImageKindsByGTINs")
    public JAXBElement<GetTIImageKindsByGTINs> createGetTIImageKindsByGTINs(GetTIImageKindsByGTINs value) {
        return new JAXBElement<>(_GetTIImageKindsByGTINs_QNAME, GetTIImageKindsByGTINs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTIImageKindsByGTINsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTIImageKindsByGTINsResponse")
    public JAXBElement<GetTIImageKindsByGTINsResponse> createGetTIImageKindsByGTINsResponse(GetTIImageKindsByGTINsResponse value) {
        return new JAXBElement<>(_GetTIImageKindsByGTINsResponse_QNAME, GetTIImageKindsByGTINsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTIN")
    public JAXBElement<GetTradeitemByGTIN> createGetTradeitemByGTIN(GetTradeitemByGTIN value) {
        return new JAXBElement<>(_GetTradeitemByGTIN_QNAME, GetTradeitemByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTINResponse")
    public JAXBElement<GetTradeitemByGTINResponse> createGetTradeitemByGTINResponse(GetTradeitemByGTINResponse value) {
        return new JAXBElement<>(_GetTradeitemByGTINResponse_QNAME, GetTradeitemByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshort }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTINshort")
    public JAXBElement<GetTradeitemByGTINshort> createGetTradeitemByGTINshort(GetTradeitemByGTINshort value) {
        return new JAXBElement<>(_GetTradeitemByGTINshort_QNAME, GetTradeitemByGTINshort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemByGTINshortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemByGTINshortResponse")
    public JAXBElement<GetTradeitemByGTINshortResponse> createGetTradeitemByGTINshortResponse(GetTradeitemByGTINshortResponse value) {
        return new JAXBElement<>(_GetTradeitemByGTINshortResponse_QNAME, GetTradeitemByGTINshortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINs }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINs }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINs")
    public JAXBElement<GetTradeitemsByGTINs> createGetTradeitemsByGTINs(GetTradeitemsByGTINs value) {
        return new JAXBElement<>(_GetTradeitemsByGTINs_QNAME, GetTradeitemsByGTINs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINsResponse")
    public JAXBElement<GetTradeitemsByGTINsResponse> createGetTradeitemsByGTINsResponse(GetTradeitemsByGTINsResponse value) {
        return new JAXBElement<>(_GetTradeitemsByGTINsResponse_QNAME, GetTradeitemsByGTINsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShort }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINsShort")
    public JAXBElement<GetTradeitemsByGTINsShort> createGetTradeitemsByGTINsShort(GetTradeitemsByGTINsShort value) {
        return new JAXBElement<>(_GetTradeitemsByGTINsShort_QNAME, GetTradeitemsByGTINsShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsByGTINsShortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsByGTINsShortResponse")
    public JAXBElement<GetTradeitemsByGTINsShortResponse> createGetTradeitemsByGTINsShortResponse(GetTradeitemsByGTINsShortResponse value) {
        return new JAXBElement<>(_GetTradeitemsByGTINsShortResponse_QNAME, GetTradeitemsByGTINsShortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsOfPoolByModifiedTime")
    public JAXBElement<GetTradeitemsOfPoolByModifiedTime> createGetTradeitemsOfPoolByModifiedTime(GetTradeitemsOfPoolByModifiedTime value) {
        return new JAXBElement<>(_GetTradeitemsOfPoolByModifiedTime_QNAME, GetTradeitemsOfPoolByModifiedTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTimeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTradeitemsOfPoolByModifiedTimeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getTradeitemsOfPoolByModifiedTimeResponse")
    public JAXBElement<GetTradeitemsOfPoolByModifiedTimeResponse> createGetTradeitemsOfPoolByModifiedTimeResponse(GetTradeitemsOfPoolByModifiedTimeResponse value) {
        return new JAXBElement<>(_GetTradeitemsOfPoolByModifiedTimeResponse_QNAME, GetTradeitemsOfPoolByModifiedTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVariantByGTIN }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVariantByGTIN }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getVariantByGTIN")
    public JAXBElement<GetVariantByGTIN> createGetVariantByGTIN(GetVariantByGTIN value) {
        return new JAXBElement<>(_GetVariantByGTIN_QNAME, GetVariantByGTIN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVariantByGTINResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVariantByGTINResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "getVariantByGTINResponse")
    public JAXBElement<GetVariantByGTINResponse> createGetVariantByGTINResponse(GetVariantByGTINResponse value) {
        return new JAXBElement<>(_GetVariantByGTINResponse_QNAME, GetVariantByGTINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tradeitem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tradeitem }{@code >}
     */
    @XmlElementDecl(namespace = "http://globalservice.ws.bept.ids.by/", name = "tradeitem")
    public JAXBElement<Tradeitem> createTradeitem(Tradeitem value) {
        return new JAXBElement<>(_Tradeitem_QNAME, Tradeitem.class, null, value);
    }

}
