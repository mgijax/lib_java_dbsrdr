//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr.dao;

/**
 * @is An object with attributes needed to create a new record in the
 *     MGI_CloneLoad_Clone table.
 * @has
 *   <UL>
 *   <LI> MGI format clone attributes.
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

public class MGICloneLoadCloneState
{
    /////////////////
    //  Variables  //
    /////////////////

    // MGI format clone attributes.
    //
    private String cloneName = null;
    private String cloneLibrary = null;
    private String jnumID = null;


    /**
     * Constructs a new MGICloneLoadCloneState object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @throws Nothing
     */
    public MGICloneLoadCloneState ()
    {
    }


    /**
     * Get the cloneName attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The cloneName attribute.
     * @throws Nothing
     */
    public String getCloneName () { return cloneName; }

    /**
     * Get the cloneLibrary attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The cloneLibrary attribute.
     * @throws Nothing
     */
    public String getCloneLibrary () { return cloneLibrary; }

    /**
     * Get the jnumID attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The jnumID attribute.
     * @throws Nothing
     */
    public String getJNumID () { return jnumID; }

    /**
     * Set the cloneName attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pCloneName The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneName (String pCloneName) { cloneName = pCloneName; }

    /**
     * Set the cloneLibrary attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pCloneLibrary The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneLibrary (String pCloneLibrary) { cloneLibrary = pCloneLibrary; }

    /**
     * Set the jnumID attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pJNumID The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setJNumID (String pJNumID) { jnumID = pJNumID; }


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
        cloneName = null;
        cloneLibrary = null;
        jnumID = null;
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
