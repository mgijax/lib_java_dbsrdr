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

public class RDRDBObjectCfg
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
    public RDRDBObjectCfg() throws KnownException
    {
        cm = ConfigurationManager.getInstance();
    }

    // Methods to get RADAR Database configuration parameters.
    //
    public String getCloneTable() throws KnownException
    {
        return ConfigLookup.getConfigValue("MGI_CLONE_TABLE",cm);
    }
    public String getCloneSeqTable() throws KnownException
    {
        return ConfigLookup.getConfigValue("MGI_CLONE_SEQ_TABLE",cm);
    }
    public String getOrganism() throws KnownException
    {
        return ConfigLookup.getConfigValue("ORGANISM",cm);
    }
    public String getDNAType() throws KnownException
    {
        return ConfigLookup.getConfigValue("DNA_TYPE",cm);
    }
    public String getVectorType() throws KnownException
    {
        return ConfigLookup.getConfigValue("VECTOR_TYPE",cm);
    }
    public String getJNumber() throws KnownException
    {
        return ConfigLookup.getConfigValue("J_NUMBER",cm);
    }
}
