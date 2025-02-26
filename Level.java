public class Level{
    public boolean goalReached;
    public int points;
    public boolean goalReached(){
        return goalReached;

    }
    public void reachGoal(){
        goalReached = true;
    }

    public void setPoints(int p){
        points = p;
    }

    public int getPoints(){
        return points;
    }
}