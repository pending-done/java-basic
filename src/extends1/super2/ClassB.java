package extends1.super2;

public class ClassB extends  ClassA{

    public ClassB(int a){
        // 부모의 생성자는 반드시 호출해야 하나
        super(); // 기본 생성자가 있는 경우 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b){
        // 부모의 생성자는 반드시 호출해야 하나
        super(); // 기본 생성자가 있는 경우 생략 가능
        System.out.println("ClassB 생성자 a+" + a + " b= " + b);
    }

}
