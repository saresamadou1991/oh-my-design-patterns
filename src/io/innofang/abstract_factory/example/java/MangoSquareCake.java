package io.innofang.abstract_factory.example.java;

/**
 * Created by InnF on 2017/2/25.
 * 芒果方形蛋糕
 */
public class MangoSquareCake extends CakeFactory {
    @Override
    public CakeCream cream() {
        return new MangoCream();
    }

    @Override
    public CakeStyle style() {
        return new SquareStyle();
    }
}
