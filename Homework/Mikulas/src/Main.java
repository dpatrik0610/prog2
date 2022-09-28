import Model.BadInputException;
import Model.Bag;
import Model.Present;
import Model.Toy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    /** Decides if the new line is a valid 3 or 4 param. Present*/
    private static Present decidePresent(String[] line){
        try{
            Present newPresent;
            if (line.length == 3){
                newPresent = new Present(
                        line[0],
                        Double.parseDouble(line[1]),
                        Integer.parseInt(line[2])
                );
            } else if (line.length == 4) {
                newPresent = new Toy(
                        line[0],
                        Double.parseDouble(line[1]),
                        Integer.parseInt(line[2]),
                        Integer.parseInt(line[3])
                );
            }
            else {
                throw new BadInputException("Bad Input!");
            }
            return newPresent;
        }
        catch (BadInputException e) {
            System.out.println(e.getMessage());
            Runtime.getRuntime().exit(400);
        }
        return null;
    }
    /** Fills the bag with the proper Presents */
    private static void fillBag(Bag myBag){
        try{
            Scanner scanner = new Scanner(new File("./src/data.csv"));
            while (scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(",");
                myBag.addPresent(decidePresent(line));
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            Runtime.getRuntime().exit(69);
        }
    }
    public static void main(String[] args) {
        Bag myBag = new Bag();
        fillBag(myBag);
        System.out.println("Content of my bag:");
        myBag.showContent();
        System.out.println();
        System.out.println("Total Value: " + myBag.sumPrice());
        if (myBag.getPresent(3).equals(myBag.getPresent(6))) System.out.println("item 3 and 6 equal.");
        else System.out.println("Not Equal.");
        if (myBag.getPresent(1).equals(myBag.getPresent(2))) System.out.println("Fox and Wolf equal");
        else System.out.println("Fox plush is not Wolf plush >w<");
    }
}