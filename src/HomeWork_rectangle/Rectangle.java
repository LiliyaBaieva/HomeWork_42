package HomeWork_rectangle;

import java.util.Objects;

public class Rectangle {
  private int length;
  private int width;
  public Rectangle(int length, int width){
    this.length = length;
    this.width = width;
  }


  public int getLength() {
    return length;
  }
  public int getWidth() {
    return width;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return String.format("Прямоугольник с длиной %d и шириной %d%n", length, width);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Rectangle other)) return false;
    return this.length == other.length && this.width == other.width;
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width);
  }
}
