package practice11;

import java.util.Observable;

public class Klass extends Observable{
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
            this.leader = student;
        }
        setChanged();
        notifyObservers();
    }

    public Student getLeader(){
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void appendMember(Student student){
        student.getKlass().flag= true;
        setChanged();
        notifyObservers();
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
