package kopibiiin;

public class RootBeer implements CaffeineContent{
    private int size;
    private int caflvl;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCaflvl() {
        return caflvl;
    }

    public void setCaflvl(int caflvl) {
        this.caflvl = caflvl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RootBeer(int size, int caflvl, String name) {
        this.size = size;
        this.caflvl = caflvl;
        this.name = name;
    }

    @Override
    public void cafcont() {
        System.out.println(getName() + ": " + getCaflvl());
    }
}
