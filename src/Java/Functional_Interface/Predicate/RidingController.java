package Java.Functional_Interface.Predicate;

import java.util.ArrayList;
import java.util.List;

class Ride {
    private Long id;
    private String riderName;
    private String pickupLocation;
    private String destination;
    private boolean completed;

    public Ride(Long id, String riderName, String pickupLocation, String destination, boolean completed) {
        this.id = id;
        this.riderName = riderName;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

public class RidingController {
    private List<Ride> rides = new ArrayList<>();
    private Long nextId = 1L;

    // Add a new ride
    public Ride addRide(String riderName, String pickupLocation, String destination) {
        Ride newRide = new Ride(nextId++, riderName, pickupLocation, destination,false);
        rides.add(newRide);
        return newRide;
    }

    // Mark a ride as completed by ID
    public Ride completeRide(Long id) {
        for (Ride ride : rides) {
            if (ride.getId().equals(id)) {
                ride.setCompleted(true);
                return ride;
            }
        }
        return null; // return null if no ride with the given ID is found
    }


    public List<Ride> getAllRides() {
        return rides;
    }
}

