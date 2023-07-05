public class numbers {
    private String number;
    private int sig;
    private boolean decimal;
    private boolean negative;

    public numbers(String number){
        this.number = number;
        if(this.number.contains(".")){
            decimal = true;
        }
        else{
            decimal = false;
        }
        if(this.number.contains("-")){
            negative = true;
            this.number = this.number.substring(1);
        }
        else{
            negative = false;
        }
    }

    public void leadZero(){
        String pattern_start = "^0*";
        this.number = this.number.replaceAll(pattern_start, "");
    }
    public void trailZero(){
        if(!decimal) {
            String pattern_end = "0*$";
            this.number = this.number.replaceAll(pattern_end, "");
        }
    }
    public int numSig(){
        if(decimal){
            sig = this.number.length() -1;
        }
        else{
            sig = this.number.length();
        }
        return sig;
    }
    public String toString(){
        if(negative){
            this.number = "-"+ this.number;
            return "There are " + sig + " significant figures";
        }
        return "There are " + sig + " significant figures";
    }
}

