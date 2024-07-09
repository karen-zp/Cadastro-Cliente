public class Moto extends Veiculo {
    private double km;

    public Moto(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    @Override
    public void printDados() {
        super.printDados();
        System.out.println("Quilometragem: " + km);
    }
}
