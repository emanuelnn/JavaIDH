public class Usuario {

    private String nome;
    private int id;
    private String plano;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }





    public Usuario(String nome, int id, String plano) {
        this.nome = nome;
        this.id = id;
        this.plano = plano;
    }
}
