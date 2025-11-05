package _32_Enum;

public enum PaymentMethod {

    /*
    결제 수단별 수수료 시스템을 정의해 주세요
    현금(CASH) - 0, 카드(CARD) - 2, 모바일(MOBILE) - 5
    필드로 수수료율과 한글표시명을 가져야 한다.
    메서드 - 1. 수수료계산하는 메서드(calcFee),
           2.한글명 리턴하는 메서드(getName)


     */

        // public static final PaymentMethod CASH = new PaymentMethod(0,"현금")
        // 변수명(생성자 매개변수들) -> CASH(0,"현금")
        // 상수 인스턴스들은 최상단에 선언되어야 한다.
        CASH(0, "현금"),
        CARD(2, "카드"),
        MOBILE(5, "모바일");

        private int feeRate;
        private String name;


        // 생성자
        PaymentMethod(int feeRate, String name) {
            this.feeRate = feeRate;
            this.name = name;
        }

        public double calcFee(int amount){
            return amount * feeRate / 100.0;
        }

        public String getName() {
            return name;
        }

}
