package impostos;

/**
 * @author s2it_rchibana
 * @version $Revision: $<br/>
 *          $Id: $
 * @since 11/17/17 1:38 PM
 */
public class ISS implements Imposto{

    @Override
    public double calcula(final Orcamento orcamento){
        return orcamento.getValor() * 0.06;
    }
}
