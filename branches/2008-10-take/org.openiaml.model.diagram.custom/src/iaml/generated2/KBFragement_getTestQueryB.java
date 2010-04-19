package iaml.generated2;

import nz.org.take.rt.*;


/**
 * Class generated by the take compiler.
 * @version Wed Oct 15 15:05:06 NZDT 2008
 */
@SuppressWarnings("unchecked")
class KBFragement_getTestQueryB {
    /**
     * Method generated for query /b[in]
     * @param app input parameter generated from slot 0
     * @return an iterator for instances of TestQueryB
    */
    public static ResultSet<TestQueryB> getTestQueryB(
        final org.openiaml.model.model.InternetApplication app) {
        DerivationController _derivation = new DefaultDerivationController();
        ResultSet<TestQueryB> _result = new ResultSet(KBFragement_getTestQueryB.getTestQueryB(
                    app, _derivation), _derivation);

        return _result;
    }

    /**
     * Method generated for query /b[in]
     * @param app input parameter generated from slot 0
     * @return an iterator for instances of TestQueryB
    */
    static ResourceIterator<TestQueryB> getTestQueryB(
        final org.openiaml.model.model.InternetApplication app,
        final DerivationController _derivation) {
        final int _derivationlevel = _derivation.getDepth();
        ResourceIterator<TestQueryB> result = new IteratorChain<TestQueryB>(1) {
                public Object getIteratorOrObject(int pos) {
                    switch (pos) {
                    // test1  IF /a([app]) THEN /b([app])
                    case 0:
                        return getTestQueryB_0(app,
                            _derivation.reset(_derivationlevel));

                    default:
                        return EmptyIterator.DEFAULT;
                    } // switch(pos)
                } // getIterator()

                public String getRuleRef(int pos) {
                    switch (pos) {
                    // test1  IF /a([app]) THEN /b([app])
                    case 0:
                        return "test1";

                    default:
                        return "";
                    } // switch(pos)
                } // getRuleRef()
            };

        return result;
    }

    /**
     * Method generated for query /b[in]
     * @param app input parameter generated from slot 0
     * @return an iterator for instances of TestQueryB
    */
    private static ResourceIterator<TestQueryB> getTestQueryB_0(
        final org.openiaml.model.model.InternetApplication app,
        final DerivationController _derivation) {
        _derivation.log("test1", DerivationController.RULE, app);

        // comparing constants in rule head with parameters
        if (!Constants.app.equals(app)) {
            return EmptyIterator.DEFAULT;
        }

        // Variable bindings in rule:  IF /a([app]) THEN /b([app])
        class bindingsInRule3 {
            // Property generated for term  "[app]"
            org.openiaml.model.model.InternetApplication p1;
        }
        ;

        final bindingsInRule3 bindings = new bindingsInRule3();
        bindings.p1 = Constants.app;

        // code for prereq /a([app])
        final ResourceIterator<a> iterator1 = KBFragement_a_1.a_1(Constants.app,
                _derivation.increaseDepth());

        // code for prereq /b([app])
        final ResourceIterator<TestQueryB> iterator2 = new NestedIterator<a, TestQueryB>(iterator1) {
                public ResourceIterator<TestQueryB> getNextIterator(a object) {
                    bindings.p1 = Constants.app;

                    return new SingletonIterator(new TestQueryB(bindings.p1));
                }
            };

        return iterator2;
    }
}