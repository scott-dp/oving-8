import static javax.swing.JOptionPane.*;
public class Main {
    public static void main(String[] args) {

        String readName=showInputDialog("Skriv inn fornavn");
        String readSurname=showInputDialog("SKriv inn etternavn");
        int readBrthYr=Integer.parseInt(showInputDialog("Skriv inn ditt fødselsår"));

        Person nyPerson=new Person(readName,readSurname,readBrthYr);

        String readArbtaknr=showInputDialog("Skriv inn arbeidstaker nummer");
        long arbnr=Long.parseLong(readArbtaknr);
        String readAnsettelsesAar=showInputDialog("Skriv inn ditt ansettelsesår");
        int ansAar=Integer.parseInt(readAnsettelsesAar);
        String readMaanedLonn=showInputDialog("Skriv inn månedslønn");
        double mndLonn=Double.parseDouble(readMaanedLonn);
        String readSkatteprosent=showInputDialog("Skriv inn skatteprosent");
        double skattPros=Double.parseDouble(readSkatteprosent);

        ArbTaker nyArbTaker=new ArbTaker(nyPerson, arbnr, ansAar, mndLonn, skattPros);

        System.out.println("Getters:");
        System.out.println(nyArbTaker.getArbtakenr());
        System.out.println(nyArbTaker.getPersonalia());
        System.out.println(nyArbTaker.getAnsettelsesAar());
        System.out.println(nyArbTaker.getMaanedLonn());
        System.out.println(nyArbTaker.getSkatteProsent());

        nyArbTaker.setMaanedLonn(30000);
        nyArbTaker.setSkatteProsent(15);


        System.out.println(nyArbTaker.skattetrekkPerMaaned());
        System.out.println(nyArbTaker.bruttolonnAar());
        System.out.println(nyArbTaker.skattetrekkAar());
        System.out.println(nyArbTaker.getNavn());
        System.out.println(nyArbTaker.getAlder());
        System.out.println(nyArbTaker.aarAnsatt());
        System.out.println(nyArbTaker.ansattLengerEnn(4));


        boolean fortsett=true;

        while(fortsett){
            String readValg=showInputDialog("For å endre på månedslønn skriv \"m\", for å endre på skatteprosent skriv \"s\", for å avslutte skriv \"x\"");
            switch (readValg){
                case "m":
                    String readNyLonn=showInputDialog("skriv inn ny månedslønn");

                    double nyLonn=Double.parseDouble(readNyLonn);
                    nyArbTaker.setMaanedLonn(nyLonn);
                    System.out.println(nyArbTaker);
                    break;
                case "s":
                    String readNyProsent=showInputDialog("Skriv inn ny skatteprosent");

                    double nyProsent=Double.parseDouble(readNyProsent);

                    nyArbTaker.setSkatteProsent(nyProsent);
                    System.out.println(nyArbTaker);
                    break;
                case "x":
                    fortsett=false;
                    break;
                default:
                    System.out.println("Du skrev ikke inn gyldig input");
            }

        }
    }
}