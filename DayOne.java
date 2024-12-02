import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 
import java.util.ArrayList;

public class DayOne {
    public static void main(String args[]) {
        int sum = 0;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        Scanner in;
        try {
            in = new Scanner(new File("input.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();
                String ins[] = s.split("   ");
                left.add(Integer.parseInt(ins[0]));
                right.add(Integer.parseInt(ins[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("You're an idiot");
        }
        left.sort(null);
        right.sort(null);
        for (int i = 0;i < left.size(); i++) {
            sum += Math.abs(left.get(i) - right.get(i));
        }
        System.out.println(sum);
    }
}