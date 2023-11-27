import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Program generuje liczby losowe z zakresu 0 do 20 i wypełnia nimi tablice jedno i dwuwymiarowe.
        System.out.println("\nRandom number");
        System.out.println("--------------");

        //Przy użyciu metody Math.random() generujemy losową liczbę zmiennoprzecinkową (typu double),
        //z zakresu od 0.0 do 1.0
        //Wynik działania metody Math.random() przypisujemy do zmiennej randomNumber, która jest typu double.
        double randomNumber = Math.random();

        //Wypisanie losowej liczby zmiennoprzecinkowej z zakresu 0.0 do 1.0.
        System.out.println("Random double from 0.00 to 1.00: " + randomNumber);

        //Pomnożenie randomNumber przez 21 powoduje rozszerzenie zakresu losowania od (0.0, 1.0) do (0.0, 21.00)
        //randomNumber będzie teraz zawierało liczby zmiennoprzecinkowe z zakresu od 0.0 do 20.99..
        //(int)(randomNumber*21) - (int) jest rzutowaniem na typ 'int'. Powoduje to obcięcie części dziesiętnej liczby
        //i pozostawienie części całkowitej. W rezultacie losowana będzie liczba całkowita z przedziału od 0 do 20.
        int randomInt = (int)(randomNumber*21);

        //Wyświetlenie zmiennej randomInt, która jest losową liczbą całkowitą z przedziału od 0 do 20.
        System.out.println("Random int from 0 to 20: " + randomInt);

        System.out.println();
        //TablicaJednowymiarowa[] - wypełnienie jednowymiarowej tablicy 20ma elementami
        //wygenerowanymi losowo, z przedziału od 0 do 20.
        //Utworzenie tablicy jednowymiarowej, która będzie zawierać 20 elemantów typu int.
        int[] TablicaJednowymiarowa = new int [20];
        //Iteracja przez wszystkie indeksy tablicy za pomocą pętli for i za pomocą metody (int)(Math.random()*21)
        // przypisanie losowej liczby całkowitej z zakresu 0 do 20  do elementu o indeksie 'i'
        for(int i = 0; i< TablicaJednowymiarowa.length; i++)
        {
            TablicaJednowymiarowa[i]=(int)(Math.random()*21);;
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
        //Podobnie jak wyżej, tylko tym razem tworzymy tablicę dwuwymiarową o rozmiarze 4x5 i za pomocą podwójnej pętli for
        // (zewnętrzna iteruje przez wiersze, a wewnętrzna iteruje przez kolumny), uzupełniamy elementy o indeksie '[i][j]'
        // losowymi liczbami całkowitymi z zakresu 0 do 20.
        int[][] TablicaDwuwymiarowa = new int[4][5];
        for(int i = 0; i < TablicaDwuwymiarowa.length; i++)
        {
            for(int j = 0; j < TablicaDwuwymiarowa[i].length; j++)
            {
                TablicaDwuwymiarowa[i][j] = (int)(Math.random()*21);
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

        // Inny sposób, który wykorzystuje wcześniej przygotowane metody uzupełnienia i wyświetlenia tablic jedno i
        // dwuwymiarowych.
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
    //Random losowa = new Random() - utworzenie obiektu klasy Random o nazwie losowa.
    // Obiekt będzie używany do generowania licz losowych.
    //Metoda nextInt(21) obiektu losowa generuje losową liczbę całkowitą z zakresu 0 do 20 i wewnątrz pętli, przypisuje ją
    //do elementu tablicy o indeksie [i].
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
//
}
