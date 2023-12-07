package curso;
public class Produto {
    private long id;
    private String nome;
    private String tipo;
    private double preco;



    public Long getId(){
        return id;
    }
    public Produto setid(long id){
        this.id=id;
        return(this);
    }
     public String getNome(){
        return nome;
     }

     public Produto setNome(String nome){
        this.nome=nome;
        return(this);
     }

     public String getTipo(){
        return tipo;
     }
     public Produto setTipo(String tipo){
      this.tipo=tipo;
      return (this);
     }

     public double getPreco(){
        return preco;
     }
     public Produto setPreco(double preco){
        this.preco=preco;
        return(this);
     }



}
