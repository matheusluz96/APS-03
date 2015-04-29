/************************************************************************
 * Classe do objeto Sorts
 * Responsável Principal: Todo mundo
 * -- Cada um será responsável por criar um método dentro deste arquivo.
 *
 * Essa classe será a responsável por organizar os arquivos, independentemente
 * do tipo de sort.
 *
 * A classe é um conjunto de Métodos de Sort:
 *  -Recebe o ArrayList<imagem> imagens;
 *  -Retorna o ArrayList<imagem> imagensOrdenadas;
 ************************************************************************/
 import java.util.Arrays;
 import java.util.ArrayList;

public class Sorts{

  //método de exemplo
  //não se esqueça do "public static!"m mude apenas o nome exemplo sort e o comentario dentro do método...
  public static ArrayList<Imagem> exemploSort(ArrayList<Imagem> imagens){ //retorna um ArrayList de Imagem, mas usa 'imagens' como parametro
    //algoritimo de ordenação aqui
    imagens.get(0).getNome(); //se você for ordenar por nome, use esse método, lembre-se de usar um for e ao invés de 0 use uma variável (lembre-se isso é igual a um array)
    imagens.get(0).getTamanhoBytes(); //se for usar para ordenar por tamanho de arquivo (o mais fácil)
    return imagens;
  }

  public static ArrayList<Imagem> selectionSort(ArrayList<Imagem> imagens){
    for (int fixo = 0; fixo < imagens.size() - 1; fixo++) {
      int menor = fixo;

      for (int i = menor + 1; i < imagens.size(); i++){
        if (imagens.get(i).getTamanhoBytes() < imagens.get(menor).getTamanhoBytes()){
    		    menor = i;
        }
      }
      if (menor != fixo) {
      	// Troca
        Imagem t = imagens.get(fixo);
        imagens.set(fixo,imagens.get(menor));
        imagens.set(menor,t);
      }
    }
    return imagens;
  }
    public static ArrayList<Imagem> selectionBubble(ArrayList<Imagem> imagens){
  {
        imagens.get(0).getTamanhoBytes();

        boolean troca = true;
        Imagem aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.size() - 1; i++) 
            {
                if (imagens.get(i).getTamanhoBytes() > imagens.get(i + 1).getTamanhoBytes() )
                {
                   aux = imagens.get(i);
                   imagens.get(i) = imagens.get(i + 1);
                   imagens.get(i + 1) = aux;
                   troca = true;
                }
            }
        }
  }
    return imagens;
  } 
  //coloque outros métodos aqui
}
