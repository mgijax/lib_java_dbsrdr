package org.jax.mgi.dbs.rdr;

import org.jax.mgi.shr.config.RDRDBObjectCfg;
import org.jax.mgi.dbs.mgi.MGIDBObject;


public class RDRDBObject extends MGIDBObject
{
    protected String organism;
    protected String dnaType;
    protected String vectorType;
    protected String jNumber;

    protected String mgiCloneTable;
    protected String mgiCloneSeqTable;

    private RDRDBObjectCfg cfg = new RDRDBObjectCfg();


    public RDRDBObject()
    {
        organism = cfg.getOrganism();
        dnaType = cfg.getDNAType();
        vectorType = cfg.getVectorType();
        jNumber = cfg.getJNumber();
        mgiCloneTable = cfg.getCloneTable();
        mgiCloneSeqTable = cfg.getCloneSeqTable();
    }

    public String getOrganism () { return organism; }
    public String getDNAType () { return dnaType; }
    public String getVectorType () { return vectorType; }
    public String getJNumber () { return jNumber; }
    public String getMGICloneTable () { return mgiCloneTable; }
    public String getMGICloneSeqTable () { return mgiCloneSeqTable; }

    public void setOrganism (String pOrganism) { organism = pOrganism; }
    public void setDNAType (String pDNAType) { dnaType = pDNAType; }
    public void setVectorType (String pVectorType) { vectorType = pVectorType; }
    public void setJNumber (String pJNumber) { jNumber = pJNumber; }
    public void setMGICloneTable (String pMGICloneTable) { mgiCloneTable = pMGICloneTable; }
    public void setMGICloneSeqTable (String pMGICloneSeqTable) { mgiCloneSeqTable = pMGICloneSeqTable; }
}
