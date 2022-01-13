public class User extends Player{



    private int choice;
    private int userScore;

    public User(){

    }
    public User(int choice, int userScore){
        this.choice = choice;
        this.userScore = userScore;

    }
    public void setChoice(int choice) {
        this.choice = choice;
    }

    @Override
    public int playerChoice() {
        return choice;
    }

    @Override
    public int userScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }
}
