public class KöttätandeVäxter extends Växt implements Vätska{
    //Arv

    public KöttätandeVäxter (String name, double längd){
        super(name,längd);
    }

    public double räknaVätska(){
        return 0.1 + (0.2 * längd);
        //Köttätande växter: Dessa behöver alltid en basnivå av 0,1 liter proteindryck per dag
        // och sedan ett extra tillskott med 0,2 liter proteindryck * sin längd i meter.
    }

    public String getVätska(){
        return "proteindryck";
    }
}