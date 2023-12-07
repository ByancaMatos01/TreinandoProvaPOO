package curso;

import java.util.List;

public interface ProdutoDao {
    void adcionar(Produto p);
    List<Produto> pesquisar(String nome);
}
