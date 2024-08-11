package MenuBars

import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.net.URL
import javax.swing.ImageIcon
import java.awt.event.KeyEvent
import javax.swing.JFrame
import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem

class MyFrame : JFrame(), ActionListener {
   private val menuBar = JMenuBar()
    private val fileMenu = JMenu("File")
    private val editMenu = JMenu("Edit")
    private val helpMenu = JMenu("Help")

    private val loadItem = JMenuItem("Load")
    private val saveItem = JMenuItem("Save")
    private val exitItem = JMenuItem("Exit")


    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(500,500)
        layout = FlowLayout()


        loadItem.addActionListener(this)
        saveItem.addActionListener(this)
        exitItem.addActionListener(this)


        fileMenu.setMnemonic(KeyEvent.VK_F) // ALT + F for file
        editMenu.setMnemonic(KeyEvent.VK_E) // ALT + E for edit
        helpMenu.setMnemonic(KeyEvent.VK_H) // ALT + H for help
        loadItem.setMnemonic(KeyEvent.VK_L) // l for load
        saveItem.setMnemonic(KeyEvent.VK_S) // s for save
        exitItem.setMnemonic(KeyEvent.VK_E) // e for load


        try {
            val loadIconURL = URL("https://img.icons8.com/material-outlined/24/000000/upload.png") // Ikon Load
            val saveIconURL = URL("https://img.icons8.com/ios/50/000000/save.png") // Ikon Save
            val exitIconURL = URL("https://img.icons8.com/ios/50/000000/exit.png") // Ikon Exit

            loadItem.icon = ImageIcon(loadIconURL)
            saveItem.icon = ImageIcon(saveIconURL)
            exitItem.icon = ImageIcon(exitIconURL)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        fileMenu.add(loadItem)
        fileMenu.add(saveItem)
        fileMenu.add(exitItem)


        menuBar.add(fileMenu)
        menuBar.add(editMenu)
        menuBar.add(helpMenu)

        this.setJMenuBar(menuBar)
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent?) {
        when(e?.source){
            loadItem -> println("*beep boop* you loaded a file")
            saveItem-> println("*beep boop* you saved a file")
            exitItem -> System.exit(0)

        }
    }
}