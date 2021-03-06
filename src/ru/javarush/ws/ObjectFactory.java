
package ru.javarush.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.javarush.ws package. 
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

    private final static QName _GetHelloString_QNAME = new QName("http://ws.javarush.ru/", "getHelloString");
    private final static QName _GetHelloStringResponse_QNAME = new QName("http://ws.javarush.ru/", "getHelloStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.javarush.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloString }
     * 
     */
    public GetHelloString createGetHelloString() {
        return new GetHelloString();
    }

    /**
     * Create an instance of {@link GetHelloStringResponse }
     * 
     */
    public GetHelloStringResponse createGetHelloStringResponse() {
        return new GetHelloStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.javarush.ru/", name = "getHelloString")
    public JAXBElement<GetHelloString> createGetHelloString(GetHelloString value) {
        return new JAXBElement<GetHelloString>(_GetHelloString_QNAME, GetHelloString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.javarush.ru/", name = "getHelloStringResponse")
    public JAXBElement<GetHelloStringResponse> createGetHelloStringResponse(GetHelloStringResponse value) {
        return new JAXBElement<GetHelloStringResponse>(_GetHelloStringResponse_QNAME, GetHelloStringResponse.class, null, value);
    }

}
