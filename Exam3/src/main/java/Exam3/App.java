package Exam3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main( String[] args ) throws ParseException
    {
        System.out.println("请输入日期");
        Scanner s = new Scanner(System.in);
        String d = s.next();
        int y= Integer.valueOf(d.substring(0, 4));
        int m = Integer.valueOf(d.substring(5, 6));
        int d2 = Integer.valueOf(d.substring(7));
        int a[] = new int[12];
        a[0]= 31;
    	a[2]= 31;
    	a[3]= 30;
    	a[4]= 31;
    	a[5]= 30;
    	a[6]= 31;
    	a[7]= 31;
    	a[8]= 30;
    	a[9]= 31;
    	a[10]= 30;
    	a[11]= 31;
        if(y%4==0||y%400==0&&y%100!=0){
        	a[1]= 29;
        }else{
        	a[1]= 28;
        }
        int count= 0;
        for (int i = 0; i < a.length; i++) {  	
			if(m==(i+1)){
				count =count +d2;
				break;
			}
			count = count+a[i];
		}
        System.out.println("您输入的日期是当前的第"+count+"天");
    }
}
