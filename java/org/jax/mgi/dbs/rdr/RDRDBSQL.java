//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr;

import java.util.Vector;
import java.util.StringTokenizer;

import org.jax.mgi.shr.config.RDRDBCfg;
import org.jax.mgi.shr.exception.KnownException;

/**
 * <p>IS: An object that knows how to get SQL commands to run against
 *        the RADAR database.</p>
 * <p>HAS:
 * <UL>
 *   <LI> RADAR database configurator
 * </UL></p>
 * <p>DOES:
 * <UL>
 *   <LI> Provides methods to get SQL statements from the RADAR database
 *        configurator.
 * </UL></p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: The Jackson Laboratory</p>
 * @author dbm
 * @version 1.0
 */

public class RDRDBSQL
{
    /////////////////
    //  Variables  //
    /////////////////

    // Configurator for the RADAR database.
    //
    private RDRDBCfg RDRCfg;


    /**
     * <p>Purpose: Constructs a RADAR database SQL object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @exception None
     */
    public RDRDBSQL () throws KnownException
    {
        RDRCfg = new RDRDBCfg();
    }


    /**
     * <p>Purpose: Gets the SQL statements that should be run before the bcp
     *             is executed for the MGI clone table in the RADAR
     *             database.</p>
     * <p>Assumes: The call to the RADAR database configurator method
     *             will return an empty string if the configuration
     *             parameter is not found.</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return A vector of SQL statements or an empty vector if none
     *         are found.
     * @exception KnownException
     */
    public Vector getMGICloneBCPPreSQL () throws KnownException
    {
        return buildSQLVector(RDRCfg.getMGICloneBCPPreSQL());
    }


    /**
     * <p>Purpose: Gets the SQL statements that should be run after the bcp
     *             is executed for the MGI clone table in the RADAR
     *             database.</p>
     * <p>Assumes: The call to the RADAR database configurator method
     *             will return an empty string if the configuration
     *             parameter is not found.</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return A vector of SQL statements or an empty vector if none
     *         are found.
     * @exception KnownException
     */
    public Vector getMGICloneBCPPostSQL () throws KnownException
    {
        return buildSQLVector(RDRCfg.getMGICloneBCPPostSQL());
    }


    /**
     * <p>Purpose: Gets the SQL statements that should be run before the bcp
     *             is executed for the MGI clone accession table in the RADAR
     *             database.</p>
     * <p>Assumes: The call to the RADAR database configurator method
     *             will return an empty string if the configuration
     *             parameter is not found.</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return A vector of SQL statements or an empty vector if none
     *         are found.
     * @exception KnownException
     */
    public Vector getMGICloneAccBCPPreSQL () throws KnownException
    {
        return buildSQLVector(RDRCfg.getMGICloneAccBCPPreSQL());
    }


    /**
     * <p>Purpose: Gets the SQL statements that should be run after the bcp
     *             is executed for the MGI clone accession table in the RADAR
     *             database.</p>
     * <p>Assumes: The call to the RADAR database configurator method
     *             will return an empty string if the configuration
     *             parameter is not found.</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return A vector of SQL statements or an empty vector if none
     *         are found.
     * @exception KnownException
     */
    public Vector getMGICloneAccBCPPostSQL () throws KnownException
    {
        return buildSQLVector(RDRCfg.getMGICloneAccBCPPostSQL());
    }


    /**
     * <p>Purpose: Build a vector of SQL statements from a "|" separated
     *             list.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param sqlCmds A string of "|" separated SQL statements.
     * @return A vector of SQL statements or an empty vector if none
     *         are found.
     * @exception None
     */
    private Vector buildSQLVector (String sqlCmds)
    {
        Vector v = new Vector();

        if (sqlCmds.length() > 0)
        {
            StringTokenizer tokens = new StringTokenizer(sqlCmds,"|");
            while (tokens.hasMoreTokens())
            {
                v.add(tokens.nextToken());
            }
        }

        return v;
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
