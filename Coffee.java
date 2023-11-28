package kopibiiin;

import java.util.ArrayList;
import java.util.List;

public class Coffee implements CaffeineContent {
    private int size;
    private String name;
    List<Coffee> kopi = new ArrayList<>();

    public Coffee(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCoffe(Coffee cof){
        kopi.add(cof);
    }

    @Override
    public void cafcont() {
        System.out.println(getName());
        for(Coffee c : kopi){
            c.cafcont();
        }
    }
}
