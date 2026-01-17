public class Array {
    
public static void main ( String a[]) {

    // {int nums[] = new int[4];
    //     nums[0] = 4;
    //     nums[1] = 5;

    // nums[3] = 6;

    // for(int i = 0; i<4; i++)

    // System.out.println(nums[i]);

    int nums [] [] = new int [3] [4];
    int random = (int) Math.random() * 100; 
    for (int i=0; i<3; i++)
    {
        for (int j=0; j<4; j++)
        {
            System.out.print(nums[i][j] + " ");
        }

        System.out.println();
    }

}

}
