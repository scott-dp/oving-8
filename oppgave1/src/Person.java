public class Person {
    private String fornavn;
    private String etternavn;
    private int fodseslsAar;

    public Person(String fornavn,String etternavn,int fodseslsAar){
        this.fornavn=fornavn;
        this.etternavn=etternavn;
        this.fodseslsAar=fodseslsAar;
    }

    public int getFodseslsAar() {
        return fodseslsAar;
    }

    public String getFornavn(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }
}
