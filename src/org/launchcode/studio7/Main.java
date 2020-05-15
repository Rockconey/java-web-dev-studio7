package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD music = new CD("Music to Love");
        CD photos = new CD("Music to Love");
        System.out.println(music.getName());
        music.setSpinRate(500);
        music.setStorageCapacity(700);
        music.setContents("Sofi Tukker, White Lies, Ramin Djawadi");
        System.out.println(music.toString());

        music.spinDisc();
        music.eraseDisc();

        DVD movies = new DVD("Good Movies");
        movies.setContents("The Sting, Jojo Rabbit, Parasite");
        movies.setSpinRate(1600);
        movies.setStorageCapacity(984);
        System.out.println(movies.toString());
        movies.spinDisc();

        System.out.println(music.equals(photos));

        Vinyl raconteurs = new Vinyl("Help Us, Stranger", "A");
        raconteurs.setContents("Steady as She Goes, Help Me Stranger, Only Child");
        raconteurs.setSpinRate(45);
        raconteurs.setStorageCapacity(440);
        System.out.println(raconteurs.toString());
        raconteurs.spinDisc();


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
