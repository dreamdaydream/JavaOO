package practice10;

public class Klass {
    private int number;
    private Student leader;
    boolean flag;

    public Klass(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    public String getDisplayName(){
        return "Class "+number;
    }

    public void assignLeader(Student student){
        if (!student.getKlass().flag){
            System.out.print("It is not one of us.\n");
        }else {
            student.getKlass().leader = student;
        }
    }

    public Student getLeader(){
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void appendMember(Student student){
        student.getKlass().flag= true;
    }

    public boolean isIn(Student student){
        if (student.getKlass().number ==this.number){
            return true;
        }
        else{
            return false;
        }
    }
}
