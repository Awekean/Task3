public class Investment {

    private float money;
    private int time;
    private float percent;

    Investment(float money, int time, float percent){
        this.money = money;
        this.time = time;
        this.percent = percent;
    }

    void setMoney(float money){
                this.money = money;
            }

    float getMoney(){
                return this.money;
        }

    float calculateMoney() {
        return this.money + this.money * this.percent;
    }

}

