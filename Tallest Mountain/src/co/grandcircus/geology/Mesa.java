package co.grandcircus.geology;

public class Mesa implements Formation {
    private int area;
    private int height;
    private String name;
    public Mesa(String name,int height,int area){
        this.height= height;
        this.name =name;
        this.area= area;

    }
    @Override
    public int getHeight(){
        return height;
    }
    public String getName(){
        return name;

    }
    public int getArea(){
        return area;
    }
    public void setHeight(int height){
        this.height = height;

    }
    public void setName(String name){
        this.name= name;

    }
    public void setArea(int area){
        this.area= area;

    }
    @Override
    public String getInfo() {
        return "Mountain " +name+ " Height "+ height+ "meters with surface area "+area+".";
    }

}



