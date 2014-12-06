package com.simpleplugin;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.simpleplugin.psi.SimpleTypes.*;

%%

%{
  public _SimpleLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SimpleLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

CRLF= \n|\r|\r\n
EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+
KEY_CHARACTER=[^:=\ \n\r\t\f\\] | "\\"{CRLF} | "\\".

NUMBER=[0-9]+
ID=[a-zA-Z_0-9]+
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\\'|\\)*\")
LINE_COMMENT="//".*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return com.intellij.psi.TokenType.WHITE_SPACE; }
  "#"                  { return END_OF_LINE_COMMENT }
  "!"                  { return END_OF_LINE_COMMENT }
  ";"                  { return SEMICOLON; }
  "="                  { return EQ; }
  "COMMENT"            { return COMMENT; }
  "CRLF"               { return CRLF; }
  "KEY"                { return KEY; }
  ":"                  { return SEPARATOR; }
  "VALUE"              { return VALUE; }

  {NUMBER}             { return NUMBER; }
  {ID}                 { return ID; }
  {STRING}             { return STRING; }
  {LINE_COMMENT}       { return LINE_COMMENT; }
  {BLOCK_COMMENT}      { return BLOCK_COMMENT; }
    {KEY_CHARACTER} {return KEY}

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
