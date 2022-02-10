import java.util.ArrayList;
import java.util.Objects;

public class Planet {

    private int orbitTime;
    private ArrayList<Moon> moons= new ArrayList<>();
    private String designation;
    public Planet(){

    }
   public Planet (int a, String planet){

   }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }
    public void addMoon(Moon){

    }

    public ArrayList<Moon> getMoons() {
        return moons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return orbitTime == planet.orbitTime && Objects.equals(moons, planet.moons) && Objects.equals(designation, planet.designation);
    }



    @Override
    public String toString() {
        return "Planet{" +
                "orbitTime=" + orbitTime +
                ", moons=" + moons +
                ", designation='" + designation + '\'' +
                '}';
    }
}
