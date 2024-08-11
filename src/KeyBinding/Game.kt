package KeyBinding


import java.awt.Color
import java.awt.event.ActionEvent
import javax.swing.*


class Game {
    private val frame = JFrame("KeyBinding demo")
    private val label = JLabel()
    private val label2 = JLabel()
    val upAction = UpAction()
    val downAction = DownAction()
    val leftAction = LeftAction()
    val rightAction = RightAction()
    init {
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(420, 420)
        frame.layout = null

        label.setBackground(Color.LIGHT_GRAY)
        label.setBounds(100, 100, 100, 100)
        label.isOpaque = true
        label2.setBackground(Color.pink)
        label2.setBounds(200, 200, 100, 100)
        label2.isOpaque = true


//        upAction
//        downAction
//        leftAction
//        rightAction

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction")
        label.actionMap.put("upAction", upAction)
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction")
        label.actionMap.put("downAction", downAction)
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction")
        label.actionMap.put("leftAction", leftAction)
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction")
        label.actionMap.put("rightAction", rightAction)

        label2.getInputMap().put(KeyStroke.getKeyStroke("W"), "upAction")
        label2.actionMap.put("W", upAction)
        label2.getInputMap().put(KeyStroke.getKeyStroke("S"), "downAction")
        label2.actionMap.put("S", downAction)
        label2.getInputMap().put(KeyStroke.getKeyStroke("A"), "leftAction")
        label2.actionMap.put("A", leftAction)
        label2.getInputMap().put(KeyStroke.getKeyStroke("D"), "rightAction")
        label2.actionMap.put("D", rightAction)

        frame.add(label)
        frame.add(label2)
        frame.isVisible = true
    }

  public inner class UpAction : AbstractAction() {
      override fun actionPerformed(e: ActionEvent) {
            label.setLocation(label.getX(), label.getY()-10)
      }
  }
    public inner class DownAction : AbstractAction() {
      override fun actionPerformed(e: ActionEvent) {
          label.setLocation(label.getX(), label.getY()+10)
      }
  }
    public inner class LeftAction : AbstractAction() {
      override fun actionPerformed(e: ActionEvent) {
          label.setLocation(label.getX()-10, label.getY())
      }
  }
    public inner class RightAction : AbstractAction() {
      override fun actionPerformed(e: ActionEvent) {
          label.setLocation(label.getX()+10, label.getY())
      }
  }


}