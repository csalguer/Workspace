import edu.princeton.cs.algs4.Digraph;
import java.util.*;
import java.io.*;
/**
 * Created by Chris on 3/31/2016.
 */
public class WordNet {


    private final int nouns;
    private Digraph wordnet;











    /**
     * Constructor: WordNet()
     * Constructor for the WordNet object. Upon creation, initialize necessary data structures to hold both synsets and
     * hypernym relationships. Constructor parses synset and hypernym data and creates digraph representation of given
     * data.
     * ----------------------------------------------------------------------------------------------------------------
     * @param synsets The filename of the CSV .txt file containing all the nouns to be used in our WordNet
     * @param hypernyms The filename of the CSV .txt file containin all the hypernym relationships to be used in our
     *                  WordNet.
     * @return Iterable collection of all nouns
     */
    public WordNet(String synsets, String hypernyms){
        parseSynset(synsets);
        parseHypernym(hypernyms);
    }





    /**
     * Function: parseSynset
     * Getter function for all the nouns (vertices) in WordNet Digraph
     * ----------------------------------------------------------------------------------------------------------------
     * @param filename Takes in the CSV file that represents the list of hypernyms in the WordNet. Parses CSV file line
     *                 by line and tokenizes the entries. It processes the data and updates the WordNet internal
     *                 structures.
     */
    private void parseSynset(String filename){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                if(line.length != 3){
                    throw new  IOException();
                }
                int synsetID = Integer.valueOf(data[0]);
                String nouns = data[1];
                String gloss = data[2];
                System.out.print("Synset id: " + Integer.toString(synsetID) + ", noun(s): " + nouns + ", Gloss: " + gloss.substring(0,20) + "\n");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done with synset file");
    }






    /**
     * Function: parseHypernym
     * Getter function for all the nouns (vertices) in WordNet Digraph
     * ----------------------------------------------------------------------------------------------------------------
     * @param filename Takes in the CSV file that represents the list of synsets in the WordNet. Parses CSV file line
     *                 by line and tokenizes the entries. It processes the data and updates the WordNet internal
     *                 structures.
     */
    private void parseHypernym(String filename){
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(filename));
            List hypernymList = new LinkedList<String>();
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                int synsetID = Integer.valueOf(data[0]);

                for(int i = 1; i < data.length; i++){
                    hypernymList.add(data[i]);
                }
                System.out.print("Synset id: " + Integer.toString(synsetID) + " was processed.\n");
                hypernymList.clear();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Done with hypernym file");
    }







    /**
     * Function: nouns()
     * Getter function for all the nouns (vertices) in WordNet Digraph
     * ----------------------------------------------------------------------------------------------------------------
     * @return Iterable collection of all nouns
     */
    public Iterable<String> nouns(){
        return new LinkedList<String>();
    }


    // is the word a WordNet noun?
    public boolean isNoun(String word){

    }

    // distance between nounA and nounB (defined below)
    public int distance(String nounA, String nounB){

    }


    // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // in a shortest ancestral path (defined below)
    public String sap(String nounA, String nounB){

    }

    // do unit testing of this class
    public static void main(String[] args){

    }

}
