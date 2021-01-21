public class AirCondition {

    private int height;
    private int length;
    private int depth;
    private String name;
    private String manufacturerName;
    private String deviceType;
    private String energyClass;

    private boolean ionizer;
    private String energyClassHeat;
    private String energyClassThermalArea;
    private String coolingFluid;
    private String thermalPerformance;

    private static int timeCreated;

    public AirCondition(){
        timeCreated++;
        periodicMaintenance();
    }

    public AirCondition(int height, int length, int depth, String name, String manufacturerName, String deviceType, String thermalPerformance,
                          String energyClass, boolean ionizer, String energyClassHeat, String energyClassThermalArea, String coolingFluid)
    {
        timeCreated++;

        setHeight(height);
        setLength(length);
        setDepth(depth);
        setName(name);
        setManufacturerName(manufacturerName);
        setDeviceType(deviceType);
        setEnergyClass(energyClass);

        setIonizer(ionizer);
        setEnergyClassHeat(energyClassHeat);
        setEnergyClassThermalArea(energyClassThermalArea);
        setCoolingFluid(coolingFluid);
        setThermalPerformance(thermalPerformance);
    }

    public static int getTimeCreated(){
        return timeCreated;
    }

    private void periodicMaintenance(){

    }

    private void periodicMaintenance(int overloading){
    }

    public void printAll(){
        System.out.println("Washing Machine");

        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Length: %d\n", this.length);
        System.out.printf("Depth: %d\n", this.depth);
        System.out.printf("Name: %d\n", this.name);
        System.out.printf("Manufacturer: %d\n", this.manufacturerName);
        System.out.printf("Type of the device: %d\n", this.deviceType);
        System.out.printf("The energy class is %d\n", this.energyClass);

        System.out.printf("Ionizer: %d\n", this.ionizer);
        System.out.printf("Energy class heat: %d\n", this.energyClassHeat);
        System.out.printf("Energy class thermal Area: %d\n", this.energyClassThermalArea);
        System.out.printf("Cooling Fluid: %d\n", this.coolingFluid);
        System.out.printf("Thermal performance: %d\n", this.thermalPerformance);
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setDepth(int depth){
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setManufacturerName(String manufacturerName){
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName(){
        return manufacturerName;
    }

    public void setDeviceType(String deviceType){
        this.deviceType = deviceType;
    }

    public String getDeviceType(){
        return deviceType;
    }

    public void setEnergyClass(String energyClass){
        this.energyClass = energyClass;
    }

    public String getEnergyClass(){
        return energyClass;
    }

    public void setIonizer(boolean ionizer){
        this.ionizer = ionizer;
    }

    public boolean getIonizer() {
        return ionizer;
    }

    public void setEnergyClassHeat(String energyClassHeat){
        this.energyClassHeat = energyClassHeat;
    }

    public String getEnergyClassHeat(){
        return energyClassHeat;
    }

    public void setEnergyClassThermalArea(String energyClassThermalArea){
        this.energyClassThermalArea = energyClassThermalArea;
    }

    public String getEnergyClassThermalArea(){
        return energyClassThermalArea;
    }

    public void setCoolingFluid(String coolingFluid){
        this.coolingFluid = coolingFluid;
    }

    public String getCoolingFluid(){
        return coolingFluid;
    }

    public void setThermalPerformance(String thermalPerformance){
        this.thermalPerformance = thermalPerformance;
    }

    public String getThermalPerformance(){
        return thermalPerformance;
    }
}
