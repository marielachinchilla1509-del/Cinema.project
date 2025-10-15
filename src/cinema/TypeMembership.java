package cinema;

public enum TypeMembership {

    BASIC(0.05, "Acceso a funciones estándar"),
    PRO(0.10, "Acceso extendido y promociones"),
    PREMIUN(0.20, "Acceso total, regalos y beneficios VIP");

    private final double discount;
    private final String benefits;

    private TypeMembership(double discount, String benefits) {
        this.discount = discount;
        this.benefits = benefits;
    }

    public double getDiscount() {
        return discount;
    }

    public String getBenefits() {
        return benefits;
    }

    @Override
    public String toString() {
        return name() + " (" + (discount * 100) + "% - " + benefits + ")";
    }
}

    
    
    
