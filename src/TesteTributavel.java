public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1111, 2222);
        cc.deposita(100.00);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorImposto ci = new CalculadorImposto();
        ci.resgistra(cc);
        ci.resgistra(sv);

        System.out.println(ci.getTotalImposto());
    }
}
