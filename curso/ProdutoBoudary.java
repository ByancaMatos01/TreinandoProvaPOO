package curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ProdutoBoudary extends Application {
private TextField txtid= new TextField();
private TextField txtnome=new TextField();
private TextField txttipo=new TextField();
private TextField txtpreco=new TextField();
private Button btnPesquisar= new Button();
private Button btnAdicionar= new Button();
private ProdutoControl control = new ProdutoControl();
private TableView table= new TableView<>();

public void generateBindings(){
    Bindings.bindBidirectional(txtid.textProperty(), control.idProdutoProperty());
    Bindings.bindBidirectional(txtnome.textProperty(), control.nomeProdutoProperty());
    Bindings.bindBidirectional(txttipo.textProperty(), control.tipoProdutoProperty());
    Bindings.bindBidirectional(txtpreco.textProperty(),control.precoProdutoProperty());
}
public void start(Stage stage) throws Exception { 
 BorderPane pane =new BorderPane();
 GridPane grid=new GridPane();
 pane.setTop(grid);
 pane.setCenter(table);
 Scene scn= new Scene(pane, 400, 600);
 
 grid.add(new Label("id produto"),0,0);
 grid.add(txtid,1,0);

 grid.add(new Label("nome produto"),0,1);
 grid.add(txtnome,1,1);
 grid.add(new Label("tipo de produto"),0,2);
 grid.add(txttipo,1,2);
 grid.add(new Label("preço do produto"),0,3);
 grid.add(txtpreco,1,3);
 grid.add(btnPesquisar,1,5);
 grid.add(btnAdicionar,1,7);
 btnPesquisar.setOnAction(e-> control.pesquisar());
 btnAdicionar.setOnAction(e -> control.adcionar());
table.setItems(control.getTable());
stage.setScene(scn);
stage.setTitle("Produtos");
stage.show();

}

public static void main(String args[] ){
  Application.launch(ProdutoBoudary.class, args);
}

}

    

