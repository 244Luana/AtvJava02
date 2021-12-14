public class Q2 {

    int atual, total, capac, pessoas;

    public void p1(int t, int c) {
        this.atual = 0;
        this.total = 0;
        this.pessoas = t;
        this.capac = c;
    }
    public void upp() {
        if (atual < pessoas) {
            atual = atual + 1;
        } else {
            System.out.println("Ultimo andar");
        }
    }
    public void dp() {
        if (atual > 0) {
            atual = atual - 1;
        } else {
            System.out.println("Terreo");
        }
    }
    public void inp() {
        if (total < capac) {
            total = total + 1;
        } else {
            System.out.println("Lotado");
        }
    }
    public void outp() {
        if (total > 0) {
            total = total - 1;
        } else {
            System.out.println("Vazio");
        }
    }
    public int getAtual() {
        return atual;
    }
    public int getQuant() {
        return pessoas;
    }
    public int getCAtual() {
        return total;
    }
    public int getCapac() {
        return capac;
    }
    public void setCapac(int a) {
        this.capac = a;
    }
    public void setQuant(int a) {
        this.pessoas = a;
    }
    public void setCAtual(int a) {
        this.total = a;
    }
    public void setAtual(int a) {
        this.atual = a;
    }

}