package _25_Casting.delivery;

// 부모 클래스
public class Delivery {
    protected int distance; // 배송거리
    protected int weight; // 배송물무게



    public Delivery(int distance, int weight) {
        this.distance = distance;
        this.weight = weight;
    }

    public int calcFee() {

        return 3000; // 무슨뜻
    }

    public void printInfo() {
        int fee = calcFee();
        System.out.println("배송비: " + fee);
    }
}
