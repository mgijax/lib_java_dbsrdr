package org.jax.mgi.dbs.rdr;

import org.jax.mgi.shr.exception.KnownException;
import org.jax.mgi.shr.config.RDRDBObjectCfg;
import org.jax.mgi.dbs.mgi.MGIDBObject;

/**
 * <p>IS: An object that represents attributes that are common to all RADAR
 *        database tables.</p>
 * <p>HAS:
 * <UL>
 *   <LI> RADAR database attributes
 *   <LI> RADAR database object configurator
 * </UL></p>
 * <p>DOES:
 * <UL>
 *   <LI> Uses an RADAR database object configurator to initialize certain
 *        attributes.
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

    protected String mgiCloneTable;
    protected String mgiCloneSeqTable;

    // An instance of the RADAR database object configurator.
    //
    private RDRDBObjectCfg RDRCfg;


    /**
     * <p>Purpose: Constructs a RADAR database object and initializes its
     *             attributes.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Set the class variables.</p>
     * @param None
     * @exception KnownException
     */
    public RDRDBObject() throws KnownException
    {
        RDRCfg = new RDRDBObjectCfg();

        organism = RDRCfg.getOrganism();
        dnaType = RDRCfg.getDNAType();
        vectorType = RDRCfg.getVectorType();
        jNumber = RDRCfg.getJNumber();
        mgiCloneTable = RDRCfg.getCloneTable();
        mgiCloneSeqTable = RDRCfg.getCloneSeqTable();
    }

    // Methods to get attributes from this object.
    //
    public String getOrganism () { return organism; }
    public String getDNAType () { return dnaType; }
    public String getVectorType () { return vectorType; }
    public String getJNumber () { return jNumber; }
    public String getMGICloneTable () { return mgiCloneTable; }
    public String getMGICloneSeqTable () { return mgiCloneSeqTable; }

    // Methods to set attributes in this object.
    //
    public void setOrganism (String pOrganism) { organism = pOrganism; }
    public void setDNAType (String pDNAType) { dnaType = pDNAType; }
    public void setVectorType (String pVectorType) { vectorType = pVectorType; }
    public void setJNumber (String pJNumber) { jNumber = pJNumber; }
    public void setMGICloneTable (String pMGICloneTable) { mgiCloneTable = pMGICloneTable; }
    public void setMGICloneSeqTable (String pMGICloneSeqTable) { mgiCloneSeqTable = pMGICloneSeqTable; }
}
