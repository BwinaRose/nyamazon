package sandbox.xmen;

public class Xmen {
        private String power; //encapsulation making state of objects
        private String codeName;   //using functions to access
        private Double height;
        private String mutantLevel;


        public Xmen(String power, String codeName,
                    Double height, String mutantLevel) {
            this.power = power;
            this.codeName = codeName;
            this.height = height;
            this.mutantLevel = mutantLevel;
        }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getMutantLevel() {
        return mutantLevel;
    }

    public void setMutantLevel(String mutantLevel) {
        this.mutantLevel = mutantLevel;
    }

    @Override
    public String toString() {
        return "Xmen{" +
                "power='" + power + '\'' +
                ", codeName='" + codeName + '\'' +
                ", height=" + height +
                ", mutantLevel='" + mutantLevel + '\'' +
                '}';
    }
}

