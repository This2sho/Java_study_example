import java.util.*;

public class test {
    public static void main(String[] args){
        double[] base_pre = {98.19, 98.51, 64.94, 99.85, 100.00, 77.63, 89.30, 92.87, 72.97, 79.63};
        double[] base_re = {96.60, 96.05, 47.74, 99.85, 99.89, 64.25, 80.41, 86.03, 56.55, 64.97};

        double[] grp_pre = {99.35, 98.20, 77.81, 99.11, 99.89, 78.01, 92.87, 92.87, 80.52, 79.14};
        double[] grp_re = {99.19, 96.68, 64.22, 98.10, 99.15, 64.02, 86.03, 86.03, 65.38, 64.17};
        
        double[] base_f1 = new double[10];
        double[] grp_f1 = new double[10];

        double base_sum = 0.0;
        double grp_sum = 0.0;

        for(int i=0; i<10; ++i){
            base_f1[i] = 2/((1/base_pre[i]) + (1/base_re[i]));
            grp_f1[i] = 2/((1/grp_pre[i]) + (1/grp_re[i]));
        }
        for(int i=0; i<10; ++i){
            base_sum += base_f1[i];
            grp_sum += grp_f1[i];
        }
        System.out.println(Arrays.toString(base_f1));
        System.out.println(Arrays.toString(grp_f1));
        System.out.println("base avg = " + base_sum/base_f1.length);
        System.out.println("grp avg = " + grp_sum/grp_f1.length);
    }
    
}

