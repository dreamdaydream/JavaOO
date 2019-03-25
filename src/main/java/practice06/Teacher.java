package practice06;

public class Teacher extends Person {
    private Integer klass;
    public Teacher(String name, int age,Integer ...klass) {
        super(name, age);
        if (klass.length==0){
            this.klass = null;
        }
        else{
            for(int item : klass){
                this.klass=item;
            }
        }
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        if (klass!=null){
            return super.introduce()+" I am a Teacher. I teach Class "+ klass+".";
        }
        else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }
    }
}
