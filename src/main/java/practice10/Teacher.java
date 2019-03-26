package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> klass;
    public Teacher(int id,String name,int age) {
        super(id,name,age);
    }

    public Teacher(int id,String name,int age ,LinkedList<Klass> klass){
        super(id,name,age);
        this.klass= klass;
    }
    public LinkedList getClasses(){
        return klass;
    }

    public String introduce(){
        if (klass!=null){
            int size = klass.size();
            String classes="";
            for(int i=0; i<size-1; i++){
                classes = klass.get(i).getNumber()+", ";
            }
            classes = classes+klass.get(size-1).getNumber();
            return super.introduce()+" I am a Teacher. I teach Class "+ classes+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student){
        if(this.klass.contains(student.getKlass())){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }
    }

    public boolean isTeaching(Student student){
        if(this.klass.contains(student.getKlass())){
            return true;
        }
        else{
            return false;
        }

    }
}
