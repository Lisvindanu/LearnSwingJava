package ComboBox

import java.awt.BorderLayout
import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JComboBox
import javax.swing.JFrame
import javax.swing.WindowConstants

class MyFrame : JFrame(), ActionListener {

    val animals = arrayOf("Dog", "Cat", "Bird")
   private val comboBox = JComboBox(animals)
init {
    defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    this.setLayout(FlowLayout())

//println(comboBox.itemCount)
//    comboBox.addItem("Horse")
//    comboBox.insertItemAt("Pig", 0)
//    comboBox.selectedIndex = 0
//    comboBox.removeItem("Cat")
//    comboBox.removeItemAt(0)
//    comboBox.removeAllItems()
comboBox.addActionListener(this)
    add(comboBox)

    pack()
    isVisible = true
}


    override fun actionPerformed(e: ActionEvent?) {
        if(e?.source == comboBox) {
            println(comboBox.selectedItem)
            println(comboBox.selectedIndex)
        }
    }
}