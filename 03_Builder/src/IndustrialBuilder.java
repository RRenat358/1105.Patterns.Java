/**
 * Строитель
 */


public abstract class IndustrialBuilder {

    IndustrialUnit industrialUnit;


    void createIndustrial() {
        industrialUnit = new IndustrialUnit();
    }

    abstract void buildName();
    abstract void buildTemperature();
    abstract void buildPressure();
    abstract void buildVoltage();
    abstract void buildSupplierName();
    abstract void buildOperation();

    IndustrialUnit getIndustrialUnit() {
        return industrialUnit;
    }


}
