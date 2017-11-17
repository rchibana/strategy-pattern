package impostos;

/**
 * @author s2it_rchibana
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 11/17/17 1:35 PM
 */
public class CalculadorDeImposto{

    public void calcula(Orcamento orcamento, Imposto estrategiaDeImposto){
        final double resultado = estrategiaDeImposto.calcula(orcamento);
        System.out.println(resultado);
    }

}
