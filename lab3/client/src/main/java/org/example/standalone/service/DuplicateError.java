
package org.example.standalone.service;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DuplicateError", targetNamespace = "http://service.standalone.example.org/")
public class DuplicateError
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DuplicateErrorFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DuplicateError(String message, DuplicateErrorFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DuplicateError(String message, DuplicateErrorFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.standalone.service.DuplicateErrorFault
     */
    public DuplicateErrorFault getFaultInfo() {
        return faultInfo;
    }

}