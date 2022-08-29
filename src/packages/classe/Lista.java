package classe;

public class Lista {

    private String[] elementos;
    private int tamanho;

    public Lista(int capacidade) {

        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // LISTA_VAZIA()
    public boolean listaVazia() {
        if (this.tamanho == 0) {
            System.out.println("Lista vazia, adicione elementos!");
            return true;
        }
        return false;
    }
    // LISTA_CHEIA()
    public boolean listaCheia() {
        if (this.elementos.length == this.tamanho) {
            System.out.println("Lista cheia, remova elementos!");
            return true;
        }
        return false;
    }

    // ADICIONAR_FINAL(e)
    public void addFim(String elemento) {
        if (listaCheia() == true) {
            System.out.println("Estrutura cheia!");

        } else {
            int indice = this.tamanho;
            this.elementos[indice] = elemento;
            this.tamanho = this.tamanho + 1;
        }
    }

     // REMOVER_FINAL()
     public String removeFim() {
        if (listaVazia()) {
            System.out.println("Estrutura vazia!");
        } else {

            int indice = this.tamanho - 1;
            String elemento_removido = this.elementos[indice];
            this.tamanho = indice;
            return elemento_removido;
        }
        return null;
    }

     // ADICIONAR_INICIO(e)
     public void addInicio(String elemento) {
        if (listaCheia() == true) {
            System.out.println("Estrutura cheia!");

        } else {
            for (int i = this.tamanho; i > 0; i--) {
                this.elementos[i] = this.elementos[i - 1];
            }
            this.elementos[0] = elemento;
            this.tamanho = this.tamanho + 1;
        }
    }

    // REMOVER_INICIO()
    public String removeInicio() {
        if (listaVazia()) {
            System.out.println("Estrutura vazia!");
        }
        String elemento_removido = this.elementos[0];
        for (int i = 1; i < this.tamanho - 1; i++) {
            this.elementos[i - 1] = this.elementos[i];
        }
        this.tamanho = this.tamanho - 1;
        return elemento_removido;
    }


    
    // ADICIONAR_POSICAO(e, i)
    public void addPosicao(int posicao, String elemento) {
        if (listaCheia() == true) {
            System.out.println("Estrutura cheia!");
        } else {
            if (posicao <= 0) {
                addInicio(elemento);
            }
        }
        if (posicao >= this.tamanho) {
            addFim(elemento);

        } else {
            for (int i = 0; i < this.tamanho; i++) {
                this.elementos[i] = this.elementos[i - 1];
            }
            this.elementos[posicao] = elemento;
            this.tamanho = this.tamanho + 1;
        }
    }

    // REMOVER_POSICAO(i)
    public String removePosicao(int posicao) {
        if (listaVazia()) {
            System.out.println("Estrutura vazia!");
        }

        if (posicao <= 0) {
            removeInicio();
        } else if (posicao >= this.tamanho) {
            removeFim();
        }
       
        String elemento_removido = this.elementos[posicao];

        for (int i = 0; i < this.tamanho - 1; i++) {
            this.elementos[posicao] = this.elementos[posicao + 1];
        }

        this.tamanho = this.tamanho - 1;
        return elemento_removido;
    }

    public String retornaElementoMeio(String elemento){
        for(int i = 0; i <= (this.tamanho/2); i++){
            removeInicio();
            addFim(elemento);
        }
        return elemento;
    }


   @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append(" | ");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(" | ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append(" | ");
        return s.toString();
    }

}
