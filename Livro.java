package biblioteca;
public class Livro {
    private String titulo;
    private String autor;
    private int cod;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Livro(String titulo, String autor, int cod) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setCod(cod);
    }
    
    public void imprimir(){
        System.out.println("====================");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Codigo: " + this.getCod());
    }
}
