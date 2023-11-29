public class Task1_5 {
    // Создать структуру д/хран-я номеров паспортов и фамилий сотр-в орг-ии.
    // Вывести данные по стор-м с фамилией Иванов
    public static void main (String args){

        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");

        System.out.println(passports.findByName("Иванов"));
        System.out.println(passports.getFullInfo());
    }
}
    
    

