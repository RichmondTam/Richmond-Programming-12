import java.util.Objects;

public class Moon {
    private Planet planet;
    private int orbitTime;
    private boolean atmosphere;
    private String designation;

    public Moon(Planet, orbitTime, atmosphere, designation){

    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moon moon = (Moon) o;
        return orbitTime == moon.orbitTime && atmosphere == moon.atmosphere && Objects.equals(planet, moon.planet) && Objects.equals(designation, moon.designation);
    }



    @Override
    public String toString() {
        return "Moon{" +
                "planet=" + planet +
                ", orbitTime=" + orbitTime +
                ", atmosphere=" + atmosphere +
                ", designation='" + designation + '\'' +
                '}';
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public Planet getPlanet() {
        return planet;
    }
}
