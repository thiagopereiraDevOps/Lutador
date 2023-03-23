public class Lutador {
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitórias, derrotas, empates;

    public void apresentar() {
        System.out.println("----------------------------------");
        System.out.println("Chegou a hora de apresentar o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Ele tem " + this.getIdade() + " anos e " + this.getAltura());
        System.out.println("No momento está pesando " + this.getPeso() + "Kg");
        System.out.println("Tem " + this.getVitórias() + "vitórias");
        System.out.println("Tem " + this.getDerrotas() + "derrotas");
    }
    public void status() {
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitórias() + "vezes");
        System.out.println("Perdeu " + this.getDerrotas() + "vezes");
        System.out.println("Empatou " + this.getEmpates() + "vezes");
    }
    public void ganharLuta() {
        this.setVitórias(this.getVitórias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String no, String na, float al, float pe, int id, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.altura = al;
//        this.peso = pe;
        this.setPeso(pe);
        this.idade = id;
        this.vitórias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade() {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitórias() {
        return vitórias;
    }

    public void setVitórias(int vitórias) {
        this.vitórias = vitórias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
