public class Q1 {

    private String nm; private Float sz; private Int yr;

    public String getNome() {
        return nm;
    }
    public Int getAno() {
        return yr;
    }
    public Float getAltura() {
        return sz;
    }
    public void setNome(String nome) {
        this.nm = nome;
    }
    public void setAno(Int ano) {
        this.yr = ano;
    }
    public void setAltura(Float altura) {
        this.sz = altura;
    }
    public void getEv() {
        System.out.println(nm);
        System.out.println(sz);
        System.out.println(yr);
    }
    public void yo() {
        int a = 2021 - this.yr;
        System.out.println(a);
    }

} 