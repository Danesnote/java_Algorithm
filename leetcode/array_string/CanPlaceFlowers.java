package array_string;

public class CanPlaceFlowers() {
    
    public boolean canPlaceFlowers(int[] garden, int numFlower) {
        if(numFlower == 0) return true;

        int availableSpots = 0;
        int index = 0;

        while(index < garden.length){
            if(garden[index] == 0){
                if(index == 0 || garden[index - 1] == 0){
                    if(index == garden.length - 1 || garden[index + 1] == 0){
                        garden[index] = 1;
                        availableSpots++;
                        index += 2;
                    }
                } else{
                    index++;
                }
            }
        }

        return availableSpots >= numFlower;
    }
    
}
