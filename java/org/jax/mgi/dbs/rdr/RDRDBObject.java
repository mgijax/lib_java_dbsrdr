//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr;

import org.jax.mgi.dbs.mgi.MGIDBObject;

/**
 * <p>IS: An object that represents attributes that are common to all RADAR
 *        database tables.</p>
 * <p>HAS:
 * <UL>
 *   <LI> RADAR database attributes
 * </UL></p>
 * <p>DOES:
 * <UL>
 *   <LI> Provides methods to get attributes stored in this object.
 *   <LI> Provides methods to set attributes stored in this object.
 * </UL></p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: The Jackson Laboratory</p>
 * @author dbm
 * @version 1.0
 */

public class RDRDBObject extends MGIDBObject
{
    /////////////////
    //  Variables  //
    /////////////////

    // RADAR database specific attributes.
    //
    protected int Clone_key;
    protected String cloneName;
    protected String cloneLibrary;
    protected String organism;
    protected String segmentType;
    protected String derivedFromID;
    protected String vectorType;
    protected String jNumber;
    protected String accID;
    protected String logicalDBClone;
    protected String logicalDBSeq;


    /**
     * <p>Purpose: Constructs a RADAR database object.</p>
     * <p>Assumes: Nothing</p>
     * <p>Effects: Nothing</p>
     * @param None
     * @exception None
     */
    public RDRDBObject ()
    {
    }


    /**
     * Get the Clone_key attribute from this object.
     */
    public int getCloneKey () { return Clone_key; }

    /**
     * Get the cloneName attribute from this object.
     */
    public String getCloneName () { return cloneName; }

    /**
     * Get the cloneLibrary attribute from this object.
     */
    public String getCloneLibrary () { return cloneLibrary; }

    /**
     * Get the organism attribute from this object.
     */
    public String getOrganism () { return organism; }

    /**
     * Get the segmentType attribute from this object.
     */
    public String getSegmentType () { return segmentType; }

    /**
     * Get the derivedFromID attribute from this object.
     */
    public String getDerivedFromID () { return derivedFromID; }

    /**
     * Get the vectorType attribute from this object.
     */
    public String getVectorType () { return vectorType; }

    /**
     * Get the jNumber attribute from this object.
     */
    public String getJNumber () { return jNumber; }

    /**
     * Get the accID attribute from this object.
     */
    public String getAccID () { return accID; }

    /**
     * Get the logicalDBClone attribute from this object.
     */
    public String getLogicalDBClone () { return logicalDBClone; }

    /**
     * Get the logicalDBSeq attribute from this object.
     */
    public String getLogicalDBSeq () { return logicalDBSeq; }

    /**
     * Set the Clone_key attribute of this object to the given value.
     */
    public void setCloneKey (int pClone_key) { Clone_key = pClone_key; }

    /**
     * Set the cloneName attribute of this object to the given value.
     */
    public void setCloneName (String pCloneName) { cloneName = pCloneName; }

    /**
     * Set the cloneLibrary attribute of this object to the given value.
     */
    public void setCloneLibrary (String pCloneLibrary) { cloneLibrary = pCloneLibrary; }

    /**
     * Set the organism attribute of this object to the given value.
     */
    public void setOrganism (String pOrganism) { organism = pOrganism; }

    /**
     * Set the segmentType attribute of this object to the given value.
     */
    public void setSegmentType (String pSegmentType) { segmentType = pSegmentType; }

    /**
     * Set the derivedFromID attribute of this object to the given value.
     */
    public void setDerivedFromID (String pDerivedFromID) { derivedFromID = pDerivedFromID; }

    /**
     * Set the vectorType attribute of this object to the given value.
     */
    public void setVectorType (String pVectorType) { vectorType = pVectorType; }

    /**
     * Set the jNumber attribute of this object to the given value.
     */
    public void setJNumber (String pJNumber) { jNumber = pJNumber; }

    /**
     * Set the accID attribute of this object to the given value.
     */
    public void setAccID (String pAccID) { accID = pAccID; }

    /**
     * Set the logicalDBClone attribute of this object to the given value.
     */
    public void setLogicalDBClone (String pLogicalDBClone) { logicalDBClone = pLogicalDBClone; }

    /**
     * Set the logicalDBSeq attribute of this object to the given value.
     */
    public void setLogicalDBSeq (String pLogicalDBSeq) { logicalDBSeq = pLogicalDBSeq; }
}


//  $Log$
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
