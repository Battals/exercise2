package demo;

import java.util.ArrayList;

public class Raflebæger {

// Lav en klasse "Raflebæger" med en attribut for et antal terninger i begæret og en constructor der angiver antallet af terninger.
// Tilføj en metode "Ryst" der ryster bægeret, og returnerer det samlede antal øjne
// Tilføj en metode "se" der returnere listen af terningernes øjne

    int antalterninger;
    int antaløjne;


    public Raflebæger(int antalterninger, int antaløjne) {

        this.antalterninger = antalterninger;
        this.antaløjne = antaløjne;

    }

    public Raflebæger() {



    }

    public Raflebæger(int antalterninger){

    }


    public double ryst() {
        double antaløjne = Math.floor(Math.random() * antalterninger * 6);
        System.out.println("Du har rystet raflebægeret");
        System.out.println("Terningerne viser: ");
        return antaløjne;
    }


    public int see() {
        System.out.println("Antal øjne: ");
        return antaløjne;
    }


    @Override
    public String toString() {
        String toString = "";
        return "Raflebæger { " +
                "antalterninger = " + antalterninger +
                ", antaløjne = " + antaløjne +  " }";
    }

public ArrayList<Raflebæger> list = new ArrayList<>();

public void addtolist(Raflebæger raflebæger){
Raflebæger hy = new Raflebæger(antalterninger, antaløjne);
list.add(hy);
}

public ArrayList<Raflebæger> getList(){
return list;
}

    }

