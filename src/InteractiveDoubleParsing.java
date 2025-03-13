import java.util.Scanner;

public class InteractiveDoubleParsing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Prosím zadejte zlomky ke sčítaní");
            String TryParseInput=scanner.nextLine();
            try
            {
                double cislo=Double.parseDouble(TryParseInput);
                System.out.println(cislo);

            } catch (NumberFormatException e) {
                System.out.println("Zadal jste neplatný řetězec ABC");
            }




        }
    }

}
