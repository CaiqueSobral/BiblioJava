package biblioteca;
import java.util.LinkedList;

public class Estoque {
    private LinkedList<Livro> estoque = new LinkedList();
    private int codigo = 0;

    public LinkedList<Livro> getEstoque() {
        return estoque;
    }    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void adicionar(Livro livro){
        this.getEstoque().add(livro);
        this.setCodigo(codigo + 1);
    }
    
    public void listar(){
        for(Livro livro : this.getEstoque()){
            livro.imprimir();
        }
    }
    
    public Livro pesquisarCod(int cod){
        int i;
        for(Livro livro : this.getEstoque()){
            if(livro.getCod() == cod){
                return livro;
            }
        }
        return null;
    }
    
    public void remover(int cod){
        for(Livro livro : this.getEstoque()){   
        }
    }
}
