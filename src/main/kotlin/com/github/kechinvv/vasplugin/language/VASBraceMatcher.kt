package com.github.kechinvv.vasplugin.language

import parser.com.github.kechinvv.vasplugin.antlr.VASCLexer
import com.github.kechinvv.vasplugin.language.VASParserDefinition.OriginalRules.tokens
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType

class VASBraceMatcher : PairedBraceMatcher {
    var PAIRS = arrayOf(
        BracePair(tokens!![VASCLexer.L_BRACKET], tokens!![VASCLexer.R_BRACKET], true),
        BracePair(tokens!![VASCLexer.L_SQUARE_BRACKET], tokens!![VASCLexer.R_SQUARE_BRACKET], true)
    )

    override fun getPairs(): Array<BracePair> {
        return PAIRS
    }

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean {
        return true
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return 0
    }
}