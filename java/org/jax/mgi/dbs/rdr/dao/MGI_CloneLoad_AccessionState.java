//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr.dao;

import java.sql.Timestamp;

/**
 * @is An object with attributes needed to create a new record in the
 *     MGI_CloneLoad_Accession table.
 * @has
 *   <UL>
 *   <LI> MGI_CloneLoad_Accession attributes.
 *   </UL>
 * @does
 *   <UL>
 *   <LI> Provides get/set methods for its attribute(s).
 *   <LI> Provides a method to clear its attribute(s).
 *   </UL>
 * @company The Jackson Laboratory
 * @author dbm
 * @version 1.0
 */

public class MGI_CloneLoad_AccessionState
{
    /////////////////
    //  Variables  //
    /////////////////

    // MGI_CloneLoad_Accession attributes.
    //
    private Integer _Clone_key = null;
    private String accID = null;
    private String logicalDB = null;
    private Boolean privateJ = null;
    private Integer _JobStream_key = null;
    private Timestamp creation_date = null;


    /**
     * Constructs a new MGI_CloneLoad_CloneState object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @throws Nothing
     */
    public MGI_CloneLoad_AccessionState ()
    {
    }


    /**
     * Get the _Clone_key attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The _Clone_key attribute.
     * @throws Nothing
     */
    public Integer getCloneKey () { return _Clone_key; }

    /**
     * Get the accID attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The accID attribute.
     * @throws Nothing
     */
    public String getAccID () { return accID; }

    /**
     * Get the logicalDB attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The logicalDB attribute.
     * @throws Nothing
     */
    public String getLogicalDB () { return logicalDB; }

    /**
     * Get the privateJ attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The privateJ attribute.
     * @throws Nothing
     */
    public Boolean getPrivateJ () { return privateJ; }

    /**
     * Get the _JobStream_key attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The _JobStream_key attribute.
     * @throws Nothing
     */
    public Integer getJobStreamKey () { return _JobStream_key; }

    /**
     * Get the creation_date attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The creation_date attribute.
     * @throws Nothing
     */
    public Timestamp getCreationDate () { return creation_date; }

    /**
     * Set the _Clone_key attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param in The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneKey (Integer in) { _Clone_key = in; }

    /**
     * Set the accID attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param in The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setAccID (String in) { accID = in; }

    /**
     * Set the logicalDB attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param in The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setLogicalDB (String in) { logicalDB = in; }

    /**
     * Set the privateJ attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param in The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setPrivateJ (Boolean in) { privateJ = in; }

    /**
     * Set the _JobStream_key attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param in The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setJobStreamKey (Integer in) { _JobStream_key = in; }

    /**
     * Set the creation_date attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param in The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setCreationDate (Timestamp in) { creation_date = in; }


    /**
     * Clear the attributes of this object.
     * @assumes Nothing
     * @effects Clears the attributes of this object.
     * @param None
     * @return Nothing
     * @throws Nothing
     */
    public void clear ()
    {
        _Clone_key = null;
        accID = null;
        logicalDB = null;
        privateJ = null;
        _JobStream_key = null;
        creation_date = null;
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
