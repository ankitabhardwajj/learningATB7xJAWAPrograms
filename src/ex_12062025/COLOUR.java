package ex_12062025;

public enum COLOUR {
    RED("r1r1"),
    PINK("p1p1"),
    BLUE("b1b1");


    private String hexvalue;
    COLOUR (String hexvalue){
        this.hexvalue = hexvalue;
    }

    public String getvalue(){
        return hexvalue;
    }
}
