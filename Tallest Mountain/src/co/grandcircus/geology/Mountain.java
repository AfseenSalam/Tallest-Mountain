package co.grandcircus.geology;

public class Mountain implements Formation {
    private int height;
    private String name;
    public Mountain(String name,int height){
        this.height= height;
        this.name =name;

    }
    @Override
    public int getHeight(){
        return height;
    }
    public String getName(){
        return name;

    }
    public void setHeight(int height){
        this.height = height;

    }
    public void setName(String name){
        this.name= name;

    }
    @Override
    public String getInfo() {
        return "Mountain " +name+ " Height "+ height+ "meters.";
    }

}
