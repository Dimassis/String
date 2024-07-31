public class Main {
    public static void main(String[] args) {
        String phone = "8912215-77 57";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("8", "7");
        if (phone.length() == 10) {
            phone = 7 + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон короткий");
        } else if(phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Телефон должен начинаться с 7");
        }
        System.out.println("Number: " + '+' + phone);

        //Task 1
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = firstName + " " + lastName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника: " + fullName);

        //Task 2
        System.out.println();
        String fullNameUP = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета - " + fullNameUP);

        //Task 3
        System.out.println();
        fullName = "Иванов Семён Семенович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);


    }
}