package EmbeddableAnnotation;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Certificate")
public class Std {
    @Id
    private int sId;
    private String sName;
    private String sQualification;

    private Certificate certificate;

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public int getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }

    public String getsQualification() {
        return sQualification;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsQualification(String sQualification) {
        this.sQualification = sQualification;
    }

    public Std(){
        super();
    }
}
