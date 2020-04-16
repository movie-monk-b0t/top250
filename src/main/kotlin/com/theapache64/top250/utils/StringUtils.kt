package com.theapache64.top250.utils


fun String.removeNewLinesAndMultipleSpaces(): String {
    return replace("\n", "").replace("\\s{2,}".toRegex(), " ")
}
