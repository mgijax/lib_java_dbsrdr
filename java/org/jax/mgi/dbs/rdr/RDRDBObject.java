package org.jax.mgi.dbs.rdr;

import org.jax.mgi.dbs.mgi.MGIDBObject;

/**
 * <p>IS: An object that represents attributes that are common to all RADAR
 *        database tables.</p>
 * <p>HAS:
 * <UL>
 *   <LI> RADAR database attributes
 * </UL></p>
 * <p>DOES:
 * <UL>
 *   <LI> Provides methods to get attributes stored in this object.
 *   <LI> Provides methods to set attributes stored in this object.
 * </UL></p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: The Jackson Laboratory</p>
 * @author dbm
 * @version 1.0
 */

public class RDRDBObject extends MGIDBObject
{
    /////////////////
    //  Variables  //
    /////////////////

    // RADAR database specific attributes.
    //
    protected String organism;
    protected String dnaType;
    protected String vectorType;
    protected String jNumber;


    /**
     * <p>Purpose: Constructs a RADAR database object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @exception None
     */
    public RDRDBObject()
    {
    }


    /**
     * Get the organism attribute from this object.
     */
    public String getOrganism () { return organism; }

    /**
     * Get the dnaType attribute from this object.
     */
    public String getDNAType () { return dnaType; }

    /**
     * Get the vectorType attribute from this object.
     */
    public String getVectorType () { return vectorType; }

    /**
     * Get the jNumber attribute from this object.
     */
    public String getJNumber () { return jNumber; }

    /**
     * Set the organism attribute of this object to the given value.
     */
    public void setOrganism (String pOrganism) { organism = pOrganism; }

    /**
     * Set the dnaType attribute of this object to the given value.
     */
    public void setDNAType (String pDNAType) { dnaType = pDNAType; }

    /**
     * Set the vectorType attribute of this object to the given value.
     */
    public void setVectorType (String pVectorType) { vectorType = pVectorType; }

    /**
     * Set the jNumber attribute of this object to the given value.
     */
    public void setJNumber (String pJNumber) { jNumber = pJNumber; }
}
