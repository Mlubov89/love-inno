package ru.innopolis.java.test.homework03.T1;

public class Television {
    private String name;
    private int price;
    private int diagonal;

    public Television(String name, int price, int diagonal) {
        this.name = name;
        this.price = price;
        this.diagonal = diagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Television{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", diagonal=" + diagonal +
                '}';
    }

    void on(){
        System.out.println(this.name + " is on");
    }
    void off(){
        System.out.println(this.name + " is off");
    }
}
