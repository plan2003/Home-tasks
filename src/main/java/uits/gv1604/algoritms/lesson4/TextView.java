package uits.gv1604.algoritms.lesson4;

import com.kaplan.library.CorrectEntry;

import java.util.Scanner;

public class TextView {
    public static void main(String[] args) {
        int numberOfConsole = enterIntFromConsole();
        if (numberOfConsole == 100) {
            System.out.println("One hundred");
        } else {
            int mostSD = numberOfConsole / 10;
            int leastSD = numberOfConsole % 10;


            switch (mostSD) {
                case 0: {
                    System.out.print("");
                }
                break;
                case 1: {
                    if (numberOfConsole == 10) {
                        System.out.println("Ten");
                    } else if (numberOfConsole == 11) {
                        System.out.println("Eleven");
                    } else if (numberOfConsole == 12) {
                        System.out.println("Twelwe");
                    } else if (numberOfConsole == 13) {
                        System.out.println("Thirteen");
                    } else if (numberOfConsole == 14) {
                        System.out.println("Fourteen");
                    } else if (numberOfConsole == 15) {
                        System.out.println("Fifteen");
                    } else if (numberOfConsole == 16) {
                        System.out.println("Sixteen");
                    } else if (numberOfConsole == 17) {
                        System.out.println("Seventeen");
                    } else if (numberOfConsole == 18) {
                        System.out.println("Eighteen");
                    } else if (numberOfConsole == 19) {
                        System.out.println("Nineteen");
                    }
                }
                break;
                case 2: {
                    System.out.print("Twenty ");
                }
                break;
                case 3: {
                    System.out.print("Thirty ");
                }
                break;
                case 4: {
                    System.out.print("Fourty ");
                }
                break;
                case 5: {
                    System.out.print("Fifty ");
                }
                break;
                case 6: {
                    System.out.print("Sixty ");
                }
                break;
                case 7: {
                    System.out.print("Seventy ");
                }
                break;
                case 8: {
                    System.out.print("Eighty ");
                }
                break;
                case 9: {
                    System.out.print("Ninety ");
                }
                break;

            }
            switch (leastSD) {
                case 0: {
                    if (mostSD == 0) {
                        System.out.println("Zero");
                    } else {/*NOP*/}
                }
                break;
                case 1: {
                    checkMostSDByOneAndPrint(mostSD, "one");
                }
                break;
                case 2: {
                    checkMostSDByOneAndPrint(mostSD, "two");
                }
                break;
                case 3: {
                    checkMostSDByOneAndPrint(mostSD,"three");
                }
                break;
                case 4: {
                    checkMostSDByOneAndPrint(mostSD, "four");
                }
                break;
                case 5: {
                    checkMostSDByOneAndPrint(mostSD, "five");
                }
                break;
                case 6: {
                    checkMostSDByOneAndPrint(mostSD, "six");
                }
                break;
                case 7: {
                    checkMostSDByOneAndPrint(mostSD, "seven");
                }
                break;
                case 8: {
                    checkMostSDByOneAndPrint(mostSD, "eight");
                }
                break;
                case 9: {
                    checkMostSDByOneAndPrint(mostSD, "nine");
                }
                break;

            }
        }
    }

    public static void checkMostSDByOneAndPrint(int msd, String number) {
        if (msd == 1) {
                    /*NOP*/
        } else {
            System.out.println(number);
        }
    }

    public static int enterIntFromConsole() {

        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                if (result < 0 || result > 100) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;
    }
}
