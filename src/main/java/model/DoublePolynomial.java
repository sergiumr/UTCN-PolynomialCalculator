package model;

import java.util.ArrayList;

public class DoublePolynomial extends Polynomial<DoubleMonomial> {

    public DoublePolynomial() {
    }

    public DoublePolynomial(IntegerPolynomial integerPolynomial) {
        for(Monomial<Integer> intMonomial : integerPolynomial.getMonomialList()) {
            this.monomialList.add(new DoubleMonomial(intMonomial));
        }
    }

    public ArrayList<DoubleMonomial> getMonomialList() {
        return this.monomialList;
    }

    public void addMonomialToList(IntegerMonomial toAdd) {
        this.monomialList.add(new DoubleMonomial(toAdd));
    }

    public void addMonomialToList(DoubleMonomial toAdd) {
        this.monomialList.add(toAdd);
    }

    public boolean equalsPolynomial(DoublePolynomial toEvaluate) {
        if(this.getMonomialList().size() != toEvaluate.getMonomialList().size()) {
            return false;
        } else {
            for(int i = 0; i < this.getMonomialList().size(); i++) {
                if(!this.getMonomialList().get(i).equalsMonomial(toEvaluate.getMonomialList().get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
