package kopibiiin;
import java.util.Comparator;
public abstract class Caffiene {
    String name;
    int palpatation;
    int caffieneLevel;

    public Caffiene(String name, int palpatation, int caffieneLevel) {
        this.name = name;
        this.palpatation = palpatation;
        this.caffieneLevel = caffieneLevel;
    }

    public int getCaffieneLevel() {
        return caffieneLevel;
    }

    public void nomi(){

    }

    public String toString(){
        super.toString();
        return null;
    }

//    public static class sortbyCL implements Comparator<Caffiene>{
//
//    }

//    public static class sortbyName implements Comparator<Caffiene>{
//
//    }

    //i like you sa malayo
}
