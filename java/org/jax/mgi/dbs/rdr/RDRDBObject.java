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

    // RADAR database specific values.
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

    // Methods to get attributes from this object.
    //
    public String getOrganism () { return organism; }
    public String getDNAType () { return dnaType; }
    public String getVectorType () { return vectorType; }
    public String getJNumber () { return jNumber; }

    // Methods to set attributes in this object.
    //
    public void setOrganism (String pOrganism) { organism = pOrganism; }
    public void setDNAType (String pDNAType) { dnaType = pDNAType; }
    public void setVectorType (String pVectorType) { vectorType = pVectorType; }
    public void setJNumber (String pJNumber) { jNumber = pJNumber; }
}
