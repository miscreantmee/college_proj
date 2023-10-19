//Hello 
// class Hello
// {
//     public static void main(String args[])
//     {
//         System.out.println("hello java");
//     }
// } 

//UnaryDemo
import java.util.Scanner;
class Box
{
    double width;
    double height;
    double depth;
    double Volume()
    {
        return width*height*depth;
    }
    void SetDim(double w,double h,double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    // void Volume()
    // {
    //     System.out.println("Volume is ");
    //     System.out.println(width*height*depth);
    // }
}
class Hello
{
    public static void main(String[] args)
    {
        // int result = +1;
        // System.out.println(result);
        // result--;
        // System.out.println(result);
        // result++;
        // System.out.println(result);
        // result = -result;
        // System.out.println(result);
        // boolean success = false;
        // System.out.println(success);
        // System.out.println(!success);
        //  int result = 1+ 2;
        //  System.out.println("1 + 2 = "+result);
        //  int original_result = result;
        //  result = result - 1;
        //  System.out.println(original_result + " - 1 = "+ result);
        //  original_result = result;
        //  result = result * 2;
        //  System.out.println(original_result + " * 2 = "+ result);
        //  original_result = result;
        //  result = result % 7;
        //  System.out.println(original_result + " % 7 = "+ result);
        // int value1 = 1;
        // int value2 = 2;
        // if(value1 == value2)
        // {
        //     System.out.println("value1 == value2");
        // }
        // if(value1 != value2)
        // {
        //     System.out.println("value1 != value2");
        // }
        // if(value1 > value2)
        // {
        //     System.out.print("value1 > value2");
        // }
        // if(value1 < value2)
        // {
        //     System.out.println("value1 < value2");
        // }
        // if(value1 <= value2)
        // {
        //     System.out.println("value1 <= value2");
        // }
        // String binary[] = {
        //     "0000","0001","0010","0011","0100","0101","0110","0111"
        //     ,"1000","1001","1010","1011","1100","1101","1110","1111"
        // };
        // int a = 3;
        // int b = 6;
        // int c = a | b;
        // int d = a & b;
        // int e = a ^ b;
        // int f = (~a & b) | (a & ~b);
        // System.out.println(" a = "+binary[a]);
        // System.out.println(" b = "+binary[b]);
        // System.out.print(" a|b = "+ binary[c]);
        // System.out.println(" a&b = "+binary[d]);
        // System.out.println(" a^b "+binary[e]);
        // System.out.println("~a&b | a&~b = "+binary[f]);
        // int month_days[]=new int[12];
        // month_days[0] = 31;
        // month_days[1] = 28;
        // month_days[2] = 31;
        // month_days[3] = 30;
        // month_days[4] = 31;
        // month_days[5] = 30;
        // month_days[6] = 31;
        // month_days[7] = 31;
        // month_days[8] = 30;
        // month_days[9] = 31;
        // month_days[10] = 30;
        // month_days[11] = 31;
        // System.out.println("April has "+month_days[3]+" days.");
        // int a[]={33,3,4,5};
        // for(int i=0;i<a.length;i++)
        // {
        //     System.out.println(a[i]);
        // }
        // int marks[]=new int[5];
        // int i;
        // Scanner inp=new Scanner(System.in);
        // for(i=0;i<5;i++)
        // {
        //     System.out.print("Enter The Marks:");
        //     marks[i] = inp.nextInt();
        // }
        // System.out.println("Student Marks Are:");
        // for(i=0;i<5;i++)
        // {
        //     System.out.println(marks[i]);
        // }
        // int twoD[][] = new int[4][5];
        // int i,j,k = 0;
        // for(i=0;i<4;i++)
        // {
        //     for(j=0;j<5;j++)
        //     {
        //         twoD[i][j]=k;
        //         k++;
        //     }
        // }
        // for(i=0;i<4;i++)
        // {
        //     for(j=0;j<5;j++)
        //     {
        //         System.out.print(twoD[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        Box mybox1 = new Box();
        Box mybox2 = new Box();        
        double vol;
        mybox1.SetDim(10, 20, 15);
        mybox2.SetDim(3, 6, 9);
        // mybox1.width = 10;
        // mybox1.height = 20;
        // mybox1.depth = 15;
        // mybox2.width = 3;
        // mybox2.height = 6;
        // mybox2.depth = 9;
        // vol = mybox.width*mybox.height*mybox.depth;
        // System.out.println("Volume is "+vol);
    //     vol = mybox1.Volume();
    //     System.out.println("Volume is "+vol);
    //     vol = mybox2.Volume();
    //     System.out.print("Volume is "+vol);
    // }
    
}

