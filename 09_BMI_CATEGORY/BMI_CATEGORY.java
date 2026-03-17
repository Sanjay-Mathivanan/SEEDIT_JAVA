import java.util.*;

public class BMI_CATEGORY {

    static int GetBMICategory(int weight, float height){
        float bmi = weight / (height * height);

        if(bmi < 18)
            return 0;
        else if(bmi < 25)
            return 1;
        else if(bmi < 30)
            return 2;
        else if(bmi < 40)
            return 3;
        else
            return 4;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int weight = scan.nextInt();
        float height = scan.nextFloat();

        System.out.println(GetBMICategory(weight, height));
    }
}