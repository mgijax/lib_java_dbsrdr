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
 * <p>Company: The Jackson Laboratory</p>
 * @author dbm
 * @version 1.0
 */

public class CloneLoadCfg extends Configurator
{
    /**
     * <p>Constructs a clone load configurator</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @throws ConfigException if a configuration manager cannot be obtained
     */
    public CloneLoadCfg() throws ConfigException
    {
    }

    /**
     * Get the value of the ORGANISM configuration parameter.
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getOrganism () throws ConfigException
    {
        return getConfigString("ORGANISM");
    }

    /**
     * Get the value of the SEGMENT_TYPE configuration parameter.
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getSegmentType () throws ConfigException
    {
        return getConfigString("SEGMENT_TYPE");
    }

    /**
     * Get the value of the DERIVED_FROM_ID configuration parameter.
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getDerivedFromID () throws ConfigException
    {
        return getConfigString("DERIVED_FROM_ID");
    }

    /**
     * Get the value of the VECTOR_TYPE configuration parameter.
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getVectorType () throws ConfigException
    {
        return getConfigString("VECTOR_TYPE");
    }

    /**
     * Get the value of the J_NUMBER configuration parameter.
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getJNumber () throws ConfigException
    {
        return getConfigString("J_NUMBER");
    }

    /**
     * Get the value of the LOGICAL_DB_CLONE configuration parameter.
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getLogicalDBClone () throws ConfigException
    {
        return getConfigString("LOGICAL_DB_CLONE");
    }

    /**
     * Get the value of the LOGICAL_DB_SEQ configuration parameter.
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getLogicalDBSeq () throws ConfigException
    {
        return getConfigString("LOGICAL_DB_SEQ");
    }
}


//  $Log$
//  Revision 1.1  2003/05/05 16:37:00  dbm
//  Renamed from RDRDBCfg.java
//
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
