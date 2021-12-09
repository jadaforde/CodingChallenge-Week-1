package CodingChallenge;

public class LCM {
    LCM(){

    }
//Problem #1
    public long LCM(int[] arr){
        long LCM = 1;
        int D = 2;

        while (true ){

            int counter = 0;

            boolean divisible = false;

            for (int i=0;i<arr.length;i++){

                if(arr[i]==1)
                    counter++;

                if(arr[i] % D == 0){
                    divisible = true;
                    arr[i] = arr[i]/D;
                }
            }
            if(divisible) {
                LCM = LCM * D;
            }
            else {
                D++;
            }
            if(counter== arr.length){
                return LCM;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr1 = {5, 4, 6, 46, 54, 12, 13, 17};
        int [] arr2 = {46, 54, 466, 544};
        int [] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr4 = {13, 6, 17, 18, 19, 20, 37};
        LCM lcm = new LCM();
        System.out.println(lcm.LCM(arr1));
        System.out.println(lcm.LCM(arr2));
        System.out.println(lcm.LCM(arr3));
        System.out.println(lcm.LCM(arr4));
    }
}


