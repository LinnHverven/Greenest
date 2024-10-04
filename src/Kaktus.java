public class Kaktus extends Växt implements Vätska{
    //Arv

    public Kaktus(String name, double längd) {
        super(name, längd);
    }

    public double räknaVätska() {
        return 0.02; //2 cl är 0,02 liter vatten
        //Kaktusar: Varje kaktus ska ha 0,02 l mineralvatten/dag, oberoende av kaktusens storlek.
    }

    public String getVätska() {
        return "mineralvatten";
    }
}