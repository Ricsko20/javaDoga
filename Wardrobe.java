package Wardrobe;
import java.util.ArrayList;
import java.util.List;

public class Wardrobe extends Cloth {
    List<Cloth> clothes;

    public Wardrobe(List<Cloth> clothes) {
        this.clothes = new ArrayList<>();
    } 

    public void addCloth(Cloth cloth) {
        this.clothes.add(cloth);
    }

    public String printInfo() {
        return this.getInfo();
    }

    public void washAllClothes(Cloth cloth) {
        if(wash(cloth))
    }

    public void repairAllClothes(Cloth cloth) {
        if(repair(cloth))
    }

    public void purge(Cloth cloth) {
        if(this.condition == 0) {
            this.clothes.remove(cloth);
        }
    }
    
}
