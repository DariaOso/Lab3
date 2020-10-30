package ru.java.lab3;

public class Class3 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 10; i++) {
            if(x==1)
                System.out.println(1/x+" ");
            else
                System.out.println("1/"+x+" ");
            x++;
        }
    }
}
