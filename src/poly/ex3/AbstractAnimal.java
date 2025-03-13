package poly.ex3;

public abstract class AbstractAnimal {

    // 추상 클래스는 하나 이상의 추상 메서드가 꼭 있어야 한다.
    public abstract void sound();
    
    public void move(){
        System.out.println("동물이 움직임");
    }
}
