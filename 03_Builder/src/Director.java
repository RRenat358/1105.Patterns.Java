
/**
 * Директор строительства
 *
 */


public class Director {

    IndustrialBuilder builder;

    public void setBuilder(IndustrialBuilder builder) {
        this.builder = builder;
    }

    IndustrialUnit buildIndustrialUnit() {

        builder.createIndustrial();
        builder.buildName();
        builder.buildTemperature();
        builder.buildPressure();
        builder.buildVoltage();

        builder.buildSupplierName();
        builder.buildOperationStatus();


        IndustrialUnit industrialUnit = builder.getIndustrialUnit();

        return industrialUnit;
    }


}
