package poly.ex3;

public class Dog extends AbstractAnimal{

    // 추상 클래스를 상속 받은 경우
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
