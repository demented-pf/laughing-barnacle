package Arrays;

public class DistCandiesToPeople {
    public int[] distributeCandies(int candies, int num_people) {
        int[] numCandies = new int[num_people];
        int people  = 0;
        int counter = 1;
        while (candies > 0){
            if (candies >= counter){
                numCandies[people] += counter;
                candies -= counter;
            }
            else {
                numCandies[people] += candies;
                candies = 0;
            }
            if (people == num_people - 1){
                people = -1;
            }
            people++;
            counter ++;
        }
        return numCandies;
    }
}
