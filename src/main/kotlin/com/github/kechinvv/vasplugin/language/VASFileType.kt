package com.github.kechinvv.vasplugin.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object VASFileType : LanguageFileType(VASLanguage) {
    override fun getName(): String {
        return "VAS"
    }

    override fun getDescription(): String {
        return "VAS file"
    }

    override fun getDefaultExtension(): String {
        return "vas"
    }

    override fun getIcon(): Icon {
        return VASIcon.FILE
    }
}