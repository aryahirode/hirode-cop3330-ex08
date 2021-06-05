package base;

import java.util.Scanner;

public class PizzaDivider {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

    }

    private int peoplePrompt() {
        System.out.print("How many people? ");
        return Integer.parseInt(in.nextLine());
    }

    private int pizzaPrompt() {
        System.out.print("How many pizzas do you have? ");
        return Integer.parseInt(in.nextLine());
    }

    private int slicePrompt() {
        System.out.print("How many slices per pizza? ");
        return Integer.parseInt(in.nextLine());
    }

    private int[] calculations(int people, int pizzas, int slices) {
        int totalSlices = pizzas * slices;
        int forEach = totalSlices / people;
        int leftovers = totalSlices % people;
        return new int[]{totalSlices, forEach, leftovers};
    }

    private void output() {
        int people = peoplePrompt();
        int pizzas = pizzaPrompt();
        int slices = slicePrompt();
        int[] nums = calculations(people, pizzas, slices);
        System.out.printf("%d people with %d pizzas (%d slices)\n", people, pizzas, nums[0]);
        System.out.printf("Each person gets %d pieces of pizza.\n", nums[1]);
        System.out.printf("There are %d leftover pieces.\n", nums[2]);
    }
}
