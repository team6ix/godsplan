package com.ibm.cfc.godsplan.cloudant.model;

import com.ibm.cfc.godsplan.cloudant.Coordinates;

/**
 * POJO for fire locations database documents
 *
 */
public class DisasterLocationContext
{
   private final Coordinates coordinates;
   private final String _id;

   /**
    * 
    * @param coordinates
    * @param id
    */
   public DisasterLocationContext(Coordinates coordinates, String id)
   {
      super();
      this.coordinates = coordinates;
      this._id = id;
   }

   /**
    * 
    * @return coordinates of the fire location
    */
   public Coordinates getCoordinates()
   {
      return coordinates;
   }

   /**
    * 
    * @return the designated id of the fire
    */
   public String getId()
   {
      return _id;
   }

   /**
    * 
    */
   @Override
   public String toString()
   {
      return "FireLocationContext [getCoordinates()=" + getCoordinates() + ", getId()=" + getId() + "]";
   }
   
   
}
