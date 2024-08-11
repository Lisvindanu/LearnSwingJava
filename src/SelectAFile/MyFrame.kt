package SelectAFile

import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.io.File
import javax.swing.JButton
import javax.swing.JFileChooser
import javax.swing.JFrame

class MyFrame : JFrame(), ActionListener {

    private val button = JButton("Select File")

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = FlowLayout()
        pack()
        button.addActionListener(this)

        this.add(button)

        isVisible = true
    }
    override fun actionPerformed(e: ActionEvent?) {
        if (e?.source == button) {
            val fileChooser = JFileChooser()

            fileChooser.setCurrentDirectory(File("."))

            //val response : Int = fileChooser.showOpenDialog(null) // select file to open
            val response : Int = fileChooser.showSaveDialog(null) // select File to save


            if(response == JFileChooser.APPROVE_OPTION) {
                val file = File(fileChooser.selectedFile.absolutePath)
                println(file)
            }

        }
    }
}