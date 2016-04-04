/**
 * Created by Chris on 2/8/2016.
 */
public class SailorsNMonkeys {

    public int nighttime(int numSailors){
        //Least case scenario, each sailor has one coconut in the morning
        int coconuts = numSailors;
        int share = numSailors
        for(int i = 0; i < numSailors; i++){
           coconuts += 1 + 5*share;
            share = coconuts;
        }
        System.out.print(coconuts);

    }

    public static void main(String[] args){

        int numSailor = 5;
        SailorsNMonkeys test = new SailorsNMonkeys();
        test.nighttime(numSailor);
    }
}
