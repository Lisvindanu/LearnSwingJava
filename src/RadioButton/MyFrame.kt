package RadioButton

import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.net.URL
import javax.swing.ButtonGroup
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JRadioButton


class MyFrame : JFrame(), ActionListener {

    val pizzaButton = JRadioButton("pizza")
    val hamburgerButton = JRadioButton("hamburger")
    val hotdogButton = JRadioButton("hotdog")
    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        this.setLayout(FlowLayout())

    try {
        val pizzaIconUrl = URL("https://img.icons8.com/color/48/000000/pizza.png")
        val hamburgerIconUrl = URL("https://img.icons8.com/color/48/000000/hamburger.png")
        val hotdogIconUrl = URL("https://img.icons8.com/color/48/000000/hot-dog.png")
        pizzaButton.icon = ImageIcon(pizzaIconUrl)
        hamburgerButton.icon = ImageIcon(hamburgerIconUrl)
        hotdogButton.icon = ImageIcon(hotdogIconUrl)
    }catch (e:Exception){
        e.printStackTrace()
    }


        val group = ButtonGroup()
        group.add(pizzaButton)
        group.add(hamburgerButton)
        group.add(hotdogButton)

        pizzaButton.addActionListener(this)
        hamburgerButton.addActionListener(this)
        hotdogButton.addActionListener(this)

        add(pizzaButton)
        add(hamburgerButton)
        add(hotdogButton)

        pack()
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent?) {
        when (e?.source) {
            pizzaButton -> println("You ordered pizza")
            hamburgerButton -> println("You ordered hamburger")
            hotdogButton -> println("You ordered hotdog")
        }
    }
}