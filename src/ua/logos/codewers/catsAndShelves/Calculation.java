package ua.logos.codewers.catsAndShelves;

import java.util.Scanner;

public class Calculation {
    int start, finish, distance, jumpOfThree, jumpOfOne, jump;

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.countTheJumps();
    }

    public void countTheJumps() {
        distance = scan();
        if (distance == 0) {
            catDoesNotJump();
        } else if (distance > 0) {
            catIsJumpUp();
        } else {
            catIsJumpDown();
        }
    }

    public int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the shelf from which the cat jumps : ");
        start = scanner.nextInt();
        System.out.print("Enter the number of the shelf on which the cat should jump : ");
        finish = scanner.nextInt();
        return finish - start;
    }

    public void catDoesNotJump() {
        System.out.println("Cat does not jump!");
    }

    public void catIsJumpUp() {
        jumpOfThree = (distance / 3);
        jumpOfOne = (distance % 3);
        jump = jumpOfThree + jumpOfOne;
        System.out.print("The cat must jump up " + jump + " times: ");
        for (int i = start; i < (start + jumpOfThree * 3); i = i + 3) {//шлях стрибками по 3 полиці
            if (i == finish - 3) {
                System.out.println(i + " => " + (i + 3));
            } else {
                System.out.print(i + " => ");
            }
        }
        for (int i = (start + jumpOfThree * 3); i <= finish - 1; i++) {//шлях стрибками по 1 полиці
            if (i == finish - 1) {
                System.out.print(i + " => " + (i + 1));
            } else {
                System.out.print(i + " => ");
            }
        }

        if (distance % 3 != 0) {//алтернативний шлях, розаховується лише коли різниця між стартом і фінішом не кратна 3
            System.out.print(" or ");
            for (int i = start; i < (finish - jumpOfThree * 3); i++) {//шлях стрибками по 1 полиці
                if (i == finish - 1) {
                    System.out.print(i + " => " + (i + 1));
                } else {
                    System.out.print(i + " => ");
                }
            }
            for (int i = (finish - jumpOfThree * 3); i <= finish - 3; i = i + 3) {//шлях стрибками по 3 полиці
                if (i == finish - 3) {
                    System.out.println(i + " => " + (i + 3));
                } else {
                    System.out.print(i + " => ");
                }
            }
        }
    }

    public void catIsJumpDown() {
        jumpOfThree = ((distance * (-1)) / 3);
        jumpOfOne = ((distance * (-1)) % 3);
        jump = (jumpOfThree + jumpOfOne);
        System.out.print("The cat must jump down " + jump + " times: ");
        for (int i = start; i > (start - jumpOfThree * 3); i = i - 3) {//шлях стрибками по 3 полиці
            if (i == finish + 3) {
                System.out.print(i + " => " + (i - 3));
            } else {
                System.out.print(i + " => ");
            }
        }
        for (int i = (start - jumpOfThree * 3); i > finish; i--) {//шлях стрибками по 1 полиці
            if (i == finish + 1) {
                System.out.print(i + " => " + (i - 1));
            } else {
                System.out.print(i + " => ");
            }
        }
        if (distance % 3 != 0) {//алтернативний шлях, розаховується лише коли різниця між стартом і фінішом не кратна 3
            System.out.print(" or ");
            for (int i = start; i > (finish + jumpOfThree * 3); i--) {//шлях стрибками по 1 полиці
                if (i == finish + 1) {
                    System.out.print(i + " => " + (i - 1));
                } else {
                    System.out.print(i + " => ");
                }
            }
            for (int i = (finish + jumpOfThree * 3); i >=finish + 3; i = i - 3) {//шлях стрибками по 3 полиці
                if (i == finish + 3) {
                    System.out.print(i + " => " + (i - 3));
                } else {
                    System.out.print(i + " => ");
                }
            }
        }
    }
}



