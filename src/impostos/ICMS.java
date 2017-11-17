package impostos;

/**
 * @author s2it_rchibana
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 11/17/17 1:36 PM
 */
public class ICMS implements Imposto{

    @Override
    public double calcula(final Orcamento orcamento){
        return 50 + orcamento.getValor() * 0.05;
    }
}
