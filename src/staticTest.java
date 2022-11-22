class Number {
    //클래스 필드 -> 정적 변수는 모든 인스턴스가 하나의 저장공간을 공유함
    static int num1 = 0;
    //인스턴스 필드 -> 인스턴스가 생성될 때마다 생성되므로 인스턴스마다 각기 다른 값을 가짐
    int num2 = 0;
}
public class staticTest {
    public static void main(String[] args) {
        Number number1 = new Number();
        Number number2 = new Number();

        number1.num1++;
        number1.num2++;

        System.out.println(number2.num1);
        System.out.println(number2.num2);
    }

}
