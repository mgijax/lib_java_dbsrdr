//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr;

/**
 * <p>IS: An object that represents attributes that are common to all RADAR
 *        clone objects.</p>
 * <p>HAS:
 * <UL>
 *   <LI> RADAR database attributes
 * </UL></p>
 * <p>DOES:
 * <UL>
 *   <LI> Provides methods to get attributes stored in this object.
 *   <LI> Provides methods to set attributes stored in this object.
 * </UL></p>
 * <p>Company: The Jackson Laboratory</p>
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

    // The value for the cloneName column in the RADAR database.
    //
    protected String cloneName;

    // The value for the cloneLibrary column in the RADAR database.
    //
    protected String cloneLibrary;

    // The value for the organism column in the RADAR database.
    //
    protected String organism;

    // The value for the segmentType column in the RADAR database.
    //
    protected String segmentType;

    // The value for the derivedFromID column in the RADAR database.
    //
    protected String derivedFromID;

    // The value for the vectorType column in the RADAR database.
    //
    protected String vectorType;

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


    /**
     * <p>Get the Clone_key attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The Clone_key attribute
     * @throws Nothing
     */
    public int getCloneKey () { return Clone_key; }

    /**
     * <p>Get the cloneName attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The cloneName attribute
     * @throws Nothing
     */
    public String getCloneName () { return cloneName; }

    /**
     * <p>Get the cloneLibrary attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The cloneLibrary attribute
     * @throws Nothing
     */
    public String getCloneLibrary () { return cloneLibrary; }

    /**
     * <p>Get the organism attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The organism attribute
     * @throws Nothing
     */
    public String getOrganism () { return organism; }

    /**
     * <p>Get the segmentType attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The segmentType attribute
     * @throws Nothing
     */
    public String getSegmentType () { return segmentType; }

    /**
     * <p>Get the derivedFromID attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The derivedFromID attribute
     * @throws Nothing
     */
    public String getDerivedFromID () { return derivedFromID; }

    /**
     * <p>Get the vectorType attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The vectorType attribute
     * @throws Nothing
     */
    public String getVectorType () { return vectorType; }

    /**
     * <p>Get the jNumber attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The jNumber attribute
     * @throws Nothing
     */
    public String getJNumber () { return jNumber; }

    /**
     * <p>Get the accID attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The accID attribute
     * @throws Nothing
     */
    public String getAccID () { return accID; }

    /**
     * <p>Get the logicalDBClone attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The logicalDBClone attribute
     * @throws Nothing
     */
    public String getLogicalDBClone () { return logicalDBClone; }

    /**
     * <p>Get the logicalDBSeq attribute from this object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @return The logicalDBSeq attribute
     * @throws Nothing
     */
    public String getLogicalDBSeq () { return logicalDBSeq; }

    /**
     * <p>Set the Clone_key attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pClone_key value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneKey (int pClone_key) { Clone_key = pClone_key; }

    /**
     * <p>Set the cloneName attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pCloneName value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneName (String pCloneName) { cloneName = pCloneName; }

    /**
     * <p>Set the cloneLibrary attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pCloneLibrary value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneLibrary (String pCloneLibrary) { cloneLibrary = pCloneLibrary; }

    /**
     * <p>Set the organism attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pOrganism value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setOrganism (String pOrganism) { organism = pOrganism; }

    /**
     * <p>Set the segmentType attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pSegmentType value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setSegmentType (String pSegmentType) { segmentType = pSegmentType; }

    /**
     * <p>Set the derivedFromID attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pDerivedFromID value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setDerivedFromID (String pDerivedFromID) { derivedFromID = pDerivedFromID; }

    /**
     * <p>Set the vectorType attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pVectorType value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setVectorType (String pVectorType) { vectorType = pVectorType; }

    /**
     * <p>Set the jNumber attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pJNumber value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setJNumber (String pJNumber) { jNumber = pJNumber; }

    /**
     * <p>Set the accID attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pAccID value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setAccID (String pAccID) { accID = pAccID; }

    /**
     * <p>Set the logicalDBClone attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pLogicalDBClone value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setLogicalDBClone (String pLogicalDBClone) { logicalDBClone = pLogicalDBClone; }

    /**
     * <p>Set the logicalDBSeq attribute of this object to the
     *    given value.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param pLogicalDBSeq value to set the attribute to
     * @return Nothing
     * @throws Nothing
     */
    public void setLogicalDBSeq (String pLogicalDBSeq) { logicalDBSeq = pLogicalDBSeq; }
}


//  $Log$
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
