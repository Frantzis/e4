public class Fridge {

    private int height;
    private int length;
    private int depth;
    private String name;
    private String manufacturerName;
    private String deviceType;
    private String energyClass;

    //oi 5 idiotikes parametroi

    private int capacity;
    private String climateZone;
    private boolean antibacterial;
    private int shelves;
    private int bottleHolder;

    private static int timeCreated;

    public Fridge(int height, int length, int depth, String name, String manufacturerName, String deviceType,
                  String energyClass,int capacity, String climateZone, boolean antibacterial, int shelves, int bottleHolder)
    {
        timeCreated++;

        setHeight(height);
        setLength(length);
        setDepth(depth);
        setName(name);
        setManufacturerName(manufacturerName);
        setDeviceType(deviceType);
        setEnergyClass(energyClass);

        setCapacity(capacity);
        setClimateZone(climateZone);
        setAntibacterial(antibacterial);
        setShelves(shelves);
        setBottleHolder(bottleHolder);
    }

    public Fridge(){
        periodicMaintenance();
        timeCreated++;
    }

    private void periodicMaintenance(){}

    private void periodicMaintenance(int overloading){}

    public void printAll(){
        System.out.println("Fridge");

        System.out.printf("Height: %d\n", this.height);
        System.out.printf("Length: %d\n", this.length);
        System.out.printf("Depth: %d\n", this.depth);
        System.out.printf("Name: %d\n", this.name);
        System.out.printf("Manufacturer: %d\n", this.manufacturerName);
        System.out.printf("Type of the device: %d\n", this.deviceType);
        System.out.printf("The energy class is %d\n", this.energyClass);

        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.printf("Climate zone is: %d\n", this.climateZone);
        System.out.printf("Antibacterial: %d\n", this.antibacterial);
        System.out.printf("Number of shelves is: %d\n", this.shelves);
        System.out.printf("The number of bottle holders is: %d\n", this.bottleHolder);
    }

    public static int getTimeCreated()
    {
        return timeCreated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setLength(int Length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setClimateZone(String climateZone){
        this.climateZone = climateZone;
    }

    public String getClimateZone(){
        return climateZone;
    }

    public void setAntibacterial(boolean antibacterial){
        this.antibacterial = antibacterial;
    }

    public boolean getAntibacterial(){
        return antibacterial;
    }

    public void setShelves(int Shelves){
        this.shelves = shelves;
    }

    public int getShelves(){
        return shelves;
    }

    public void setBottleHolder(int bottleHolder){
        this.bottleHolder = bottleHolder;
    }

    public int getBottleHolder(){
        return bottleHolder;
    }
}
