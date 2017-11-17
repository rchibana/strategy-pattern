package impostos;

/**
 * @author s2it_rchibana
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 11/17/17 1:43 PM
 */
public class ICCC implements Imposto{

    @Override
    public double calcula(final Orcamento orcamento){

        final double valorOrcamento = orcamento.getValor();

        if(valorOrcamento < 1000) {
            return valorOrcamento * 0.05;
        }else if(valorOrcamento <= 3000) {
            return valorOrcamento * 0.07;
        }else {
            return 30 + valorOrcamento * 0.08;
        }

    }
}
