package org.example.homeworks.hw_07;

public class FractionNumbers {

    private int nominator;
    private int denominator;

    public FractionNumbers(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public FractionNumbers plus(FractionNumbers other){
        this.nominator= this.nominator * other.getDenominator() + this.denominator* other.getDenominator();
        this.denominator = this.denominator * other.getDenominator();
        return new FractionNumbers(nominator,denominator);
    }
    public FractionNumbers minus(FractionNumbers other){
        this.nominator= this.nominator * other.getDenominator() - this.denominator* other.getDenominator();
        this.denominator = this.denominator * other.getDenominator();
        return new FractionNumbers(nominator,denominator);
    }
    public FractionNumbers multiply(FractionNumbers other){
        this.nominator= this.nominator * other.getDenominator() ;
        this.denominator = this.denominator * other.getDenominator();
        return new FractionNumbers(nominator,denominator);
    }
    public FractionNumbers divide(FractionNumbers other){
        this.nominator= this.denominator * other.getDenominator();
        this.denominator = this.nominator * other.getDenominator() ;
        return new FractionNumbers(nominator,denominator);
    }
    @Override
    public String toString() {
        return "nominator" + "/" + denominator;
    }
}











