//  $Header$
//  $Name$

package org.jax.mgi.shr.config;

/**
 * @is An object that is used to retrieve configuration parameters that
 *     are common to all clone loads.
 * @has
 *   <UL>
 *   <LI> A reference to a configuration manager
 *   </UL>
 * @does
 *   <UL>
 *   <LI> Provides methods for retrieving configuration parameters.
 *   </UL>
 * @company The Jackson Laboratory
 * @author dbm
 * @version 1.0
 */

public class CloneLoadCfg extends Configurator
{
    /**
     * Constructs a clone load configurator.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @throws ConfigException if a configuration manager cannot be obtained
     */
    public CloneLoadCfg() throws ConfigException
    {
    }

    /**
     * Get the value of the SEGMENT_TYPE configuration parameter.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getSegmentType () throws ConfigException
    {
        return getConfigString("SEGMENT_TYPE");
    }

    /**
     * Get the value of the VECTOR_TYPE configuration parameter.
     * @assumes Nothing
     * @effects Nothing
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
     * @assumes Nothing
     * @effects Nothing
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
     * @assumes Nothing
     * @effects Nothing
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
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getLogicalDBSeq () throws ConfigException
    {
        return getConfigString("LOGICAL_DB_SEQ");
    }

    /**
     * Get the value of the PRIVATE_ACC configuration parameter.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getPrivateAcc () throws ConfigException
    {
        return getConfigString("PRIVATE_ACC");
    }
}


//  $Log$
//  Revision 1.4  2003/06/25 16:59:18  dbm
//  Removed get methods for ORGANISM and DERIVED_FROM_ID.
//
//  Revision 1.3  2003/05/13 18:48:47  dbm
//  Fixed javadocs
//
//  Revision 1.2  2003/05/08 19:20:27  dbm
//  Changes per code review.
//
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
