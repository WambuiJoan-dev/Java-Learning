class Hello
{
    public static void main(String args[])
    {
        int num = 7;
        //int num2 = 5;

        //int result = num1 % num2;

        //num1 = num1 + 2;
        //num1 -= 2;
        //num1++;     //post increment
        //++num1;     //pre-increment       

        int result = num++; //fetch the value and then increment
        //int result = ++num; will increment value then fetch it
        System.out.println(result);
    }
}       
