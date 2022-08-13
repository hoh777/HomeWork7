public class Main {
    public static void main(String[] args) {


        // задание 1
        int dog = 7;
        byte cat = 1;
        short muse = 3;
        long elephant = 110L;
        double sugarWeight = 1.5f;
        boolean dogIsAbult = dog > 10;
        char bar = 35;
        System.out.println(dogIsAbult);

        // задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfallBoxers = boxer1 + boxer2;
        double weightDfallBoxers = boxer2 - boxer1;
        System.out.println("Общий вес боксеров "+ weightOfallBoxers);
        System.out.println("Разница в весе боксеров " + weightDfallBoxers);


        //задача 3
        var banana = 5 * 80;
        var milk = 200 + 105;
        var iceCream = 2 * 100;
        var aggs = 4 * 70;
        var productsWeight = banana + milk + iceCream + aggs;
        System.out.println("Общий вес продуктов " + productsWeight);
        System.out.println("Общий вес продуктов " + productsWeight /1000 + "кг");

        // задача 4
        float reset = 7;
        float gramm = reset / 250;
        System.out.println("сколько дней понадобится " + gramm + "дн");

        // задача 5
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        var mashaHight = 67760 * 0.1;
        var denisHight = 83690 * 0.1;
        var kristinaHight = 76230 * 0.1;
        var mashaDiff = mashaHight - masha;
        var denisDiff = denisHight - denis;
        var kristinaDiff = kristinaHight - kristina;
        System.out.println("после увеличения ЗП на 10%, маша будет получать "+ mashaHight + "рублей в месяц");
        System.out.println("после увеличения ЗП на 10%, денис будет получать " + denisHight + "рублей в месяц");
        System.out.println("после увеличения ЗП на 10%, кристина будет получать " +kristinaHight + "рублей в месяц");


















    }
}