package com.github.kechinvv.vasplugin.language


import gen.VASCLexer
import gen.VASCParser
import com.github.kechinvv.vasplugin.language.psi.PsiElementFactory
import com.github.kechinvv.vasplugin.language.psi.VASPSIFileRoot
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.v4.runtime.Parser
import org.antlr.v4.runtime.tree.ParseTree

class VASParserDefinition : ParserDefinition {

    val FILE = IFileElementType(VASLanguage)

    object OriginalRules {
        var tokens: List<TokenIElementType>? = emptyList()
        var rules: List<RuleIElementType>? = emptyList()
    }

    init {
        PSIElementTypeFactory.defineLanguageIElementTypes(
            VASLanguage,
            VASCParser.tokenNames, VASCParser.ruleNames
        );
        OriginalRules.tokens = PSIElementTypeFactory.getTokenIElementTypes(VASLanguage);
        OriginalRules.rules = PSIElementTypeFactory.getRuleIElementTypes(VASLanguage);
    }

    val COMMENTS = PSIElementTypeFactory.createTokenSet(
        VASLanguage,
        VASCLexer.COMMENT,
        VASCLexer.MlComment
    )

    val WHITESPACE = PSIElementTypeFactory.createTokenSet(
        VASLanguage,
        VASCLexer.WS
    )

    val STRING = TokenSet.EMPTY

    override fun createLexer(project: Project?): Lexer {
        val lexer = VASCLexer(null)
        return ANTLRLexerAdaptor(VASLanguage, lexer)
    }

    override fun createParser(project: Project?): PsiParser {
        val parser = VASCParser(null)
        return object : ANTLRParserAdaptor(VASLanguage, parser) {
            override fun parse(parser: Parser, root: IElementType): ParseTree {
                return (parser as VASCParser).program()
            }
        }
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITESPACE
    }

    override fun getStringLiteralElements(): TokenSet {
        return STRING
    }

    override fun createElement(node: ASTNode): PsiElement {
        return PsiElementFactory.createElement(node)
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return VASPSIFileRoot(viewProvider)
    }
}