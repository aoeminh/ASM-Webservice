
package com.example.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.service package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _CheckClient_QNAME = new QName("http://service.example.com/", "checkClient");
    private final static QName _CheckClientResponse_QNAME = new QName("http://service.example.com/", "checkClientResponse");
    private final static QName _CheckPartner_QNAME = new QName("http://service.example.com/", "checkPartner");
    private final static QName _CheckPartnerResponse_QNAME = new QName("http://service.example.com/", "checkPartnerResponse");
    private final static QName _Client_QNAME = new QName("http://service.example.com/", "client");
    private final static QName _GetPartnerHis_QNAME = new QName("http://service.example.com/", "getPartnerHis");
    private final static QName _GetPartnerHisResponse_QNAME = new QName("http://service.example.com/", "getPartnerHisResponse");
    private final static QName _Hello_QNAME = new QName("http://service.example.com/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://service.example.com/", "helloResponse");
    private final static QName _Partner_QNAME = new QName("http://service.example.com/", "partner");
    private final static QName _PartnerHis_QNAME = new QName("http://service.example.com/", "partnerHis");
    private final static QName _PartnerHisResponse_QNAME = new QName("http://service.example.com/", "partnerHisResponse");
    private final static QName _Partnerhistory_QNAME = new QName("http://service.example.com/", "partnerhistory");
    private final static QName _Test_QNAME = new QName("http://service.example.com/", "test");
    private final static QName _TestResponse_QNAME = new QName("http://service.example.com/", "testResponse");
    private final static QName _UpdateCLientMoney_QNAME = new QName("http://service.example.com/", "updateCLientMoney");
    private final static QName _UpdateCLientMoneyResponse_QNAME = new QName("http://service.example.com/", "updateCLientMoneyResponse");
    private final static QName _UpdatePartnerMoney_QNAME = new QName("http://service.example.com/", "updatePartnerMoney");
    private final static QName _UpdatePartnerMoneyResponse_QNAME = new QName("http://service.example.com/", "updatePartnerMoneyResponse");
    private final static QName _UserHis_QNAME = new QName("http://service.example.com/", "userHis");
    private final static QName _UserHisResponse_QNAME = new QName("http://service.example.com/", "userHisResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckClient }
     * 
     */
    public CheckClient createCheckClient() {
        return new CheckClient();
    }

    /**
     * Create an instance of {@link CheckClientResponse }
     * 
     */
    public CheckClientResponse createCheckClientResponse() {
        return new CheckClientResponse();
    }

    /**
     * Create an instance of {@link CheckPartner }
     * 
     */
    public CheckPartner createCheckPartner() {
        return new CheckPartner();
    }

    /**
     * Create an instance of {@link CheckPartnerResponse }
     * 
     */
    public CheckPartnerResponse createCheckPartnerResponse() {
        return new CheckPartnerResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link GetPartnerHis }
     * 
     */
    public GetPartnerHis createGetPartnerHis() {
        return new GetPartnerHis();
    }

    /**
     * Create an instance of {@link GetPartnerHisResponse }
     * 
     */
    public GetPartnerHisResponse createGetPartnerHisResponse() {
        return new GetPartnerHisResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Partner }
     * 
     */
    public Partner createPartner() {
        return new Partner();
    }

    /**
     * Create an instance of {@link PartnerHis }
     * 
     */
    public PartnerHis createPartnerHis() {
        return new PartnerHis();
    }

    /**
     * Create an instance of {@link PartnerHisResponse }
     * 
     */
    public PartnerHisResponse createPartnerHisResponse() {
        return new PartnerHisResponse();
    }

    /**
     * Create an instance of {@link Partnerhistory }
     * 
     */
    public Partnerhistory createPartnerhistory() {
        return new Partnerhistory();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link UpdateCLientMoney }
     * 
     */
    public UpdateCLientMoney createUpdateCLientMoney() {
        return new UpdateCLientMoney();
    }

    /**
     * Create an instance of {@link UpdateCLientMoneyResponse }
     * 
     */
    public UpdateCLientMoneyResponse createUpdateCLientMoneyResponse() {
        return new UpdateCLientMoneyResponse();
    }

    /**
     * Create an instance of {@link UpdatePartnerMoney }
     * 
     */
    public UpdatePartnerMoney createUpdatePartnerMoney() {
        return new UpdatePartnerMoney();
    }

    /**
     * Create an instance of {@link UpdatePartnerMoneyResponse }
     * 
     */
    public UpdatePartnerMoneyResponse createUpdatePartnerMoneyResponse() {
        return new UpdatePartnerMoneyResponse();
    }

    /**
     * Create an instance of {@link UserHis }
     * 
     */
    public UserHis createUserHis() {
        return new UserHis();
    }

    /**
     * Create an instance of {@link UserHisResponse }
     * 
     */
    public UserHisResponse createUserHisResponse() {
        return new UserHisResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "checkClient")
    public JAXBElement<CheckClient> createCheckClient(CheckClient value) {
        return new JAXBElement<CheckClient>(_CheckClient_QNAME, CheckClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "checkClientResponse")
    public JAXBElement<CheckClientResponse> createCheckClientResponse(CheckClientResponse value) {
        return new JAXBElement<CheckClientResponse>(_CheckClientResponse_QNAME, CheckClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "checkPartner")
    public JAXBElement<CheckPartner> createCheckPartner(CheckPartner value) {
        return new JAXBElement<CheckPartner>(_CheckPartner_QNAME, CheckPartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPartnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "checkPartnerResponse")
    public JAXBElement<CheckPartnerResponse> createCheckPartnerResponse(CheckPartnerResponse value) {
        return new JAXBElement<CheckPartnerResponse>(_CheckPartnerResponse_QNAME, CheckPartnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnerHis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "getPartnerHis")
    public JAXBElement<GetPartnerHis> createGetPartnerHis(GetPartnerHis value) {
        return new JAXBElement<GetPartnerHis>(_GetPartnerHis_QNAME, GetPartnerHis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPartnerHisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "getPartnerHisResponse")
    public JAXBElement<GetPartnerHisResponse> createGetPartnerHisResponse(GetPartnerHisResponse value) {
        return new JAXBElement<GetPartnerHisResponse>(_GetPartnerHisResponse_QNAME, GetPartnerHisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Partner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "partner")
    public JAXBElement<Partner> createPartner(Partner value) {
        return new JAXBElement<Partner>(_Partner_QNAME, Partner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerHis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "partnerHis")
    public JAXBElement<PartnerHis> createPartnerHis(PartnerHis value) {
        return new JAXBElement<PartnerHis>(_PartnerHis_QNAME, PartnerHis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerHisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "partnerHisResponse")
    public JAXBElement<PartnerHisResponse> createPartnerHisResponse(PartnerHisResponse value) {
        return new JAXBElement<PartnerHisResponse>(_PartnerHisResponse_QNAME, PartnerHisResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Partnerhistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "partnerhistory")
    public JAXBElement<Partnerhistory> createPartnerhistory(Partnerhistory value) {
        return new JAXBElement<Partnerhistory>(_Partnerhistory_QNAME, Partnerhistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCLientMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "updateCLientMoney")
    public JAXBElement<UpdateCLientMoney> createUpdateCLientMoney(UpdateCLientMoney value) {
        return new JAXBElement<UpdateCLientMoney>(_UpdateCLientMoney_QNAME, UpdateCLientMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCLientMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "updateCLientMoneyResponse")
    public JAXBElement<UpdateCLientMoneyResponse> createUpdateCLientMoneyResponse(UpdateCLientMoneyResponse value) {
        return new JAXBElement<UpdateCLientMoneyResponse>(_UpdateCLientMoneyResponse_QNAME, UpdateCLientMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartnerMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "updatePartnerMoney")
    public JAXBElement<UpdatePartnerMoney> createUpdatePartnerMoney(UpdatePartnerMoney value) {
        return new JAXBElement<UpdatePartnerMoney>(_UpdatePartnerMoney_QNAME, UpdatePartnerMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePartnerMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "updatePartnerMoneyResponse")
    public JAXBElement<UpdatePartnerMoneyResponse> createUpdatePartnerMoneyResponse(UpdatePartnerMoneyResponse value) {
        return new JAXBElement<UpdatePartnerMoneyResponse>(_UpdatePartnerMoneyResponse_QNAME, UpdatePartnerMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserHis }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "userHis")
    public JAXBElement<UserHis> createUserHis(UserHis value) {
        return new JAXBElement<UserHis>(_UserHis_QNAME, UserHis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserHisResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.example.com/", name = "userHisResponse")
    public JAXBElement<UserHisResponse> createUserHisResponse(UserHisResponse value) {
        return new JAXBElement<UserHisResponse>(_UserHisResponse_QNAME, UserHisResponse.class, null, value);
    }

}
