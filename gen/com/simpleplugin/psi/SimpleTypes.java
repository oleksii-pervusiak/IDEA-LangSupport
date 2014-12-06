// This is a generated file. Not intended for manual editing.
package com.simpleplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.simpleplugin.psi.impl.*;

public interface SimpleTypes {

  IElementType EXPR = new SimpleElementType("EXPR");
  IElementType PROPERTY = new SimpleElementType("PROPERTY");
  IElementType PROPERTY_1 = new SimpleElementType("PROPERTY_1");

  IElementType BLOCK_COMMENT = new SimpleTokenType("block_comment");
  IElementType COMMENT = new SimpleTokenType("COMMENT");
  IElementType CRLF = new SimpleTokenType("CRLF");
  IElementType EQ = new SimpleTokenType("=");
  IElementType ID = new SimpleTokenType("id");
  IElementType KEY = new SimpleTokenType("KEY");
  IElementType LINE_COMMENT = new SimpleTokenType("line_comment");
  IElementType NUMBER = new SimpleTokenType("number");
  IElementType SEMICOLON = new SimpleTokenType(";");
  IElementType SEPARATOR = new SimpleTokenType("SEPARATOR");
  IElementType STRING = new SimpleTokenType("string");
  IElementType VALUE = new SimpleTokenType("VALUE");
  IElementType END_OF_LINE_COMMENT = new SimpleTokenType("END_OF_LINE_COMMENT");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == EXPR) {
        return new SimpleExprImpl(node);
      }
      else if (type == PROPERTY) {
        return new SimplePropertyImpl(node);
      }
      else if (type == PROPERTY_1) {
        return new SimpleProperty1Impl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
