//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr.dao;

import java.util.Vector;

import org.jax.mgi.shr.config.ConfigException;
import org.jax.mgi.shr.dbutils.dao.DAO;
import org.jax.mgi.shr.dbutils.DBException;
import org.jax.mgi.shr.dbutils.Table;
import org.jax.mgi.shr.exception.MGIException;

/**
 * @is An object that represents a record in the MGI_CloneLoad_Clone table.
 * @has
 *   <UL>
 *   <LI> MGI_CloneLoad_CloneKey object
 *   <LI> MGI_CloneLoad_CloneState object
 *   </UL>
 * @does
 *   <UL>
 *   <LI> Provides get methods for its attribute(s).
 *   <LI> Provides BCPTranslatable and SQLTranslatable implementations.
 *   </UL>
 * @company The Jackson Laboratory
 * @author dbm
 * @version 1.0
 */

public class MGI_CloneLoad_CloneDAO extends DAO
{
    /////////////////
    //  Variables  //
    /////////////////

    // MGI_CloneLoad_CloneKey object.
    //
    private MGI_CloneLoad_CloneKey key = null;

    // MGI_CloneLoad_CloneState object.
    //
    private MGI_CloneLoad_CloneState state = null;


    /**
     * Constructs a new MGI_CloneLoad_CloneDAO object from a given
     * MGI_CloneLoad_CloneState object and a generated MGI_CloneLoad_CloneKey
     * object.
     * @assumes Nothing
     * @effects Nothing
     * @param pState The MGI_CloneLoad_CloneState object.
     * @throws ConfigException
     * @throws DBException
     */
    public MGI_CloneLoad_CloneDAO (MGI_CloneLoad_CloneState pState)
        throws ConfigException, DBException
    {
        key = new MGI_CloneLoad_CloneKey();
        state = pState;
    }


    /**
     * Constructs a new MGI_CloneLoad_CloneDAO object from given
     * MGI_CloneLoad_CloneKey and MGI_CloneLoad_CloneState objects.
     * @assumes Nothing
     * @effects Nothing
     * @param pKey The MGI_CloneLoad_CloneKey object.
     * @param pState The MGI_CloneLoad_CloneState object.
     * @throws Nothing
     */
    public MGI_CloneLoad_CloneDAO (MGI_CloneLoad_CloneKey pKey,
                                   MGI_CloneLoad_CloneState pState)
    {
        key = pKey;
        state = pState;
    }


    /**
     * Get the key attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The key attribute.
     * @throws Nothing
     */
    public MGI_CloneLoad_CloneKey getKey () { return key; }


    /**
     * Get the state attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The state attribute.
     * @throws Nothing
     */
    public MGI_CloneLoad_CloneState getState () { return state; }


    /**
     * Get a vector of table names that are supported by this class.
     * The BCPWriter will call the getBCPVector() method for each
     * of the tables that are provided by this method.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return A vector of table names support by this class.
     * @throws Nothing
     */
    public Vector getBCPSupportedTables()
    {
        // Create a new vector.
        //
        Vector v = new Vector();

        // Add each of the table names to the vector.
        //
        v.add("MGI_CloneLoad_Clone");

        // Return the vector.
        //
        return v;
    }


    /**
     * Get a vector from this object that represents one row of data to be
     * written to the bcp file.  The order of the attributes in the vector
     * needs to correspond to the order of the columns in the given table.
     * @assumes Nothing
     * @effects Nothing
     * @param table The name of the database table that the vector of
     *        attributes is being targeted for.
     * @return A vector for the bcp record to be written.
     * @throws Nothing
     */
    public Vector getBCPVector (Table table)
    {
        // Create a new vector to hold the attributes for one record of a
        // bcp file.
        //
        Vector v = new Vector();

        // Populate the vector with attributes that are needed to create a
        // bcp record for the MGI_CloneLoad_Clone table.
        //
        if (table.getName().equals("MGI_CloneLoad_Clone"))
        {
            // Add the attributes to the vector.
            //
            v.add(key.getKey());
            v.add(state.getCloneName());
            v.add(state.getCloneLibrary());
            v.add(state.getJNumID());
        }

        // Return the vector.
        //
        return v;
    }


    /**
     * Build the SQL statements needed to insert records into the database
     * for this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return A string representing the SQL statement.
     * @throws MGIException
     */
    public String getInsertSQL()
    {
        throw MGIException.getUnsupportedMethodException();
    }


    /**
     * Build the SQL statements needed to update records in the database
     * for this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return A string representing the SQL statement.
     * @throws MGIException
     */
    public String getUpdateSQL()
    {
        throw MGIException.getUnsupportedMethodException();
    }


    /**
     * Build the SQL statements needed to delete records from the database
     * for this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return A string representing the SQL statement.
     * @throws MGIException
     */
    public String getDeleteSQL()
    {
        throw MGIException.getUnsupportedMethodException();
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
