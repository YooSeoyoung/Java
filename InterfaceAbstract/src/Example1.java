//전자장치 추상클래스
abstract class Device{
    String brand;
    String model;

    public Device() {
    }

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void powerOn(){
        System.out.println(brand+" "+ model+ "전원 켜짐");
    }
    public void powerOff(){
        System.out.println(brand+" "+ model+ "전원 꺼짐");
    }
    public abstract void doFunction(); //추상메서드(기능 구현)
}
interface Wifi{
    void connectToWifi(); // 인터페이스 추상 메서드
}
interface Bluetooth{
    void connetToBluetooth();
}

//휴대폰
class Phone extends Device implements Wifi,Bluetooth{
    public Phone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void doFunction() {
        System.out.println("휴대폰으로 전화를 겁니다.");
    }

    @Override
    public void connetToBluetooth() {
        System.out.println("휴대폰으로 블루투스에 연결합니다.");
    }

    @Override
    public void connectToWifi() {
        System.out.println("휴대폰으로 와이파이에 연결합니다.");
    }
}
//노트북
class Laptop extends Device implements Wifi{
    public Laptop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void doFunction() {
        System.out.println("노트북은 프로그램을 실행합니다.");
    }

    @Override
    public void connectToWifi() {
        System.out.println("노트북으로 와이파이에 연결합니다.");
    }
}


public class Example1 {
    public static void main(String[] args) {
        Device phone =new Phone("삼성", "갤럭시 S24 " );
        Device laptop =new Laptop("Apple","MacBook Pro ");
        phone.powerOn();
        phone.doFunction();
        phone.powerOff();
        //동적 바인딩이 부모클래스인 Device로 되어있으므로 connetToWifi를 호출하기 위해서는 타입 변환 필요
        ((Wifi)phone).connectToWifi();
        ((Bluetooth)phone).connetToBluetooth();
        System.out.println();
        laptop.powerOn();
        laptop.doFunction();
        laptop.powerOff();
        ((Wifi)laptop).connectToWifi();
    }
}
