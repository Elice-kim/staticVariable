/**
 * Created by elicekim on 2017. 7. 6..
 */
public class MyMath {

    long a, b;

    //인스턴스 변수 a,b를 이용해서 작업을 하므로 parameter 필요없다
    long add(){ return a+b; }
    long subtract(){ return a-b; }

    //인스턴스 변수와는 전혀 관계없이 parameter만으로 가능
    static long add(long a, long b){
        return a+b;
    }
    static long subtract(long a, long b){
        return a-b;
    }

}
