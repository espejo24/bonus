public class Main {
    public static void main(String[] args) {
        int count = 100; // начальная сумма счета
        int depositAmount = 1001; // сумма пополнения
        int bonusCount = 100; // курс бонуса
        int totalAmount; // = count + deposit_amount/bonus_count; // итоговая сумма на счету

        if (depositAmount > 1000) {
            totalAmount = depositAmount / bonusCount + depositAmount + count;

        } else {
            totalAmount = depositAmount + count;
        }

        System.out.println("Итоговая сумма на счету клиента:");
        System.out.println((totalAmount) + " рублей");


    }
}