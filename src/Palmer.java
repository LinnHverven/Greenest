public class Palmer extends Växt implements Vätska{
    //Arv

    public Palmer (String namn, double längd){
        super(namn, längd);
    }

    public double räknaVätska(){
        return 0.5 * längd; //En palm behöver 0,5 liter kranvatten per dag * sin längd i meter.
    }

    public String getVätska(){
        return "kranvatten";
    }
}