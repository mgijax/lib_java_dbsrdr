//  $Header$
//  $Name$

package org.jax.mgi.shr.config;

/**
 * <p>IS: An object that is used to retrieve RADAR database specific
 *        configuration parameters.</p>
 * <p>HAS:
 * <UL>
 *   <LI> A reference to a configuration manager
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

public class RDRDBCfg extends Configurator
{
    /**
     * <p>Purpose: Constructs a RADAR database object configurator.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @exception ConfigException
     */
    public RDRDBCfg () throws ConfigException
    {
        super();
    }


    /**
     * Get the name of the MGI clone table from the configuration file.
     */
    public String getMGICloneTable () throws ConfigException
    {
        return getConfigString("MGI_CLONE_TABLE");
    }

    /**
     * Get the SQL statement(s) to be executed before a bcp file is loaded
     * into the MGI clone table.
     */
    public String getMGICloneBCPPreSQL () throws ConfigException
    {
        return getConfigString("MGI_CLONE_BCP_PRE_SQL","");
    }

    /**
     * Get the SQL statement(s) to be executed after a bcp file is loaded
     * into the MGI clone table.
     */
    public String getMGICloneBCPPostSQL () throws ConfigException
    {
        return getConfigString("MGI_CLONE_BCP_POST_SQL","");
    }

    /**
     * Get the configuration value that indicates if the MGI clone table
     * should be truncated before loading the bcp file.  The default is
     * false.
     */
    public boolean getMGICloneBCPTruncTable () throws ConfigException
    {
        return getConfigBoolean("MGI_CLONE_BCP_TRUNCATE_TABLE",new Boolean(false)).booleanValue();
    }

    /**
     * Get the configuration value that indicates if the indexes on the
     * MGI clone table should be dropped before loading the bcp file.  The
     * default is false.
     */
    public boolean getMGICloneBCPDropIndex () throws ConfigException
    {
        return getConfigBoolean("MGI_CLONE_BCP_DROP_INDEXES",new Boolean(false)).booleanValue();
    }

    /**
     * Get the name of the MGI clone accession table from the configuration
     * file.
     */
    public String getMGICloneAccTable () throws ConfigException
    {
        return getConfigString("MGI_CLONE_ACC_TABLE");
    }

    /**
     * Get the SQL statement(s) to be executed before a bcp file is loaded
     * into the MGI clone accession table.
     */
    public String getMGICloneAccBCPPreSQL () throws ConfigException
    {
        return getConfigString("MGI_CLONE_ACC_BCP_PRE_SQL","");
    }

    /**
     * Get the SQL statement(s) to be executed after a bcp file is loaded
     * into the MGI clone accession table.
     */
    public String getMGICloneAccBCPPostSQL () throws ConfigException
    {
        return getConfigString("MGI_CLONE_ACC_BCP_POST_SQL","");
    }

    /**
     * Get the configuration value that indicates if the MGI clone accession
     * table should be truncated before loading the bcp file.  The default
     * is false.
     */
    public boolean getMGICloneAccBCPTruncTable () throws ConfigException
    {
        return getConfigBoolean("MGI_CLONE_ACC_BCP_TRUNCATE_TABLE",new Boolean(false)).booleanValue();
    }

    /**
     * Get the configuration value that indicates if the indexes on the
     * MGI clone accession table should be dropped before loading the bcp
     * file.  The default is false.
     */
    public boolean getMGICloneAccBCPDropIndex () throws ConfigException
    {
        return getConfigBoolean("MGI_CLONE_ACC_BCP_DROP_INDEXES",new Boolean(false)).booleanValue();
    }

    /**
     * Get the organism attribute from the configuration file.
     */
    public String getOrganism () throws ConfigException
    {
        setApplyPrefix(false);
        String value = getConfigString("ORGANISM");
        setApplyPrefix(true);
        return value;
    }

    /**
     * Get the segmentType attribute from the configuration file.
     */
    public String getSegmentType () throws ConfigException
    {
        setApplyPrefix(false);
        String value = getConfigString("SEGMENT_TYPE");
        setApplyPrefix(true);
        return value;
    }

    /**
     * Get the derivedFromID attribute from the configuration file.
     */
    public String getDerivedFromID () throws ConfigException
    {
        setApplyPrefix(false);
        String value = getConfigString("DERIVED_FROM_ID");
        setApplyPrefix(true);
        return value;
    }

    /**
     * Get the vectorType attribute from the configuration file.
     */
    public String getVectorType () throws ConfigException
    {
        setApplyPrefix(false);
        String value = getConfigString("VECTOR_TYPE");
        setApplyPrefix(true);
        return value;
    }

    /**
     * Get the jNumber attribute from the configuration file.
     */
    public String getJNumber () throws ConfigException
    {
        setApplyPrefix(false);
        String value = getConfigString("J_NUMBER");
        setApplyPrefix(true);
        return value;
    }

    /**
     * Get the logicalDB attribute for a clone from the configuration file.
     */
    public String getLogicalDBClone () throws ConfigException
    {
        setApplyPrefix(false);
        String value = getConfigString("LOGICAL_DB_CLONE");
        setApplyPrefix(true);
        return value;
    }

    /**
     * Get the logicalDB attribute for a sequence from the configuration file.
     */
    public String getLogicalDBSeq () throws ConfigException
    {
        setApplyPrefix(false);
        String value = getConfigString("LOGICAL_DB_SEQ");
        setApplyPrefix(true);
        return value;
    }
}


//  $Log$
//  Revision 1.3  2003/04/15 18:44:09  dbm
//  Changes per design review
//
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
