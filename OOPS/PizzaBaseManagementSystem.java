public class PizzaBaseManagementSystem{
    int small;
    int big;
    int medium;

    PizzaBaseManagementSystem(int bQ,int mQ, int sQ){
        this.small = sQ;
        this.big = bQ;                                            
        this.medium = mQ;                                                                                            
    }

    public boolean checkBase(int token){
        // token 1 -> big
        // token 2 -> medium
        // token 3 -> small

        if(token == 1){
            if(big > 0){
                big -=  1;
                return true;
            }else{
                return false;
            }
        }else if(token == 2){
            if(medium > 0){
                medium--;
                return true;
            }else{
                return false;
            }
        }else{
            if(small > 0){
                small--;
                return true;
            }else{
                return false;
            }
        }
    }

}