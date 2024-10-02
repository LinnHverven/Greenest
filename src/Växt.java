public abstract class Växt implements Vätska{

    protected String name;
    protected double längd;

    public Växt(String name, double längd){
        this.name = name;
        this.längd = längd;
    }

    public String getName(){
        return name;
    }

    public double getLängd() {
        return längd;
    }
}
