package com.github.kechinvv.vasplugin.language.psi

import com.github.kechinvv.vasplugin.language.VASFileType
import com.github.kechinvv.vasplugin.language.VASLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class VASPSIFileRoot(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, VASLanguage) {
    override fun getFileType(): FileType {
        return VASFileType
    }

    override fun toString(): String {
        return "VAS File"
    }
}