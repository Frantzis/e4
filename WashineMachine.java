public class WashineMachine {

    private int height;
    private int length;
    private int depth;
    private String name;
    private String manufacturerName;
    private String deviceType;
    private String energyClass;

    private int capacity;
    private boolean steamProgram;
    private boolean touchScreen;
    private boolean autoRefill;
    private boolean fastProgram;

    private static int timeCreated;

    public WashineMachine(){
        timeCreated++;
        periodicMaintenance();
    }

    public WashineMachine(int height, int length, int depth, String name, String manufacturerName, String deviceType,
                          String energyClass, int capacity, boolean steamProgram, boolean autoRefill, boolean touchScreen, boolean fastProgram)
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
        setSteamProgram(steamProgram);
        setTouchScreen(touchScreen);
        setAutoRefill(autoRefill);
        setFastProgram(fastProgram);
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

        System.out.printf("Capacity: %d\n", this.capacity);
        System.out.printf("Steam program: %d\n", this.steamProgram);
        System.out.printf("Touch screen: %d\n", this.touchScreen);
        System.out.printf("Auto refill: %d\n", this.autoRefill);
        System.out.printf("Fast program: %d\n", this.fastProgram);
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth){
        this.depth = depth;
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

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setSteamProgram(boolean steamProgram){
        this.steamProgram = steamProgram;
    }

    public boolean getSteamProgram(){
        return steamProgram;
    }

    public void setTouchScreen(boolean touchScreen){
        this.touchScreen = touchScreen;
    }

    public boolean getTouchScreen(){
        return touchScreen;
    }

    public void setAutoRefill(boolean autoRefill){
        this.autoRefill = autoRefill;
    }

    public boolean getAutoRefill(){
        return autoRefill;
    }

    public void setFastProgram(boolean fastProgram){
        this.fastProgram = fastProgram;
    }

    public boolean getFastProgram(){
        return fastProgram;
    }
}
