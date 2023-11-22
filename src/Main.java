
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
    }

}