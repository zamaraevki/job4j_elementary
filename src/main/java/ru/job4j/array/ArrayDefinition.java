package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        String[] names = new String[4];
        float[] prices = new float[40];
        names[0] = "Petr";
        names[1] = "Konstantin";
        names[2] = "Artem";
        names[3] = "Rustem";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
