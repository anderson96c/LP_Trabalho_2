
public class Vehicle
{
	// Unique id for this vehicle.
	private String id;
	// The destination of this vehicle.
	private String destination;
	// The location of this vehicle.
	private String location;

	/**
	 * Constructor
	 *
	 * @param	id	Unique id of the vehicle
	 * @param	d 	Destination of the vehicle
	 * @param 	l 	Location of the vehicle
	 */
	public Vehicle(String base, String id)
	{
		this.id = id;
		destination = null;
		location = base;
	}

	/**
     * Return the status of this vehicle.
     * @return The status.
     */
    public String getStatus()
    {
		if(getDestination() != null)
		{
        return id + " at " + location + " headed for " +
               destination;
		}
		else
		{
			return id + " at " + location + " and it's avaliable";
		}
    }

	/**
	 * Return the ID of the vehicle.
	 * @return The ID of the vehicle.
	 */
	public String getID()
	{
		return id;
	}
	
	/**
	 * Set the intented destination of the vehicle.
	 * @param destination The intended destination.
	 */
	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	/**
	 * Return the destination of the vehicle.
	 * @return The destination of the vehicle.
	 */
	public String getDestination()
	{
		return destination;
	}

	 /**
     * Sets the current location of the vehicle.
     * @param	location	current location.
     */
    public void setLocation(String location){
    	this.location = location;
    }

	/**
     * Return the location of the vehicle.
     * @return The location of the vehicle.
     */
  	public String getLocation()
   	{
    	return location;
    }

	/**
     * Indicate that this vehicle has arrived at its destination.
     */
	public void arrived()
	{
		/*void*/
	}

	/**
	 * Overwrite in class taxi
	 */
	public boolean isFree()
	{
		return false;
	}
}
