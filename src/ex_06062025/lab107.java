package ex_06062025;

import java.util.Arrays;

public class lab107 {
    public static void main(String[] args) {

        //most important interview question
        // find max salary in salary array
        int[] salary = {7,14,24,30};
        //infys - automation interview
        int max = 1;
        int min = salary[0];
        for (int i = 0; i < salary.length; i++) {
            if (salary[i]> max){
                max = salary[i];
            }
            if (min>salary[i]){
                min = salary[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

        // using function ->
        // sort -> find
        Arrays.sort(salary);
        System.out.println(salary[salary.length-1]);

    }
}
