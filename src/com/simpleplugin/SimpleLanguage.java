package com.simpleplugin;

import com.intellij.lang.Language;


/**
 * Created by Алексей on 01.12.2014.
 */
public class SimpleLanguage extends Language {
    public static final SimpleLanguage INSTANCE = new SimpleLanguage();

    private SimpleLanguage() {
        super("Simple");
    }
}
