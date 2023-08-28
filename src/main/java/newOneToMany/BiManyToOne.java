package newOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BiManyToOne {

    @Id
    int id;

    int marks;

    String answer;

    @ManyToOne
    BiOneToMany Ques;

    public BiManyToOne(){
        super();
    }

    public BiManyToOne(int id, int marks, String answer, BiOneToMany Ques){
        this.answer = answer;
        this.id = id;
        this.marks =marks;
        this.Ques = Ques;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public void setQues(BiOneToMany ques) {
        Ques = ques;
    }

    public BiOneToMany getQues() {
        return Ques;
    }
}
