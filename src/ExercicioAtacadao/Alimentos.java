package ExercicioAtacadao;

public class Alimentos {
    private String titulo;
    private double preco;
    private String descricao;

    public Alimentos(String titulo,double preco, String descricao){
        this.titulo = titulo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public void apresentacoao(){
        System.out.println("==== Exibição dos dados ====");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("preco: " + this.preco);
        System.out.println("descricao" + this.descricao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
