//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr.dao;

import org.jax.mgi.shr.config.ConfigException;
import org.jax.mgi.shr.dbutils.DBException;
import org.jax.mgi.shr.dbutils.SQLDataManager;
import org.jax.mgi.shr.dbutils.SQLDataManagerFactory;
import org.jax.mgi.shr.dbutils.Table;

/**
 * @is An object that has the primary key for a record in the
 *     MGI_CloneLoad_Clone table.
 * @has
 *   <UL>
 *   <LI> The primary key for the table.
 *   </UL>
 * @does
 *   <UL>
 *   <LI> Provides a get method for its key.
 *   </UL>
 * @company The Jackson Laboratory
 * @author dbm
 * @version 1.0
 */

public class MGICloneLoadCloneKey
{
    /////////////////
    //  Variables  //
    /////////////////

    // The primary key for a record in the MGI_CloneLoad_Clone table.
    //
    private Integer primaryKey;


    /**
     * Constructs a new MGICloneLoadCloneKey object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @throws ConfigException
     * @throws DBException
     */
    public MGICloneLoadCloneKey ()
        throws ConfigException, DBException
    {
        SQLDataManager sqlMgr = SQLDataManagerFactory.getShared("RADAR");
        primaryKey = Table.getInstance("MGI_CloneLoad_Clone",sqlMgr).getNextKey();
    }


    /**
     * Constructs a new MGICloneLoadCloneKey object.
     * @assumes Nothing
     * @effects Nothing
     * @param pKey The value to set the primary key.
     * @throws Nothing
     */
    public MGICloneLoadCloneKey (Integer pKey)
    {
        primaryKey = pKey;
    }


    /**
     * Get the primaryKey attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The primaryKey attribute.
     * @throws Nothing
     */
    public Integer getPrimaryKey () { return primaryKey; }
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
