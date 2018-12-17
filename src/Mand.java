public class Mand extends Menneske {

    //@Override


    public Mand() {
        egenskab = new Dovenlas();
        køn = "mand";
    }

    public String exclusiveMand () {

        return "det her gælder kun for mænd";
    }


    public String laver () {

        return "sparker dem bagi";
    }
}
