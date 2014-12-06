
/**
 * Created by Алексей on 06.12.2014.
 */
package com.simpleplugin;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class SimpleLexerAdapter extends FlexAdapter {
    public SimpleLexerAdapter() {
        super(new _SimpleLexer((Reader) null));
    }
}