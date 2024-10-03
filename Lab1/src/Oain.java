import java.util.Arrays;
import java.util.Scanner;
public class Oain
{
    public static void main(String[] args)
    {
        //Задаём а и б
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите числа a и b");
        double a=sc.nextInt();
        double b=sc.nextInt();
        //Создаём массив
        double[] myArray=new double[2];
        //Заполняем массив
        myArray[0]=a;
        myArray[1]=b;
        //Ищем мин и макс
        double min= Arrays.stream(myArray).min().getAsDouble();
        double max= Arrays.stream(myArray).max().getAsDouble();
        //считаем и выводим д
        double d=(5*max-4*min)/(8.3+(max/min));
        System.out.println("Вывод д " + d);

    }
}
