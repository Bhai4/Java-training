package week3.week3;

public class House {

    private int bricks;
    private int cement;
    private String houseName;
    private double squarefoot;
    private boolean isMadeFromVinyl;

    //constructor 1 - model 1
    public House(int bricks, int cement) {
        this.bricks = bricks;
        this.cement = cement;
    }

    //constructor model 2
    public House(int bricks, int cement, String houseName) {
        this.bricks = bricks;
        this.cement = cement;
        this.houseName = houseName;
    }

    //constructor model 3
    public House(int bricks, int cement, String houseName, double squarefoot) {
        this.bricks = bricks;
        this.cement = cement;
        this.houseName = houseName;
        this.squarefoot = squarefoot;
    }
    //constructor 4 model 4
    public House(int bricks, int cement, String houseName, double squarefoot, boolean isMadeFromVinyl){
        this.bricks = bricks;
        this.cement = cement;
        this.houseName = houseName;
        this.squarefoot = squarefoot;
        this.isMadeFromVinyl = isMadeFromVinyl;
    }

    public static void main(String[] args) {
        House house1 = new House(1000,500);
        System.out.println("Total bricks used " + house1.getBricks());
        System.out.println("Total cement used "+ house1.getCement());
        System.out.println(house1.houseName);
            //Model 1
            house1.setBricks(800);
        System.out.println(house1.bricks);
            house1.setCement(500);
        System.out.println(house1.cement);

        //Model 2











    }
    //getters/setters
    // getter is return
    public void setBricks(int bricks){
        this.bricks = bricks;
    }
    public int getBricks(){
        return this.bricks;

    }
    public void setCement(int cement){
        double toLbs = cement * 1.6;
        int totalSackCount = (int) (toLbs/10);
        this.cement = cement;
    }
    public int getCement(){
        return this.cement;
    }
    public void setHouseName(String houseName){
        this.houseName = houseName;

    }
    public String getHouseName(){
        return this.houseName.toLowerCase();
    }

    @Override
    public String toString() {
        return "House{" +
                "bricks=" + bricks +
                ", cement=" + cement +
                ", houseName='" + houseName + '\'' +
                ", square foot=" + squarefoot +
                ", isMadeFromVinyl=" + isMadeFromVinyl +
                '}';
    }
}
// this = current class