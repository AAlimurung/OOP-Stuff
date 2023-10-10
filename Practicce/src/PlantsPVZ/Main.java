package PlantsPVZ;

//PAIR: KISTERIA
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int INFINITE = Integer.MAX_VALUE;

    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Game Mode: ");
        String mode = sc.nextLine();

        String input;
        do {
            System.out.print("Add a plant: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                case "Wall Nut":
                    plants.add(new Plant.WallNut());
                    break;
                case "Sun-shroom":
                    plants.add(new Mushroom.SunShroom(false));
                    break;
                // add more plants here
                case "Sunflower":
                    plants.add(new Plant.Sunflower());
                    break;
                case "Peashooter":
                    plants.add(new Plant.Peashooter());
                    break;
                case "Puff-shroom":
                    plants.add(new Mushroom.PuffShroom(false));
                    break;
                case "Doom-shroom":
                    plants.add(new Mushroom.DoomShroom(false));
                    break;
                case "Jalapeno":
                    plants.add(new Plant.Jalapeno());
                    break;
                case "Squash":
                    plants.add(new Plant.Squash());
                    break;
                case "Lily Pad":
                    plants.add(new Plant.LilyPad());
                    break;
                case "Cattail":
                    break;
                case "Coffee Bean":
                    Plant.CoffeeBean cb = new Plant.CoffeeBean();
                    for (Plant p : plants){
                        if(p instanceof Mushroom){
                            if(((Mushroom)p).isAwake()){
                            }else {
                                ((Mushroom)p).awaken(cb);
                                break;
                            }
                        }
                    }
                    break;
                default:
                    System.out.println(input + " is not a plant");
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Do something: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    break;
                case "Produce Sun":
                    // add implementation here
                    int counterSun = 0;
                    int counterSunProducer = 0;
                    for(Plant p : plants){
                        if(p instanceof SunProducer){
                            counterSun += ((SunProducer)p).produce_sun();
                            counterSunProducer++;
                            System.out.println(p.name + " produces " +  ((SunProducer)p).produce_sun() + " suns");
                        }
                    }
                    System.out.println(counterSunProducer + " sun producers gather " + counterSun + " suns");
                    break;
                case "Attack":
                    // add implementation here
                    for(Plant p : plants){
                            
                    }
                    break;
                // add more cases here
                case "Attacker Status":
                    for(Plant p : plants){
                        if(p instanceof Attacker) {
                            if (((Attacker) p).rangeType() == 0) {
                                System.out.println(p.name + " can attack on a single line");
                            }
                            if (((Attacker) p).rangeType() == 1) {
                                System.out.println(p.name + " can attack using area-of-effect");
                            }
                            if (((Attacker) p).rangeType() == -1) {
                                System.out.println(p.name + " can attack only when enemy is nearby");
                            }
                        }
                    }
                    break;
                case "Instant Kill Status":
                    for(Plant p : plants){
                        if(p instanceof InstantKiller){
                            if(((InstantKiller)p).killType() == 1){
                                System.out.println(p.name + " can kill instantly");
                            }
                            if(((InstantKiller)p).killType() == 0){
                                System.out.println(p.name + " can kill on contact");
                            }
                        }
                    }
                    break;
                case "Sort by HP":
                  plants.sort(new Plant.sortbyHP());
                    for(Plant p : plants){
                        if(p.hp == INFINITE){
                            System.out.println(p.name + " (∞) - cost: " + p.sun_cost);
                        }else{
                            System.out.println(p.name + " (" + p.hp + ") - cost: " + p.sun_cost);
                        }
                    }
                    break;
                case "Sort by Sun Cost":
                    plants.sort(new Plant.sortbySunCost());
                    for(Plant p : plants){
                        if(p.hp == INFINITE){
                            System.out.println(p.name + " (∞) - cost: " + p.sun_cost);
                        }else{
                            System.out.println(p.name + " (" + p.hp + ") - cost: " + p.sun_cost);
                        }
                    }
                    break;
                case "Sort by Name":
                    plants.sort(new Plant.NameComparator());
                    for(Plant p : plants){
                        System.out.println(p);
                    }
                    break;
                default:
                    System.out.println("Unknown action: " + input);
            }
        } while (!input.equals("DONE"));
    }
}
