package iaml.generated2;

import nz.org.take.rt.*;


/**
 * Class generated by the take compiler.
 * @version Wed Oct 15 12:18:47 NZDT 2008
 */
@SuppressWarnings("unchecked")
class KBFragement_generated_app_children_00 {
    /**
     * Method generated for query /generated_app_children[out,out]
     * @return an iterator for instances of GeneratedAppChildren
    */
    public static ResultSet<GeneratedAppChildren> generated_app_children_00() {
        DerivationController _derivation = new DefaultDerivationController();
        ResultSet<GeneratedAppChildren> _result = new ResultSet(KBFragement_generated_app_children_00.generated_app_children_00(
                    _derivation), _derivation);

        return _result;
    }

    /**
     * Method generated for query /generated_app_children[out,out]
     * @return an iterator for instances of GeneratedAppChildren
    */
    static ResourceIterator<GeneratedAppChildren> generated_app_children_00(
        final DerivationController _derivation) {
        final int _derivationlevel = _derivation.getDepth();
        ResourceIterator<GeneratedAppChildren> result = new IteratorChain<GeneratedAppChildren>(0) {
                public Object getIteratorOrObject(int pos) {
                    switch (pos) {
                    default:
                        return EmptyIterator.DEFAULT;
                    } // switch(pos)
                } // getIterator()

                public String getRuleRef(int pos) {
                    switch (pos) {
                    default:
                        return "";
                    } // switch(pos)
                } // getRuleRef()
            };

        return result;
    }
}