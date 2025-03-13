package poly;

public class PolyMain {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        Parent parent1 = new Child();
        parent1.parentMethod();


    }
}
