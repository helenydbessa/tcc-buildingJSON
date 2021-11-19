package Enums;

public enum Waves {
    T1("T1"),
    T2("T2"),
    T3("T3");

    private String wave;

    Waves(String wave) {
        this.wave = wave;
    }

    public String getWave() {
        return wave;
    }
}
