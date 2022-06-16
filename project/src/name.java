import java.util.*;

public class name {

        public static void main(String[] args) throws InterruptedException {

            Scanner scan = new Scanner(System.in);
            boolean id = false;
            Components components = new Components();

            while (id != true) {
                System.out.println("1)To order coffee");
                System.out.println("2)See components");
                System.out.println("3)To load machine");
                System.out.print("Enter a number: ");

                int num = scan.nextInt();

                if (num == 1) {
                    System.out.println("1)To order cappuccino");
                    System.out.println("2)To order regular coffee");
                    System.out.print("Enter a number: ");

                    int coffee = scan.nextInt();

                    if (coffee == 1) {
                        if (components.getWater() >= 100 && components.getGrains() >= 15 && components.getMilk() >= 100) {
                            components.setWater(100);
                            components.setMilk(100);
                            components.setGrains(15);
                            Thread.sleep(2000);
                            System.out.println("Your coffee ready");
                        } else System.out.println("I can't to make coffee");
                    } else if (coffee == 2) {
                        if (components.getWater() >= 100 && components.getGrains() >= 6) {
                            components.setWater(100);
                            components.setGrains(6);
                            Thread.sleep(2000);
                            System.out.println("Your coffee ready");
                        } else System.out.println("I can't to make coffee");
                    }
                } else if (num == 2) {
                    System.out.println("Components machine: ");
                    System.out.println("1)Milk: " + components.getMilk());
                    System.out.println("2)Grains: " + components.getGrains());
                    System.out.println("3)Water: " + components.getWater());
                } else if (num == 3) {
                    System.out.println("1)Milk: ");
                    System.out.println("2)Grains: ");
                    System.out.println("3)Water: ");
                    System.out.print("What to need add: ");
                    int name = scan.nextInt();
                    System.out.print("How many: ");

                    int amount = scan.nextInt();

                    switch (name) {
                        case 1:
                            components.setMilk2(amount);
                            break;
                        case 2:
                            components.setGrains2(amount);
                            break;
                        case 3:
                            components.setWater2(amount);
                            break;
                    }
                }
            }

        }
}
