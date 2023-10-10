package PlantsPVZ;

public abstract class Mushroom extends Plant{
    boolean state;
    public Mushroom(String name, int sun_cost, boolean state) {
        super(name, sun_cost);
        this.state = state;
    }

    public boolean isAwake() {
        // TODO implementation
        return state;
    }

    public void awaken(CoffeeBean coffeeBean) {
        // TODO implementation
        state = true;
        if(isAwake()){
            System.out.println(coffeeBean.die());
        }
    }

    // an example given for free
    public static class SunShroom extends Mushroom implements SunProducer {

        public SunShroom(boolean state) {
            super("Sun-shroom", 25, state);
        }

        @Override
        public int produce_sun() {
            if (isAwake()) {
                System.out.println(name + " produces 10 suns");
                return 10;
            }
            System.out.println(name + " is asleep and cannot produce sun");
            return 0;
        }
    }

    // Add more mushroom subclasses here
    public static class PuffShroom extends Mushroom implements Attacker{
        public PuffShroom(boolean state){
            super("Puff-shroom", 0, state);
        }

        public int attack(){
            return 1;
        }

        @Override
        public int rangeType() {
            return -1; //single line
        }
    }

    public static class DoomShroom extends Mushroom implements InstantKiller, Attacker{
        public DoomShroom(boolean state){
            super("Doom-shroom", 125, state);
        }

        public int attack(){
            return 10;
        }

        public int rangeType(){
            return 1; //aoe
        }

        @Override
        public int killType() {
            return 1;
        }
    }
}