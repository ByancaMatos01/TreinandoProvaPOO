package curso;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProdutoControl {
    private StringProperty idProduto= new SimpleStringProperty("");
    private StringProperty nomeProduto= new SimpleStringProperty("");
    private StringProperty tipoProduto= new SimpleStringProperty("");
    private StringProperty precoProduto= new SimpleStringProperty("");
    private ObservableList <Produto> lista= FXCollections.observableArrayList();
  ProdutoDaoImplementation dao;
 public void Control (){
    dao= new ProdutoDaoImplementation();
   }

   public void adcionar(){
    Produto p= getEntity();
    dao.adcionar(p);
   }
 

public void pesquisar(){
List<Produto>l=dao.pesquisar(nomeProduto.get());
lista.setAll(l);

}



public Produto getEntity(){
    Produto p= new Produto();
    p.setid(Long.parseLong(idProduto.get()));
    p.setNome(nomeProduto.get());
    p.setTipo(tipoProduto.get());
    p.setPreco(Double.parseDouble(precoProduto.get()));
    return p;
}

public void setEntity(Produto p){
    idProduto.set(String.valueOf(p.getId()));
    nomeProduto.set(p.getNome());
    tipoProduto.set(p.getTipo());
    precoProduto.set(String.valueOf(p.getPreco()));
    }


    public StringProperty nomeProdutoProperty() {
        return nomeProduto;
    }

    public ObservableList <Produto> getTable(){
        return lista;
    }

    public StringProperty idProdutoProperty(){
        return idProduto;
    }
    public StringProperty precoProdutoProperty(){
        return precoProduto;

    }
    public StringProperty tipoProdutoProperty(){
        return tipoProduto;
        }

}



    


