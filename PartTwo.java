public class PartTwo {
    public static void main(String args[]) {
        int sum = 0;
        ArrayList<Integer> left = new ArrayList<>();
        HashMap<Integer, Integer> right = new HashMap<>();//contains # and # of times it's there
        Scanner in;
        try {
            in = new Scanner(new File("input.txt"));
            while (in.hasNextLine()) {
                String s = in.nextLine();
                String ins[] = s.split("   ");
                left.add(Integer.parseInt(ins[0]));
                if(right.containsKey(ins[1])) {
                    
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("You're an idiot");
        }
        left.sort(null);
        //right.sort(null);
        for (int i = 0;i < left.size(); i++) {
            sum += left.get(i); //* value of right
        }
        System.
    }
}