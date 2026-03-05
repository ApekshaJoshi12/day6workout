import java.util.ArrayList;
public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(96);
        marks.add(58);
        marks.add(32);
        marks.add(61);
        marks.add(85);
        for(int mark:marks){
        System.out.println(mark
            
        );
        }
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        double average = (double)sum/marks.size();
        System.out.println("The average of marks:"+average);
    }
}
