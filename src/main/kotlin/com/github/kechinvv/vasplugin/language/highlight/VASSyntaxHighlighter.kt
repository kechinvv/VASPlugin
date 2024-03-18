package com.github.kechinvv.vasplugin.language.highlight

import gen.VASCLexer
import gen.VASCParser
import com.github.kechinvv.vasplugin.language.VASLanguage
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType

class VASSyntaxHighlighter : SyntaxHighlighterBase() {

    private val EMPTY_KEYS = arrayOfNulls<TextAttributesKey>(0)

    val ID = TextAttributesKey.createTextAttributesKey("VAS_ID", DefaultLanguageHighlighterColors.IDENTIFIER)
    val KEYWORD = TextAttributesKey.createTextAttributesKey("VAS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
    val STRING = TextAttributesKey.createTextAttributesKey("VAS_STRING", DefaultLanguageHighlighterColors.STRING)
    val LINE_COMMENT =
        TextAttributesKey.createTextAttributesKey("VAS_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
    val BLOCK_COMMENT =
        TextAttributesKey.createTextAttributesKey("VAS_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)

    val BAD_CHARACTER = TextAttributesKey.createTextAttributesKey("VAS_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(
            VASLanguage,
            VASCParser.tokenNames,
            VASCParser.ruleNames
        )
    }

    override fun getHighlightingLexer(): Lexer {
        val lexer = VASCLexer(null)
        return ANTLRLexerAdaptor(VASLanguage, lexer)
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey?> {
        if (tokenType !is TokenIElementType) return EMPTY_KEYS
        val ttype = tokenType.antlrTokenType
        val attrKey: TextAttributesKey
        attrKey = when (ttype) {
            VASCLexer.IDENTIFIER -> ID
            VASCLexer.CLASS, VASCLexer.EXTENDS,
            VASCLexer.METHOD, VASCLexer.WHILE,
            VASCLexer.LOOP, VASCLexer.IS, VASCLexer.END,
            VASCLexer.IF, VASCLexer.THEN, VASCLexer.ELSE,
            VASCLexer.VAR, VASCLexer.THIS, VASCLexer.NULL,
            VASCLexer.SUPER, VASCLexer.RETURN,
            VASCLexer.TRUE, VASCLexer.FALSE -> KEYWORD

            VASCLexer.COMMENT -> LINE_COMMENT

            VASCLexer.MlComment -> BLOCK_COMMENT
            VASCLexer.BAD_CHARACTER -> BAD_CHARACTER
            else -> return EMPTY_KEYS
        }
        return arrayOf(attrKey)
    }
}