package newOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
public class BiOneToMany {

    @Id
    int id;

    String ques;

    @OneToMany(mappedBy = "Ques")
    List<BiManyToOne> ls;

    public BiOneToMany(){
        super();
    }

    public BiOneToMany(int id, String ques, List<BiManyToOne> ls){
        this.ques = ques;
        this.ls = ls;
        this.id = id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public List<BiManyToOne> getLs() {
        return ls;
    }

    public void setLs(List<BiManyToOne> ls) {
        this.ls = ls;
    }

}
