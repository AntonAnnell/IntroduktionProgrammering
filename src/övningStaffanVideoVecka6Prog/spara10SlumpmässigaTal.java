package övningStaffanVideoVecka6Prog;

import java.util.Arrays;

public class spara10SlumpmässigaTal {

    static void main(String[] args) {

        int[] tioSlumptal = new int[10];

        int min = 1;
        int max = 100;
        int range = max - min + 1;

        for (int i = 0; i < tioSlumptal.length; i++){
            tioSlumptal[i] = (int) ((int) range*Math.random());
        }

        System.out.println(Arrays.toString(tioSlumptal));

    }


}
