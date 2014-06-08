package com.tcooper8.io

import java.io.{InputStream, Closeable}

trait IFile extends Closeable with AutoCloseable {
    val content: Option[InputStream]
    val name: String
    val path: String
    val parent: IFile

    def apply(path: String): Option[IFile]
    def apply(parent: IFile, child: String): Option[IFile]
    def close(): Unit
    def write(inStream: InputStream, key: String): Option[IFile]
}