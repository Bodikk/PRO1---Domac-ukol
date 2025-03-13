import java.util.regex.Pattern;

public class Fraction {
    long n; //čitatel
    long d; //jmenovatel


    public Fraction(long n, long d) {

        this.n = n;
        this.d=d;
        System.out.println("\n");
    }

    public static Fraction parse(String s) {

        s = s.replace(" ","");
        String[] split = s.split(Pattern.quote("+"));
        Fraction sum = new Fraction(0,1);
        for (String part : split)
        {
            Fraction partFraction;
            if(part.contains("%")) {
                partFraction = new Fraction(
                        Long.parseLong(part.replace("%","")),
                        100);
            }
            else {
                String[] split2 = part.split("/");
                partFraction = new Fraction(
                        Long.parseLong(split2[0]),
                        Long.parseLong(split2[1]));
            }
            sum = sum.add(partFraction);
        }
        return sum;
    }

    public Fraction add(Fraction other)
    {
        long nnn = n * other.d + other.n * d;
        long ddd = d * other.d;
        long gcd=Utils.GCD(nnn,ddd);
        return new Fraction(nnn/gcd,ddd/gcd);

    }
    public String toString() {
        return n + "/" + d;
    }




}
