//  $Header$
//  $Name$

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
    private ConfigurationManager cm = null;


    /**
     * <p>Purpose: Constructs a RADAR database object configurator and gets
     *             an instance of a configuration manager.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @exception KnownException
     */
    public RDRDBCfg () throws KnownException
    {
        cm = ConfigurationManager.getInstance();
    }


    /**
     * Get the name of the MGI clone table from the configuration file.
     */
    public String getMGICloneTable () throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_TABLE",cm);
    }

    /**
     * Get the SQL statement(s) to be executed before a bcp file is loaded
     * into the MGI clone table.
     */
    public String getMGICloneBCPPreSQL () throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_BCP_PRE_SQL","",cm);
    }

    /**
     * Get the SQL statement(s) to be executed after a bcp file is loaded
     * into the MGI clone table.
     */
    public String getMGICloneBCPPostSQL () throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_BCP_POST_SQL","",cm);
    }

    /**
     * Get the configuration value that indicates if the MGI clone table
     * should be truncated before loading the bcp file.
     */
    public boolean getMGICloneBCPTruncTable () throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_TRUNCATE_TABLE",cm);
    }

    /**
     * Get the configuration value that indicates if the indexes on the
     * MGI clone table should be dropped before loading the bcp file.
     */
    public boolean getMGICloneBCPDropIndex () throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_BCP_DROP_INDEXES",cm);
    }

    /**
     * Get the name of the MGI clone accession table from the configuration
     * file.
     */
    public String getMGICloneAccTable () throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_ACC_TABLE",cm);
    }

    /**
     * Get the SQL statement(s) to be executed before a bcp file is loaded
     * into the MGI clone accession table.
     */
    public String getMGICloneAccBCPPreSQL () throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_ACC_BCP_PRE_SQL","",cm);
    }

    /**
     * Get the SQL statement(s) to be executed after a bcp file is loaded
     * into the MGI clone accession table.
     */
    public String getMGICloneAccBCPPostSQL () throws KnownException
    {
        return ConfigLookup.getConfigString("MGI_CLONE_ACC_BCP_POST_SQL","",cm);
    }

    /**
     * Get the configuration value that indicates if the MGI clone accession
     * table should be truncated before loading the bcp file.
     */
    public boolean getMGICloneAccBCPTruncTable () throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_ACC_BCP_TRUNCATE_TABLE",cm);
    }

    /**
     * Get the configuration value that indicates if the indexes on the
     * MGI clone accession table should be dropped before loading the bcp file.
     */
    public boolean getMGICloneAccBCPDropIndex () throws KnownException
    {
        return ConfigLookup.getConfigBoolean("MGI_CLONE_ACC_BCP_DROP_INDEXES",cm);
    }

    /**
     * Get the organism attribute from the configuration file.
     */
    public String getOrganism () throws KnownException
    {
        return ConfigLookup.getConfigString("ORGANISM",cm);
    }

    /**
     * Get the segmentType attribute from the configuration file.
     */
    public String getSegmentType () throws KnownException
    {
        return ConfigLookup.getConfigString("SEGMENT_TYPE",cm);
    }

    /**
     * Get the derivedFromID attribute from the configuration file.
     */
    public String getDerivedFromID () throws KnownException
    {
        return ConfigLookup.getConfigString("DERIVED_FROM_ID",cm);
    }

    /**
     * Get the vectorType attribute from the configuration file.
     */
    public String getVectorType () throws KnownException
    {
        return ConfigLookup.getConfigString("VECTOR_TYPE",cm);
    }

    /**
     * Get the jNumber attribute from the configuration file.
     */
    public String getJNumber () throws KnownException
    {
        return ConfigLookup.getConfigString("J_NUMBER",cm);
    }

    /**
     * Get the logicalDB attribute for a clone from the configuration file.
     */
    public String getLogicalDBClone () throws KnownException
    {
        return ConfigLookup.getConfigString("LOGICAL_DB_CLONE",cm);
    }

    /**
     * Get the logicalDB attribute for a sequence from the configuration file.
     */
    public String getLogicalDBSeq () throws KnownException
    {
        return ConfigLookup.getConfigString("LOGICAL_DB_SEQ",cm);
    }
}


//  $Log$
/**************************************************************************
*
* Warranty Disclaimer and Copyright Notice
*
*  THE JACKSON LABORATORY MAKES NO REPRESENTATION ABOUT THE SUITABILITY OR
*  ACCURACY OF THIS SOFTWARE OR DATA FOR ANY PURPOSE, AND MAKES NO WARRANTIES,
*  EITHER EXPRESS OR IMPLIED, INCLUDING MERCHANTABILITY AND FITNESS FOR A
*  PARTICULAR PURPOSE OR THAT THE USE OF THIS SOFTWARE OR DATA WILL NOT
*  INFRINGE ANY THIRD PARTY PATENTS, COPYRIGHTS, TRADEMARKS, OR OTHER RIGHTS.
*  THE SOFTWARE AND DATA ARE PROVIDED "AS IS".
*
*  This software and data are provided to enhance knowledge and encourage
*  progress in the scientific community and are to be used only for research
*  and educational purposes.  Any reproduction or use for commercial purpose
*  is prohibited without the prior express written permission of The Jackson
*  Laboratory.
*
* Copyright \251 1996, 1999, 2002, 2003 by The Jackson Laboratory
*
* All Rights Reserved
*
**************************************************************************/
