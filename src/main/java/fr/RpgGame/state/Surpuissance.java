package fr.RpgGame.state;

public class Surpuissance {

    private double bonusAtkPercent;
    private int cumul;

    public Surpuissance() {
        cumul = 1;
        bonusAtkPercent = 1;
    }

    public double getBonus() {
        return (bonusAtkPercent * cumul) / 100.f;
    }

    public void addCumul() {
        if (cumul < 10) {
            ++cumul;
        }
    }

}
