package KeyBinding.KB2

import java.awt.Color
import java.awt.event.ActionEvent
import javax.swing.*


class Game2 {
    private val frame = JFrame("KeyBind demo")
    private val label = JLabel()
    private val label2 = JLabel()

    init {
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(1000, 1000)
        frame.layout =null

        label.background = Color.blue
        label.setBounds(100, 100, 100,100)
        label.isOpaque = true

        label2.setBackground(Color.PINK)
        label2.setBounds(200, 200, 100, 100)
        label2.isOpaque = true

        // Key Bindings for label 1 (Arrow Keys)
        label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("UP"), "upAction")
        label.actionMap.put("upAction", MoveAction(label, "upAction"))

        label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DOWN"), "downAction")
        label.actionMap.put("downAction", MoveAction(label, "downAction"))

        label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("LEFT"), "leftAction")
        label.actionMap.put("leftAction", MoveAction(label, "leftAction"))

        label.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("RIGHT"), "rightAction")
        label.actionMap.put("rightAction", MoveAction(label, "rightAction"))

        // Key Bindings for label 2 (WASD)
        label2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("W"), "upAction")
        label2.actionMap.put("upAction", MoveAction(label2, "upAction"))

        label2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "downAction")
        label2.actionMap.put("downAction", MoveAction(label2, "downAction"))

        label2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "leftAction")
        label2.actionMap.put("leftAction", MoveAction(label2, "leftAction"))

        label2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("D"), "rightAction")
        label2.actionMap.put("rightAction", MoveAction(label2, "rightAction"))

        frame.add(label)
        frame.add(label2)
        frame.isVisible = true


    }

    inner class MoveAction(private val label: JLabel, private val direction: String) : AbstractAction() {
        override fun actionPerformed(e: ActionEvent) {
            when(direction) {
                "upAction" -> label.setLocation(label.x, label.y -10)
                "downAction" -> label.setLocation(label.x, label.y +10)
                "leftAction" -> label.setLocation(label.x-10, label.y )
                "rightAction" -> label.setLocation(label.x+10, label.y )
            }
            label.revalidate()
            label.repaint()
        }
    }
}