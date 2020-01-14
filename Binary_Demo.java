

import java.util.*;

public class Binary_Demo {
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
        String[][] clock=new String[6][4];
        for(int i=0;i<6;i++){

            for(int f=0;f<4;f++){
              clock[i][f] = input.nextLine();
            }
        }
        System.out.print(Binary_Reader.reader_h10(clock[0][0],clock[0][1],clock[0][2],clock[0][3])+"");
        System.out.print(Binary_Reader.reader_h1(clock[1][0],clock[1][1],clock[1][2],clock[1][3])+":,l");
        System.out.print(Binary_Reader.reader_m10(clock[2][0],clock[2][1],clock[2][2],clock[2][3])+"");
        System.out.print(Binary_Reader.reader_m1(clock[3][0],clock[3][1],clock[3][2],clock[3][3])+":");
        System.out.print(Binary_Reader.reader_s10(clock[4][0],clock[4][1],clock[4][2],clock[4][3])+"");
        System.out.print(Binary_Reader.reader_s10(clock[5][0],clock[5][1],clock[5][2],clock[5][3])+"");
    }
}
