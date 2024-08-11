package ProgressBarGUI
import java.awt.*
import javax.swing.*

class ProgressBarDemo {

    val frame = JFrame()
    val bar = JProgressBar()

    init {

        bar.setValue(0)
        bar.setBounds(0,0,420,50)
        bar.isStringPainted = true
        bar.font = Font(Font.MONOSPACED, Font.PLAIN, 24)
        bar.foreground = Color.green
        bar.background = Color.BLACK
        frame.add(bar)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(420,420)
        frame.setLayout(null)
        frame.isVisible = true

        fill()
    }
    fun fill() {
        var counter : Int = 0

        while (counter<=100) {
            bar.setValue(counter)
            try {
                Thread.sleep(50)
            }catch (e: InterruptedException) {
                e.printStackTrace()
            }
        counter += 1
        }
        bar.setString("Done! :)")
    }
}