# Swing

Swing is a part of JFC (Java Foundation Classes) that is used to create Window based application. For example, Swing can be used to make GUI Components like TextField, Button, Label, etc.

javax.swing -> Swing  
java.awt.event -> ActionListener

### AWT vs Swing:  

- AWT  
  - AWT Components are platform dependent  
  - AWT Components are heavy weight as it calls OS in order to produce GUI Components.  
  - AWT provides fewer components than Swing.
  - It is within java.awt package.



- Swing  
  - Swing components are platform independent  
  - Swing components are lightweight as it will not call OS to produce GUI Components.
  - Swing provides more powerful components such as table, list, etc.
  - It is within javax.swing package.

| AWT | Swing |
| :-- | :-- |
| Platform Dependent | Platform Independent |
| Components are heavy weight | Components are light weight |
| Fewer components | More components |
| java.awt | javax.swing |

### ActionListener

java.awt.event  
The class that is interested in processing an action event must implement this interface and the object created with that class is registered with a component using component's `addActionListener()`. When an action event occurs, the object's `actionPerformed()` is invoked.  

### LayoutManager

FlowLayout -> Default Layout  
java.awt  
A layout manager arrnages component within a window using some specific algorithm.  
FlowLayout manages a layout which is similar to how words flow in a text editor, that is, from upper left corner, then left to right, and from top to bottom.