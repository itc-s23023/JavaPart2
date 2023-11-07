package exercise;

import chapter6.Tax;

public class E621_1 {
    public static void main(String[] args) {
        Tax kimura = new Tax(110, "Kimura", 300000, 90000);
        Tax suzuki = new Tax(120, "Suzuki", 250000,120000);
        Tax saito = new Tax(130, "Saitou", 400000, 180000);

        System.out.println(kimura.zengaku());
        System.out.println(suzuki.zengaku());
        System.out.println(saito.zengaku());
    }
}
