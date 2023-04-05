public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Завдання 1:");
        int n = 60;
        if (50<n && n<100)
            System.out.println("Число "+ n + " міститься в проміжку (50; 100)");
        else {
            System.out.println("Число " + n + " не міститься в проміжку (50; 100)");
        }
        //Task 1

        //Task 2
        System.out.println("Завдання 2:");
        int a = 374;
        int x = a/100;
        int y = a/10%10;
        int z = a%100%(y*10);
        if (x>y && x>z){
            System.out.println("Найбільше число "+x);
        }
        else if (y>x && y>z){
            System.out.println("Найбільше число "+y);
        }
        else {
            System.out.println("Найбільше число "+z);
        }
        //Task 2

        //Task 3
        System.out.println("Завдання 3:");
        int gdepowerh=1;
        int kudapowerh=5;
        if (gdepowerh<kudapowerh){
            System.out.println("Ви піднялись на " + kudapowerh + " поверх");
        }
        else if (kudapowerh == 2) {
            System.out.println("Кнопка 2 не працює");
            if (gdepowerh<kudapowerh){
                System.out.println("Ви піднялись на 3 поверх");
            }
            else {
                System.out.printf("Ви спустились на 1 поверх");
            }
        }
        else{
            System.out.println("Ви спустились на" + kudapowerh + "поверх");
        }
        //Task 3

        //Task 4
        System.out.println("Завдання 4:");
        String pogod = "Погодитись";
        String pam = "OK";
        switch (pogod){
            case "Погодитись":
                switch(pam){
                    case "Так":
                        System.out.println("Я погоджуюсь");
                        break;
                    case "Yes":
                        System.out.println("Я погоджуюсь");
                        break;
                    case "OK":
                        System.out.println("Я погоджуюсь");
                        break;
                    case "Y":
                        System.out.println("Я погоджуюсь");
                        break;
                    case "+":
                        System.out.println("Я погоджуюсь");
                        break;
                    case "Ok":
                        System.out.println("Я погоджуюсь");
                        break;
                }
            case "Відмовитись":
                switch(pam){
                    case "Ні":
                        System.out.println("Я відмовляюcь");
                        break;
                    case "NO":
                        System.out.println("Я відмовляюcь");
                        break;
                    case "N":
                        System.out.println("Я відмовляюcь");
                        break;
                    case "-":
                        System.out.println("Я відмовляюcь");
                        break;
                    case "No":
                        System.out.println("Я відмовляюcь");
                        break;

                }
        }
        //Task 4


    }
}