package _18_Class2.Phone;

public class Phone {

    int battery;
    boolean isPowerOn;

    void turnOn() {
        if (battery >= 10) {
            isPowerOn = true;
            System.out.println("전원 켜기");
        } else {
            System.out.println("배터리가 부족합니다. 전원을 켤수 없습니다");
        }
    }

    void turnOff() {
        if (isPowerOn) {
            System.out.println("이미 전원이 꺼져있습니다");
            return;
        }

        isPowerOn = false;
        System.out.println("전원을 끕니다.");
        }

    void playYoutube() {
        if (!isPowerOn) {
            System.out.println("전원을 먼저 켜주세요");
            return;
        }
        if (battery <5 ) {
            System.out.println("배터리가 부족합니다(최소 5%필요)");
            return;
        }

        battery -=5;
        System.out.println("유투브 시작!");

    }
    void  charge() {
        battery += 20;
        if (battery > 100) {
            battery = 100;
        }
        System.out.println("최대 충전입니다. 더이상 충전할수 없습니다");
    }
    }

