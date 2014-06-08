package com.tcooper8.io.local.internal

import java.io.File

object SafeFile {
    private[this] implicit val log = Logging(this.getClass)

    def apply(filename: String) = Maybe{ new File(filename) }
    def apply(parent: File, child: String) = Maybe{ new File(parent, child) }
}