/**
 * Объект лёгкой промышленности
 *
 */


public class HeavyIndustrialUnitBuilder extends IndustrialBuilder{


    @Override
    void buildName() {
        industrialUnit.setName("Heavy Industry");
    }

    @Override
    void buildTemperature() {
        industrialUnit.setTemperature(1000.0f);
    }

    @Override
    void buildPressure() {
        industrialUnit.setPressure(500.0);
    }

    @Override
    void buildVoltage() {
        industrialUnit.setVoltage(380);
    }

    @Override
    void buildSupplierName() {
        industrialUnit.setSupplierName("Great Supplier");
    }

    @Override
    void buildOperationStatus() {
        industrialUnit.setOperationStatus(OperationStatus.OPERATING);
    }
}
