package iaml.generated2;

import nz.org.take.rt.*;


/**
 * Class generated by the take compiler.
 * @version Wed Oct 15 15:05:06 NZDT 2008
 */
@SuppressWarnings("unchecked")
class KBFragement_getAppName {
    /**
     * Method generated for query /app_name[in,out]
     * @param app input parameter generated from slot 0
     * @return an iterator for instances of InternetApplication_Name
    */
    public static ResultSet<InternetApplication_Name> getAppName(
        final org.openiaml.model.model.InternetApplication app) {
        DerivationController _derivation = new DefaultDerivationController();
        ResultSet<InternetApplication_Name> _result = new ResultSet(KBFragement_getAppName.getAppName(
                    app, _derivation), _derivation);

        return _result;
    }

    /**
     * Method generated for query /app_name[in,out]
     * @param app input parameter generated from slot 0
     * @return an iterator for instances of InternetApplication_Name
    */
    static ResourceIterator<InternetApplication_Name> getAppName(
        final org.openiaml.model.model.InternetApplication app,
        final DerivationController _derivation) {
        final int _derivationlevel = _derivation.getDepth();
        ResourceIterator<InternetApplication_Name> result = new IteratorChain<InternetApplication_Name>(1) {
                public Object getIteratorOrObject(int pos) {
                    switch (pos) {
                    // factsInternetApplication_Name nz.org.take.ExternalFactStore@da3a1e
                    case 0:
                        return getAppName_0(app,
                            _derivation.reset(_derivationlevel));

                    default:
                        return EmptyIterator.DEFAULT;
                    } // switch(pos)
                } // getIterator()

                public String getRuleRef(int pos) {
                    switch (pos) {
                    // factsInternetApplication_Name nz.org.take.ExternalFactStore@da3a1e
                    case 0:
                        return "factsInternetApplication_Name";

                    default:
                        return "";
                    } // switch(pos)
                } // getRuleRef()
            };

        return result;
    }

    /**
     * Method generated for query /app_name[in,out]
     * @param app input parameter generated from slot 0
     * @return an iterator for instances of InternetApplication_Name
    */
    private static ResourceIterator<InternetApplication_Name> getAppName_0(
        final org.openiaml.model.model.InternetApplication app,
        final DerivationController _derivation) {
        _derivation.log("factsInternetApplication_Name",
            DerivationController.EXTERNAL_FACT_SET, app,
            DerivationController.NIL);

        return FactStores.factsInternetApplication_Name.fetch(app, null);
    }

    /**
     * Method generated for query /app_name[in,in]
     * @param app input parameter generated from slot 0
     * @param string input parameter generated from slot 1
     * @return an iterator for instances of InternetApplication_Name
    */
    public static ResultSet<InternetApplication_Name> getAppName(
        final org.openiaml.model.model.InternetApplication app,
        final java.lang.String string) {
        DerivationController _derivation = new DefaultDerivationController();
        ResultSet<InternetApplication_Name> _result = new ResultSet(KBFragement_getAppName.getAppName(
                    app, string, _derivation), _derivation);

        return _result;
    }

    /**
     * Method generated for query /app_name[in,in]
     * @param app input parameter generated from slot 0
     * @param string input parameter generated from slot 1
     * @return an iterator for instances of InternetApplication_Name
    */
    static ResourceIterator<InternetApplication_Name> getAppName(
        final org.openiaml.model.model.InternetApplication app,
        final java.lang.String string, final DerivationController _derivation) {
        final int _derivationlevel = _derivation.getDepth();
        ResourceIterator<InternetApplication_Name> result = new IteratorChain<InternetApplication_Name>(1) {
                public Object getIteratorOrObject(int pos) {
                    switch (pos) {
                    // factsInternetApplication_Name nz.org.take.ExternalFactStore@da3a1e
                    case 0:
                        return getAppName_0(app, string,
                            _derivation.reset(_derivationlevel));

                    default:
                        return EmptyIterator.DEFAULT;
                    } // switch(pos)
                } // getIterator()

                public String getRuleRef(int pos) {
                    switch (pos) {
                    // factsInternetApplication_Name nz.org.take.ExternalFactStore@da3a1e
                    case 0:
                        return "factsInternetApplication_Name";

                    default:
                        return "";
                    } // switch(pos)
                } // getRuleRef()
            };

        return result;
    }

    /**
     * Method generated for query /app_name[in,in]
     * @param app input parameter generated from slot 0
     * @param string input parameter generated from slot 1
     * @return an iterator for instances of InternetApplication_Name
    */
    private static ResourceIterator<InternetApplication_Name> getAppName_0(
        final org.openiaml.model.model.InternetApplication app,
        final java.lang.String string, final DerivationController _derivation) {
        _derivation.log("factsInternetApplication_Name",
            DerivationController.EXTERNAL_FACT_SET, app, string);

        return FactStores.factsInternetApplication_Name.fetch(app, string);
    }
}