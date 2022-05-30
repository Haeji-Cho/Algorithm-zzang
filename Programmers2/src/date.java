public class date {
    public static void main(String[] args) {
        sol s = new sol();
        int a = 5, b = 24;
        System.out.println(s.solution(a, b));
    }
}

class sol{
    public String solution(int a, int b){
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int all = 0;

        for(int i = 0; i < a -1; i++){
            all += month[i];
        }
        all += (b-1);
        answer = day[all % 7];

        return answer;
    }
}