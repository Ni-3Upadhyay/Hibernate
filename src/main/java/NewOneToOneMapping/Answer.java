package NewOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

    @Id
    int id;

    String ans;

    public Answer(){
        super();
    }

    public Answer(int id, String ans){
        this.id = id;
        this.ans = ans;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }
}
