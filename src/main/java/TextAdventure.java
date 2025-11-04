//Conner Chan
//Code
//Project
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;
public class TextAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int CBossHP = 0, choice1 = 0, cmoney = 100, moneyd = 10000, num = 0,
                truess = 0, money = 100, x = 0, sec = 0, TOTALHP = 3, scorefinal = 0,
                hotdogHP = 0, hotdogDMG = 0, hotdogSPD = 0, MoneyG = 0, EnyHP = 0, EnyAT = 0,
                BossHP = 0, BossAT = 0, chotdogHP = 0 , CEnyHP = 0, choice = 0, uo = 0;
        boolean beg3, intro, start, beg, cat, beg2, choice5, g, l, mm, h, hi;



        beg3 = true;
        // introduction page
        System.out.println(" _   _  ___ _____   ____   ___   ____                          \n" +
                "| | | |/ _ \\_   _| |  _ \\ / _ \\ / ___|                         \n" +
                "| |_| | | | || |   | | | | | | | |  _                          \n" +
                "|  _  | |_| || |   | |_| | |_| | |_| |                         \n" +
                "|_| |_|\\___/_|_|  _|____/_\\___/ \\____|    _    ___ ____  _____ \n" +
                "|  \\/  |_ _| |   | |   |_ _/ _ \\| \\ | |  / \\  |_ _|  _ \\| ____|\n" +
                "| |\\/| || || |   | |    | | | | |  \\| | / _ \\  | || |_) |  _|  \n" +
                "| |  | || || |___| |___ | | |_| | |\\  |/ ___ \\ | ||  _ <| |___ \n" +
                "|_| _|_|___|_____|_____|___\\___/|_|_\\_/_/__ \\_\\___|_|_\\_\\_____|\n" +
                "/ |/ _ \\/ | ___|  | ____|  _ \\_ _|_   _|_ _/ _ \\| \\ | |        \n" +
                "| | (_) | |___ \\  |  _| | | | | |  | |  | | | | |  \\| |        \n" +
                "| |\\__, | |___) | | |___| |_| | |  | |  | | |_| | |\\  |        \n" +
                "|_|  /_/|_|____/  |_____|____/___| |_| |___\\___/|_| \\_|        ");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⡴⠶⠚⠛⠛⡿⠿⣿⠛⢶⠛⠓⠶⢦⣄⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠛⠉⠀⣀⣀⣴⡶⠾⢤⣚⠉⢣⡈⠳⡀⠀⠀⠹⡆\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⠶⠛⠉⠀⠀⠀⡏⠉⢁⡤⢟⠀⡖⢦⡈⠓⠤⠵⠀⡇⠀⠀⠀⣿\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⡴⠶⠛⠋⠉⠀⠀⣀⠤⠴⡽⠋⠁⠚⣅⠀⠸⡀⢳⠀⠉⠒⠤⠔⡞⠉⠒⠉⢱⣏\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⡴⠶⠚⠋⢉⣀⠀⠀⣀⣠⣎⣁⠚⣁⡤⠖⡁⢸⠉⢦⡈⠳⠤⠃⡸⠀⢀⡴⠒⠴⡥⠒⠒⢦⢀⡿\n" +
                "⠀⠀⠀⠀⠀⠀⢀⣠⣤⠶⠛⠋⠉⠀⠀⣀⣀⣰⠋⠀⠉⠉⢠⠏⢁⣀⠙⢧⡀⠀⡇⠈⡇⠀⠙⠒⠤⢲⠗⠒⠚⢀⠖⠋⠀⠀⠀⢸⡟⠀\n" +
                "⠀⠀⠀⠀⣴⠞⠋⠁⠀⡰⠓⢦⠤⠒⠚⠀⡸⠋⡉⠓⣖⠉⠹⡀⢸⠀⠱⢄⡈⠉⣡⠜⠓⠤⡤⠒⣒⣋⣀⠞⠁⠀⠀⠀⠀⠀⠀⣾⠃⠀\n" +
                "⠀⠀⢀⣼⣧⣀⡞⣉⣉⣡⠞⢉⡉⠳⡊⠉⡇⢸⠉⢦⠈⢦⣀⡇⢸⠄⠀⠀⠉⣹⠃⢀⡠⠤⠤⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠃⠀⠀\n" +
                "⠀⢀⣼⠷⢧⡀⠹⡄⠀⢸⠀⡎⠹⡄⠱⡄⡇⢸⣇⡀⠓⢤⣀⣠⣞⠀⡰⢋⣀⣁⡠⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⠟⠀⠀⠀⠀\n" +
                "⢰⠟⠁⠀⠀⠙⡄⠘⣄⡸⠀⡇⠀⠙⢤⣈⣠⡾⠉⠈⠉⠒⠊⢀⣀⣉⠜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡶⠋⠁⠀⠀⠀⠀⠀\n" +
                "⣿⠀⣆⡀⠀⠀⠘⠦⣀⣀⣴⠥⠤⠄⠠⠔⠚⠁⡰⠚⠒⠤⠜⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠶⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⢿⡀⡜⠃⠀⢠⠖⠲⠤⠞⡡⠤⣀⣀⡴⠊⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡴⠞⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠈⢳⣌⡀⠀⠈⢆⣠⠒⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⡴⠞⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠈⠙⠛⢲⣏⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⠴⠞⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠈⠙⣷⣤⣀⣀⣀⣀⣀⣀⣀⣠⣤⠴⠶⠚⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");


        System.out.println("Welcome to HotDog Millionaire");
        System.out.println("Will you become the first one to accomplish this task?");
        System.out.println("Answer this math problem to start; 9 + 10 = ? ");
        int answer = sc.nextInt();
        if(answer != 21){
            System.out.println("You're not fit for this game");
            System.exit(0);
        }
        System.out.println("CORRECT!");
        // background information given to the people
        System.out.println("\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n"
        );






        //Main Menu
        intro = true;
        while (intro){
            System.out.println("---Main Menu---");
            System.out.println("[1] Start");
            System.out.println("[2] Settings");
            System.out.println("[3] Controls");
            System.out.println("[4] Exit");
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    start = true;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Choose your difficulty");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("[1]IMPOSSIBLE MODE");
                    System.out.println("STARTING HP: 50");
                    System.out.println("STARTING DAMAGE: 5");
                    System.out.println("Enemies Have More HP");
                    System.out.println("Less Money Dropped Per Kill");
                    System.out.println("Lower Hit Rate");
                    System.out.println("Money Resets When You Loose a Life");
                    System.out.println("----------------------------------");
                    System.out.println("[2]Normal Mode");
                    System.out.println("STARTING HP: 200");
                    System.out.println("STARTING DAMAGE: 10");
                    System.out.println("Enemies Have Normal HP");
                    System.out.println("Normal Money Dropped Per Kill");
                    System.out.println("Normal Hit Rate");
                    System.out.println("----------------------------------");
                    System.out.println("[3]Easy Mode");
                    System.out.println("STARTING HP: 300");
                    System.out.println("STARTING DAMAGE: 15");
                    System.out.println("Enemies Have Less HP");
                    System.out.println("More Money Dropped Per Kill");
                    System.out.println("High Hit Rate");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.print("Enter your choice: ");
                    System.out.println("");




                    choice1 = sc.nextInt();


                    if (choice1 == 1){
                        // impossible game mode
                        hotdogHP = 50;
                        hotdogDMG = 5;
                        hotdogSPD = 5;
                        MoneyG = 1;
                        EnyHP = 45;
                        CEnyHP = 45;
                        EnyAT = 10;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 50;
                        intro = false;
                        x =10;
                    }
                    else if(choice1 == 2){
                        // normal game mode
                        hotdogHP = 200;
                        hotdogDMG = 10;
                        hotdogSPD = 20;
                        MoneyG = 2;
                        EnyHP = 35;
                        CEnyHP = 35;
                        x=6;
                        EnyAT = 8;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 200;
                        intro = false;
                    }
                    else if(choice1 == 3){
                        // easy game mode
                        hotdogHP = 300;
                        hotdogDMG = 15;
                        hotdogSPD = 30;
                        MoneyG = 3;
                        EnyHP = 20;
                        CEnyHP = 20;
                        x = 4;
                        EnyAT = 5;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 300;
                        intro = false;
                    }
                    else{
                        System.out.println("Not an option, Automatically setting to Easy Mode");
                        hotdogHP = 300;
                        hotdogDMG = 75;
                        hotdogSPD = 30;
                        MoneyG = 3;
                        EnyHP = 20;
                        EnyAT = 5;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 300;
                        intro = false;
                        x = 4;
                    }


                    break;
                case 2:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("This is a text adventure why would there be settings. What settings " +
                            "would you change?");
                    System.out.println("");
                    System.out.println("");
                    break;


                case 3:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Just type the number that corresponds with the choice " +
                            "that you want");
                    System.out.println("");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Bye Bye");
                    System.exit(0);
                    break;
            }
        }


        // fake loading


        System.out.println("Downloading Level...");


        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {


        }


        System.out.println("Hiring Workers...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Creating Storyline...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {


        }


        System.out.println("Implementing Difficulty...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Downloading Virus...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {


        }


        System.out.println("Downloading Anti-Cheat...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Compiling Files...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println("Starting Game...");
        System.out.println("");
        System.out.println("");
        System.out.println("");


// fake loading done, on to game
        System.out.println("You are a hot dog made in the United States of America," +
                " created in 1915 during WWI");
        System.out.println("Become a millionaire before the United States join the war to win");
        System.out.println("");


        // game starts
        beg = true;
        int choice2 = 0;


        while(beg){
            System.out.println("What do you want to do?");
            System.out.println("[1] Do nothing");
            System.out.println("[2] Grow Arms and Legs");
            System.out.println("[3] Eat yourself");
            System.out.println("[4] Hop in the firey pits");
            System.out.println("[5] Check Stats");
            System.out.println("");
            System.out.println("Enter your choice: ");
            choice2 = sc.nextInt();
            switch(choice2){
                case 1:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("You do nothing");
                    sec +=1;
                    if(sec == 5){
                        System.out.println("MEGAKNIGHT! Secert # 1    do nothing 5 times");
                        System.out.println("You Gain 500,000");
                        cmoney += 500000;
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("You try to grow arms and legs but you remember that you can't");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {


                    }
                    System.out.println("However you fall onto the ground and get dirty");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {


                    }
                    System.out.println("a worker spots you and throws you into the trash");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {


                    }
                    System.out.println("that trash is transported into the waste chamber");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {


                    }
                    System.out.println("The waste chamber has nuclear waste and you grow 2 arms and 4 legs");
                    beg = false;
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("You try to eat yourself, but you remember that you don't have a mouth.");
                    System.out.println("You loose a life");
                    TOTALHP = TOTALHP - 1;
                    System.out.println("Lives remaing = " + TOTALHP);
                    System.out.println("");
                    System.out.println("");
                    if(TOTALHP == 0){
                        System.out.println("You lose all 3 lives. You suck at this game");
                        System.out.println("Try again?");
                        System.out.println("[1]yes [2]no");
                        uo = sc.nextInt();
                        if(uo == 1){
                            System.out.println("okie don't loose again");
                            TOTALHP = 3;
                        }
                        else if(uo == 2){
                            System.exit(0);
                        }
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("");
                    System.out.println("You try to hop in the firey pits, but you remember you have no legs.");
                    System.out.println("You loose a life");
                    TOTALHP = TOTALHP - 1;
                    System.out.println("Lives remaing = " + TOTALHP);
                    System.out.println("");
                    System.out.println("");
                    if(TOTALHP == 0){
                        System.out.println("You lost all 3 lives. You suck at this game");


                        System.out.println("Try again?");
                        System.out.println("[1]yes [2]no");
                        uo = sc.nextInt();
                        if(uo == 1){
                            System.out.println("okie don't loose again");
                            TOTALHP = 3;
                        }
                        else if(uo == 2){
                            System.exit(0);
                        }
                        break;
                    }
                case 5:
                    System.out.println();
                    System.out.println();
                    System.out.println("HP: " + chotdogHP +  "/" + hotdogHP);
                    System.out.println("SPEED: " + hotdogSPD);
                    System.out.println("ATTACK: " + hotdogDMG);
                    System.out.println("MONEY: " + cmoney);
                    System.out.println("Lives remaining: "   + TOTALHP);
                    System.out.println();
                    System.out.println();
                    break;




            }
        }
        System.out.println("Now that you have legs and arms, what will you do? ");




        beg2 = true;
        while(beg2){
            System.out.println("[1] Escape the factory");
            System.out.println("[2] Try to take over the factory");
            System.out.println("[3] Do nothing");
            System.out.println("[4] Jump into a firey pit");
            System.out.println("[5] Check Stats");
            System.out.println();
            System.out.println("Enter your choice: ");
            int choice4 = sc.nextInt();
            switch(choice4){
                case 1:
                    System.out.println();
                    System.out.println();
                    System.out.println("You try to escape the factory, however you run into a guard. What do you do? ");
                    System.out.println();
                    System.out.println();
                    beg2 = false;
                    break;
                case 2 :
                    System.out.println();
                    System.out.println();
                    System.out.println("How will you take control of the factory? ");


                    System.out.println();
                    System.out.println();
                    beg2 = false;
                    beg3 = false;
                    choice5 = true;
                    while(choice5){
                        System.out.println("[1] Create an army of bugs");
                        System.out.println("[2] Hire guards to overthrough the ceo");
                        System.out.println("[3] Create an army of hotdogs");
                        System.out.println("[4] Back");
                        System.out.println("[5] Check Stats");
                        System.out.println();
                        System.out.println("Enter your choice: ");
                        int t= sc.nextInt();
                        switch(t){
                            case 1:
                                System.out.println();
                                System.out.println();
                                System.out.println("You attempt to make an army out of bugs, however after calculating you found out that you would run out of time.");
                                System.out.println();
                                System.out.println();


                                break;
                            case 2 :
                                System.out.println();
                                System.out.println();
                                System.out.println("You try to hire the guards, however you are broke");
                                System.out.println();
                                System.out.println();




                                break;
                            case 3 :
                                System.out.println();
                                System.out.println();
                                System.out.println("You attempt to recreate the creation of hotdogs' with legs, however you were unsucessful");
                                System.out.println();
                                System.out.println();


                                break;
                            case 4 :
                                System.out.println();
                                System.out.println();
                                choice5 = false;
                                beg2 = true;
                                System.out.println();
                                System.out.println();

                                break;
                            case 5:
                                System.out.println();
                                System.out.println();
                                System.out.println("HP: " + chotdogHP +  "/" + hotdogHP);
                                System.out.println("SPEED: " + hotdogSPD);
                                System.out.println("ATTACK: " + hotdogDMG);
                                System.out.println("MONEY:  "+ cmoney);
                                System.out.println();
                                break;


                        }


                    }


                    break;
                case 3 :
                    System.out.println();
                    System.out.println();
                    System.out.println("You do nothing");
                    truess += 1;
                    if (truess == 5){
                        cmoney = -500000000;
                        System.out.println("Stop, you loose money");
                    }
                    System.out.println();
                    System.out.println();


                    break;
                case 4 :


                    num = num + 1;
                    System.out.println();
                    System.out.println();
                    System.out.println("You try to jump into a firey pit but you remember you don't own a firey pit");
                    System.out.println("You take 1 damage of emotional damage");
                    System.out.println("Emotional Damage Counter = " + num);
                    System.out.println();
                    System.out.println();


                    break;
                case 5:
                    System.out.println();
                    System.out.println();
                    System.out.println("HP: " + chotdogHP +  "/" + hotdogHP);
                    System.out.println("SPEED: " + hotdogSPD);
                    System.out.println("ATTACK: " + hotdogDMG);
                    System.out.println("MONEY: " + cmoney);
                    System.out.println("Lives remaining: "   + TOTALHP);
                    System.out.println();
                    System.out.println();
                    break;
            }


        }
        // enemies----------
        // Guard




        while(beg3){


            System.out.println("[1] Attack the guard");
            System.out.println("[2] Pretend to be a hotdog");
            System.out.println("[3] Try to run away(Current odds of Success 25%)");
            System.out.println("[4] Heal");
            System.out.println("[5] Check Stats");
            System.out.println();
            System.out.println("Enter your choice: ");
            int y= sc.nextInt();
            switch(y){
                case 1:
                    int randomint = rand.nextInt(x);
                    if(randomint <= 4){
                        CEnyHP = CEnyHP - hotdogDMG;
                        System.out.println("Attack landed!");
                        System.out.println();
                        System.out.println();
                        System.out.println("You Deal " + hotdogDMG + " damage. Guard health remaining = " + CEnyHP + "/" + EnyHP);
                        if (CEnyHP <= 0){
                            int randomy = rand.nextInt(3) + 1;
                            money =  moneyd*randomy*MoneyG;
                            cmoney = cmoney + money;
                            System.out.println("You received $" + money);
                            if(cmoney >= 900000){

                                beg3 = false; intro = false; start = false; beg =false; cat = false; beg2 = false; choice5 = false; g = false; l = false;  mm = false; h = false; hi = false;}
                            EnyHP = 45;
                            CEnyHP = 45;
                            EnyAT = 50;
                            BossHP = EnyHP * 2;
                            BossAT = EnyAT* 2;
                            scorefinal += 1;


                            beg3 = false;
                        }
                    }
                    else{







                        System.out.println("You missed and the guard attacks you back for " + EnyAT + " damage (*HINT check stats for remaining health)");
                        chotdogHP = chotdogHP - EnyAT;


                        if(chotdogHP <=0){
                            System.out.println("You loose a life");
                            if (choice1 == 1){
                                // impossible game mode
                                hotdogHP = 50;
                                hotdogDMG = 5;
                                hotdogSPD = 5;
                                MoneyG = 1;
                                EnyHP = 45;
                                CEnyHP = 45;
                                EnyAT = 10;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 50;
                                cmoney = 100;
                                x =10;
                            }
                            else if(choice1 == 2){
                                // normal game mode
                                hotdogHP = 200;
                                hotdogDMG = 10;
                                hotdogSPD = 20;
                                MoneyG = 2;
                                EnyHP = 35;
                                CEnyHP = 35;
                                x=6;
                                EnyAT = 8;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 200;


                            }
                            else if(choice1 == 3){
                                // easy game mode
                                hotdogHP = 300;
                                hotdogDMG = 15;
                                hotdogSPD = 30;
                                MoneyG = 3;
                                EnyHP = 20;
                                CEnyHP = 20;
                                x = 4;
                                EnyAT = 5;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 300;


                            }
                            else{


                                hotdogHP = 300;
                                hotdogDMG = 75;
                                hotdogSPD = 30;
                                MoneyG = 3;
                                EnyHP = 20;
                                EnyAT = 5;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 300;


                                x = 4;
                            }
                            TOTALHP = TOTALHP - 1;
                            System.out.println("Lives remaing = " + TOTALHP);
                            System.out.println("");
                            System.out.println("");
                            if(TOTALHP <= 0){
                                System.out.println("You lose all 3 lives. You suck at this game");
                                System.out.println("Try again?");
                                System.out.println("[1]yes [2]no");
                                uo = sc.nextInt();
                                if(uo == 1){
                                    System.out.println("okie don't loose again");
                                    TOTALHP = 3;
                                }
                                else if(uo == 2){
                                    System.exit(0);
                                }
                            }}
                    }


                    System.out.println();
                    System.out.println();


                    break;
                case 2 :
                    System.out.println();
                    System.out.println();
                    System.out.println("You pretend to be a hotdog, However the guard sees your arms and legs and crushes you.");
                    TOTALHP = TOTALHP - 1;


                    System.out.println("You loose a life");
                    if (choice1 == 1){
                        // impossible game mode
                        hotdogHP = 50;
                        hotdogDMG = 5;
                        hotdogSPD = 5;
                        MoneyG = 1;
                        EnyHP = 45;
                        CEnyHP = 45;
                        EnyAT = 10;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 50;
                        cmoney = 100;
                        x =10;
                    }
                    else if(choice1 == 2){
                        // normal game mode
                        hotdogHP = 200;
                        hotdogDMG = 10;
                        hotdogSPD = 20;
                        MoneyG = 2;
                        EnyHP = 35;
                        CEnyHP = 35;
                        x=6;
                        EnyAT = 8;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 200;


                    }
                    else if(choice1 == 3){
                        // easy game mode
                        hotdogHP = 300;
                        hotdogDMG = 15;
                        hotdogSPD = 30;
                        MoneyG = 3;
                        EnyHP = 20;
                        CEnyHP = 20;
                        x = 4;
                        EnyAT = 5;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 300;


                    }
                    else{


                        hotdogHP = 300;
                        hotdogDMG = 75;
                        hotdogSPD = 30;
                        MoneyG = 3;
                        EnyHP = 20;
                        EnyAT = 5;
                        BossHP = EnyHP * 2;
                        BossAT = EnyAT* 2;
                        chotdogHP = 300;


                        x = 4;
                    }


                    System.out.println("Lives remaing = " + TOTALHP);
                    System.out.println("");
                    System.out.println("");
                    if(TOTALHP <= 0){
                        System.out.println("Try again?");
                        System.out.println("[1]yes [2]no");
                        uo = sc.nextInt();
                        if(uo == 1){
                            System.out.println("okie don't loose again");
                            TOTALHP = 3;
                        }
                        else if(uo == 2){
                            System.exit(0);
                        }
                    }


                    break;
                case 3:
                    int randomInt = rand.nextInt(10);
                    System.out.println();
                    System.out.println();
                    System.out.println("You try to run away");




                    System.out.println("Rolling the Dice...");
                    if( randomInt <= 1){
                        beg3 = false;
                        System.out.println("Sucessful Escape!");
                    }
                    else{
                        System.out.println("Failed Escaped. You take " + EnyAT + " damage (*HINT check stats for remaining health)");
                        chotdogHP = chotdogHP - EnyAT;
                        if(chotdogHP <=0){
                            System.out.println("You loose a life");
                            if (choice1 == 1){
                                // impossible game mode
                                hotdogHP = 50;
                                hotdogDMG = 5;
                                hotdogSPD = 5;
                                MoneyG = 1;
                                EnyHP = 45;
                                CEnyHP = 45;
                                EnyAT = 10;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 50;
                                cmoney = 100;
                                CBossHP = BossHP;
                                x =10;
                            }
                            else if(choice1 == 2){
                                // normal game mode
                                hotdogHP = 200;
                                hotdogDMG = 10;
                                hotdogSPD = 20;
                                MoneyG = 2;
                                EnyHP = 35;
                                CEnyHP = 35;
                                x=6;
                                CBossHP = BossHP;
                                EnyAT = 8;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 200;


                            }
                            else if(choice1 == 3){
                                // easy game mode
                                hotdogHP = 300;
                                hotdogDMG = 15;
                                hotdogSPD = 30;
                                MoneyG = 3;
                                EnyHP = 20;
                                CEnyHP = 20;
                                x = 4;
                                CBossHP = BossHP;
                                EnyAT = 5;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 300;




                            }
                            else{


                                hotdogHP = 300;
                                hotdogDMG = 75;
                                hotdogSPD = 30;
                                MoneyG = 3;
                                EnyHP = 20;
                                CBossHP = BossHP;
                                EnyAT = 5;
                                BossHP = EnyHP * 2;
                                BossAT = EnyAT* 2;
                                chotdogHP = 300;


                                x = 4;
                            }
                            TOTALHP = TOTALHP- 1;
                            System.out.println("Lives remaing = " + TOTALHP);


                            System.out.println("");
                            System.out.println("");
                            if(TOTALHP <= 0){
                                System.out.println("You lose all 3 lives. You suck at this game");
                                System.out.println("Try again?");
                                System.out.println("[1]yes [2]no");
                                uo = sc.nextInt();
                                if(uo == 1){
                                    System.out.println("okie don't loose again");
                                    TOTALHP = 3;
                                }
                                else if(uo == 2){
                                    System.exit(0);
                                }
                            }}
                    }
                    System.out.println();
                    System.out.println();


                    break;
                case 4:
                    // loose a life


                    System.out.println();
                    System.out.println();
                    System.out.println(" You have 0 healing items at the moment");
                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                    }
                    System.out.println("However the guard attacks you while you were looking for healingg items you take  " + EnyAT + " damage (*HINT check stats for remaining health)");
                    chotdogHP = chotdogHP - EnyAT;
                    if(chotdogHP <=0){
                        System.out.println("You loose a life");
                        if (choice1 == 1){
                            // impossible game mode
                            hotdogHP = 50;
                            hotdogDMG = 5;
                            hotdogSPD = 5;
                            MoneyG = 1;
                            EnyHP = 45;
                            CEnyHP = 45;
                            EnyAT = 10;
                            BossHP = EnyHP * 2;
                            BossAT = EnyAT* 2;
                            chotdogHP = 50;
                            cmoney = 100;
                            x =10;
                            CBossHP = BossHP;
                        }
                        else if(choice1 == 2){
                            // normal game mode
                            hotdogHP = 200;
                            hotdogDMG = 10;
                            CBossHP = BossHP;
                            hotdogSPD = 20;
                            MoneyG = 2;
                            EnyHP = 35;
                            CEnyHP = 35;
                            x=6;
                            EnyAT = 8;
                            BossHP = EnyHP * 2;
                            BossAT = EnyAT* 2;
                            chotdogHP = 200;


                        }
                        else if(choice1 == 3){
                            // easy game mode
                            hotdogHP = 300;
                            hotdogDMG = 15;
                            hotdogSPD = 30;
                            MoneyG = 3;
                            CBossHP = BossHP;
                            EnyHP = 20;
                            CEnyHP = 20;
                            x = 4;
                            EnyAT = 5;
                            BossHP = EnyHP * 2;
                            BossAT = EnyAT* 2;
                            chotdogHP = 300;


                        }
                        else{


                            hotdogHP = 300;
                            hotdogDMG = 75;
                            hotdogSPD = 30;
                            MoneyG = 3;
                            CBossHP = BossHP;
                            EnyHP = 20;
                            EnyAT = 5;
                            BossHP = EnyHP * 2;
                            BossAT = EnyAT* 2;
                            chotdogHP = 300;


                            x = 4;
                        }
                        TOTALHP = TOTALHP - 1;
                        System.out.println("Lives remaing = " + TOTALHP);


                        System.out.println("");
                        System.out.println("");
                        if(TOTALHP <= 0){
                            System.out.println("You lose all 3 lives. You suck at this game");
                            System.out.println("Try again?");
                            System.out.println("[1]yes [2]no");
                            uo = sc.nextInt();
                            if(uo == 1){
                                System.out.println("okie don't loose again");
                                TOTALHP = 3;
                            }
                            else if(uo == 2){
                                System.exit(0);
                            }
                        }}
                    break;
                case 5:
                    System.out.println();
                    System.out.println();
                    System.out.println("HP: " + chotdogHP +  "/" + hotdogHP);
                    System.out.println("SPEED: " + hotdogSPD);
                    System.out.println("ATTACK: " + hotdogDMG);
                    System.out.println("MONEY: " + cmoney);
                    System.out.println("Lives remaining: "   + TOTALHP);
                    System.out.println();
                    break;


            }


        }
        System.out.println("You escaped the factory");
        cat = true;
        while(cat){
            System.out.println("However you need more money, what will you do?");
            System.out.println("[1] Go Hunting");
            System.out.println("[2] Go Gambling");
            System.out.println("[3] Do Nothing");
            System.out.println("[4] Visit Store");
            System.out.println("[5] Check Stats");
            System.out.println();
            System.out.println("Enter your choice: ");
            int any= sc.nextInt();
            switch(any){
                case 1:
                    int ran = rand.nextInt(100)+1;
                    if(ran  <= 1){ //testing purpose
                        System.out.println();
                        System.out.println();
                        System.out.println("You are blind so you failed to find anything");

                        System.out.println();
                        System.out.println();
                    }
                    else{
                        System.out.println();
                        System.out.println();
                        System.out.print("You Found a " );


                        if( 5 < ran && ran < 35 )
                        {
                            System.out.println("chicken");
                        }
                        else if( 36 < ran && ran < 51 )
                        {
                            System.out.println("homeless begger");
                        }
                        else if( 52 < ran && ran < 80 )
                        {
                            System.out.println("street artist");
                        }
                        else if( 81 < ran  )
                        {
                            System.out.println("street vendor");
                        }
                        else{
                            System.out.println("police officer");
                        }
                        System.out.println();
                        System.out.println();
                    }


                    g = true;
                    if(ran<= 1){
                        System.out.println("Secert #2      1% to appear when hunting");
                        System.out.println();
                        System.out.println();
                        g = false;
                    }

                    while(g){
                        System.out.println("[1] Kick");
                        System.out.println("[2] Punch");
                        System.out.println("[3] Bite");
                        System.out.println("[4] Play Dead (50% success rate)");
                        System.out.println("[5] Check Stats");
                        System.out.println();
                        System.out.println("Enter your choice: ");
                        int z= sc.nextInt();
                        switch(z){
                            case 1:
                                System.out.println();
                                System.out.println();
                                System.out.println("You Kick");
                                int mint = rand.nextInt(x);
                                if(mint <= 4){




                                    CEnyHP = CEnyHP - hotdogDMG;
                                    System.out.println("Attack landed!");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("You Deal " + hotdogDMG + " damage. Enemy health remaining = " + CEnyHP + "/" + EnyHP);

                                    if (CEnyHP <= 0){
                                        if( ran <= 5){
                                            int randomy = rand.nextInt(3) + 1;
                                            money =  10000*randomy*MoneyG;
                                            cmoney = cmoney + money;
                                            BossHP = EnyHP * 2;
                                            BossAT = EnyAT* 2;
                                        }
                                        else{
                                            int randomy = rand.nextInt(3) + 1;
                                            money =  moneyd*randomy*MoneyG;
                                            cmoney = cmoney + money;
                                            EnyHP = 45;
                                            CEnyHP = 45;
                                            EnyAT = 50;
                                            BossHP = EnyHP * 2;
                                            BossAT = EnyAT* 2;
                                        }
                                        System.out.println("You received $" + money);
                                        if(cmoney >= 900000){

                                            beg3 = false; intro = false; start = false; beg =false; cat = false; beg2 = false; choice5 = false; g = false; l = false;  mm = false; h = false; hi = false;}
                                        scorefinal += 1;


                                        g = false;


                                    }
                                }
                                else{






                                    try {
                                        TimeUnit.SECONDS.sleep(3);
                                    } catch (InterruptedException e) {
                                    }
                                    System.out.println("You missed and the guard attacks you back for " + EnyAT + " damage (*HINT check stats for remaining health)");
                                    chotdogHP = chotdogHP - EnyAT;


                                    if(chotdogHP <=0){
                                        System.out.println("You loose a life");
                                        hotdogHP = 50;
                                        hotdogDMG = 5;
                                        hotdogSPD = 5;
                                        MoneyG = 1;
                                        EnyHP = 45;
                                        CBossHP = BossHP;
                                        CEnyHP = 45;
                                        EnyAT = 50;
                                        BossHP = EnyHP * 2;
                                        BossAT = EnyAT* 2;
                                        chotdogHP = 50;
                                        TOTALHP = TOTALHP - 1;
                                        System.out.println("Lives remaing = " + TOTALHP);
                                        System.out.println("");
                                        System.out.println("");
                                        if(TOTALHP <= 0){
                                            System.out.println("Try again?");
                                            System.out.println("[1]yes [2]no");
                                            uo = sc.nextInt();
                                            if(uo == 1){
                                                System.out.println("okie don't loose again");
                                                TOTALHP = 3;
                                            }
                                            else if(uo == 2){
                                                System.exit(0);
                                            }
                                            System.out.println();
                                            System.out.println();
                                        }}}
                                break;
                            case 2 :
                                System.out.println();
                                System.out.println();
                                System.out.println("You Punch");
                                int randomint = rand.nextInt(x);
                                if(randomint <= 4){
                                    CEnyHP = CEnyHP - hotdogDMG;
                                    System.out.println("Attack landed!");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println("You Deal " + hotdogDMG + " damage. Guard health remaining = " + CEnyHP + "/" + EnyHP);
                                    if (CEnyHP <= 0){
                                        int randomy = rand.nextInt(3) + 1;
                                        money =  moneyd*randomy*MoneyG;
                                        cmoney = cmoney + money;
                                        EnyHP = 45;
                                        CEnyHP = 45;
                                        EnyAT = 50;
                                        BossHP = EnyHP * 2;
                                        BossAT = EnyAT* 2;
                                        System.out.println("You received $" + money);
                                        scorefinal += 1;
                                        if(cmoney >= 900000){

                                            beg3 = false; intro = false; start = false; beg =false; cat = false; beg2 = false; choice5 = false; g = false; l = false;  mm = false; h = false; hi = false;}
                                        g = false;
                                    }
                                }
                                else{






                                    try {
                                        TimeUnit.SECONDS.sleep(3);
                                    } catch (InterruptedException e) {
                                    }
                                    System.out.println("You missed and the guard attacks you back for " + EnyAT + " damage (*HINT check stats for remaining health)");
                                    chotdogHP = chotdogHP - EnyAT;


                                    if(chotdogHP <=0){
                                        System.out.println("You loose a life");
                                        hotdogHP = 50;
                                        hotdogDMG = 5;
                                        hotdogSPD = 5;
                                        CBossHP = BossHP;
                                        MoneyG = 1;
                                        EnyHP = 45;
                                        CEnyHP = 45;
                                        EnyAT = 50;
                                        BossHP = EnyHP * 2;
                                        BossAT = EnyAT* 2;
                                        chotdogHP = 50;
                                        TOTALHP = TOTALHP - 1;
                                        System.out.println("Lives remaing = " + TOTALHP);
                                        System.out.println("");
                                        System.out.println("");
                                        if(TOTALHP <= 0){
                                            System.out.println("Try again?");
                                            System.out.println("[1]yes [2]no");
                                            uo = sc.nextInt();
                                            if(uo == 1){
                                                System.out.println("okie don't loose again");
                                                TOTALHP = 3;
                                            }
                                            else if(uo == 2){
                                                System.exit(0);
                                            }
                                            System.out.println();
                                            System.out.println();


                                        }}}
                                break;
                            case 3 :
                                System.out.println();
                                System.out.println();
                                System.out.println("You don't have a mouth...");
                                System.out.println();
                                System.out.println();


                                break;
                            case 4 :


                                int radf = rand.nextInt(10);
                                System.out.println();
                                System.out.println();
                                System.out.println("You try to play dead");




                                System.out.println("Rolling the Dice...");
                                if( radf <= 1){
                                    g = false;
                                    System.out.println("Sucessful Escape!");
                                }
                                else{
                                    System.out.println("Failed Escaped. You take " + EnyAT + " damage (*HINT check stats for remaining health)");
                                    chotdogHP = chotdogHP - EnyAT;
                                    if(chotdogHP <=0){
                                        System.out.println("You loose a life");
                                        if (choice1 == 1){
                                            // impossible game mode
                                            hotdogHP = 50;
                                            hotdogDMG = 5;
                                            hotdogSPD = 5;
                                            MoneyG = 1;
                                            EnyHP = 45;
                                            CEnyHP = 45;
                                            CBossHP = BossHP;
                                            EnyAT = 10;
                                            BossHP = EnyHP * 2;
                                            BossAT = EnyAT* 2;
                                            chotdogHP = 50;
                                            cmoney = 100;
                                            x =10;
                                        }
                                        else if(choice1 == 2){
                                            // normal game mode
                                            hotdogHP = 200;
                                            hotdogDMG = 10;
                                            hotdogSPD = 20;
                                            MoneyG = 2;
                                            EnyHP = 35;
                                            CEnyHP = 35;
                                            x=6;
                                            CBossHP = BossHP;
                                            EnyAT = 8;
                                            BossHP = EnyHP * 2;
                                            BossAT = EnyAT* 2;
                                            chotdogHP = 200;


                                        }
                                        else if(choice1 == 3){
                                            // easy game mode
                                            hotdogHP = 300;
                                            hotdogDMG = 15;
                                            CBossHP = BossHP;
                                            hotdogSPD = 30;
                                            MoneyG = 3;
                                            EnyHP = 20;
                                            CEnyHP = 20;
                                            x = 4;
                                            EnyAT = 5;
                                            BossHP = EnyHP * 2;
                                            BossAT = EnyAT* 2;
                                            chotdogHP = 300;


                                        }
                                        else{


                                            hotdogHP = 300;
                                            hotdogDMG = 75;
                                            hotdogSPD = 30;
                                            MoneyG = 3;
                                            EnyHP = 20;
                                            EnyAT = 5;
                                            BossHP = EnyHP * 2;
                                            CBossHP = BossHP;
                                            BossAT = EnyAT* 2;
                                            chotdogHP = 300;


                                            x = 4;
                                        }
                                        System.out.println("Lives remaing = " + TOTALHP);


                                        System.out.println("");
                                        System.out.println("");
                                        if(TOTALHP <= 0){
                                            System.out.println("Try again?");
                                            System.out.println("[1]yes [2]no");
                                            uo = sc.nextInt();
                                            if(uo == 1){
                                                System.out.println("okie don't loose again");
                                                TOTALHP = 3;
                                            }
                                            else if(uo == 2){
                                                System.exit(0);
                                            }
                                        }}
                                }
                                System.out.println();
                                System.out.println();
                            case 5:
                                System.out.println();
                                System.out.println();
                                System.out.println("HP: " + chotdogHP +  "/" + hotdogHP);
                                System.out.println("SPEED: " + hotdogSPD);
                                System.out.println("ATTACK: " + hotdogDMG);
                                System.out.println("MONEY: " + cmoney);
                                System.out.println();
                                break;
                        }


                    }
                    break;
                case 2 :
                    System.out.println();
                    System.out.println();
                    System.out.println("Let's go gambling!");
                    l = true;
                    while(l){
                        System.out.println("[1] Slot Machines");
                        System.out.println("[2] Roulette");
                        System.out.println("[3] Back");
                        System.out.println();
                        System.out.println("Enter your choice: ");
                        int y= sc.nextInt();
                        if(y == 1){
                            System.out.println("");
                            System.out.println("Spinning...");
                            try {
                                TimeUnit.SECONDS.sleep(2);
                            } catch (InterruptedException e) {
                            }

                            int asdff = rand.nextInt(7)+1;
                            int asdfg = rand.nextInt(7) +1;
                            int asdfh = rand.nextInt(7) + 1;
                            System.out.println("_____________");
                            System.out.println("[ "+ asdff + " | " + asdfg + " | " + asdfh +  " ]");
                            System.out.println("_____________");
                            if(asdff == asdfg && asdfg == asdfh){
                                System.out.println("JACKPOT!");
                                System.out.println("+ $500,000 ");
                                cmoney+= 500000;
                                if(cmoney >= 900000){

                                    beg3 = false; intro = false; start = false; beg =false; cat = false; beg2 = false; choice5 = false; g = false; l = false;  mm = false; h = false; hi = false;}
                            }
                            else if(asdff == asdfg || asdfg == asdfh || asdff == asdfh){
                                System.out.println("You win");
                                System.out.println("+ $70,000");
                                cmoney += 70000;
                                if(cmoney >= 900000){

                                    beg3 = false; intro = false; start = false; beg =false; cat = false; beg2 = false; choice5 = false; g = false; l = false;  mm = false; h = false; hi = false;}




                            }
                            else{
                                System.out.println("You loose");
                                System.out.println("- $10000");
                                cmoney -= 10000;
                                if(cmoney >= 900000){

                                    beg3 = false; intro = false; start = false; beg =false; cat = false; beg2 = false; choice5 = false; g = false; l = false;  mm = false; h = false; hi = false;}
                            }

                        }
                        else if(y == 2){
                            mm = true;
                            while(mm){
                                System.out.println("What do you bet on");
                                System.out.println("[1] Red");
                                System.out.println("[2] Black");
                                System.out.println("[3] Back");
                                System.out.println();
                                System.out.println("Enter your choice: ");
                                int yg= sc.nextInt();
                                System.out.println("How much do you bet?");
                                int hg = sc.nextInt();
                                if(hg > cmoney){
                                    System.out.println("You don't have enough money...");
                                    System.out.println();
                                    System.out.println();
                                }
                                else if(hg < cmoney){
                                    int rou = rand.nextInt(2)+1;
                                    if(yg == 1){

                                        System.out.println("");
                                        System.out.println("Spinning...");
                                        try {
                                            TimeUnit.SECONDS.sleep(2);
                                        } catch (InterruptedException e) {
                                        }
                                        if (rou == 1){
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Landed on Red");
                                            System.out.println("You Win");
                                            cmoney = hg*3 + cmoney;
                                        }
                                        else if(rou == 2){
                                            System.out.println();
                                            System.out.println();
                                            System.out.println("Landed on Black");
                                            System.out.println("You Loose");
                                            cmoney = cmoney - hg;
                                        }
                                        mm = false;
                                    }
                                    else if(yg == 2){
                                        System.out.println("");
                                        System.out.println("Spinning...");
                                        try {
                                            TimeUnit.SECONDS.sleep(2);
                                        } catch (InterruptedException e) {
                                        }
                                        mm = false;
                                        if (rou == 2){

                                            System.out.println("Landed on Black");
                                            cmoney = hg*3 + cmoney;
                                            System.out.println("You Win");
                                        }
                                        else if(rou == 1){
                                            System.out.println("Landed on Red");
                                            cmoney = cmoney - hg;
                                            System.out.println("You Win");
                                        }
                                    }
                                    else{
                                        System.out.println("");
                                    }
                                }
                            }}
                        else{
                            l = false;
                        }
                    }
                    System.out.println();
                    System.out.println();




                    break;
                case 3 :
                    System.out.println();
                    System.out.println();
                    System.out.println("You do nothing");

                    System.out.println();
                    System.out.println();


                    break;
                case 4 :


                    System.out.println();
                    System.out.println();
                    System.out.println("Welcome to the store");
                    h = true;
                    int rando = rand.nextInt(5);
                    int rando1 = rand.nextInt(5);
                    int rando2 = rand.nextInt(2);
                    hi = true;


                    while(h){


                        System.out.println("*All buffs are lost when a life is lost*");
                        System.out.println("[1] Buy: Extra Life (Cost 10,000) x" + rando2);
                        System.out.println("[2] Buy: Extra Dmg (Cost 5,000) x" + rando);
                        System.out.println("[3] Buy: Extra Hp (Cost 5,000) x" + rando1);
                        System.out.println("[4] Check Money");
                        System.out.println("[5] Go back");
                        System.out.println();
                        System.out.println("Enter your choice: ");
                        int e= sc.nextInt();
                        switch(e){
                            case 1:
                                System.out.println();
                                System.out.println();


                                hi = true;


                                while(hi){




                                    cmoney = cmoney - 10000;
                                    if(rando2 > 0 && cmoney > 0){
                                        rando2 = rando2 - 1;


                                        TOTALHP = TOTALHP + 1;


                                        System.out.println("Lives Increased by 1");
                                        System.out.println();
                                        System.out.println();
                                        hi = false;
                                    }
                                    else{
                                        cmoney = cmoney + 10000;
                                        System.out.println("No More Stock/Insufficient Funds");
                                        System.out.println();
                                        System.out.println();
                                        hi = false;
                                    }
                                }


                                hi = false;
                                break;
                            case 2 :
                                System.out.println();
                                System.out.println();


                                hi = true;
                                while(hi){


                                    cmoney = cmoney - 5000;
                                    if(rando > 0 && cmoney > 0){
                                        rando = rando - 1;
                                        hotdogDMG = hotdogDMG + 5;


                                        System.out.println("Damage Increased by 5");
                                        hi = false;
                                    }
                                    else{
                                        System.out.println("No More Stock/Insufficient Funds");
                                        cmoney = cmoney + 5000;
                                        hi = false;
                                    }
                                }
                                System.out.println();
                                System.out.println();


                                hi = false;
                                break;
                            case 3:
                                System.out.println();
                                System.out.println();


                                hi = true;
                                while(hi){
                                    cmoney = cmoney - 5000;


                                    if(rando1 > 0 && cmoney > 0){
                                        rando1 = rando1 - 1;
                                        hotdogHP = hotdogHP + 10;
                                        chotdogHP = chotdogHP + 10;
                                        hi = false;
                                        System.out.println("Health Increased by 10");
                                        System.out.println("New Health is: " + chotdogHP + "/" +hotdogHP);
                                        System.out.println();
                                        System.out.println();


                                    }
                                    else{
                                        System.out.println("No More Stock/Insufficient Funds");
                                        System.out.println();
                                        cmoney= cmoney + 5000;
                                        hi = false;
                                        System.out.println();


                                    }
                                }
                                System.out.println();
                                System.out.println();
                                hi = false;
                                break;
                            case 4 :


                                System.out.println();
                                System.out.println();
                                System.out.println("Current Money: " + cmoney);
                                System.out.println();
                                System.out.println();


                                break;
                            case 5:
                                System.out.println();
                                System.out.println();
                                h = false;


                                break;
                        }
                    }
                    System.out.println();
                    System.out.println();


                    break;
                case 5:
                    System.out.println();
                    System.out.println();
                    System.out.println("HP: " + chotdogHP +  "/" + hotdogHP);
                    System.out.println("SPEED: " + hotdogSPD);
                    System.out.println("ATTACK: " + hotdogDMG);
                    System.out.println("MONEY: " + cmoney);
                    System.out.println();
                    break;


            }


        }
        if(cmoney < 1000000 && cmoney >= 900000){
            System.out.println("You are so close to finishing the game, you have $" + cmoney);
            System.out.println("However, you must decide to kill or save the dog");
            System.out.println("What will it be?");
            System.out.println("[1]Kill or [2]Save");
            int qewr = sc.nextInt();
            if (qewr == 1){
                System.out.println("You attempt to kill the dog, but he shows you photos of his family");
                System.out.println("[1]kill him, [2]don't kill him");
                int df = sc.nextInt();
                if (df == 1){
                    System.out.println("Dang you really want to kill this dog");
                    System.out.println("However he tells you he has 5 children and he is paying for his mothers medical bill");
                    int dmoney = 1000000 - cmoney;
                    System.out.println("But you kill him for his remaining $" + dmoney);
                }
                if (df == 2){
                    System.out.println("You attempt to save the dog but he eats you");
                    TOTALHP -= 5000;
                    System.out.println("You loose buddy");
                }
            }
            else if(qewr == 2){
                System.out.println("You attempt to save the dog but he eats you");
                TOTALHP -= 5000;
                System.out.println("You loose buddy");
            }
            else{
                System.out.println("Not an option, therefore the dog dies");
            }
        }
        System.out.println("Congrats on finishing the game");

        int score = scorefinal*1000;
        score = score + TOTALHP * 1000;
        System.out.println("Total Score: " + score);
        System.out.println("Total Enemies killed: " + scorefinal);
        System.out.println("Total Lives remaining " + TOTALHP);
        System.out.println("Ending Stats: ");
        System.out.println("HP: " + chotdogHP +  "/" + hotdogHP);
        System.out.println("SPEED: " + hotdogSPD);
        System.out.println("ATTACK: " + hotdogDMG);
        System.out.println("MONEY: " + cmoney);
        if(cmoney > 1000000){
            System.out.println("CONGRATS, you made more than 1 million!");
        }
        else{
            System.out.println();
        }
        if (score < 0){
            System.out.println("Holy **** you suck at this game, I didn't even know you could get negative points...");
        }
    }
}

