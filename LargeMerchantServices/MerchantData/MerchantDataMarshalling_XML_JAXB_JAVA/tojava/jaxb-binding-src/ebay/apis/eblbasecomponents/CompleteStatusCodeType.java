//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 06:08:42 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompleteStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompleteStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Incomplete"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Pending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompleteStatusCodeType")
@XmlEnum
public enum CompleteStatusCodeType {


    /**
     * 
     * 						The order is incomplete. Generally speaking, an order is incomplete when payment
     * 						from the buyer has yet to be initiated.
     * 					
     * 
     */
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),

    /**
     * 
     * 						The order is complete. Generally speaking, an order is complete when payment
     * 						from the buyer has been initiated and processed.
     * 						<br><br>
     * 						<b>Note</b>: If the <b>PaymentMethodUsed</b> is 'CashOnPickup',
     * 						the <b>CheckoutStatus.Status</b> value in <b>GetOrders</b> will be 
     * 						'Complete' right at Checkout, even though the seller may not have been officially paid
     * 						yet. The <b>CheckoutStatus.Status</b> value in <b>GetOrders</b> will 
     * 						remain as 'Complete' even if the seller uses <b>ReviseCheckoutStatus</b> to 
     * 						change the checkout status to Pending. However, the <b>eBayPaymentStatus</b> 
     * 						value in <b>GetOrders</b> will change from 'NoPaymentFailure' to 
     * 						'PaymentInProcess'.
     * 					
     * 
     */
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * 
     * 						The order is pending. Generally speaking, an order is pending when payment
     * 						from the buyer has been initiated but has yet to be fully processed.
     * 						<br><br>
     * 						<b>Note</b>: If the PaymentMethod is CashOnPickup, the
     * 						CheckoutStatus.Status value in GetOrders will read Complete right at Checkout,
     * 						even though the seller may not have been officially paid yet. The
     * 						CheckoutStatus.Status value in GetOrders will remain as Complete even if the
     * 						seller uses ReviseCheckoutStatus to change the checkout status to Pending.
     * 						However, the eBayPaymentStatus value in GetOrders will change from
     * 						NoPaymentFailure to PaymentInProcess.
     * 					
     * 
     */
    @XmlEnumValue("Pending")
    PENDING("Pending"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CompleteStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompleteStatusCodeType fromValue(String v) {
        for (CompleteStatusCodeType c: CompleteStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}