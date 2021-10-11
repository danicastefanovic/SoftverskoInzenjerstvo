package projekat;

/**
 *
 * @author Danica
 */
public class KnjigeBean {
    private int id;
    private String knjiga;
    private int ocena;
    private String zanr;
    private byte[] slika;
    
    
    
    public KnjigeBean(int id,String knjiga,int ocena,String zanr,byte[] slika){
        this.id=id;
        this.knjiga=knjiga;
        this.ocena=ocena;
        this.zanr=zanr;
        this.slika=slika;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(String knjiga) {
        this.knjiga = knjiga;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public byte[] getSlika() {
        return slika;
    }

    public void setSlika(byte[] slika) {
        this.slika = slika;
    }
}
