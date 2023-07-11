public class calculation {
    private double answer; private String num1;private String num2;private double val_1;private double val_2;private boolean decimal;
    public calculation(String n1, String n2){
        this.num1 = n1;
        this.num2 = n2;
        this.val_1 = Double.parseDouble(num1);
        this.val_2 = Double.parseDouble(num2);
        if(!n1.contains(".") && !n2.contains(".")){
            this.decimal = false;
            //System.out.println("false");
        }
        else{
            this.decimal = true;
            //System.out.println("true");
        }
    }
    private int numDecimal(String n){
        int amount = 0;
        boolean flag = false;
        for(int i =0; i<n.length(); i++){
            if(n.substring(i,i+1).equals(".")){
                flag = true;
            }
            if(flag){
                amount++;
            }
        }
        amount-=1;
        return amount;
    }
    public String add(){
        this.answer = this.val_1 + this.val_2;
        if(decimal == false){
            return Double.toString(this.answer);
        }
        int num_d1=0; int num_d2=0; int d;
        num_d1 = numDecimal(this.num1);
        //System.out.println(num_d1);
        num_d2 = numDecimal(this.num2);
        //System.out.println(num_d2);
        if(num_d1 <= num_d2){
            d = num_d1;
        }
        else{
            d = num_d2;
        }
        int curr_d = numDecimal(Double.toString(this.answer));
        //next step compare curr_d and d
        String original = Double.toString(this.answer);
        if(curr_d <= d){
            int diff = d-curr_d;
            for(int i=0; i<diff;i++){
                original = original + "0";
            }
            return original;
        }
        String temp = "";
        for(int j=0; j<original.length();j++){
            temp += original.substring(j,j+1);
            if(original.substring(j,j+1).equals(".")){
                temp += original.substring(j+1, j+d+1);
                break;
            }
        }
        return temp;
    }
    public String subtract(){
        this.answer = this.val_1 - this.val_2;
        if(decimal == false){
            return Double.toString(this.answer);
        }
        int num_d1=0; int num_d2=0; int d;
        num_d1 = numDecimal(this.num1);
        //System.out.println(num_d1);
        num_d2 = numDecimal(this.num2);
        //System.out.println(num_d2);
        if(num_d1 <= num_d2){
            d = num_d1;
        }
        else{
            d = num_d2;
        }
        int curr_d = numDecimal(Double.toString(this.answer));
        //next step compare curr_d and d
        String original = Double.toString(this.answer);
        if(curr_d <= d){
            int diff = d-curr_d;
            for(int i=0; i<diff;i++){
                original = original + "0";
            }
            return original;
        }
        String temp = "";
        for(int j=0; j<original.length();j++){
            temp += original.substring(j,j+1);
            if(original.substring(j,j+1).equals(".")){
                temp += original.substring(j+1, j+d+1);
                break;
            }
        }
        return temp;
    }
}
