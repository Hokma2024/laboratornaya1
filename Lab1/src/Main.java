import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    /*
    . Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y.
     Большее из них возвести в квадрат.
     Вывести результат на экран.
     */
    public static void main(String[] args)
    {
        double[] myArray=new double[2];
        System.out.println("Введите числа x и y.");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            myArray[0]=sc.nextDouble();
            if(sc.hasNextDouble())
            {
                myArray[1]=sc.nextDouble();
                double max= Arrays.stream(myArray).max().getAsDouble();
                max=max*max;
                System.out.println(max);
            }
            else
            {
                System.out.println("Неверное количество параметров.");
            }
        }
        else
        {
            System.out.println("Неверное количество параметров.");
        }
    }
}
