/**
 * ObjectDoesNotExist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zeus.soap.zxtm._1_0;


/**
 * The ObjectDoesNotExist fault is raised when attempting to perform
 * an
 *              operation on an object (such as Virtual Server) that
 * doesn't exist.
 *          
 *              This fault will only be raised if the primary object
 * in the call doesn't
 *              exist. For example if calling VirtualServer.setPool(),
 * then
 *              this fault will be raised if the Virtual Server doesn't
 * exist, but if
 *              the Pool doesn't exist then the "InvalidInput" fault
 * will be raised.
 */
public class ObjectDoesNotExist  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    /* A human readable string describing the error */
    private java.lang.String errmsg;

    /* The name of the object that caused the fault */
    private java.lang.String object;

    public ObjectDoesNotExist() {
    }

    public ObjectDoesNotExist(
           java.lang.String errmsg,
           java.lang.String object) {
        this.errmsg = errmsg;
        this.object = object;
    }


    /**
     * Gets the errmsg value for this ObjectDoesNotExist.
     * 
     * @return errmsg   * A human readable string describing the error
     */
    public java.lang.String getErrmsg() {
        return errmsg;
    }


    /**
     * Sets the errmsg value for this ObjectDoesNotExist.
     * 
     * @param errmsg   * A human readable string describing the error
     */
    public void setErrmsg(java.lang.String errmsg) {
        this.errmsg = errmsg;
    }


    /**
     * Gets the object value for this ObjectDoesNotExist.
     * 
     * @return object   * The name of the object that caused the fault
     */
    public java.lang.String getObject() {
        return object;
    }


    /**
     * Sets the object value for this ObjectDoesNotExist.
     * 
     * @param object   * The name of the object that caused the fault
     */
    public void setObject(java.lang.String object) {
        this.object = object;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectDoesNotExist)) return false;
        ObjectDoesNotExist other = (ObjectDoesNotExist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errmsg==null && other.getErrmsg()==null) || 
             (this.errmsg!=null &&
              this.errmsg.equals(other.getErrmsg()))) &&
            ((this.object==null && other.getObject()==null) || 
             (this.object!=null &&
              this.object.equals(other.getObject())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErrmsg() != null) {
            _hashCode += getErrmsg().hashCode();
        }
        if (getObject() != null) {
            _hashCode += getObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObjectDoesNotExist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.zeus.com/zxtm/1.0/", "ObjectDoesNotExist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errmsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errmsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object");
        elemField.setXmlName(new javax.xml.namespace.QName("", "object"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
