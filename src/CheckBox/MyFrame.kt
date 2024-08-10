package CheckBox

import java.awt.FlowLayout
import java.awt.Font
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class MyFrame : JFrame(), ActionListener {
     val button = JButton()
    val checkBox = JCheckBox()
    var xIcon = ImageIcon()
    var check = ImageIcon()
    init {
       defaultCloseOperation = EXIT_ON_CLOSE
        layout = FlowLayout()

        xIcon = ImageIcon("src/CheckBox/x.png")
        check = ImageIcon("src/CheckBox/v.png")


        button.setText("Submit")
        button.addActionListener(this)
        add(button)

        checkBox.setText("I'm not a robot")
        checkBox.setFocusable(false)
        checkBox.font = Font("Menlo", Font.PLAIN, 20)
        checkBox.setIcon(xIcon)
        checkBox.setSelectedIcon(check)
        add(checkBox)



        pack()
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent?) {
        if(e?.source == button)
         println(checkBox.isSelected)



    }
}