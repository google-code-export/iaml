package iaml.generated2;

import nz.org.take.rt.*;


/**
 * Class generated by the take compiler.
 * @version Tue Oct 14 23:16:03 NZDT 2008
 */
@SuppressWarnings("unchecked")
class KBFragement_getAppChildren {
    /**
     * Method generated for query /app_children[in,out]
     * @param slot1 input parameter generated from slot 0
     * @return an iterator for instances of InternetApplication_Children
    */
    public static ResultSet<InternetApplication_Children> getAppChildren(
        final org.openiaml.model.model.InternetApplication slot1) {
        DerivationController _derivation = new DefaultDerivationController();
        ResultSet<InternetApplication_Children> _result = new ResultSet(KBFragement_getAppChildren.getAppChildren(
                    slot1, _derivation), _derivation);

        return _result;
    }

    /**
     * Method generated for query /app_children[in,out]
     * @param slot1 input parameter generated from slot 0
     * @return an iterator for instances of InternetApplication_Children
    */
    static ResourceIterator<InternetApplication_Children> getAppChildren(
        final org.openiaml.model.model.InternetApplication slot1,
        final DerivationController _derivation) {
        final int _derivationlevel = _derivation.getDepth();
        ResourceIterator<InternetApplication_Children> result = new IteratorChain<InternetApplication_Children>(1) {
                public Object getIteratorOrObject(int pos) {
                    switch (pos) {
                    // factsInternetApplication_Children nz.org.take.ExternalFactStore@1f78040
                    case 0:
                        return getAppChildren_0(slot1,
                            _derivation.reset(_derivationlevel));

                    default:
                        return EmptyIterator.DEFAULT;
                    } // switch(pos)
                } // getIterator()

                public String getRuleRef(int pos) {
                    switch (pos) {
                    // factsInternetApplication_Children nz.org.take.ExternalFactStore@1f78040
                    case 0:
                        return "factsInternetApplication_Children";

                    default:
                        return "";
                    } // switch(pos)
                } // getRuleRef()
            };

        return result;
    }

    /**
     * Method generated for query /app_children[in,out]
     * @param slot1 input parameter generated from slot 0
     * @return an iterator for instances of InternetApplication_Children
    */
    private static ResourceIterator<InternetApplication_Children> getAppChildren_0(
        final org.openiaml.model.model.InternetApplication slot1,
        final DerivationController _derivation) {
        _derivation.log("factsInternetApplication_Children",
            DerivationController.EXTERNAL_FACT_SET, slot1,
            DerivationController.NIL);

        return FactStores.factsInternetApplication_Children.fetch(slot1, null);
    }
}
