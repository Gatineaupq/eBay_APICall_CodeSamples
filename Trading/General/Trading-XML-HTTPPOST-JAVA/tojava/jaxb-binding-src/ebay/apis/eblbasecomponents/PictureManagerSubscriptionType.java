//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Describes one type of Picture Manager subscription that is available.
 * 			
 * 
 * <p>Java class for PictureManagerSubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureManagerSubscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionLevel" type="{urn:ebay:apis:eBLBaseComponents}PictureManagerSubscriptionLevelCodeType" minOccurs="0"/>
 *         &lt;element name="Fee" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="StorageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureManagerSubscriptionType", propOrder = {
    "subscriptionLevel",
    "fee",
    "storageSize"
})
public class PictureManagerSubscriptionType {

    @XmlElement(name = "SubscriptionLevel")
    protected PictureManagerSubscriptionLevelCodeType subscriptionLevel;
    @XmlElement(name = "Fee")
    protected AmountType fee;
    @XmlElement(name = "StorageSize")
    protected Integer storageSize;

    /**
     * Gets the value of the subscriptionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PictureManagerSubscriptionLevelCodeType }
     *     
     */
    public PictureManagerSubscriptionLevelCodeType getSubscriptionLevel() {
        return subscriptionLevel;
    }

    /**
     * Sets the value of the subscriptionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureManagerSubscriptionLevelCodeType }
     *     
     */
    public void setSubscriptionLevel(PictureManagerSubscriptionLevelCodeType value) {
        this.subscriptionLevel = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFee(AmountType value) {
        this.fee = value;
    }

    /**
     * Gets the value of the storageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStorageSize() {
        return storageSize;
    }

    /**
     * Sets the value of the storageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStorageSize(Integer value) {
        this.storageSize = value;
    }

}
