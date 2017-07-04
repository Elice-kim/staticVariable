public class Main {


    public static void main(String[] args) {

        //static을 선언한 클래스 변수는 객체를 생성하지 않아도 '클래스이름.클래스변수'로 선언가능함
        System.out.println("Card.width :" +Card.width );
        System.out.println("Card.height :" +Card.height );

        Card c1 = new Card();
        c1.kind = "Heard";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 5;

        System.out.println("c1은 :" +c1.kind +","+c1.number+"이며 "+ c1.width+ ","+ c1.height);
        System.out.println("c2은 :" +c2.kind +","+c2.number+"이며 "+ c2.width+ ","+ c2.height);

        c1.width = 80;
        c1.height = 100;

        //Card의 인스턴스인 c1, c2가 클래스 변수인 height, width를 공유하기 때문에
        //c1의 값만 변경해도 c2의 값도 같이 바뀐 결
        System.out.println("c1은 :" +c1.kind +","+c1.number+"이며 "+ c1.width+ ","+ c1.height);
        System.out.println("c2은 :" +c2.kind +","+c2.number+"이며 "+ c2.width+ ","+ c2.height);

    }
}