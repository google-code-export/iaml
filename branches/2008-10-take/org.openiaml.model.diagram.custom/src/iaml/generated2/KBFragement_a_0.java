package iaml.generated2;

import nz.org.take.rt.*;


/**
 * Class generated by the take compiler.
 * @version Wed Oct 15 14:02:15 NZDT 2008
 */
@SuppressWarnings("unchecked")
class KBFragement_a_0 {
    /**
     * Method generated for query /a[out]
     * @return an iterator for instances of a
    */
    public static ResultSet<a> a_0() {
        DerivationController _derivation = new DefaultDerivationController();
        ResultSet<a> _result = new ResultSet(KBFragement_a_0.a_0(_derivation),
                _derivation);

        return _result;
    }

    /**
     * Method generated for query /a[out]
     * @return an iterator for instances of a
    */
    static ResourceIterator<a> a_0(final DerivationController _derivation) {
        final int _derivationlevel = _derivation.getDepth();
        ResourceIterator<a> result = new IteratorChain<a>(1) {
                public Object getIteratorOrObject(int pos) {
                    switch (pos) {
                    // fact1  IF  THEN /a(<app>)
                    case 0:
                        return a_0_0(_derivation.reset(_derivationlevel));

                    default:
                        return EmptyIterator.DEFAULT;
                    } // switch(pos)
                } // getIterator()

                public String getRuleRef(int pos) {
                    switch (pos) {
                    // fact1  IF  THEN /a(<app>)
                    case 0:
                        return "fact1";

                    default:
                        return "";
                    } // switch(pos)
                } // getRuleRef()
            };

        return result;
    }

    /**
     * Method generated for query /a[out]
     * @return an iterator for instances of a
    */
    private static ResourceIterator<a> a_0_0(
        final DerivationController _derivation) {
        _derivation.log("fact1", DerivationController.RULE,
            DerivationController.NIL);

        // rule with empty body
        a result = new a();
        result.slot1 = null;

        return new SingletonIterator<a>(result);
    }
}