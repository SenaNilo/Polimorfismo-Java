import com.aula8.Cliente;
import com.aula8.Produto;
import com.aula8.Tabela;
import com.sobrescrita.Animal;
import com.sobrescrita.Gato;
// Sobrecarga (OverLoad)
// Definicao: é uma maneira de resolver ambiguidades em relação a nome de métodos. A sopbrecarga propõe uma solução p/ essas ambiguidades usando a ASSINATURA de um método
// ASSINATURA = NOME DO METODO + LISTA DE PARAMETRO
// Sobrecarga só importa a assinatura e nada mais!!

// Sobrescrita (OverRide)
// Definicao: É também uma maneira de RESOLVER AMBIGUIDADE de nome de metodos,porém o uso de heranca deve estar envolvido. O nome e a lista de parâmetros devem ser iguais, mas o metodo tem que residir em classes distintas ligadas por herança.

// Polimorfismo Do Subtipos
// Definicao: É característica do SISTEMA DE TIPOS que permite o uso de subtipos de um determinado tipo em um contexto. Por Exemplo, seja A e B classes, com B <= A (B é um subtipo de A) então o método: 
// public void metodo(A a){}
/*
 * As chamadas: 
 *     metodo(new A()) 
 * e
 *     metodo(new B()) 
 * SÃO VÁLIDAS
*/
/* OU
 * A a = new A();
 * A a = new B(); -> SÃO VÁLIDAS
 */


public class App {
    public static void main(String[] args) throws Exception {
        String sql = Tabela.inserir(new Produto("Garcom", 4012));
        System.out.println(sql);
        String sql2 = Tabela.inserir(new Cliente("Nilo", "5489751320"));
        System.out.println(sql2);

        //Polimorfismo - funciona os metodos que sao generalizaveis, acessando suas subclasses apenas com a Sobrescrita
        Animal a = new Gato("Frajola");

        a.emitirSom();
        //a.ronronar(); Ele não acessa o metodo do GATO, e sim apenas os metodos que estao sobreescritos;

    }
}