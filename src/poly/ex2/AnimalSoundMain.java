package poly.ex2;

public class AnimalSoundMain {

    // 다형성을 사용하여 중복된 코드 개선

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        sound(dog);
        sound(cat);
        sound(caw);

    }

    // dog, cat, caw가 전부 animal을 상속받아 sound라는 메서드에 해당 인스턴스들 전달 가능
    public static void sound(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
