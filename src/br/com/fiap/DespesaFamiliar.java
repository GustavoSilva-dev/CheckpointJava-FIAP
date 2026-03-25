package br.com.fiap;

// rm573880 - Gustavo Soares Silva
public class DespesaFamiliar {
    public double rendaFamiliar;
    public double gastoComLuz;
    public int numeroDeMoradores;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    public double calcularTotalDeDespesas(){
        double mensalidadeTotal = valorMensalidadeDaAcademia * numeroDeMoradores;
        double totalDespesas = gastoComLuz + gastoComAgua + gastoComInternet + mensalidadeTotal;
        return totalDespesas;
    }

    public double calcularRendaFamiliarLiquida() {
        double rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    }
}
