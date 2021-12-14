import java.lang.Math;

public class Estacionamento {
    String pl, md;
    float in, out;

    public void p1() {
        this.in = 0; this.out = 0;
        this.pl = ""; this.md = "";
    }
    public void setpl(String p) {
        this.pl = p;
    }
    public void setmd(String m) {
        this.md = m;
    }
    public void setin(float i) {
        this.in = i;
    }
    public void setout(float o) {
        this.out = o;
    }
    public void wt() {
        System.out.println(this.pl);
        System.out.println(this.md);
        System.out.println(this.in);
        System.out.println(this.out);
    }
    public double pay() {
        double sp;
        double a, b;
        int y, z;
        y = Math.round(this.in);
        z = Math.round(this.out);
        a = this.in - y;
        b = this.out - z;
        b = b * 0.6;
        a = a * 0.6;
        sp = (z - y) + (a - b);
        sp = sp * 1.5;

        return sp;
    }

}