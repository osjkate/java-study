package oop2.polymorphism;

import java.util.Vector;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv();
        Computer computer = new Computer();
        Audio audio = new Audio();
        buyer.buy(tv);
        buyer.buy(computer);
        buyer.buy(audio);
        System.out.println();
        System.out.println("현재 남은 돈은 " + buyer.money + "만원입니다. ");
        System.out.println("현재 보너스 포인트는 " + buyer.bonusPoint + "점 입니다. ");
        buyer.summary();
        System.out.println();
        buyer.refund(computer);
        System.out.println("현재 남은 돈은 " + buyer.money + "만원입니다. ");
        System.out.println("현재 보너스 포인트는 " + buyer.bonusPoint + "점 입니다. ");
        buyer.summary();
    }
}
class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price / 10.0);
    }
}

class Tv extends Product{
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product{
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product{
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}


class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    Vector item = new Vector();
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "를 구입하셨습니다. ");
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "를 반품하셨습니다. ");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다. ");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다. ");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다. ");
        System.out.println("구입하신 제품은 " + itemList + "입니다. ");
    }
}