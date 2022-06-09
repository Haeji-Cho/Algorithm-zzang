public class saeledTest {//주석처리한게 generic타입이고 두 번째로 푼게 봉입 타입이니꺼 둘 다 풀어보기
    public static void main(String[] args) {

//        Drink<Coke> dc = new Drink<>(new Coke()); //선언된 항목을 넣어주기
//        Drink<Juice> dj = new Drink<>(new Juice());
//        Drink<Pesticide> dp = new Drink<>(new Pesticide()); //자식 타입이 아니므로 오류가 발생한다.


        Drink d1 = new Drink(new Coke());
        Drink d2 = new Drink(new Juice());
 //       Drink d3 = new Drink(new Pesticide()); //오류가 발생한다.

        d1.drink();
        d2.drink();

//        dc.drink();
//        dj.drink();
//        dp.drink();
    }
}

//sealed interface Drinkable permits  Coke, Juice{}
sealed interface Drinkable permits  Coke, Juice{
    String name();
}

final class Juice implements Drinkable{
    public String name(){
        return "쥬스";
    }
}

sealed class Coke implements Drinkable permits CC, PC{ //sealed가 오면 permits가 와야 한다.
    public String name(){
        return "콜라";
    }
}

sealed class CC extends Coke permits DC, UC {}
final class DC extends CC{}
final class UC extends CC{}

non-sealed class PC extends Coke {}

class PC1 extends PC{} //non-sealed로 만드어서 아무거나 만들어도 된다. sealed는 자식 클래스를 제한한다. final은 끝나서 자식이 없다.
class PC2 extends PC{}

class Pesticide{
    String name(){
        return "농약";
    }
}

//class Drink<T extends Drinkable> { //extends Drinkable을 넣어줘서 Drinakable의 자식 타입만 들어오도록 한다.
//    T t;
//
//    public Drink(T t) {
//        this.t = t;
//    }
//
//    void drink(){
//        if(t instanceof Coke c)
//            System.out.println(c.name()+ "를 마신다.");
//        else if(t instanceof Juice j)
//            System.out.println(j.name()+ "를 마신다.");
//        else if(t instanceof Pesticide p)
//            System.out.println(p.name()+ "를 마신다.");
//    }
//}


class Drink{
    Drinkable d;

    public Drink(Drinkable d) {
        this.d = d;
    }

    void drink(){
        System.out.println(d.name() +"를 마신다.");
    }
}