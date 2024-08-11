package ColorChooser

import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JColorChooser
import javax.swing.JFrame
import javax.swing.JLabel
import kotlin.math.E

class MyFrame : JFrame(), ActionListener {

    private val button = JButton("Pick A Color")
    private val label = JLabel()

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = FlowLayout()

        label.background = Color.WHITE
        label.text = "This is some text"
        label.font = Font("MV Boli", Font.PLAIN, 100)
        label.isOpaque = true


        this.add(button)
        this.add(label)

        button.addActionListener(this)
        pack()
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent?) {
        if(e?.source == button) {
            val colorChooser = JColorChooser()

            val color = JColorChooser.showDialog(null, "Pick a Color", Color.BLACK)

//            label.setForeground(color)
            label.background = color
        }
    }
}