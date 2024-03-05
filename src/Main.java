public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        int n = 11;
        if (n<100) {
            if (n>50){
                System.out.println("Число "+n+" належить проміжку (50;100)");
            }else{
                System.out.println("Число "+n+" не належить проміжку (50;100)");
            }
        }else{
            System.out.println("Число "+n+" не належить проміжку (50;100)");
        }
        System.out.println("Завдання 2");
        int m = 709;
        int a = m/100;
        int b = (m%100)/10;
        int c = (m%10);
        if (a>b){
            if (a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else if (b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
        System.out.println("Завдання 3");
        String direction = "До гори";
        int floor = 2;
        if (direction=="До низу"){
            if (floor==2){
                System.out.println("Ви спустились на 1 поверх");
            }else {
                System.out.println("Ви спустились на "+floor+" поверх");
            }
        }else{
            if (floor==2){
                System.out.println("Ви піднялись на 3 поверх");
            }else {
                System.out.println("Ви піднялись на "+floor+" поверх");
            }
        }
        System.out.println("Завдання 4");
        String yn = "-";
        switch (yn){
            case "Yes":
            case "Ok":
            case "Y":
                System.out.println("Я погоджуюсь!");
                break;
            case "+":
            case "Так":
            case "ОК":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "No":
                System.out.println("Я відмовляюсь");
            case "N":
            case "-":
                System.out.println("Я відмовляюсь");

        }
        System.out.println("Завдання 5");
        int n1 = 34;
        int n2 = 45;
        int n3 = 12;
        if (n1>n2){
            if (n1>n3){
                if (n2>n3){
                    System.out.println(n3+", "+n2+", "+n1);
                }else{
                    System.out.println(n2+", "+n3+", "+n1);
                }
            }else{
                System.out.println(n2+", "+n1+", "+n3);
            }
        }else if (n2>n3){
            if (n1>n3){
                System.out.println(n3+", "+n1+", "+n2);
            }else{
                System.out.println(n1+", "+n3+", "+n2);
            }
        }else{
            System.out.println(n1+", "+n2+", "+n3);
        }
        System.out.println("Завдання 6");
        int s = 144;
        int g = s/3600;
        if (g == 0){
            System.out.println(s+" секунд");
            System.out.println("До кінця робочого дня залишилось менше 1 годин");
        }else{
            System.out.println(s+" секунд");
            System.out.println("До кінця робочого дня залишилось "+g+" годин");
        }
    }
}