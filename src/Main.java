public class Main {
    public static void main(String[] args) {
        int count = 100; // начальная сумма счета
        int deposit_amount = 1001; // сумма пополнения
        int bonus_count = 100; // курс бонуса
        int total_amount; // = count + deposit_amount/bonus_count; // итоговая сумма на счету

        if (deposit_amount > 1000) {
            total_amount = deposit_amount/bonus_count + deposit_amount + count;

        }
        else {total_amount = deposit_amount + count;}

        System.out.println("Итоговая сумма на счету клиента:");
        System.out.println((total_amount) + " рублей");



    }
}