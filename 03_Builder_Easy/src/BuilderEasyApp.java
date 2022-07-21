public class BuilderEasyApp {

    public static void main(String[] args) {

        System.out.println("\n==============================");
        System.out.println("=== Builder ==================\n");

        Director director = new Director();
        director.setBuilder(new LightIndustrialUnitBuilder());

        IndustrialUnit industrialUnit = director.buildIndustrialUnit();

        System.out.println(industrialUnit);

        director.setBuilder(new HeavyIndustrialUnitBuilder());
        System.out.println(director.buildIndustrialUnit());


        System.out.println("\n=== END ======================");
        System.out.println("==============================\n");




    }


}
