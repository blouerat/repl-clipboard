package fr.blouerat.replclipboard

object Clipboard {

  import java.awt.Toolkit
  import java.awt.datatransfer.StringSelection
  
  def copy(content: String): Unit = {
    val syscb = Toolkit.getDefaultToolkit.getSystemClipboard
    syscb.setContents(new StringSelection(content), null)
  }
}

