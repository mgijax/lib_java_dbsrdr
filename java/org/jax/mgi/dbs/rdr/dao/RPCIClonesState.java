//  $Header$
//  $Name$

package org.jax.mgi.dbs.rdr.dao;

import java.sql.Timestamp;

/**
 * @is An object with attributes needed to create a new record in the
 *     DP_RPCI_Clones table.
 * @has
 *   <UL>
 *   <LI> RPCI data provider clone attributes.
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

public class RPCIClonesState
{
    /////////////////
    //  Variables  //
    /////////////////

    // RPCI data provider clone attributes.
    //
    private String cloneID = null;
    private String ends = null;
    private Integer fpSize = null;
    private String fpBin = null;
    private String chromosome = null;
    private String status = null;
    private String gCenter = null;
    private Timestamp cloneDate = null;
    private String seqID = null;


    /**
     * Constructs a new RPCIClonesState object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @throws Nothing
     */
    public RPCIClonesState ()
    {
    }


    /**
     * Get the cloneID attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The cloneID attribute.
     * @throws Nothing
     */
    public String getCloneID () { return cloneID; }

    /**
     * Get the ends attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The ends attribute.
     * @throws Nothing
     */
    public String getEnds () { return ends; }

    /**
     * Get the fpSize attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The fpSize attribute.
     * @throws Nothing
     */
    public Integer getFpSize () { return fpSize; }

    /**
     * Get the fpBin attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The fpBin attribute.
     * @throws Nothing
     */
    public String getFpBin () { return fpBin; }

    /**
     * Get the chromosome attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The chromosome attribute.
     * @throws Nothing
     */
    public String getChromosome () { return chromosome; }

    /**
     * Get the status attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The status attribute.
     * @throws Nothing
     */
    public String getStatus () { return status; }

    /**
     * Get the gCenter attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The gCenter attribute.
     * @throws Nothing
     */
    public String getGCenter () { return gCenter; }

    /**
     * Get the cloneDate attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The cloneDate attribute.
     * @throws Nothing
     */
    public Timestamp getCloneDate () { return cloneDate; }

    /**
     * Get the seqID attribute from this object.
     * @assumes Nothing
     * @effects Nothing
     * @param None
     * @return The seqID attribute.
     * @throws Nothing
     */
    public String getSeqID () { return seqID; }

    /**
     * Set the cloneID attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pCloneID The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneID (String pCloneID) { cloneID = pCloneID; }

    /**
     * Set the ends attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pEnds The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setEnds (String pEnds) { ends = pEnds; }

    /**
     * Set the fpSize attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pFpSize The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setFpSize (Integer pFpSize) { fpSize = pFpSize; }

    /**
     * Set the fpBin attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pFpBin The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setFpBin (String pFpBin) { fpBin = pFpBin; }

    /**
     * Set the chromosome attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pChromosome The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setChromosome (String pChromosome) { chromosome = pChromosome; }

    /**
     * Set the status attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pStatus The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setStatus (String pStatus) { status = pStatus; }

    /**
     * Set the gCenter attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pGCenter The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setGCenter (String pGCenter) { gCenter = pGCenter; }

    /**
     * Set the cloneDate attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pCloneDate The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setCloneDate (Timestamp pCloneDate) { cloneDate = pCloneDate; }

    /**
     * Set the seqID attribute of this object to the given value.
     * @assumes Nothing
     * @effects Nothing
     * @param pSeqID The value to set the attribute to.
     * @return Nothing
     * @throws Nothing
     */
    public void setSeqID (String pSeqID) { seqID = pSeqID; }


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
        cloneID = null;
        ends = null;
        fpSize = null;
        fpBin = null;
        chromosome = null;
        status = null;
        gCenter = null;
        cloneDate = null;
        seqID = null;
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
