
package org.example.standalone.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClusterVmWebService", targetNamespace = "http://service.standalone.example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClusterVmWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.example.standalone.service.ClusterVm>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getClusterVms", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.GetClusterVms")
    @ResponseWrapper(localName = "getClusterVmsResponse", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.GetClusterVmsResponse")
    @Action(input = "http://service.standalone.example.org/ClusterVmWebService/getClusterVmsRequest", output = "http://service.standalone.example.org/ClusterVmWebService/getClusterVmsResponse")
    public List<ClusterVm> getClusterVms(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Filter> arg0);

    /**
     * 
     * @param id
     * @return
     *     returns org.example.standalone.service.QueryStatus
     * @throws NotFoundError
     * @throws ValidationError
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteClusterVm", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.DeleteClusterVm")
    @ResponseWrapper(localName = "deleteClusterVmResponse", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.DeleteClusterVmResponse")
    @Action(input = "http://service.standalone.example.org/ClusterVmWebService/deleteClusterVmRequest", output = "http://service.standalone.example.org/ClusterVmWebService/deleteClusterVmResponse", fault = {
        @FaultAction(className = ValidationError.class, value = "http://service.standalone.example.org/ClusterVmWebService/deleteClusterVm/Fault/ValidationError"),
        @FaultAction(className = NotFoundError.class, value = "http://service.standalone.example.org/ClusterVmWebService/deleteClusterVm/Fault/NotFoundError")
    })
    public QueryStatus deleteClusterVm(
        @WebParam(name = "id", targetNamespace = "")
        String id)
        throws NotFoundError, ValidationError
    ;

    /**
     * 
     * @param image
     * @param memory
     * @param vmid
     * @param name
     * @param cpu
     * @return
     *     returns java.lang.String
     * @throws DuplicateError
     * @throws ValidationError
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createClusterVm", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.CreateClusterVm")
    @ResponseWrapper(localName = "createClusterVmResponse", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.CreateClusterVmResponse")
    @Action(input = "http://service.standalone.example.org/ClusterVmWebService/createClusterVmRequest", output = "http://service.standalone.example.org/ClusterVmWebService/createClusterVmResponse", fault = {
        @FaultAction(className = ValidationError.class, value = "http://service.standalone.example.org/ClusterVmWebService/createClusterVm/Fault/ValidationError"),
        @FaultAction(className = DuplicateError.class, value = "http://service.standalone.example.org/ClusterVmWebService/createClusterVm/Fault/DuplicateError")
    })
    public String createClusterVm(
        @WebParam(name = "vmid", targetNamespace = "")
        Long vmid,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "image", targetNamespace = "")
        String image,
        @WebParam(name = "cpu", targetNamespace = "")
        Integer cpu,
        @WebParam(name = "memory", targetNamespace = "")
        Integer memory)
        throws DuplicateError, ValidationError
    ;

    /**
     * 
     * @param image
     * @param memory
     * @param vmid
     * @param name
     * @param cpu
     * @param id
     * @return
     *     returns org.example.standalone.service.QueryStatus
     * @throws DuplicateError
     * @throws NotFoundError
     * @throws ValidationError
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateClusterVm", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.UpdateClusterVm")
    @ResponseWrapper(localName = "updateClusterVmResponse", targetNamespace = "http://service.standalone.example.org/", className = "org.example.standalone.service.UpdateClusterVmResponse")
    @Action(input = "http://service.standalone.example.org/ClusterVmWebService/updateClusterVmRequest", output = "http://service.standalone.example.org/ClusterVmWebService/updateClusterVmResponse", fault = {
        @FaultAction(className = NotFoundError.class, value = "http://service.standalone.example.org/ClusterVmWebService/updateClusterVm/Fault/NotFoundError"),
        @FaultAction(className = ValidationError.class, value = "http://service.standalone.example.org/ClusterVmWebService/updateClusterVm/Fault/ValidationError"),
        @FaultAction(className = DuplicateError.class, value = "http://service.standalone.example.org/ClusterVmWebService/updateClusterVm/Fault/DuplicateError")
    })
    public QueryStatus updateClusterVm(
        @WebParam(name = "id", targetNamespace = "")
        String id,
        @WebParam(name = "vmid", targetNamespace = "")
        Long vmid,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "image", targetNamespace = "")
        String image,
        @WebParam(name = "cpu", targetNamespace = "")
        Integer cpu,
        @WebParam(name = "memory", targetNamespace = "")
        Integer memory)
        throws DuplicateError, NotFoundError, ValidationError
    ;

}
