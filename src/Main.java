import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nRandom number");
        System.out.println("--------------");

        double randomNumber = Math.random();

        System.out.println("Random double from 0.00 to 1.00: " + randomNumber);
        int randomInt = (int)(randomNumber*20);
        System.out.println("Random int from 0 to 20: " + randomInt);

        System.out.println();
        //TablicaJednowymiarowa[] - wypełnienie jednowymiarowej tablicy 20ma elementami
        //wygenerowanymi losowo, z przedziału od 0 do 20.
        int[] TablicaJednowymiarowa = new int [20];
        for(int i = 0; i< TablicaJednowymiarowa.length; i++)
        {
            TablicaJednowymiarowa[i]=(int)(Math.random()*20);;
        }

        //Wyświetlenie elementów tablicy TablicaJednowymiarowa[]
        System.out.println("TablicaJednowymiarowa: ");
        System.out.println("----------------------------");

        for(int value: TablicaJednowymiarowa)
        {
            System.out.print(value + " ");

        }

        //TablicaDwuwymiarowa[][] - wypełnienie dwuwymiarowej tablicy 20ma elementami
        //wygenerowanymi losowo, z przedziału od 0 do 20.
        int[][] TablicaDwuwymiarowa = new int[4][5];
        for(int i = 0; i < TablicaDwuwymiarowa.length; i++)
        {
            for(int j = 0; j < TablicaDwuwymiarowa[i].length; j++)
            {
                TablicaDwuwymiarowa[i][j] = (int)(Math.random()*20);
            }
        }

        //Wyświetlenie elementów tablicy TablicaDwuwymiarowa[][]
        System.out.println("\n\nTablicaDwuwymiarowa[][]:");
        System.out.println("-------------------------");
        for(int i = 0; i < TablicaDwuwymiarowa.length; i++)
        {
            for(int j = 0; j < TablicaDwuwymiarowa[i].length; j++)
            {
                System.out.print(TablicaDwuwymiarowa[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        System.out.println("=== Inna Metoda ===\n");
        System.out.println("Jednowymiarowa >> ");
        int[] Jednowymiarowa = new int[20];
        uzupelnijJednowymiarow(Jednowymiarowa);
        wyswietlJednowymiarowa(Jednowymiarowa);
        System.out.println("\n");
        System.out.println("Dwuwymiarowa >> ");
        int[][] Dwuwymiarowa = new int[4][5];
        uzupelnijDwuwymiarowy(Dwuwymiarowa);
        wyswietlDwuwymiarowa(Dwuwymiarowa);

    }
    // Metoda do uzupełniania tablicy jednowymiarowej liczbami losowymi
    public static void uzupelnijJednowymiarow(int[] tablica)
    {
        Random losowa = new Random();
        for(int i = 0; i < tablica.length; i++)
        {
            tablica[i]= losowa.nextInt(21);
        }
    }
    // Metoda do wyświetlania zawartości tablicy jednowymiarowej

    public static void wyswietlJednowymiarowa(int[] tablica)
    {
        for(int value: tablica)
        {
            System.out.print(value + " ");
        }
    }

    // Metoda do uzupełniania tablicy dwuwymiarowej liczbami losowymi
    public static  void uzupelnijDwuwymiarowy(int[][] tablica)
    {
        Random losowa = new Random();
        for(int i=0; i < tablica.length; i++)
        {
            for(int j=0; j < tablica[i].length; j++)
            {
                tablica[i][j] = losowa.nextInt(21);
            }
        }
    }

    // Metoda do wyświetlania zawartości tablicy dwuwymiarowej

    public static void wyswietlDwuwymiarowa(int[][] tablica){

        for(int i=0; i < tablica.length; i++)
        {
            for(int j=0; j < tablica[i].length; j++)
            {
                System.out.print(tablica[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
