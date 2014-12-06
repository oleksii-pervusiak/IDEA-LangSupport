// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class SimpleVisitor extends PsiElementVisitor {

  public void visitExpr(@NotNull SimpleExpr o) {
    visitPsiElement(o);
  }

  public void visitProperty(@NotNull SimpleProperty o) {
    visitPsiElement(o);
  }

  public void visitProperty1(@NotNull SimpleProperty1 o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
