public enum Power {
    ICE("Ice"),
    STROKE("Stroke"),
    SPOKE("Spoke");
    private String power;

    private Power(String power){
        this.power = power;
    }

    public String getPower(){
        return power;
    }

}
