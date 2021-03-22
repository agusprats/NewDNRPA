package adaitw.java;

public enum Motor {
    e("(E)"), c("(C)");

    private Motor(String signo) {
        this.signo=signo;
    }

    public String getSigno(){
        return signo;
    }
    private String signo;
}
