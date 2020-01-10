/*
 * XML Type:  AD.NPfIT.CodedCountry
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML AD.NPfIT.CodedCountry(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class ADNPfITCodedCountryImpl extends uk.nhs.connect.iucds.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry
{
    private static final long serialVersionUID = 1L;
    
    public ADNPfITCodedCountryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIMITER$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "delimiter");
    private static final javax.xml.namespace.QName COUNTRY$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "country");
    private static final javax.xml.namespace.QName STATE$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "state");
    private static final javax.xml.namespace.QName COUNTY$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "county");
    private static final javax.xml.namespace.QName CITY$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "city");
    private static final javax.xml.namespace.QName POSTALCODE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "postalCode");
    private static final javax.xml.namespace.QName STREETADDRESSLINE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetAddressLine");
    private static final javax.xml.namespace.QName HOUSENUMBER$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "houseNumber");
    private static final javax.xml.namespace.QName HOUSENUMBERNUMERIC$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "houseNumberNumeric");
    private static final javax.xml.namespace.QName DIRECTION$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "direction");
    private static final javax.xml.namespace.QName STREETNAME$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetName");
    private static final javax.xml.namespace.QName STREETNAMEBASE$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetNameBase");
    private static final javax.xml.namespace.QName STREETNAMETYPE$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetNameType");
    private static final javax.xml.namespace.QName ADDITIONALLOCATOR$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "additionalLocator");
    private static final javax.xml.namespace.QName UNITID$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "unitID");
    private static final javax.xml.namespace.QName UNITTYPE$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "unitType");
    private static final javax.xml.namespace.QName CARRIER$32 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "carrier");
    private static final javax.xml.namespace.QName CENSUSTRACT$34 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "censusTract");
    private static final javax.xml.namespace.QName ADDRESSKEY$36 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "addressKey");
    private static final javax.xml.namespace.QName DESC$38 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "desc");
    private static final javax.xml.namespace.QName USEABLEPERIOD$40 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "useablePeriod");
    private static final javax.xml.namespace.QName ID$42 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName USE$44 = 
        new javax.xml.namespace.QName("", "use");
    private static final javax.xml.namespace.QName ISNOTORDERED$46 = 
        new javax.xml.namespace.QName("", "isNotOrdered");
    
    
    /**
     * Gets array of all "delimiter" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter[] getDelimiterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIMITER$0, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "delimiter" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter getDelimiterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter)get_store().find_element_user(DELIMITER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "delimiter" element
     */
    public int sizeOfDelimiterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIMITER$0);
        }
    }
    
    /**
     * Sets array of all "delimiter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDelimiterArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter[] delimiterArray)
    {
        check_orphaned();
        arraySetterHelper(delimiterArray, DELIMITER$0);
    }
    
    /**
     * Sets ith "delimiter" element
     */
    public void setDelimiterArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter delimiter)
    {
        generatedSetterHelperImpl(delimiter, DELIMITER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delimiter" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter insertNewDelimiter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter)get_store().insert_element_user(DELIMITER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delimiter" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter addNewDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter)get_store().add_element_user(DELIMITER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "delimiter" element
     */
    public void removeDelimiter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIMITER$0, i);
        }
    }
    
    /**
     * Gets array of all "country" elements
     */
    public uk.nhs.connect.iucds.ucr.ADXPNPfITCoded[] getCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COUNTRY$2, targetList);
            uk.nhs.connect.iucds.ucr.ADXPNPfITCoded[] result = new uk.nhs.connect.iucds.ucr.ADXPNPfITCoded[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "country" element
     */
    public uk.nhs.connect.iucds.ucr.ADXPNPfITCoded getCountryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADXPNPfITCoded target = null;
            target = (uk.nhs.connect.iucds.ucr.ADXPNPfITCoded)get_store().find_element_user(COUNTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "country" element
     */
    public int sizeOfCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$2);
        }
    }
    
    /**
     * Sets array of all "country" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCountryArray(uk.nhs.connect.iucds.ucr.ADXPNPfITCoded[] countryArray)
    {
        check_orphaned();
        arraySetterHelper(countryArray, COUNTRY$2);
    }
    
    /**
     * Sets ith "country" element
     */
    public void setCountryArray(int i, uk.nhs.connect.iucds.ucr.ADXPNPfITCoded country)
    {
        generatedSetterHelperImpl(country, COUNTRY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "country" element
     */
    public uk.nhs.connect.iucds.ucr.ADXPNPfITCoded insertNewCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADXPNPfITCoded target = null;
            target = (uk.nhs.connect.iucds.ucr.ADXPNPfITCoded)get_store().insert_element_user(COUNTRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "country" element
     */
    public uk.nhs.connect.iucds.ucr.ADXPNPfITCoded addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADXPNPfITCoded target = null;
            target = (uk.nhs.connect.iucds.ucr.ADXPNPfITCoded)get_store().add_element_user(COUNTRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "country" element
     */
    public void removeCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$2, i);
        }
    }
    
    /**
     * Gets array of all "state" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State[] getStateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATE$4, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "state" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State getStateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State)get_store().find_element_user(STATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "state" element
     */
    public int sizeOfStateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$4);
        }
    }
    
    /**
     * Sets array of all "state" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStateArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State[] stateArray)
    {
        check_orphaned();
        arraySetterHelper(stateArray, STATE$4);
    }
    
    /**
     * Sets ith "state" element
     */
    public void setStateArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State state)
    {
        generatedSetterHelperImpl(state, STATE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "state" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State insertNewState(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State)get_store().insert_element_user(STATE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "state" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State addNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State)get_store().add_element_user(STATE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "state" element
     */
    public void removeState(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$4, i);
        }
    }
    
    /**
     * Gets array of all "county" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County[] getCountyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COUNTY$6, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "county" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County getCountyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County)get_store().find_element_user(COUNTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "county" element
     */
    public int sizeOfCountyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTY$6);
        }
    }
    
    /**
     * Sets array of all "county" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCountyArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County[] countyArray)
    {
        check_orphaned();
        arraySetterHelper(countyArray, COUNTY$6);
    }
    
    /**
     * Sets ith "county" element
     */
    public void setCountyArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County county)
    {
        generatedSetterHelperImpl(county, COUNTY$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "county" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County insertNewCounty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County)get_store().insert_element_user(COUNTY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "county" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County addNewCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County)get_store().add_element_user(COUNTY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "county" element
     */
    public void removeCounty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTY$6, i);
        }
    }
    
    /**
     * Gets array of all "city" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City[] getCityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITY$8, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "city" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City getCityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City)get_store().find_element_user(CITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "city" element
     */
    public int sizeOfCityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$8);
        }
    }
    
    /**
     * Sets array of all "city" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCityArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City[] cityArray)
    {
        check_orphaned();
        arraySetterHelper(cityArray, CITY$8);
    }
    
    /**
     * Sets ith "city" element
     */
    public void setCityArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City city)
    {
        generatedSetterHelperImpl(city, CITY$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "city" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City insertNewCity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City)get_store().insert_element_user(CITY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "city" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City addNewCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City)get_store().add_element_user(CITY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "city" element
     */
    public void removeCity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$8, i);
        }
    }
    
    /**
     * Gets array of all "postalCode" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode[] getPostalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POSTALCODE$10, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "postalCode" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode getPostalCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode)get_store().find_element_user(POSTALCODE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "postalCode" element
     */
    public int sizeOfPostalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALCODE$10);
        }
    }
    
    /**
     * Sets array of all "postalCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPostalCodeArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode[] postalCodeArray)
    {
        check_orphaned();
        arraySetterHelper(postalCodeArray, POSTALCODE$10);
    }
    
    /**
     * Sets ith "postalCode" element
     */
    public void setPostalCodeArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode postalCode)
    {
        generatedSetterHelperImpl(postalCode, POSTALCODE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postalCode" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode insertNewPostalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode)get_store().insert_element_user(POSTALCODE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postalCode" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode addNewPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode)get_store().add_element_user(POSTALCODE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "postalCode" element
     */
    public void removePostalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALCODE$10, i);
        }
    }
    
    /**
     * Gets array of all "streetAddressLine" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine[] getStreetAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETADDRESSLINE$12, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetAddressLine" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine getStreetAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine)get_store().find_element_user(STREETADDRESSLINE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetAddressLine" element
     */
    public int sizeOfStreetAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETADDRESSLINE$12);
        }
    }
    
    /**
     * Sets array of all "streetAddressLine" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStreetAddressLineArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine[] streetAddressLineArray)
    {
        check_orphaned();
        arraySetterHelper(streetAddressLineArray, STREETADDRESSLINE$12);
    }
    
    /**
     * Sets ith "streetAddressLine" element
     */
    public void setStreetAddressLineArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine streetAddressLine)
    {
        generatedSetterHelperImpl(streetAddressLine, STREETADDRESSLINE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetAddressLine" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine insertNewStreetAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine)get_store().insert_element_user(STREETADDRESSLINE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetAddressLine" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine addNewStreetAddressLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine)get_store().add_element_user(STREETADDRESSLINE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetAddressLine" element
     */
    public void removeStreetAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETADDRESSLINE$12, i);
        }
    }
    
    /**
     * Gets array of all "houseNumber" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber[] getHouseNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOUSENUMBER$14, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "houseNumber" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber getHouseNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber)get_store().find_element_user(HOUSENUMBER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "houseNumber" element
     */
    public int sizeOfHouseNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOUSENUMBER$14);
        }
    }
    
    /**
     * Sets array of all "houseNumber" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setHouseNumberArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber[] houseNumberArray)
    {
        check_orphaned();
        arraySetterHelper(houseNumberArray, HOUSENUMBER$14);
    }
    
    /**
     * Sets ith "houseNumber" element
     */
    public void setHouseNumberArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber houseNumber)
    {
        generatedSetterHelperImpl(houseNumber, HOUSENUMBER$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "houseNumber" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber insertNewHouseNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber)get_store().insert_element_user(HOUSENUMBER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "houseNumber" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber addNewHouseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber)get_store().add_element_user(HOUSENUMBER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "houseNumber" element
     */
    public void removeHouseNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOUSENUMBER$14, i);
        }
    }
    
    /**
     * Gets array of all "houseNumberNumeric" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric[] getHouseNumberNumericArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOUSENUMBERNUMERIC$16, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "houseNumberNumeric" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric getHouseNumberNumericArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric)get_store().find_element_user(HOUSENUMBERNUMERIC$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "houseNumberNumeric" element
     */
    public int sizeOfHouseNumberNumericArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOUSENUMBERNUMERIC$16);
        }
    }
    
    /**
     * Sets array of all "houseNumberNumeric" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setHouseNumberNumericArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric[] houseNumberNumericArray)
    {
        check_orphaned();
        arraySetterHelper(houseNumberNumericArray, HOUSENUMBERNUMERIC$16);
    }
    
    /**
     * Sets ith "houseNumberNumeric" element
     */
    public void setHouseNumberNumericArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric houseNumberNumeric)
    {
        generatedSetterHelperImpl(houseNumberNumeric, HOUSENUMBERNUMERIC$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "houseNumberNumeric" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric insertNewHouseNumberNumeric(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric)get_store().insert_element_user(HOUSENUMBERNUMERIC$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "houseNumberNumeric" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric addNewHouseNumberNumeric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric)get_store().add_element_user(HOUSENUMBERNUMERIC$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "houseNumberNumeric" element
     */
    public void removeHouseNumberNumeric(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOUSENUMBERNUMERIC$16, i);
        }
    }
    
    /**
     * Gets array of all "direction" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction[] getDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTION$18, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "direction" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction getDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction)get_store().find_element_user(DIRECTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "direction" element
     */
    public int sizeOfDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTION$18);
        }
    }
    
    /**
     * Sets array of all "direction" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDirectionArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction[] directionArray)
    {
        check_orphaned();
        arraySetterHelper(directionArray, DIRECTION$18);
    }
    
    /**
     * Sets ith "direction" element
     */
    public void setDirectionArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction direction)
    {
        generatedSetterHelperImpl(direction, DIRECTION$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "direction" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction insertNewDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction)get_store().insert_element_user(DIRECTION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "direction" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction addNewDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction)get_store().add_element_user(DIRECTION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "direction" element
     */
    public void removeDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTION$18, i);
        }
    }
    
    /**
     * Gets array of all "streetName" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName[] getStreetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNAME$20, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetName" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName getStreetNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName)get_store().find_element_user(STREETNAME$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetName" element
     */
    public int sizeOfStreetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAME$20);
        }
    }
    
    /**
     * Sets array of all "streetName" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStreetNameArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName[] streetNameArray)
    {
        check_orphaned();
        arraySetterHelper(streetNameArray, STREETNAME$20);
    }
    
    /**
     * Sets ith "streetName" element
     */
    public void setStreetNameArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName streetName)
    {
        generatedSetterHelperImpl(streetName, STREETNAME$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetName" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName insertNewStreetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName)get_store().insert_element_user(STREETNAME$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetName" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName addNewStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName)get_store().add_element_user(STREETNAME$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetName" element
     */
    public void removeStreetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAME$20, i);
        }
    }
    
    /**
     * Gets array of all "streetNameBase" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase[] getStreetNameBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNAMEBASE$22, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetNameBase" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase getStreetNameBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase)get_store().find_element_user(STREETNAMEBASE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetNameBase" element
     */
    public int sizeOfStreetNameBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAMEBASE$22);
        }
    }
    
    /**
     * Sets array of all "streetNameBase" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStreetNameBaseArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase[] streetNameBaseArray)
    {
        check_orphaned();
        arraySetterHelper(streetNameBaseArray, STREETNAMEBASE$22);
    }
    
    /**
     * Sets ith "streetNameBase" element
     */
    public void setStreetNameBaseArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase streetNameBase)
    {
        generatedSetterHelperImpl(streetNameBase, STREETNAMEBASE$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetNameBase" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase insertNewStreetNameBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase)get_store().insert_element_user(STREETNAMEBASE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetNameBase" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase addNewStreetNameBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase)get_store().add_element_user(STREETNAMEBASE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetNameBase" element
     */
    public void removeStreetNameBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAMEBASE$22, i);
        }
    }
    
    /**
     * Gets array of all "streetNameType" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType[] getStreetNameTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNAMETYPE$24, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetNameType" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType getStreetNameTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType)get_store().find_element_user(STREETNAMETYPE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetNameType" element
     */
    public int sizeOfStreetNameTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAMETYPE$24);
        }
    }
    
    /**
     * Sets array of all "streetNameType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setStreetNameTypeArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType[] streetNameTypeArray)
    {
        check_orphaned();
        arraySetterHelper(streetNameTypeArray, STREETNAMETYPE$24);
    }
    
    /**
     * Sets ith "streetNameType" element
     */
    public void setStreetNameTypeArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType streetNameType)
    {
        generatedSetterHelperImpl(streetNameType, STREETNAMETYPE$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetNameType" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType insertNewStreetNameType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType)get_store().insert_element_user(STREETNAMETYPE$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetNameType" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType addNewStreetNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType)get_store().add_element_user(STREETNAMETYPE$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetNameType" element
     */
    public void removeStreetNameType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAMETYPE$24, i);
        }
    }
    
    /**
     * Gets array of all "additionalLocator" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator[] getAdditionalLocatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALLOCATOR$26, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalLocator" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator getAdditionalLocatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator)get_store().find_element_user(ADDITIONALLOCATOR$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalLocator" element
     */
    public int sizeOfAdditionalLocatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALLOCATOR$26);
        }
    }
    
    /**
     * Sets array of all "additionalLocator" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAdditionalLocatorArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator[] additionalLocatorArray)
    {
        check_orphaned();
        arraySetterHelper(additionalLocatorArray, ADDITIONALLOCATOR$26);
    }
    
    /**
     * Sets ith "additionalLocator" element
     */
    public void setAdditionalLocatorArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator additionalLocator)
    {
        generatedSetterHelperImpl(additionalLocator, ADDITIONALLOCATOR$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalLocator" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator insertNewAdditionalLocator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator)get_store().insert_element_user(ADDITIONALLOCATOR$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalLocator" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator addNewAdditionalLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator)get_store().add_element_user(ADDITIONALLOCATOR$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalLocator" element
     */
    public void removeAdditionalLocator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALLOCATOR$26, i);
        }
    }
    
    /**
     * Gets array of all "unitID" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID[] getUnitIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNITID$28, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unitID" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID getUnitIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID)get_store().find_element_user(UNITID$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "unitID" element
     */
    public int sizeOfUnitIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITID$28);
        }
    }
    
    /**
     * Sets array of all "unitID" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUnitIDArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID[] unitIDArray)
    {
        check_orphaned();
        arraySetterHelper(unitIDArray, UNITID$28);
    }
    
    /**
     * Sets ith "unitID" element
     */
    public void setUnitIDArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID unitID)
    {
        generatedSetterHelperImpl(unitID, UNITID$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitID" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID insertNewUnitID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID)get_store().insert_element_user(UNITID$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitID" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID addNewUnitID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID)get_store().add_element_user(UNITID$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "unitID" element
     */
    public void removeUnitID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITID$28, i);
        }
    }
    
    /**
     * Gets array of all "unitType" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType[] getUnitTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNITTYPE$30, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unitType" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType getUnitTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType)get_store().find_element_user(UNITTYPE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "unitType" element
     */
    public int sizeOfUnitTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITTYPE$30);
        }
    }
    
    /**
     * Sets array of all "unitType" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUnitTypeArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType[] unitTypeArray)
    {
        check_orphaned();
        arraySetterHelper(unitTypeArray, UNITTYPE$30);
    }
    
    /**
     * Sets ith "unitType" element
     */
    public void setUnitTypeArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType unitType)
    {
        generatedSetterHelperImpl(unitType, UNITTYPE$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitType" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType insertNewUnitType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType)get_store().insert_element_user(UNITTYPE$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitType" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType addNewUnitType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType)get_store().add_element_user(UNITTYPE$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "unitType" element
     */
    public void removeUnitType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITTYPE$30, i);
        }
    }
    
    /**
     * Gets array of all "carrier" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier[] getCarrierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CARRIER$32, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "carrier" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier getCarrierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier)get_store().find_element_user(CARRIER$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "carrier" element
     */
    public int sizeOfCarrierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARRIER$32);
        }
    }
    
    /**
     * Sets array of all "carrier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCarrierArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier[] carrierArray)
    {
        check_orphaned();
        arraySetterHelper(carrierArray, CARRIER$32);
    }
    
    /**
     * Sets ith "carrier" element
     */
    public void setCarrierArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier carrier)
    {
        generatedSetterHelperImpl(carrier, CARRIER$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "carrier" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier insertNewCarrier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier)get_store().insert_element_user(CARRIER$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "carrier" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier addNewCarrier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier)get_store().add_element_user(CARRIER$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "carrier" element
     */
    public void removeCarrier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARRIER$32, i);
        }
    }
    
    /**
     * Gets array of all "censusTract" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract[] getCensusTractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CENSUSTRACT$34, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "censusTract" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract getCensusTractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract)get_store().find_element_user(CENSUSTRACT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "censusTract" element
     */
    public int sizeOfCensusTractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CENSUSTRACT$34);
        }
    }
    
    /**
     * Sets array of all "censusTract" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCensusTractArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract[] censusTractArray)
    {
        check_orphaned();
        arraySetterHelper(censusTractArray, CENSUSTRACT$34);
    }
    
    /**
     * Sets ith "censusTract" element
     */
    public void setCensusTractArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract censusTract)
    {
        generatedSetterHelperImpl(censusTract, CENSUSTRACT$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "censusTract" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract insertNewCensusTract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract)get_store().insert_element_user(CENSUSTRACT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "censusTract" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract addNewCensusTract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract)get_store().add_element_user(CENSUSTRACT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "censusTract" element
     */
    public void removeCensusTract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CENSUSTRACT$34, i);
        }
    }
    
    /**
     * Gets array of all "addressKey" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey[] getAddressKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSKEY$36, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "addressKey" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey getAddressKeyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey)get_store().find_element_user(ADDRESSKEY$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "addressKey" element
     */
    public int sizeOfAddressKeyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSKEY$36);
        }
    }
    
    /**
     * Sets array of all "addressKey" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddressKeyArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey[] addressKeyArray)
    {
        check_orphaned();
        arraySetterHelper(addressKeyArray, ADDRESSKEY$36);
    }
    
    /**
     * Sets ith "addressKey" element
     */
    public void setAddressKeyArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey addressKey)
    {
        generatedSetterHelperImpl(addressKey, ADDRESSKEY$36, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addressKey" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey insertNewAddressKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey)get_store().insert_element_user(ADDRESSKEY$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addressKey" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey addNewAddressKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey)get_store().add_element_user(ADDRESSKEY$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "addressKey" element
     */
    public void removeAddressKey(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSKEY$36, i);
        }
    }
    
    /**
     * Gets array of all "desc" elements
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc[] getDescArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DESC$38, targetList);
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc[] result = new uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "desc" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc getDescArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc)get_store().find_element_user(DESC$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "desc" element
     */
    public int sizeOfDescArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESC$38);
        }
    }
    
    /**
     * Sets array of all "desc" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDescArray(uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc[] descArray)
    {
        check_orphaned();
        arraySetterHelper(descArray, DESC$38);
    }
    
    /**
     * Sets ith "desc" element
     */
    public void setDescArray(int i, uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc desc)
    {
        generatedSetterHelperImpl(desc, DESC$38, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "desc" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc insertNewDesc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc)get_store().insert_element_user(DESC$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "desc" element
     */
    public uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc addNewDesc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc target = null;
            target = (uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc)get_store().add_element_user(DESC$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "desc" element
     */
    public void removeDesc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESC$38, i);
        }
    }
    
    /**
     * Gets array of all "useablePeriod" elements
     */
    public uk.nhs.connect.iucds.ucr.IVLTS[] getUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEABLEPERIOD$40, targetList);
            uk.nhs.connect.iucds.ucr.IVLTS[] result = new uk.nhs.connect.iucds.ucr.IVLTS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "useablePeriod" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS getUseablePeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().find_element_user(USEABLEPERIOD$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "useablePeriod" element
     */
    public int sizeOfUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEABLEPERIOD$40);
        }
    }
    
    /**
     * Sets array of all "useablePeriod" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUseablePeriodArray(uk.nhs.connect.iucds.ucr.IVLTS[] useablePeriodArray)
    {
        check_orphaned();
        arraySetterHelper(useablePeriodArray, USEABLEPERIOD$40);
    }
    
    /**
     * Sets ith "useablePeriod" element
     */
    public void setUseablePeriodArray(int i, uk.nhs.connect.iucds.ucr.IVLTS useablePeriod)
    {
        generatedSetterHelperImpl(useablePeriod, USEABLEPERIOD$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useablePeriod" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS insertNewUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().insert_element_user(USEABLEPERIOD$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useablePeriod" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS addNewUseablePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().add_element_user(USEABLEPERIOD$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "useablePeriod" element
     */
    public void removeUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEABLEPERIOD$40, i);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public uk.nhs.connect.iucds.ucr.II getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.II target = null;
            target = (uk.nhs.connect.iucds.ucr.II)get_store().find_element_user(ID$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$42) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(uk.nhs.connect.iucds.ucr.II id)
    {
        generatedSetterHelperImpl(id, ID$42, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "id" element
     */
    public uk.nhs.connect.iucds.ucr.II addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.II target = null;
            target = (uk.nhs.connect.iucds.ucr.II)get_store().add_element_user(ID$42);
            return target;
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$42, 0);
        }
    }
    
    /**
     * Gets the "use" attribute
     */
    public java.util.List getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$44);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "use" attribute
     */
    public uk.nhs.connect.iucds.ucr.SetCsPostalAddressUse xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.SetCsPostalAddressUse target = null;
            target = (uk.nhs.connect.iucds.ucr.SetCsPostalAddressUse)get_store().find_attribute_user(USE$44);
            return target;
        }
    }
    
    /**
     * True if has "use" attribute
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USE$44) != null;
        }
    }
    
    /**
     * Sets the "use" attribute
     */
    public void setUse(java.util.List use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$44);
            }
            target.setListValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(uk.nhs.connect.iucds.ucr.SetCsPostalAddressUse use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.SetCsPostalAddressUse target = null;
            target = (uk.nhs.connect.iucds.ucr.SetCsPostalAddressUse)get_store().find_attribute_user(USE$44);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.SetCsPostalAddressUse)get_store().add_attribute_user(USE$44);
            }
            target.set(use);
        }
    }
    
    /**
     * Unsets the "use" attribute
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USE$44);
        }
    }
    
    /**
     * Gets the "isNotOrdered" attribute
     */
    public boolean getIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNOTORDERED$46);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isNotOrdered" attribute
     */
    public uk.nhs.connect.iucds.ucr.Bl2 xgetIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(ISNOTORDERED$46);
            return target;
        }
    }
    
    /**
     * True if has "isNotOrdered" attribute
     */
    public boolean isSetIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISNOTORDERED$46) != null;
        }
    }
    
    /**
     * Sets the "isNotOrdered" attribute
     */
    public void setIsNotOrdered(boolean isNotOrdered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNOTORDERED$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISNOTORDERED$46);
            }
            target.setBooleanValue(isNotOrdered);
        }
    }
    
    /**
     * Sets (as xml) the "isNotOrdered" attribute
     */
    public void xsetIsNotOrdered(uk.nhs.connect.iucds.ucr.Bl2 isNotOrdered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(ISNOTORDERED$46);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().add_attribute_user(ISNOTORDERED$46);
            }
            target.set(isNotOrdered);
        }
    }
    
    /**
     * Unsets the "isNotOrdered" attribute
     */
    public void unsetIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISNOTORDERED$46);
        }
    }
    /**
     * An XML delimiter(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class DelimiterImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Delimiter
    {
        private static final long serialVersionUID = 1L;
        
        public DelimiterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML state(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class StateImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.State
    {
        private static final long serialVersionUID = 1L;
        
        public StateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML county(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class CountyImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.County
    {
        private static final long serialVersionUID = 1L;
        
        public CountyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML city(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class CityImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.City
    {
        private static final long serialVersionUID = 1L;
        
        public CityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML postalCode(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class PostalCodeImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.PostalCode
    {
        private static final long serialVersionUID = 1L;
        
        public PostalCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML streetAddressLine(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class StreetAddressLineImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetAddressLine
    {
        private static final long serialVersionUID = 1L;
        
        public StreetAddressLineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML houseNumber(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class HouseNumberImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumber
    {
        private static final long serialVersionUID = 1L;
        
        public HouseNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML houseNumberNumeric(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class HouseNumberNumericImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.HouseNumberNumeric
    {
        private static final long serialVersionUID = 1L;
        
        public HouseNumberNumericImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML direction(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class DirectionImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Direction
    {
        private static final long serialVersionUID = 1L;
        
        public DirectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML streetName(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class StreetNameImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetName
    {
        private static final long serialVersionUID = 1L;
        
        public StreetNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML streetNameBase(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class StreetNameBaseImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameBase
    {
        private static final long serialVersionUID = 1L;
        
        public StreetNameBaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML streetNameType(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class StreetNameTypeImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.StreetNameType
    {
        private static final long serialVersionUID = 1L;
        
        public StreetNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML additionalLocator(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class AdditionalLocatorImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AdditionalLocator
    {
        private static final long serialVersionUID = 1L;
        
        public AdditionalLocatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML unitID(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class UnitIDImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitID
    {
        private static final long serialVersionUID = 1L;
        
        public UnitIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML unitType(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class UnitTypeImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.UnitType
    {
        private static final long serialVersionUID = 1L;
        
        public UnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML carrier(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class CarrierImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Carrier
    {
        private static final long serialVersionUID = 1L;
        
        public CarrierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML censusTract(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class CensusTractImpl extends uk.nhs.connect.iucds.ucr.impl.ADXPImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.CensusTract
    {
        private static final long serialVersionUID = 1L;
        
        public CensusTractImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML addressKey(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class AddressKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.AddressKey
    {
        private static final long serialVersionUID = 1L;
        
        public AddressKeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
    /**
     * An XML desc(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class DescImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.ADNPfITCodedCountry.Desc
    {
        private static final long serialVersionUID = 1L;
        
        public DescImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARTTYPE$0 = 
            new javax.xml.namespace.QName("", "partType");
        
        
        /**
         * Gets the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partType" attribute
         */
        public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_default_attribute_value(PARTTYPE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "partType" attribute
         */
        public boolean isSetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "partType" attribute
         */
        public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.setEnumValue(partType);
            }
        }
        
        /**
         * Sets (as xml) the "partType" attribute
         */
        public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
                }
                target.set(partType);
            }
        }
        
        /**
         * Unsets the "partType" attribute
         */
        public void unsetPartType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTTYPE$0);
            }
        }
    }
}
