/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hesap.makinesi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int ay, gun;
        boolean IsError = false;
        String burcunuz = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugunuz ay : ");
        ay = input.nextInt();
        System.out.print("Dogdugunuz gun : ");
        gun = input.nextInt();
        if (ay == 1) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 21) {
                    burcunuz = "Kova";
                } else {
                    burcunuz = "Oğlak";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 2) {
            if (gun >= 1 && gun <= 28) {

                if (gun > 19) {
                    burcunuz = "Balık";
                } else {
                    burcunuz = "Kova";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 3) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 20) {
                    burcunuz = "Koç";
                } else {
                    burcunuz = "Balık";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 4) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 20) {
                    burcunuz = "Boğa";
                } else {
                    burcunuz = "Koç";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 5) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 21) {
                    burcunuz = "İkizler";
                } else {
                    burcunuz = "Boğa";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 6) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 21) {
                    burcunuz = "Yengeç";
                } else {
                    burcunuz = "İkizler";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 7) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 22) {
                    burcunuz = "Aslan";
                } else {
                    burcunuz = "Yengeç";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 8) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 22) {
                    burcunuz = "Başak";
                } else {
                    burcunuz = "Aslan";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 9) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 22) {
                    burcunuz = "Terazi";
                } else {
                    burcunuz = "Başak";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 10) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 21) {
                    burcunuz = "Yay";
                } else {
                    burcunuz = "Akrep";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 11) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 21) {
                    burcunuz = "Yay";
                } else {
                    burcunuz = "Akrep";
                }
            } else {
                IsError = true;
            }
        }
        if (ay == 12) {
            if (gun >= 1 && gun <= 31) {

                if (gun > 21) {
                    burcunuz = "Oğlak";
                } else {
                    burcunuz = "Yay";
                }
            } else {
                IsError = true;
            }
        }



        if (IsError) {
            System.err.println("Hatalı seçim");
        }
        System.out.print("Burcunuz : " + burcunuz + " burcudur.");
    }

}