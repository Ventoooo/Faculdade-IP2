package elements.enums;

public enum Dose {
    DOSE1(1),
    DOSE2(2);

    private final int dose;

    Dose(int dose){
        this.dose = dose;
    }

    public int getTipo() {
        return dose;
    }
}
