package es.upm.miw.spai.ecp2;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {
    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<Double>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
    }

    public double higher() {
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher)
                higher = item;
        }
        return higher;
    }

    public double multiplicacion() {
        double result = 1.0d;
        if (this.size() > 0) {
            for (Double doubleIt : this.collection) {
                result = result * doubleIt;
            }
        } else {
            result = 0d;
        }
        return result;
    }

    public double lower() {
        double result;
        if (this.size() > 0) {
            result = this.collection.get(0);
            for (Double doubleIt : this.collection) {
                if (doubleIt < result) {
                    result = doubleIt;
                }
            }
        } else {
            result = 0d;
        }
        return result;
    }

    public double mean() {
        return this.sum() / this.collection.size();
    }
}
