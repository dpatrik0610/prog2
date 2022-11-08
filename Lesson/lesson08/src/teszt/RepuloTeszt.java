package teszt;

import legikozlekedes.Legitarsasag;
import repules.Repulogep;
import repules.Utasszallito;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RepuloTeszt {
    public static void main(String[] args) {
        List<Repulogep> repulogepList = new ArrayList<>();
        try {
            File myObject = new File(args[0]);
            Scanner myReader = new Scanner(myObject);
            while(myReader.hasNextLine()){
                String line = myReader.nextLine();
                String[] data = line.split(";");
                try{
                    if (data[0].equals("R")){
                        repulogepList.add(new Repulogep(data[1],
                                data[2],
                                Double.parseDouble(data[3]),
                                Boolean.parseBoolean(data[4]))
                        );
                    }

                    if (data[0].equals("U")){
                        repulogepList.add(new Utasszallito(
                                data[1],
                                data[2],
                                Double.parseDouble(data[3]),
                                Boolean.parseBoolean(data[4]),
                                Integer.parseInt(data[5]))
                        );
                    }
                }catch (IllegalArgumentException e){
                    System.out.println("Rossz adat!");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nincs ilyen file!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ning megadva a file neve!");
        }
        System.out.println(repulogepList);

        Legitarsasag legitarsasag;
        try {
            legitarsasag = new Legitarsasag(args[1], repulogepList);
        }catch (ArrayIndexOutOfBoundsException e){
            legitarsasag = new Legitarsasag("Unideb Airlines", repulogepList);
        }
        System.out.println(legitarsasag.name);

        Scanner scanner = new Scanner(System.in);
        //int ferohely = scanner.nextInt();
        //System.out.println(legitarsasag.megfelelőGépek(ferohely));
        //String gyarto = scanner.nextLine();
        //kiiratas(repulogepList, gyarto);
        legitarsasag.kiirCsakRepulo();
    }

    public static void kiiratas(Collection<Repulogep> repulogepCollection, String gyarto){
        for (Repulogep repulo : repulogepCollection){
            if (repulo.getGyarto().equalsIgnoreCase(gyarto)){
                System.out.println(repulo.getClass() + " " + repulo);
            }
        }
    }
}
