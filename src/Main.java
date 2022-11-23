import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);

        int balance = 1000;
        
        System.out.println("\n Witamy w bankomacie");
        System.out.println(" \n Stan twojego konta wynosi 1000zl. \n Podaj kwotę, ktora chcesz wyplacic: ");

        int amount = skaner.nextInt();

        if (amount>balance){
            System.out.println("Brak wystarzajacych srodków na konie.");
        }else{
            System.out.println("Wyplacono: " + amount +" zl." +" Stan twojego konta wynosi: " + (balance - amount) + " zl.");
        }




    }
}