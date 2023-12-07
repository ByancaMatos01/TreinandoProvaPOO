import java.util.List;

import curso.Produto;

public interface ProdutoDao {
    void adcionar(Produto p);
    List<Produto> pesquisar(String nome);
}
