import java.util.ArrayList;
import java.util.Arrays;

public class pickTwo {
    public static void main(String[] args) {
        pick p = new pick();
        int[] numbers = {2, 1, 3, 4, 1};
        ArrayList<Integer> ans = new ArrayList<Integer>();
        System.out.println(p.pick(numbers));
    }
}

class pick{
    public int[] pick(int[] numbers){
        ArrayList<Integer> arr= new ArrayList<Integer>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                int a = numbers[i] + numbers[j];

                if(arr.indexOf(a) < 0){
                    arr.add(a);
                }
            }
        }

        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
