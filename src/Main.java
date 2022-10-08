public class Main {
    public static void main(String[] args) {
        int Length=100;
        byte Diameter=50;
        long Height=1800L;
        short Foot=370;
        float Speed= 300.000F;
        double Temperature=67.8998;
        System.out.println("Значение переменной Length с типом int равно "+Length);
        System.out.println("Значение переменной Diameter с типом byte равно "+Diameter);
        System.out.println("Значение переменной Height с типом long равно "+Height);
        System.out.println("Значение переменной Foot с типом short равно "+Foot);
        System.out.println("Значение переменной Speed с типом float равно "+Speed);
        System.out.println("Значение переменной Temperature с типом double равно "+Temperature);

        float x=27.12F;
        long y=987678965549l;
        double z=2.786;
        boolean e=false;
        int q=569;
        short w=-159;
        int r=27897;
        byte t=67;

        short LP=23;
        short AS=27;
        short EA=30;
        int List=480/(LP+AS+EA);
        System.out.println("На каждого ученика рассчитано "+ List +" листов бумаги");

        int perfPerMin=16/2*t;
        int tMinute=20*60*t;
        int tday=24*60*60*t;
        int tDay=3*24*60*60*t;
        int tMonth=30*24*60*60*t;

        //int Norm=
        System.out.println("За 20 минут машина произвела бутылок "+ tMinute +" штук ");
        System.out.println("За сутки машина произвела бутылок "+ tday +" штук ");
        System.out.println("За 3 дня машина произвела бутылок "+ tDay +" штук ");
        System.out.println("За месяц машина произвела бутылок "+ tMonth +" штук ");


        int cR=120/(2+4);
        int cW=cR*2;
        int cB=cR*4;
        System.out.println("В школе, где "+cR+" классов, нужно "+cW+" банок белой краски и "+cB+" банок коричневой краски");

        /*Бананы – 5 штук (1 банан - 80 грамм);
Молоко – 200 мл (100 мл = 105 грамм);
Мороженое пломбир – 2 брикета по 100 грамм;
Яйца сырые – 4 яйца (1 яйцо - 70 грамм).*/
        short ban=80, milk=105, iceCr=100, egg=70;
        int cocktailW=ban*5+milk*200/100+iceCr*2+egg*4;
        System.out.println(cocktailW/1000+" кг");

        //min=250;
        //max=500;
        double maxDays=7000/250, minDays=7000/500, averDays=(maxDays+minDays)/2;
        System.out.println(minDays);
        System.out.println(maxDays);
        System.out.println(averDays);

        /*Маша получает 67 760 рублей в месяц

Денис получает 83 690 рублей в месяц

Кристина получает 76 230 рублей в месяц

Каждому нужно увеличить зарплату на 10% от текущей месячной.*/
        //int salary=
        int salM=67760, salD=83690, salK=76230;
        double salMN=salM+salM*0.1, salDN=salD+salD*0.1, salKN=salK+salK*0.1;
        double profitM=salMN-salM, profitD=salDN-salD, profitK=salKN-salK;

        System.out.println("Маша теперь получает "+ salMN +"рублей. Годовой доход вырос на "+ profitM +"рублей");
        System.out.println("Денис теперь получает "+ salDN +"рублей. Годовой доход вырос на "+ profitD +"рублей");
        System.out.println("Кристина теперь получает "+ salKN +"рублей. Годовой доход вырос на "+profitK +"рублей");

    }
}