public class SimuladorTributario {

    public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase) {
        return valorFaturamento * (aliquotaBase / 100.0);
    }

    public static double calcularImpostoProposto(double valorFaturamento, int aliquotaProposta) {
        return valorFaturamento * (aliquotaProposta / 100.0);
    }

    public static double calcularDiferenca(double impostoAntigo, double impostoProposto) {
        return impostoProposto - impostoAntigo;
    }

    public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
    }

    public static void main(String[] args) {
        double faturamento = 50000000.00;

        System.out.println("=== Análise de Tributação de Fintechs ===");
        System.out.printf("Faturamento Base: R$ %.2f\n", faturamento);

        System.out.println("-- Proposta A (9% -> 15%) --");
        double impostoAntigoA = calcularImpostoAntigo(faturamento, 9);
        double impostoPropostoA = calcularImpostoProposto(faturamento, 15);
        double diferencaA = calcularDiferenca(impostoAntigoA, impostoPropostoA);
        System.out.printf("Imposto Antigo (9%%): R$ %.2f\n", impostoAntigoA);
        System.out.printf("Imposto Proposto (15%%): R$ %.2f\n", impostoPropostoA);
        System.out.printf("Aumento de Imposto: R$ %.2f\n", diferencaA);

        System.out.println("-- Proposta B (15% -> 20%) --");
        double impostoAntigoB = calcularImpostoAntigo(faturamento, 15);
        double impostoPropostoB = calcularImpostoProposto(faturamento, 20);
        double diferencaB = calcularDiferenca(impostoAntigoB, impostoPropostoB);
        System.out.printf("Imposto Antigo (15%%): R$ %.2f\n", impostoAntigoB);
        System.out.printf("Imposto Proposto (20%%): R$ %.2f\n", impostoPropostoB);
        System.out.printf("Aumento de Imposto: R$ %.2f\n", diferencaB);

        System.out.println("-- Análise de Diálogo --");
        SimuladorTributario simulador = new SimuladorTributario();
        simulador.statusDialogo(true);
        simulador.statusDialogo(false);
    }
}