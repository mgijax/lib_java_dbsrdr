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


    /**
     * Get the name of the MGI clone table from the configuration file.
     */
    public String getMGICloneTable() throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_TABLE",cm);
    }

    /**
     * Get the configuration value that indicates if the MGI clone table
     * should be truncated before loading the bcp file.
     */
    public boolean getMGICloneBCPTruncTable() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_TRUNCATE_TABLE",cm);
    }

    /**
     * Get the configuration value that indicates if the indexes on the
     * MGI clone table should be dropped before loading the bcp file.
     */
    public boolean getMGICloneBCPDropIndex() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_DROP_INDEXES",cm);
    }

    /**
     * Get the configuration value that indicates if the transaction log
     * should be truncated after loading the bcp file into the MGI clone
     * table.
     */
    public boolean getMGICloneBCPTruncLog() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_TRUNCATE_LOG",cm);
    }

    /**
     * Get the name of the MGI clone sequence table from the configuration
     * file.
     */
    public String getMGICloneSeqTable() throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_SEQ_TABLE",cm);
    }

    /**
     * Get the configuration value that indicates if the MGI clone sequence
     * table should be truncated before loading the bcp file.
     */
    public boolean getMGICloneSeqBCPTruncTable() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_SEQ_BCP_TRUNCATE_TABLE",cm);
    }

    /**
     * Get the configuration value that indicates if the indexes on the
     * MGI clone sequence table should be dropped before loading the bcp file.
     */
    public boolean getMGICloneSeqBCPDropIndex() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_SEQ_BCP_DROP_INDEXES",cm);
    }

    /**
     * Get the configuration value that indicates if the transaction log
     * should be truncated after loading the bcp file into the MGI clone
     * sequence table.
     */
    public boolean getMGICloneSeqBCPTruncLog() throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_SEQ_BCP_TRUNCATE_LOG",cm);
    }

    /**
     * Get the organism attribute from the configuration file.
     */
    public String getOrganism() throws KnownException
    {
        return ConfigLookup.getConfigString("ORGANISM",cm);
    }

    /**
     * Get the dnaType attribute from the configuration file.
     */
    public String getDNAType() throws KnownException
    {
        return ConfigLookup.getConfigString("DNA_TYPE",cm);
    }

    /**
     * Get the vectorType attribute from the configuration file.
     */
    public String getVectorType() throws KnownException
    {
        return ConfigLookup.getConfigString("VECTOR_TYPE",cm);
    }

    /**
     * Get the jNumber attribute from the configuration file.
     */
    public String getJNumber() throws KnownException
    {
        return ConfigLookup.getConfigString("J_NUMBER",cm);
    }
}
