public class saeledTest {
    public static void main(String[] args) {

        Drink<Coke> dc = new Drink<>(new Coke()); //선언된 항목을 넣어주기
        Drink<Juice> dj = new Drink<>(new Juice());
//        Drink<Pesticide> dp = new Drink<>(new Pesticide()); //자식 타입이 아니므로 오류가 발생한다.


        dc.drink();
        dj.drink();
//        dp.drink();
    }
}

sealed interface Drinkable permits  Coke, Juice{}

final class Juice implements Drinkable{
    String name(){
        return "쥬스";
    }
}

sealed class Coke implements Drinkable permits CC, PC{ //sealed가 오면 permits가 와야 한다.
    String name(){
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

class Drink<T extends Drinkable> { //extends Drinkable을 넣어줘서 Drinakable의 자식 타입만 들어오도록 한다.
    T t;

    public Drink(T t) {
        this.t = t;
    }

    void drink(){
        if(t instanceof Coke c)
            System.out.println(c.name()+ "를 마신다.");
        else if(t instanceof Juice j)
            System.out.println(j.name()+ "를 마신다.");
        else if(t instanceof Pesticide p)
            System.out.println(p.name()+ "를 마신다.");
    }
}
