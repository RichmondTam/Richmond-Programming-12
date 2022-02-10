public class RockPlanet extends Planet{
    private boolean habitable;
    RockPlanet(int orbitTime, String designation, boolean atmosphere){

    }

    @Override
    public String toString() {
        return "RockPlanet{" +
                "habitable=" + habitable +
                '}';
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }
}
