package com.tcooper8.io.local.internal

import com.tcooper8.io.IFile
import java.io.{FileInputStream, File, InputStream}

case class LocalFile(file: File) extends IFile {
    private[this] implicit val log = Logging(this.getClass)

    lazy val content: Option[InputStream] = Maybe{ new FileInputStream(file) }
    val name: String = file.getName()
    val path: String = file.getPath()
    val parent: IFile =

    def apply(path: String): Option[IFile] = None
    def apply(parent: IFile, child: String): Option[IFile] = None
    def close() = content.close()
    def write(inStream: InputStream, key: String): Option[IFile]
}
