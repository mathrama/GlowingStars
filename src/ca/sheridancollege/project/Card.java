/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.Objects;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 *
 * @author Sivagama
 * team member : Paramjeet Kaur , Ramanpreet Kaur, Hardeep Singh, Gauravdeep Singh
 */
public class Card {
    private final Symbol symbol1;
    private final Symbol symbol2;
    private final Symbol symbol3;

    public Card(Symbol s1, Symbol s2, Symbol s3) {
        symbol1 = s1;
        symbol2 = s2;
        symbol3 = s3;
    }

    @Override
    public String toString() {
        return "Card{" +
                "symbol1=" + symbol1 +
                ", symbol2=" + symbol2 +
                ", symbol3=" + symbol3 +
                '}';
    }

    public boolean symbolMatched(Card o) {
        if (o == null) return false;
        Card card = o;
        return card.symbol1 == symbol1 || card.symbol1 == symbol2 || card.symbol1 == symbol3
                || card.symbol2 == symbol1 || card.symbol2 == symbol2 || card.symbol2 == symbol3
                || card.symbol3 == symbol1 || card.symbol3 == symbol2 || card.symbol3 == symbol3;


    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol1, symbol2, symbol3);
    }

    /**
     * Students should implement this method for their specific children classes
     */
    public enum Symbol {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z}
}
