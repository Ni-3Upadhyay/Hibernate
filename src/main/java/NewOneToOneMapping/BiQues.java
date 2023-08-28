package NewOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BiQues {

    @Id
    int id;

    String ques;

    @OneToOne
    BiAns ans;

    public BiQues(){
        super();
    }

    public BiQues(int id , String ques, BiAns ans){
        this.ans = ans;
        this.ques =ques;
        this.id = id;
    }

    public void setAns(BiAns ans) {
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

    public BiAns getAns() {
        return ans;
    }
}
