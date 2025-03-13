import java.util.Scanner;

public class InteractiveFractionParsing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Prosím zadejte dva zlomky (a+b)");
            String TryParseInput=scanner.nextLine().trim();


            try
            {

              Fraction zlomkysum= Fraction.parse(TryParseInput);
                System.out.println("Zadal jste zlomek " + zlomkysum);


            } catch (Exception e) {
                System.out.println("Zadal jste neplatný řetězec ABC");
            }




        }

    }




}
