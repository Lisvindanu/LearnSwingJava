package KeyListener

import java.awt.Color
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import java.net.URL
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel

class MyFrame : JFrame(), KeyListener {

    private val label = JLabel()


    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(500, 500)
        layout = null
        addKeyListener(this)

        label.setBounds(0,0,100,100)
//        label.background = Color.pink
//        label.isOpaque = true
        this.contentPane.background = Color.blue
        try {
            val labelIconUrl = URL("https://img.icons8.com/ios/50/000000/rocket.png")
            val labelIcon = ImageIcon(labelIconUrl)
            label.icon = labelIcon
        }catch (e: Exception) {
            e.printStackTrace()
        }

        this.add(label)
        isVisible = true
    }

    override fun keyTyped(e: KeyEvent?) {
        // invoked when a key is typed. uses keyChar, char output
        when(e?.keyChar) {
            'w' -> label.setLocation(label.x ,label.y-10)
            'a' ->label.setLocation(label.x-10 ,label.y)
            's' ->label.setLocation(label.x ,label.y+10)
            'd' ->label.setLocation(label.x+10 ,label.y)
        }

    }

    override fun keyPressed(e: KeyEvent?) {
        // invoked when a physical key is pressed. uses keyCode, Int output
        when(e?.keyCode) {
            38 -> label.setLocation(label.x ,label.y-10)
            37 ->label.setLocation(label.x-10 ,label.y)
            40 ->label.setLocation(label.x ,label.y+10)
            39 ->label.setLocation(label.x+10 ,label.y)
        }
    }

    override fun keyReleased(e: KeyEvent?) {
        // called whenever a button is released
        println("You released  key char: " + e?.keyChar)
        println("You released  key char: " + e?.keyCode)
    }
}