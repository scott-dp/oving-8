public class ArbTaker {
    private Person personalia;
    final private long arbtakenr;
    final private int ansettelsesAar;
    private double maanedLonn;
    private double skatteProsent;
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
    int aar = kalender.get(java.util.Calendar.YEAR);

    public ArbTaker(Person personalia, long arbtakenr, int ansettelsesAar, double maanedLonn, double skatteProsent){
        this.personalia=personalia;
        this.arbtakenr=arbtakenr;
        this.maanedLonn=maanedLonn;
        this.ansettelsesAar=ansettelsesAar;
        this.skatteProsent=skatteProsent;
    }

    public Person getPersonalia(){//samarbeider med personalia
        return personalia;
    }

    public long getArbtakenr(){
        return arbtakenr;
    }
    public int getAnsettelsesAar(){
        return ansettelsesAar;
    }

    public double getMaanedLonn(){
        return maanedLonn;
    }

    public double getSkatteProsent(){
        return skatteProsent;
    }

    public void setMaanedLonn(double nyLonn){
        maanedLonn=nyLonn;
    }

    public void setSkatteProsent(double nyProsent){
        skatteProsent=nyProsent;
    }

    public void setPersonalia(Person personalia){
        this.personalia=personalia;
    }

    public double skattetrekkPerMaaned(){
        return getMaanedLonn()*(getSkatteProsent()/100.0);
    }

    public double bruttolonnAar(){
        return getMaanedLonn()*12;
    }

    public double skattetrekkAar(){
        double skattetrekk=skattetrekkPerMaaned()*10;//alle maaned utenom juni og desember
        skattetrekk+=skattetrekkPerMaaned()*0.5;//skatt i desember
        return skattetrekk;
    }

    public String getNavn(){//samarbeider med personalia
        return personalia.getEtternavn()+", "+personalia.getFornavn();
    }

    public int getAlder(){//samarbeider med personalia
        return aar-personalia.getFodseslsAar();
    }

    public int aarAnsatt(){
        return aar-getAnsettelsesAar();
    }

    public boolean ansattLengerEnn(int limit){
        return aarAnsatt() > limit;
    }

    public String toString(){//samarbeider med personalia
        return getNavn()+", din månedslønn er "+getMaanedLonn()+" og din skatteprosent er "+getSkatteProsent()+". Brutto lønn år: "+bruttolonnAar()+" skattetrekk per måned og år er henholdsvis: "+skattetrekkPerMaaned()+" "+skattetrekkAar();
    }
}
