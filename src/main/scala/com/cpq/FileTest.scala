package com.cpq

import java.io.File

/**
  * Created by Enzo Cotter on 2019/5/28.
  */
object FileTest {
  def main(args: Array[String]): Unit = {
    val listFiles: Array[File] = (new File("D:\\Data")).listFiles()
    for(file <- listFiles if file.isFile if file.getName.endsWith("txt")){
      println(file)
    }
  }
}
