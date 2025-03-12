package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        // super 키워드를 사용함으로서 부모의 자원이라는 것을 명시하여 사용할 수 있다. (부모와 자식의 필드, 메서드명이 같을 경우)
        System.out.println("this value : " + this.value);
        System.out.println("super value : " + super.value);

        this.hello();
        super.hello();
    }

}
