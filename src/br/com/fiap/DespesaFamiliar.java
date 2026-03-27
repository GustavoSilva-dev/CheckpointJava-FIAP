package br.com.fiap;

// rm573880 - Gustavo Soares Silva
// rm565337 - Luiz Fernando Machado de Moura
public class DespesaFamiliar {
    double rendaFamiliar;
    double gastoComLuz;
    int numeroDeMoradores;
    double gastoComAgua;
    double gastoComInternet;
    double valorMensalidadeDaAcademia;

    double calcularTotalDeDespesas(){
        double mensalidadeTotal = valorMensalidadeDaAcademia * numeroDeMoradores;
        double totalDespesas = gastoComLuz + gastoComAgua + gastoComInternet + mensalidadeTotal;
        return totalDespesas;
    }

    double calcularRendaFamiliarLiquida() {
        double rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    }
}
