# 상속과 메모리 구조
- 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.
- 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이때 호출자의 타입을 통해 대상 타입을 찾는다
- 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾는다. 계속 올라가며 기능을 찾지 못하면 컴파일 오류가 발생한다.