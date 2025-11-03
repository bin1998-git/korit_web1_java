package _25_Casting.delivery;

 // 부모클래스에서 calcFee의 리턴값을 3000으로 했어도
 // 자식클래스에서 오버로딩으로 인하여 3000리턴값을 무시.

public class Fast extends Delivery{
    public Fast(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public int calcFee() {
        System.out.println("특급배송 계산 시작");
        int fee = 4000 + distance * 300 + weight * 200;
        return fee;

    }

}
