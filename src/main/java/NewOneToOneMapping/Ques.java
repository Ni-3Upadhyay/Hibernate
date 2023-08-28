package NewOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ques {

    @Id
    int id;

    String ques;

    @OneToOne
    Answer ans;

    public Ques(){
        super();
    }

    public Ques(int id , String ques, Answer ans){
        this.ans = ans;
        this.ques =ques;
        this.id = id;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getQues() {
        return ques;
    }

    public Answer getAns() {
        return ans;
    }
}
