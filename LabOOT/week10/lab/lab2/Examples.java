package week10.lab.lab2;

public class Examples {
    public static void main(String[] args) {
         //1
        String str = "AEIOU";
        int len = str.length();
        int maxid = 0, minid = 0; 
        int max = str.charAt(0), min = str.charAt(0);

        for (int i = 1; i < len; i++) {
            if ((int)str.charAt(i) > max) {
                maxid = i;
                max = (int)str.charAt(i);
            }
            if ((int)str.charAt(i) < min) {
                minid = i;
                min = (int)str.charAt(i);
            }
        }

        System.out.println("Max ASCII code value character is " + str.charAt(maxid));
        System.out.println("Min ASCII code value character is " + str.charAt(minid));
        System.out.println("Range from " + max + " to " + min +" is " + (max - min));
    }
        
}

