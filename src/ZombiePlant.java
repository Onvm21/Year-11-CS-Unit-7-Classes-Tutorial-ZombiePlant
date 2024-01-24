public class ZombiePlant {
    private int potency;
    private int treatmentsNeeded;


    public ZombiePlant(int potency, int treatmentsNeeded){
        this.potency = potency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency(){
        return potency;
    }

    public int treatmentsNeeded(){
        return treatmentsNeeded;
    }

    public boolean isDangerous(){
        if(treatmentsNeeded > 0){
            return true;
        }
        return false;
    }

    public void treat(int potency2){
        if(potency2<=0){
            return;
        } else if(treatmentsNeeded>0 && potency2 <=potency){
            treatmentsNeeded-=1;
        }
        else if(potency2 >=potency){
            treatmentsNeeded+=1;
        }
    }
}
