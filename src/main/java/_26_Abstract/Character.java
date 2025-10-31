package _26_Abstract;

// 게임캐릭터
public abstract class Character { // 추상메서드는 클래스 앞에도 avstract 사용해야함
    // 추상(abstract) : 명세만 있고, 구체적인 구현은 없는 것
    // 추상클래스: 추상메서드를 하나 이상 포함하는 클래스
    // 추상메서드: 메서드의 시그니처만 정의하고, 구현(중괄호)를 생략
    // 상속받는 클래스에서는, 반드시 부모의 추상메서드를 오버라이딩 해줘야 한다.

    protected String name; // 이름
    protected int Hp; // 체력
    protected int attackDamage; // 공격력

    public Character(String name, int hp, int attackDamage) {
        this.name = name;
        this.Hp = hp;
        this.attackDamage = attackDamage;
    }

    // 각 캐릭터마다 공격하는 방식은 달라져야 한다.
    // 추상메서드 -> {} 중괄호 x
    public abstract void attack(Character target);

    public void showStatus() {
        System.out.println(name + " 체력: " + Hp);
    }

    // 데미지를 받는 공통 메서드
    public void receiveDamage(int damage) {
        this.Hp -= damage;
        if (this.Hp <=0 ){
            this.Hp = 0; // this 생략가능할까?
            System.out.println(name + "가 쓰러졌습니다.");
        }
    }

    public String getName() {
        return name;
    }
}
