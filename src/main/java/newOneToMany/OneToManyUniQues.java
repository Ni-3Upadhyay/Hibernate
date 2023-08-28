package newOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class OneToManyUniQues {

    @Id
    int id;

    String ques;

    @OneToMany
    List<OneTomanyUniAns> ls;

    public OneToManyUniQues(){
        super();
    }

    public OneToManyUniQues(int id, String ques, List<OneTomanyUniAns> ls){
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

    public List<OneTomanyUniAns> getLs() {
        return ls;
    }

    public void setLs(List<OneTomanyUniAns> ls) {
        this.ls = ls;
    }


}
