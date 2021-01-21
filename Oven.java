public class Oven {

    private int height;
    private int length;
    private int depth;
    private String name;
    private String manufacturerName;
    private String deviceType;
    private String energyClass;

    private boolean clock;
    private int cookingType;
    private int foci;
    private boolean cracking;
    private String componentsIncluded;

    private static int timeCreated;

    public Oven(){
        timeCreated++;
        periodicMaintenance();
    }

    public Oven(int height, int length, int depth, String name, String manufacturerName, String deviceType, String componentsIncluded,
                        String energyClass, boolean clock, int cookingType, int foci, boolean cracking)
    {
        timeCreated++;

        setHeight(height);
        setLength(length);
        setDepth(depth);
        setName(name);
        setManufacturerName(manufacturerName);
        setDeviceType(deviceType);
        setEnergyClass(energyClass);

        setClock(clock);
        setCookingType(cookingType);
        setFoci(foci);
        setCracking(cracking);
        setComponentsIncluded(componentsIncluded);
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

        System.out.printf("Clock: %d\n", this.clock);
        System.out.printf("Cooking type: %d\n", this.cookingType);
        System.out.printf("Foci: %d\n", this.foci);
        System.out.printf("Cracking: %d\n", this.cracking);
        System.out.printf("Components included: %d\n", this.componentsIncluded);
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

    public void setClock(boolean clock){
        this.clock = clock;
    }

    public boolean getClock() {
        return clock;
    }

    public void setCookingType(int cookingType){
        this.cookingType = cookingType;
    }

    public int getCookingType(){
        return cookingType;
    }

    public void setFoci(int foci){
        this.foci = foci;
    }

    public int getFoci(){
        return foci;
    }

    public void setCracking(boolean cracking){
        this.cracking = cracking;
    }

    public boolean getCracking(){
        return cracking;
    }

    public void setComponentsIncluded(String componentsIncluded){
        this.componentsIncluded = componentsIncluded;
    }

    public String getComponentsIncluded(){
        return componentsIncluded;
    }
}
