package NewOneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BiAns {

    @Id
    int id;

    String ans;

    @OneToOne(mappedBy = "ans")             // by using mapped by both tables will not show an extra column of foreign key only one will show
    BiQues question;                        // the other table will have the reference column.

    public BiAns(){
        super();
    }

    public BiAns(int id, String ans){
        this.id = id;
        this.ans = ans;
    }

    public void setQuestion(BiQues question) {
        this.question = question;
    }

    public BiQues getQuestion() {
        return question;
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
