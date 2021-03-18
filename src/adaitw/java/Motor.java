package adaitw.java;

public enum Motor {
    electrico("(E)"), combustion("(C)");

    private Motor(String signo) {
        this.signo=signo;
    }

    public String getSigno(){
        return signo;
    }
    private String signo;
}
