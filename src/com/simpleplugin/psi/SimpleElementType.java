package com.simpleplugin.psi;

/**
 * Created by Алексей on 01.12.2014.
 */
import com.intellij.psi.tree.IElementType;
import com.simpleplugin.SimpleLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}
