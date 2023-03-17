package HomeWork_rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
//  Создайте класс Rectangle (прямоугольник).
//  При создании класс должен получать длины сторон.
//  Сохраните их в памяти как поля (атрибуты) класса "длина" и "ширина".
//
//  При попытке сравнить два прямоугольника они должны оказываться одинаковыми,
//  если сами прямоугольники как геометрические фигуры равны
//  - если их можно совместить, повернув и наложив друг на друга.
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


  }

  public static Rectangle readRectangle(BufferedReader br) throws IOException{
    System.out.print("Введите длину прямоугольника: ");
    int length = Integer.parseInt(br.readLine());
    System.out.print("Введите ширину прямоугольника: ");
    int width = Integer.parseInt(br.readLine());

    return new Rectangle(length, width);
  }
}