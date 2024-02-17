package com.github.kechinvv.vasplugin.language.psi

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType

object PsiElementFactory {
    fun createElement(node: ASTNode): PsiElement {
        val elType = node.elementType
        if (elType is TokenIElementType) {
            return ASTWrapperPsiElement(node)
        }
        if (elType !is RuleIElementType) {
            return ASTWrapperPsiElement(node)
        }
        return ASTWrapperPsiElement(node)
    }
}