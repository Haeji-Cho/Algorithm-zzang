//333의 random 부분
//317페이지 중간에 random 0.0과 1사이의 난수는 1은 포함 안된다.
//344 주사위 문제

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        System.out.println(new d().roll());
    }
}

class d{
    int roll(){
//        return (int)(Math.random()) * 6 + 1; //0이 나오면 안된다.최대 6까지 하려면 *6을 하면 5.99999까지 나온다.
        //거기에 int로 정수까지

        Random r = new Random();
        return r.nextInt(6+1); //int타입의 난수를 발생시킨다. ()에 숫자를 넣으면 숫자만큼만 나온다. 하지만 괄호안의 수는 포함안한다.
        //더하기 1을 해서 6까지 나오도록 만든다.
    }
}
