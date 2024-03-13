import java.util.Scanner;
public class Main {


    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe 1: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Wprowadz liczbe 2: ");
        int liczba2 = scanner.nextInt();
        System.out.println("Wprowadz liczbe 3: ");
        int liczba3 = scanner.nextInt();
       
        int najwiekszaliczba = liczba1;
      if (liczba2 > najwiekszaliczba)
      {
        najwiekszaliczba = liczba2;
      }
      if (liczba3 > najwiekszaliczba)
      {
        najwiekszaliczba = liczba3;
      }
      System.out.println("Najwieksza liczba: " + najwiekszaliczba);
    }
}