package Chapter1;

/**
 * Created by Wahyu on 3/22/2017.
 */
public class Ex1_11_PopulationProjection {
    public static void main(String[] args){
        System.out.println("1 year = 365 days");
        System.out.print("2 years = ");
        System.out.print(365 * 2);
        System.out.println(" days");
        System.out.print("3 years = ");
        System.out.print(365 * 3);
        System.out.println(" days");
        System.out.print("4 years = ");
        System.out.print(365 * 4);
        System.out.println(" days");
        System.out.print("5 years = ");
        System.out.print(365 * 5);
        System.out.println(" days");
        System.out.println("");

        System.out.println("1 day = 24 hours");
        System.out.println("1 hour = 60 minutes");
        System.out.println("1 minutes = 60 seconds");
        System.out.print("1 day = ");
        System.out.print(24 * 60 * 60);
        System.out.println(" seconds");
        System.out.println("");

        System.out.println("1 years = 365 days * 86400 seconds");
        System.out.print("        = ");
        System.out.print(365 * 86400);
        System.out.println(" seconds");
        System.out.println("");

        System.out.println("2 years = 730 days * 86400 seconds");
        System.out.print("        = ");
        System.out.print(31536000*2);
        System.out.println(" seconds");
        System.out.println("");

        System.out.println("3 years = 1095 days * 86400 seconds");
        System.out.print("        = ");
        System.out.print(31536000*3);
        System.out.println(" seconds");
        System.out.println("");

        System.out.println("4 years = 1460 days * 86400 seconds");
        System.out.print("        = ");
        System.out.print(31536000*4);
        System.out.println(" seconds");
        System.out.println("");

        System.out.println("5 years = 1825 days * 86400 seconds");
        System.out.print("        = ");
        System.out.print(31536000*5);
        System.out.println(" seconds");
        System.out.println("");

        System.out.println("+1 Population every 7 seconds of birth");
        System.out.println("-1 Population every 13 seconds of death");
        System.out.println("+1 Population every 45 seconds of immigrant");
        System.out.println("");

        System.out.print("In 5 years there are ");
        System.out.print(157680000.0/7);
        System.out.println(" of births");
        System.out.print("In 5 years there are ");
        System.out.print(157680000.0/13);
        System.out.println(" of deaths");
        System.out.print("In 5 years there are ");
        System.out.print(157680000.0/45);
        System.out.println(" of immigrant comes");
        System.out.println("");

        System.out.println("U.S. current population is 312,032,486");
        System.out.print("In 1 year the population will be ");
        System.out.println(312032486 + (31536000.0/7) - (31536000.0/13) + (31536000.0/45));
        System.out.print("In 2 years the population will be ");
        System.out.println(312032486 + (63072000.0/7) - (63072000.0/13) + (63072000.0/45));
        System.out.print("In 3 years the population will be ");
        System.out.println(312032486 + (94608000.0/7) - (94608000.0/13) + (94608000.0/45));
        System.out.print("In 4 years the population will be ");
        System.out.println(312032486 + (126144000.0/7) - (126144000.0/13) + (126144000.0/45));
        System.out.print("In 5 years the population will be ");
        System.out.println(312032486 + (157680000.0/7) - (157680000.0/13) + (157680000.0/45));
    }
}
