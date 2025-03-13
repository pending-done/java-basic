package interface1;

public class InterfaceMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        sound(cat);
        sound(dog);

    }

    public static void sound(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
