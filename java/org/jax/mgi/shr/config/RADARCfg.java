//  $Header$
//  $Name$

package org.jax.mgi.shr.config;

/**
 * @is An object that is used to retrieve configuration parameters related to
 *     the RADAR database.
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

public class RADARCfg extends Configurator
{
    /**
     * Constructs an RADAR configurator.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @throws ConfigException if a configuration manager cannot be obtained
     */
    public RADARCfg() throws ConfigException
    {
    }

    /**
     * Get the job key created for this run of the job stream.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public Integer getJobKey () throws ConfigException
    {
        return getConfigInteger("JOBKEY");
    }

    /**
     * Get the name of the job stream.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public String getJobStreamName () throws ConfigException
    {
        return getConfigString("JOBSTREAM");
    }

    /**
     * Get the J-Number associated with the load.
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
     * Get the logical DB value to be associated with a clone ID.
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
     * Get the logical DB value to be associated with a sequence ID.
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
     * Get the private attribute to be associated with an accession ID.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The configuration value
     * @throws ConfigException if the value is not found
     */
    public Boolean getPrivateVal() throws ConfigException
    {
        return getConfigBoolean("PRIVATE",new Boolean(false));
    }
}


//  $Log$
//  Revision 1.1  2003/11/25 15:02:54  dbm
//  Initial version
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