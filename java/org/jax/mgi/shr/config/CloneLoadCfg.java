//  $Header$
//  $Name$

package org.jax.mgi.shr.config;

/**
 * <p>IS: An object that is used to retrieve configuration parameters that
 *        are common to all clone loads.</p>
 * <p>HAS:
 * <UL>
 *   <LI> A reference to a configuration manager
 * </UL></p>
 * <p>DOES:
 * <UL>
 *   <LI> Provides methods for retrieving configuration parameters.
 * </UL></p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: The Jackson Laboratory</p>
 * @author dbm
 * @version 1.0
 */

public class CloneLoadCfg extends LoadCfg
{
    /**
     * <p>Purpose: Constructs a clone load configurator.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @exception ConfigException
     */
    public CloneLoadCfg () throws ConfigException
    {
        super();
    }


    /**
     * Get the organism attribute from the configuration file.
     */
    public String getOrganism () throws ConfigException
    {
        return getConfigString("ORGANISM");
    }

    /**
     * Get the segmentType attribute from the configuration file.
     */
    public String getSegmentType () throws ConfigException
    {
        return getConfigString("SEGMENT_TYPE");
    }

    /**
     * Get the derivedFromID attribute from the configuration file.
     */
    public String getDerivedFromID () throws ConfigException
    {
        return getConfigString("DERIVED_FROM_ID");
    }

    /**
     * Get the vectorType attribute from the configuration file.
     */
    public String getVectorType () throws ConfigException
    {
        return getConfigString("VECTOR_TYPE");
    }

    /**
     * Get the jNumber attribute from the configuration file.
     */
    public String getJNumber () throws ConfigException
    {
        return getConfigString("J_NUMBER");
    }

    /**
     * Get the logicalDB attribute for a clone from the configuration file.
     */
    public String getLogicalDBClone () throws ConfigException
    {
        return getConfigString("LOGICAL_DB_CLONE");
    }

    /**
     * Get the logicalDB attribute for a sequence from the configuration file.
     */
    public String getLogicalDBSeq () throws ConfigException
    {
        return getConfigString("LOGICAL_DB_SEQ");
    }
}


//  $Log$
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
