package org.jax.mgi.shr.config;

import org.jax.mgi.shr.exception.KnownException;

/**
 * <p>IS: An object that is used to retrieve RADAR database specific
 *        configuration parameters.</p>
 * <p>HAS:
 * <UL>
 *   <LI> Configuration manager object
 * </UL></p>
 * <p>DOES:
 * <UL>
 *   <LI> Provides methods for retrieving configuration parameters that
 *        are specific to the RADAR database.
 * </UL></p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: The Jackson Laboratory</p>
 * @author dbm
 * @version 1.0
 */

public class RDRDBCfg
{
    /////////////////
    //  Variables  //
    /////////////////

    // An instance of a configuration manager.
    //
    static protected ConfigurationManager cm = null;


    /**
     * <p>Purpose: Constructs a RADAR database object configurator and gets
     *             an instance of a configuration manager.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @exception KnownException
     */
    public RDRDBCfg() throws KnownException
    {
        cm = ConfigurationManager.getInstance();
    }

    // Methods to get RADAR database configuration parameters for the
    // MGI clone table.
    //
    public String getMGICloneTable() throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_TABLE",cm);
    }
    public boolean getMGICloneBCPTruncTable() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_TRUNCATE_TABLE",cm);
    }
    public boolean getMGICloneBCPDropIndex() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_DROP_INDEXES",cm);
    }
    public boolean getMGICloneBCPTruncLog() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_TRUNCATE_LOG",cm);
    }

    // Methods to get RADAR database configuration parameters for the
    // MGI clone sequence table.
    //
    public String getMGICloneSeqTable() throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_SEQ_TABLE",cm);
    }
    public boolean getMGICloneSeqBCPTruncTable() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_SEQ_BCP_TRUNCATE_TABLE",cm);
    }
    public boolean getMGICloneSeqBCPDropIndex() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_SEQ_BCP_DROP_INDEXES",cm);
    }
    public boolean getMGICloneSeqBCPTruncLog() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_SEQ_BCP_TRUNCATE_LOG",cm);
    }

    // Methods to get RADAR database configuration parameters for common
    // table attributes.
    //
    public String getOrganism() throws KnownException
    {
        return ConfigLookup.getConfigString("ORGANISM",cm);
    }
    public String getDNAType() throws KnownException
    {
        return ConfigLookup.getConfigString("DNA_TYPE",cm);
    }
    public String getVectorType() throws KnownException
    {
        return ConfigLookup.getConfigString("VECTOR_TYPE",cm);
    }
    public String getJNumber() throws KnownException
    {
        return ConfigLookup.getConfigString("J_NUMBER",cm);
    }
}
