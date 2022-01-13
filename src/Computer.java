public class Computer {

    private int cpuChoice;
    private int cpuScore;
    public Computer(){}
    public Computer(int choice, int cpuScore){
        this.cpuChoice = choice;
        this.cpuScore = cpuScore;

    }

    public int getCpuScore() {
        return cpuScore;
    }

    public void setCpuScore(int cpuScore) {
        this.cpuScore = cpuScore;
    }
    public int getCpuChoice(){
        return cpuChoice;
    }
    public void setCpuChoice(int cpuChoice){
        this.cpuChoice = cpuChoice;
    }

}

