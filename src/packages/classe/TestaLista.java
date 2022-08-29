package classe;

public class TestaLista {
    public static void main(String[] args){
    
        Lista vetor = new Lista(10);

        System.out.println(vetor);
        
        vetor.addInicio("a");
        vetor.addInicio("b");
        vetor.addInicio("c");
        vetor.addInicio("d");
        vetor.addInicio("e");
        vetor.addInicio("f");
        vetor.addInicio("g");
        vetor.addInicio("h");
        
        System.out.println(vetor);

        vetor.addFim("Y");
        vetor.addFim("X");

        System.out.println(vetor);

        vetor.removeInicio();
        vetor.removeInicio();
        vetor.removeInicio();
        vetor.removeInicio();

        System.out.println(vetor);
        
        vetor.addFim("Z");
        vetor.addFim("W");
                       
        System.out.println(vetor);
        
        vetor.removeFim();
        vetor.removeFim();
        vetor.removeFim();
        vetor.removeFim();
        vetor.removeFim();
        vetor.removeFim();

        System.out.println(vetor);

        vetor.addPosicao(2, "A");
        vetor.addPosicao(3, "B");
        vetor.addPosicao(4, "F");
        vetor.addPosicao(5, "G");
        vetor.addPosicao(6, "H");
        vetor.addPosicao(7, "I");
                       
        System.out.println(vetor);

        vetor.removePosicao(6);
        vetor.removePosicao(5);

        System.out.println(vetor);

        //vetor.retornaElementoMeio();

    }
}
