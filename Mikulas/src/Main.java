import Model.BadInputException;
import Model.Bag;
import Model.Present;
import Model.Toy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static Present decidePresent(String[] line){
        try{
            if (line.length == 3){
                Present newPresent = new Present(
                        line[0],
                        Double.parseDouble(line[1]),
                        Integer.parseInt(line[2])
                );
                return newPresent;
            } else if (line.length == 4) {
                Present newToy = new Toy(
                        line[0],
                        Double.parseDouble(line[1]),
                        Integer.parseInt(line[2]),
                        Integer.parseInt(line[3])
                );
                return newToy;
            }
            else {
                throw new BadInputException("Bad Input!");
            }
        }
        catch (BadInputException e) {
            System.out.println(e.getMessage());
            Runtime.getRuntime().exit(69);
        }
        return null;
    }
    private static void fillBag(Bag myBag){
        try{
            Scanner scanner = new Scanner(new File("./src/data.txt"));
            while (scanner.hasNextLine()){
                String[] line = scanner.nextLine().split(";");
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