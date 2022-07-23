/**
 * Упрощённый строитель
 *
 */


public class BuilderEasyApp {

    public static void main(String[] args) {

        System.out.println("\n==============================");
        System.out.println("=== Builder ==================\n");


        Report report = new Report
                .Builder("Отчёт за неделю")
                .setTitle("Закупка")
                .setContent("Реализовано")
                .setTable("Таблица цен")
                .setPageNumber(2)
                .build();

        System.out.println(report);




        System.out.println("\n=== END ======================");
        System.out.println("==============================\n");




    }


}
