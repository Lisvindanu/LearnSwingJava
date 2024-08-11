package mouseListener

import java.awt.Color
import java.awt.FlowLayout
import java.awt.Image
import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import java.awt.event.MouseMotionListener
import javax.swing.ImageIcon
import javax.swing.JFrame
import javax.swing.JLabel


class MyFrame : JFrame(), MouseListener {

    private val label = JLabel()
    private val Nokotan1 = ImageIcon("src/mouseListener/Img/Nokotan1.jpg")
    private val Nokotan2 = ImageIcon("src/mouseListener/Img/Nokotan2.jpg")
    private val Nokotan3 = ImageIcon("src/mouseListener/Img/Nokotan3.jpg")
    private val Nokotan4 = ImageIcon("src/mouseListener/Img/Nokotan4.jpg")


    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(1000,1000)
        layout = FlowLayout()
        setLocationRelativeTo(null)

        label.setBounds(0,0,500,500)
//        label.background = Color.pink
//        label.isOpaque = true
        label.setIcon(Nokotan1)

        label.addMouseListener(this)

        add(label)
        isVisible = true
    }

    override fun mouseClicked(e: MouseEvent?) {
        // invoked when the mouse has been clicked (pressed and released) on a component
//        println("You clicked on the mouse")
    }

    override fun mousePressed(e: MouseEvent?) {
        // invoked when a mouse button has been pressed on a component
//        println("You pressed on the mouse")
//        label.background = Color.cyan
        label.icon = Nokotan2
    }

    override fun mouseReleased(e: MouseEvent?) {
        // invoked when a mouse button has been released on a component
//        println("You released on the mouse")
//        label.background = Color.green
        label.icon = Nokotan3
    }

    override fun mouseEntered(e: MouseEvent?) {
        // invoked when the mouse enters  a components
//        println("You entered on the component")
//        label.background = Color.red
        label.icon = Nokotan4
    }

    override fun mouseExited(e: MouseEvent?) {
        // invoked when the mouse exits a component
//        println("You exited on the component")
        label.icon = Nokotan1
    }
}