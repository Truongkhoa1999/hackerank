package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    // Genereate dynamic arrayList
    Scanner sc = new Scanner (System.in);
    int numberOfLines = sc.nextInt();
    ArrayList<ArrayList<Integer>> dynamicArrayList = new ArrayList<>();
        for(int i = 0; i < numberOfLines; i++){
        int numberOfIntegersEachLine = sc.nextInt();
        ArrayList<Integer> line = new ArrayList<>();
        for (int j = 0; j<numberOfIntegersEachLine; j++){
            int integers =sc.nextInt();
            line.add(integers);
        }
        dynamicArrayList.add(line);
    }
//        for (int i = 0; i < dynamicArrayList.size(); i++){
//            System.out.println(dynamicArrayList.get(i));
//        }
//        System.out.println(dynamicArrayList.get(0).get(2));
// Generate querry check
        while(sc.hasNext()){
        int numberOfLine= sc.nextInt();
        for(
                int i = 0; i< numberOfLine; i++
        ){
//                System.out.println("Please type in your line query");
            int line = sc.nextInt();
//                System.out.println("please type in your position query");
            int position = sc.nextInt();

            line--;
            position--;



            if(line >=0 && line<=dynamicArrayList.size()){
                ArrayList<Integer> currentLine = dynamicArrayList.get(line);
                if (!currentLine.isEmpty() && position >= 0 && position < currentLine.size()) {
                    int value = currentLine.get(position);
                    System.out.println(value);
                } else{
                    System.out.println("ERROR!");
                }
            } else{
                System.out.println("ERROR!");
            }
        }
    }
        sc.close();

}
}
