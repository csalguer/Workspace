/**
 * Created by Chris on 2/7/2016.
 */
public class FunnyPlant {


    public int compute(int people, int plants){
        int fruits = 0;
        int weeks = 0;
        while ( fruits < people){
            weeks += 1;
            fruits += plants;
            plants += fruits;
        }
        return weeks + 1;
    }
    /*
     * Class Constructor
     *
     */
    public static void main(String[] args){

        int plants = 1;
        int people = 15;
        FunnyPlant problem = new FunnyPlant();
        System.out.print(problem.compute(people, plants));
    }






}
