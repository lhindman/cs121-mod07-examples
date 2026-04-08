/**
 * Represents a star in the Astrophage Star Map.
 * Each star has a name, distance from Earth in light years,
 * constellation, and Astrophage infection status.
 */
public class Star {
    private String name;
    private double distanceLightYears;
    private String constellation;
    private boolean infected;

    /**
     * Constructs a Star with the given properties.
     *
     * @param name               The common or catalog name of the star
     * @param distanceLightYears Distance from Earth in light years
     * @param constellation      The constellation the star belongs to
     * @param infected           Whether the star shows Astrophage infection
     */
    public Star(String name, double distanceLightYears, String constellation, boolean infected) {
        this.name = name;
        this.distanceLightYears = distanceLightYears;
        this.constellation = constellation;
        this.infected = infected;
    }

    /**
     * Returns the name of the star.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the distance from Earth in light years.
     */
    public double getDistanceLightYears() {
        return distanceLightYears;
    }

    /**
     * Returns the constellation this star belongs to.
     */
    public String getConstellation() {
        return constellation;
    }

    /**
     * Returns true if this star is infected with Astrophage.
     */
    public boolean isInfected() {
        return infected;
    }

    /**
     * Returns a formatted string representation of this star.
     */
    public String toString() {
        String status = infected ? "INFECTED" : "Clear";
        return String.format("%-28s %8.2f ly   %-20s [%s]",
                name, distanceLightYears, constellation, status);
    }
}
