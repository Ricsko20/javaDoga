package Wardrobe;

public class Cloth {
    String type;
    String color;
    int condition;
    int daysWorn;

    public String getType() {
        return this.type;
    }

    public String hasToBeWashed(int daysWorn) {
        String hasToWash = "";

        if(getType() == "skirt") {
            if(this.daysWorn >= 5) {
                hasToWash = "It has to be washed.";
            }
            else {
                hasToWash = "It doesn't need to be washed.";
            }
        }
        if(getType() == "boxer briefs") {
            if(this.daysWorn >= 1) {
                hasToWash = "It has to be washed.";
            }
            else {
                hasToWash = "It doesn't need to be washed.";
            }
        }
        return hasToWash;
    }

    public String needsToBeRepaired(int condition) {
        String hasToRepair = "";

        if(getType() == "skirt") {
            if(this.condition >= 1 && this.condition <= 5) {
                hasToRepair = "It has to be repaired";
            }
            else {
                hasToRepair = "It doesn't need to be repaired";
            }
        }
        if(getType() == "boxer briefs") {
            if(this.condition >= 1) {
                hasToRepair = "This type of cloth cannot be repaired!";
            }
        }
        return hasToRepair;
    }
    
    public void wear(int daysWorn) throws Exception {
        if(getType() == "overwear") {
            if(this.daysWorn == 5) {
                throw new Exception("The cloth cannot be worn, it needs to be washed!");
           } else {
            this.daysWorn++;
           } 
        }
        if(getType() == "underwear") {
            if(this.daysWorn == 1) {
                throw new Exception("The cloth cannot be worn, it needs to be washed!");
           } else {
            this.daysWorn++;
           } 
        }
    }

    public void wash() throws Exception {
        if(this.condition == 0) {
            throw new Exception("Condition cannot be negative!");
        } else {
            this.daysWorn = 0;
            this.condition--;
        }
    }

    public void repair() {
        if(getType() == "overwear") {
            this.condition = 50;
        }
        if(getType() == "underwear") {
            this.condition = 100;
        }
    }

    public String getInfo() {
        String info = this.color + " " + this.type + " worn for " + this.daysWorn + " days, has " + this.condition + " wash cycles left";
        return info;
    }
}
