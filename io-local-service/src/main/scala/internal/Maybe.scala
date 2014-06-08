package com.tcooper8.io.local.internal

import org.slf4j.Logger

object Maybe {
    def apply[A](expr: => A)(implicit log: Logger): Option[A] = {
        try Some(expr)
        catch { case e: Throwable => log.error("", e); None }
    }
}
