package com.tcooper8.io.local.internal

import org.slf4j.LoggerFactory

object Logging {
    def apply(cls: Class[_]) = LoggerFactory.getLogger(cls)
    def apply(name: String) = LoggerFactory.getLogger(name)
}
