//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr;

/**
 * @is An object that represents attributes that are common to all RADAR
 *     clone objects.
 * @has
 *   <UL>
 *   <LI> RADAR database attributes
 *   </UL>
 * @does
 *   <UL>
 *   <LI> Provides methods to get attributes stored in this object.
 *   <LI> Provides methods to set attributes stored in this object.
 *   </UL>
 * @company The Jackson Laboratory
 * @author dbm
 * @version 1.0
 */

public class RDRCloneObject
{
    /////////////////
    //  Variables  //
    /////////////////

    // The value for the _Clone_key column in the RADAR database.
    //
    protected int Clone_key;

    // The value for the cloneID column in the RADAR database.
    //
    protected String cloneID;

    // The value for the cloneName column in the RADAR database.
    //
    protected String cloneName;

    // The value for the cloneLibrary column in the RADAR database.
    //
    protected String cloneLibrary;

    // The value for the jnumID column in the RADAR database.
    //
    protected String jNumber;

    // The value for the accID column in the RADAR database.
    //
    protected String accID;

    // The value for the logicalDB column in the RADAR database when
    // the accession ID is a cloneID.
    //
    protected String logicalDBClone;

    // The value for the logicalDB column in the RADAR database when
    // the accession ID is a seqID.
    //
    protected String logicalDBSeq;

    // The value for the private column in the RADAR database.
    //
    protected String privateAcc;


    /**
     * Get the Clone_key attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The Clone_key attribute
     * @throws Nothing
     */
    public int getCloneKey () { return Clone_key; }

    /**
     * Get the cloneID attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The cloneID attribute
     * @throws Nothing
     */
    public String getCloneID () { return cloneID; }

    /**
     * Get the cloneName attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The cloneName attribute
     * @throws Nothing
     */
    public String getCloneName () { return cloneName; }

    /**
     * Get the cloneLibrary attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The cloneLibrary attribute
     * @throws Nothing
     */
    public String getCloneLibrary () { return cloneLibrary; }

    /**
     * Get the jNumber attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The jNumber attribute
     * @throws Nothing
     */
    public String getJNumber () { return jNumber; }

    /**
     * Get the accID attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The accID attribute
     * @throws Nothing
     */
    public String getAccID () { return accID; }

    /**
     * Get the logicalDBClone attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The logicalDBClone attribute
     * @throws Nothing
     */
    public String getLogicalDBClone () { return logicalDBClone; }

    /**
     * Get the logicalDBSeq attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The logicalDBSeq attribute
     * @throws Nothing
     */
    public String getLogicalDBSeq () { return logicalDBSeq; }

    /**
     * Get the privateAcc attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The privateAcc attribute
     * @throws Nothing
     */
    public String getPrivateAcc () { return privateAcc; }

    /**
     * Set the Clone_key attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pClone_key value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneKey (int pClone_key) { Clone_key = pClone_key; }

    /**
     * Set the cloneID attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pCloneID value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneID (String pCloneID) { cloneID = pCloneID; }

    /**
     * Set the cloneName attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pCloneName value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneName (String pCloneName) { cloneName = pCloneName; }

    /**
     * Set the cloneLibrary attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pCloneLibrary value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneLibrary (String pCloneLibrary) { cloneLibrary = pCloneLibrary; }

    /**
     * Set the jNumber attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pJNumber value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setJNumber (String pJNumber) { jNumber = pJNumber; }

    /**
     * Set the accID attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pAccID value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setAccID (String pAccID) { accID = pAccID; }

    /**
     * Set the logicalDBClone attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pLogicalDBClone value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setLogicalDBClone (String pLogicalDBClone) { logicalDBClone = pLogicalDBClone; }

    /**
     * Set the logicalDBSeq attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pLogicalDBSeq value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setLogicalDBSeq (String pLogicalDBSeq) { logicalDBSeq = pLogicalDBSeq; }

    /**
     * Set the privateAcc attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pPrivateAcc value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setPrivateAcc (String pPrivateAcc) { privateAcc = pPrivateAcc; }
}


//  $Log$
//  Revision 1.4  2003/07/07 16:27:48  dbm
//  Added privateAcc attribute.
//
//  Revision 1.3  2003/06/25 17:00:26  dbm
//  Removed support for organism and derivedFromID.
//
//  Revision 1.2  2003/05/13 18:49:05  dbm
//  Fixed javadocs
//
//  Revision 1.1  2003/05/08 19:13:14  dbm
//  Renamed from RDRDBObject.java
//
//  Revision 1.6  2003/05/05 16:47:18  dbm
//  Include logicalDB attribute for the clone and seq ID.
//
//  Revision 1.5  2003/04/15 18:44:54  dbm
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
