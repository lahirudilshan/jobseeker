
package dblayer;

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
@WebService(name = "DBService", targetNamespace = "http://DBLayer/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DBService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://DBLayer/", className = "dblayer.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://DBLayer/", className = "dblayer.HelloResponse")
    @Action(input = "http://DBLayer/DBService/helloRequest", output = "http://DBLayer/DBService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
